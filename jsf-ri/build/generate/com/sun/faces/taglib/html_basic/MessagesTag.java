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

package com.sun.faces.taglib.html_basic;

import com.sun.faces.util.Util;
import java.io.IOException;
import javax.el.*;
import javax.faces.*;
import javax.faces.component.*;
import javax.faces.context.*;
import javax.faces.convert.*;
import javax.faces.el.*;
import javax.faces.event.*;
import javax.faces.validator.*;
import javax.faces.webapp.*;
import javax.servlet.jsp.JspException;


/*
 * ******* GENERATED CODE - DO NOT EDIT *******
 */


public class MessagesTag extends UIComponentELTag {


    // Setter Methods
    // PROPERTY: globalOnly
    private javax.el.ValueExpression globalOnly;
    public void setGlobalOnly(javax.el.ValueExpression globalOnly) {
        this.globalOnly = globalOnly;
    }

    // PROPERTY: showDetail
    private javax.el.ValueExpression showDetail;
    public void setShowDetail(javax.el.ValueExpression showDetail) {
        this.showDetail = showDetail;
    }

    // PROPERTY: showSummary
    private javax.el.ValueExpression showSummary;
    public void setShowSummary(javax.el.ValueExpression showSummary) {
        this.showSummary = showSummary;
    }

    // PROPERTY: dir
    private javax.el.ValueExpression dir;
    public void setDir(javax.el.ValueExpression dir) {
        this.dir = dir;
    }

    // PROPERTY: errorClass
    private javax.el.ValueExpression errorClass;
    public void setErrorClass(javax.el.ValueExpression errorClass) {
        this.errorClass = errorClass;
    }

    // PROPERTY: errorStyle
    private javax.el.ValueExpression errorStyle;
    public void setErrorStyle(javax.el.ValueExpression errorStyle) {
        this.errorStyle = errorStyle;
    }

    // PROPERTY: fatalClass
    private javax.el.ValueExpression fatalClass;
    public void setFatalClass(javax.el.ValueExpression fatalClass) {
        this.fatalClass = fatalClass;
    }

    // PROPERTY: fatalStyle
    private javax.el.ValueExpression fatalStyle;
    public void setFatalStyle(javax.el.ValueExpression fatalStyle) {
        this.fatalStyle = fatalStyle;
    }

    // PROPERTY: infoClass
    private javax.el.ValueExpression infoClass;
    public void setInfoClass(javax.el.ValueExpression infoClass) {
        this.infoClass = infoClass;
    }

    // PROPERTY: infoStyle
    private javax.el.ValueExpression infoStyle;
    public void setInfoStyle(javax.el.ValueExpression infoStyle) {
        this.infoStyle = infoStyle;
    }

    // PROPERTY: lang
    private javax.el.ValueExpression lang;
    public void setLang(javax.el.ValueExpression lang) {
        this.lang = lang;
    }

    // PROPERTY: layout
    private javax.el.ValueExpression layout;
    public void setLayout(javax.el.ValueExpression layout) {
        this.layout = layout;
    }

    // PROPERTY: style
    private javax.el.ValueExpression style;
    public void setStyle(javax.el.ValueExpression style) {
        this.style = style;
    }

    // PROPERTY: styleClass
    private javax.el.ValueExpression styleClass;
    public void setStyleClass(javax.el.ValueExpression styleClass) {
        this.styleClass = styleClass;
    }

    // PROPERTY: title
    private javax.el.ValueExpression title;
    public void setTitle(javax.el.ValueExpression title) {
        this.title = title;
    }

    // PROPERTY: tooltip
    private javax.el.ValueExpression tooltip;
    public void setTooltip(javax.el.ValueExpression tooltip) {
        this.tooltip = tooltip;
    }

    // PROPERTY: warnClass
    private javax.el.ValueExpression warnClass;
    public void setWarnClass(javax.el.ValueExpression warnClass) {
        this.warnClass = warnClass;
    }

    // PROPERTY: warnStyle
    private javax.el.ValueExpression warnStyle;
    public void setWarnStyle(javax.el.ValueExpression warnStyle) {
        this.warnStyle = warnStyle;
    }


    // General Methods
    public String getRendererType() {
        return "javax.faces.Messages";
    }

    public String getComponentType() {
        return "javax.faces.HtmlMessages";
    }

    protected void setProperties(UIComponent component) {
        super.setProperties(component);
        javax.faces.component.UIMessages messages = null;
        try {
            messages = (javax.faces.component.UIMessages) component;
        } catch (ClassCastException cce) {
            throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected: javax.faces.component.UIMessages.  Perhaps you're missing a tag?");
        }

        if (globalOnly != null) {
            messages.setValueExpression("globalOnly", globalOnly);
        }
        if (showDetail != null) {
            messages.setValueExpression("showDetail", showDetail);
        }
        if (showSummary != null) {
            messages.setValueExpression("showSummary", showSummary);
        }
        if (dir != null) {
            messages.setValueExpression("dir", dir);
        }
        if (errorClass != null) {
            messages.setValueExpression("errorClass", errorClass);
        }
        if (errorStyle != null) {
            messages.setValueExpression("errorStyle", errorStyle);
        }
        if (fatalClass != null) {
            messages.setValueExpression("fatalClass", fatalClass);
        }
        if (fatalStyle != null) {
            messages.setValueExpression("fatalStyle", fatalStyle);
        }
        if (infoClass != null) {
            messages.setValueExpression("infoClass", infoClass);
        }
        if (infoStyle != null) {
            messages.setValueExpression("infoStyle", infoStyle);
        }
        if (lang != null) {
            messages.setValueExpression("lang", lang);
        }
        if (layout != null) {
            messages.setValueExpression("layout", layout);
        }
        if (style != null) {
            messages.setValueExpression("style", style);
        }
        if (styleClass != null) {
            messages.setValueExpression("styleClass", styleClass);
        }
        if (title != null) {
            messages.setValueExpression("title", title);
        }
        if (tooltip != null) {
            messages.setValueExpression("tooltip", tooltip);
        }
        if (warnClass != null) {
            messages.setValueExpression("warnClass", warnClass);
        }
        if (warnStyle != null) {
            messages.setValueExpression("warnStyle", warnStyle);
        }
    }
    // Methods From TagSupport
    public int doStartTag() throws JspException {
        try {
            return super.doStartTag();
        } catch (Exception e) {
            Throwable root = e;
            while (root.getCause() != null) {
                root = root.getCause();
            }
            throw new JspException(root);
        }
    }

    public int doEndTag() throws JspException {
        try {
            return super.doEndTag();
        } catch (Exception e) {
            Throwable root = e;
            while (root.getCause() != null) {
                root = root.getCause();
            }
            throw new JspException(root);
        }
    }

    // RELEASE
    public void release() {
        super.release();

        // component properties
        this.globalOnly = null;
        this.showDetail = null;
        this.showSummary = null;

        // rendered attributes
        this.dir = null;
        this.errorClass = null;
        this.errorStyle = null;
        this.fatalClass = null;
        this.fatalStyle = null;
        this.infoClass = null;
        this.infoStyle = null;
        this.lang = null;
        this.layout = null;
        this.style = null;
        this.styleClass = null;
        this.title = null;
        this.tooltip = null;
        this.warnClass = null;
        this.warnStyle = null;
    }

    public String getDebugString() {
        return "id: " + this.getId() + " class: " + this.getClass().getName();
    }

}
