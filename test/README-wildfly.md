# Steps to use the Test Suite with wildfly / EAP

1. Install wildfly ZIP bundle and create an admin user for the console.

```bash
unzip  /path/to/wildfly/dist/target/wildfly-22.0.0.Beta1-SNAPSHOT.zip
cd wildfly-22.0.0.Beta1-SNAPSHOT/bin
./add-user.sh -u admin -p admin
```

2. Prepare the wildfly with the new version of the JSF to test. The `Multi-JSF` feature is used to install the `snapshot` version for jsf components (api, implementation and injection modules).

  * jsf-api (just copy the default module and change slot). `jsf-api-module.xml`:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<module name="javax.faces.api:snapshot" xmlns="urn:jboss:module:1.8">
    <dependencies>
        <module name="com.sun.jsf-impl:snapshot"/>
        <module name="javax.enterprise.api" export="true"/>
        <module name="javax.servlet.api" export="true"/>
        <module name="javax.servlet.jsp.api" export="true"/>
        <module name="javax.servlet.jstl.api" export="true"/>
        <module name="javax.validation.api" export="true"/>
        <module name="org.glassfish.jakarta.el" export="true"/>
        <module name="javax.api"/>
        <module name="javax.websocket.api"/>
    </dependencies>

    <resources>
        <resource-root path="jboss-jsf-api_2.3_spec-2.3.9.SP03-SNAPSHOT.jar"/>
    </resources>
</module>
```

```bash
module add --name=javax.faces.api --slot=snapshot --resources=/path/to/jboss-jsf-api_spec/target/jboss-jsf-api_2.3_spec-2.3.9.SP03-SNAPSHOT.jar --module-xml=/path/to/jsf-api-module.xml
```

  * Implementation project `jsf-impl-module.xml`:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<module name="com.sun.jsf-impl:snapshot" xmlns="urn:jboss:module:1.8">
    <properties>
        <property name="jboss.api" value="private"/>
    </properties>

    <dependencies>
        <module name="javax.faces.api:snapshot"/>
        <module name="javax.annotation.api"/>
        <module name="javax.servlet.api"/>
        <module name="javax.servlet.jsp.api"/>
        <module name="javax.websocket.api"/>
        <module name="javax.validation.api"/>
        <module name="javax.json.api"/>
        <module name="javax.ejb.api"/>
        <module name="javax.xml.bind.api"/>
        <module name="org.glassfish.jakarta.el"/>
        <module name="javax.api"/>
        <module name="javax.servlet.jstl.api"/>
        <module name="org.apache.xerces" services="import"/>
        <module name="org.apache.xalan" services="import"/>
        <module name="org.jboss.weld.core"/>
        <module name="org.jboss.weld.spi"/>
    </dependencies>

    <resources>
        <resource-root path="jsf-impl-2.3.9.SP13-SNAPSHOT.jar"/>
    </resources>
</module>
```

```bash
module add --name=com.sun.jsf-impl --slot=snapshot --resources=/path/to/mojarra/impl/target/jsf-impl-2.3.9.SP13-SNAPSHOT.jar --module-xml=/path/to/jsf-impl-module.xml
```

  * Injection (copy the module and re-use the jars from the bundle) `jsf-injection-module.xml`:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<module name="org.jboss.as.jsf-injection:snapshot" xmlns="urn:jboss:module:1.8">
    <properties>
        <property name="jboss.api" value="private"/>
    </properties>

    <resources>
        <resource-root path="wildfly-jsf-injection-22.0.0.Beta1-SNAPSHOT.jar"/>
        <resource-root path="weld-jsf-3.1.5.Final.jar"/>
    </resources>

    <dependencies>
        <module name="com.sun.jsf-impl:snapshot"/>
        <module name="java.naming"/>
        <module name="java.desktop"/>
        <module name="org.jboss.as.ee"/>
        <module name="org.jboss.as.jsf"/>
        <module name="org.jboss.as.web-common"/>
        <module name="javax.servlet.api"/>
        <module name="javax.enterprise.api"/>
        <module name="org.jboss.logging"/>
        <module name="org.jboss.weld.core"/>
        <module name="org.jboss.weld.api"/>

        <!-- added this for MyFacesAnnotationProvider -->
        <module name="javax.faces.api:snapshot"/>
    </dependencies>
</module>
```

```bash
module add --name=org.jboss.as.jsf-injection --slot=snapshot --resources=/path/to/wildfly-22.0.0.Beta1-SNAPSHOT/modules/system/layers/base/org/jboss/as/jsf-injection/main/wildfly-jsf-injection-22.0.0.Beta1-SNAPSHOT.jar:/path/to/wildfly-22.0.0.Beta1-SNAPSHOT/modules/system/layers/base/org/jboss/as/jsf-injection/main/weld-jsf-3.1.5.Final.jar --module-xml=/path/to/jsf-injection-module.xml
```

NOTE: We can do this faster just over-writing the default JARs in default modules. But just to do it right new modules are used.

  * Finally change the JSF impl globally to the use the snapshot, allow property replacement in spec (web.xml) files used by the test applications and initialize filters at startup (`servlet30/multiTenantSetsTccl` needs that filters were initialized at webapp deployment as the servlet spec says):

```bash
/subsystem=jsf:write-attribute(name=default-jsf-impl-slot, value=snapshot)
/subsystem=ee:write-attribute(name=spec-descriptor-property-replacement, value=true)
/subsystem=undertow/servlet-container=default:write-attribute(name=eager-filter-initialization, value=true)
```

3. Start with the correct properties for your test (we can test different combinations of those properties):

```bash
./standalone.sh -Dwebapp.partialStateSaving=true -Dwebapp.projectStage=Production -Dwebapp.stateSavingMethod=server -Dwebapp.serializeServerState=false
```

4. Now we are ready for launching the tests for the different subgroups to be executed against that wildfly server:

  * Compile and prepare the tests (util folder is also necessary):

```bash
cd mojarra/util
mvn clean install
cd mojarra/test
mvn clean install
```

  * Go to a test group/folder, for example, javaee7:

```bash
cd javaee7
mvn cargo:redeploy -Pwildfly-cargo -fae        # deploy test applications in this group
mvn verify -Pintegration -Pwildfly-cargo -fae  # launch the tests for the group
mvn cargo:undeploy -Pwildfly-cargo -fae        # undeploy the applications for the group
```

  * The complete test-suite consists in executing the same in the folders: **htmlunitaware**, **javaee6**, **javaee6web**, **javaee7**, **javaee8**, **servlet31**, **servlet40**. This is what is (or was) executed in the PRs when they are sent to the upstream eclipse project. The **servlet30** folder can also be executed for wildfly.
