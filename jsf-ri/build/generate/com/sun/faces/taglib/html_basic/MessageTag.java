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


public class MessageTag extends UIComponentELTag {


    // Setter Methods
    // PROPERTY: for
    private javax.el.ValueExpression _for;
    public void setFor(javax.el.ValueExpression _for) {
        this._for = _for;
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
        return "javax.faces.Message";
    }

    public String getComponentType() {
        return "javax.faces.HtmlMessage";
    }

    protected void setProperties(UIComponent component) {
        super.setProperties(component);
        javax.faces.component.UIMessage message = null;
        try {
            message = (javax.faces.component.UIMessage) component;
        } catch (ClassCastException cce) {
            throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected: javax.faces.component.UIMessage.  Perhaps you're missing a tag?");
        }

        if (_for != null) {
            message.setValueExpression("for", _for);
        }
        if (showDetail != null) {
            message.setValueExpression("showDetail", showDetail);
        }
        if (showSummary != null) {
            message.setValueExpression("showSummary", showSummary);
        }
        if (dir != null) {
            message.setValueExpression("dir", dir);
        }
        if (errorClass != null) {
            message.setValueExpression("errorClass", errorClass);
        }
        if (errorStyle != null) {
            message.setValueExpression("errorStyle", errorStyle);
        }
        if (fatalClass != null) {
            message.setValueExpression("fatalClass", fatalClass);
        }
        if (fatalStyle != null) {
            message.setValueExpression("fatalStyle", fatalStyle);
        }
        if (infoClass != null) {
            message.setValueExpression("infoClass", infoClass);
        }
        if (infoStyle != null) {
            message.setValueExpression("infoStyle", infoStyle);
        }
        if (lang != null) {
            message.setValueExpression("lang", lang);
        }
        if (style != null) {
            message.setValueExpression("style", style);
        }
        if (styleClass != null) {
            message.setValueExpression("styleClass", styleClass);
        }
        if (title != null) {
            message.setValueExpression("title", title);
        }
        if (tooltip != null) {
            message.setValueExpression("tooltip", tooltip);
        }
        if (warnClass != null) {
            message.setValueExpression("warnClass", warnClass);
        }
        if (warnStyle != null) {
            message.setValueExpression("warnStyle", warnStyle);
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
        this._for = null;
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
