/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 1997-2007 Sun Microsystems, Inc. All rights reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License. You can obtain
 * a copy of the License at https://glassfish.dev.java.net/public/CDDL+GPL.html
 * or glassfish/bootstrap/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.  If applicable, add the following below the License
 * Header, with the fields enclosed by brackets [] replaced by your own
 * identifying information: "Portions Copyrighted [year]
 * [name of copyright owner]"
 * 
 * Contributor(s):
 * 
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package javax.faces.component.html;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.context.FacesContext;
import javax.el.MethodExpression;
import javax.el.ValueExpression;


/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */


/**
 * <p>Causes all child components of this component
 * to be rendered.  This is useful in scenarios
 * where a parent component is expecting a single
 * component to be present, but the application
 * wishes to render more than one.</p>
 * <p>By default, the <code>rendererType</code> property must be set to "<code>javax.faces.Group</code>".
 * This value can be changed by calling the <code>setRendererType()</code> method.</p>
 */
public class HtmlPanelGroup extends javax.faces.component.UIPanel {



    private static final String OPTIMIZED_PACKAGE = "javax.faces.component.";

    public HtmlPanelGroup() {
        super();
        setRendererType("javax.faces.Group");
    }


    /**
     * <p>The standard component type for this component.</p>
     */
    public static final String COMPONENT_TYPE = "javax.faces.HtmlPanelGroup";


    private java.lang.String layout;
    /**
     * <p>Return the value of the <code>layout</code> property.</p>
     * <p>Contents: The type of layout markup to use when rendering this group.
     * If the value is "block" the renderer must produce an HTML
     * "div" element.  Otherwise HTML "span" element must
     * be produced.
     */
    public java.lang.String getLayout() {
        if (null != this.layout) {
            return this.layout;
        }
        ValueExpression _ve = getValueExpression("layout");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>layout</code> property.</p>
     */
    public void setLayout(java.lang.String layout) {
        this.layout = layout;
    }


    private java.lang.String style;
    /**
     * <p>Return the value of the <code>style</code> property.</p>
     * <p>Contents: CSS style(s) to be applied when this component is rendered.
     */
    public java.lang.String getStyle() {
        if (null != this.style) {
            return this.style;
        }
        ValueExpression _ve = getValueExpression("style");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>style</code> property.</p>
     */
    public void setStyle(java.lang.String style) {
        this.style = style;
        handleAttribute("style", style);
    }


    private java.lang.String styleClass;
    /**
     * <p>Return the value of the <code>styleClass</code> property.</p>
     * <p>Contents: Space-separated list of CSS style class(es) to be applied when
     * this element is rendered.  This value must be passed through
     * as the "class" property on generated markup.
     */
    public java.lang.String getStyleClass() {
        if (null != this.styleClass) {
            return this.styleClass;
        }
        ValueExpression _ve = getValueExpression("styleClass");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>styleClass</code> property.</p>
     */
    public void setStyleClass(java.lang.String styleClass) {
        this.styleClass = styleClass;
    }


    private Object[] _values;

    public Object saveState(FacesContext _context) {
        if (_values == null) {
            _values = new Object[4];
        }
        _values[0] = super.saveState(_context);
        _values[1] = layout;
        _values[2] = style;
        _values[3] = styleClass;
        return _values;
}


    public void restoreState(FacesContext _context, Object _state) {
        _values = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.layout = (java.lang.String) _values[1];
        this.style = (java.lang.String) _values[2];
        this.styleClass = (java.lang.String) _values[3];
    }


    private void handleAttribute(String name, Object value) {
        List<String> setAttributes = (List<String>) this.getAttributes().get("javax.faces.component.UIComponentBase.attributesThatAreSet");
        if (setAttributes == null) {
            String cname = this.getClass().getName();
            if (cname != null && cname.startsWith(OPTIMIZED_PACKAGE)) {
                setAttributes = new ArrayList<String>(6);
                this.getAttributes().put("javax.faces.component.UIComponentBase.attributesThatAreSet", setAttributes);
            }
        }
        if (setAttributes != null) {
            if (value == null) {
                ValueExpression ve = getValueExpression(name);
                if (ve == null) {
                    setAttributes.remove(name);
                }
            } else if (!setAttributes.contains(name)) {
                setAttributes.add(name);
            }
        }
    }

}
