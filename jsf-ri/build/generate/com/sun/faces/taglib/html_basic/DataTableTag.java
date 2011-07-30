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


public class DataTableTag extends UIComponentELTag {


    // Setter Methods
    // PROPERTY: first
    private javax.el.ValueExpression first;
    public void setFirst(javax.el.ValueExpression first) {
        this.first = first;
    }

    // PROPERTY: rows
    private javax.el.ValueExpression rows;
    public void setRows(javax.el.ValueExpression rows) {
        this.rows = rows;
    }

    // PROPERTY: value
    private javax.el.ValueExpression value;
    public void setValue(javax.el.ValueExpression value) {
        this.value = value;
    }

    // PROPERTY: var
    private java.lang.String _var;
    public void setVar(java.lang.String _var) {
        this._var = _var;
    }

    // PROPERTY: bgcolor
    private javax.el.ValueExpression bgcolor;
    public void setBgcolor(javax.el.ValueExpression bgcolor) {
        this.bgcolor = bgcolor;
    }

    // PROPERTY: border
    private javax.el.ValueExpression border;
    public void setBorder(javax.el.ValueExpression border) {
        this.border = border;
    }

    // PROPERTY: captionClass
    private javax.el.ValueExpression captionClass;
    public void setCaptionClass(javax.el.ValueExpression captionClass) {
        this.captionClass = captionClass;
    }

    // PROPERTY: captionStyle
    private javax.el.ValueExpression captionStyle;
    public void setCaptionStyle(javax.el.ValueExpression captionStyle) {
        this.captionStyle = captionStyle;
    }

    // PROPERTY: cellpadding
    private javax.el.ValueExpression cellpadding;
    public void setCellpadding(javax.el.ValueExpression cellpadding) {
        this.cellpadding = cellpadding;
    }

    // PROPERTY: cellspacing
    private javax.el.ValueExpression cellspacing;
    public void setCellspacing(javax.el.ValueExpression cellspacing) {
        this.cellspacing = cellspacing;
    }

    // PROPERTY: columnClasses
    private javax.el.ValueExpression columnClasses;
    public void setColumnClasses(javax.el.ValueExpression columnClasses) {
        this.columnClasses = columnClasses;
    }

    // PROPERTY: dir
    private javax.el.ValueExpression dir;
    public void setDir(javax.el.ValueExpression dir) {
        this.dir = dir;
    }

    // PROPERTY: footerClass
    private javax.el.ValueExpression footerClass;
    public void setFooterClass(javax.el.ValueExpression footerClass) {
        this.footerClass = footerClass;
    }

    // PROPERTY: frame
    private javax.el.ValueExpression frame;
    public void setFrame(javax.el.ValueExpression frame) {
        this.frame = frame;
    }

    // PROPERTY: headerClass
    private javax.el.ValueExpression headerClass;
    public void setHeaderClass(javax.el.ValueExpression headerClass) {
        this.headerClass = headerClass;
    }

    // PROPERTY: lang
    private javax.el.ValueExpression lang;
    public void setLang(javax.el.ValueExpression lang) {
        this.lang = lang;
    }

    // PROPERTY: onclick
    private javax.el.ValueExpression onclick;
    public void setOnclick(javax.el.ValueExpression onclick) {
        this.onclick = onclick;
    }

    // PROPERTY: ondblclick
    private javax.el.ValueExpression ondblclick;
    public void setOndblclick(javax.el.ValueExpression ondblclick) {
        this.ondblclick = ondblclick;
    }

    // PROPERTY: onkeydown
    private javax.el.ValueExpression onkeydown;
    public void setOnkeydown(javax.el.ValueExpression onkeydown) {
        this.onkeydown = onkeydown;
    }

    // PROPERTY: onkeypress
    private javax.el.ValueExpression onkeypress;
    public void setOnkeypress(javax.el.ValueExpression onkeypress) {
        this.onkeypress = onkeypress;
    }

    // PROPERTY: onkeyup
    private javax.el.ValueExpression onkeyup;
    public void setOnkeyup(javax.el.ValueExpression onkeyup) {
        this.onkeyup = onkeyup;
    }

    // PROPERTY: onmousedown
    private javax.el.ValueExpression onmousedown;
    public void setOnmousedown(javax.el.ValueExpression onmousedown) {
        this.onmousedown = onmousedown;
    }

    // PROPERTY: onmousemove
    private javax.el.ValueExpression onmousemove;
    public void setOnmousemove(javax.el.ValueExpression onmousemove) {
        this.onmousemove = onmousemove;
    }

    // PROPERTY: onmouseout
    private javax.el.ValueExpression onmouseout;
    public void setOnmouseout(javax.el.ValueExpression onmouseout) {
        this.onmouseout = onmouseout;
    }

    // PROPERTY: onmouseover
    private javax.el.ValueExpression onmouseover;
    public void setOnmouseover(javax.el.ValueExpression onmouseover) {
        this.onmouseover = onmouseover;
    }

    // PROPERTY: onmouseup
    private javax.el.ValueExpression onmouseup;
    public void setOnmouseup(javax.el.ValueExpression onmouseup) {
        this.onmouseup = onmouseup;
    }

    // PROPERTY: rowClasses
    private javax.el.ValueExpression rowClasses;
    public void setRowClasses(javax.el.ValueExpression rowClasses) {
        this.rowClasses = rowClasses;
    }

    // PROPERTY: rules
    private javax.el.ValueExpression rules;
    public void setRules(javax.el.ValueExpression rules) {
        this.rules = rules;
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

    // PROPERTY: summary
    private javax.el.ValueExpression summary;
    public void setSummary(javax.el.ValueExpression summary) {
        this.summary = summary;
    }

    // PROPERTY: title
    private javax.el.ValueExpression title;
    public void setTitle(javax.el.ValueExpression title) {
        this.title = title;
    }

    // PROPERTY: width
    private javax.el.ValueExpression width;
    public void setWidth(javax.el.ValueExpression width) {
        this.width = width;
    }


    // General Methods
    public String getRendererType() {
        return "javax.faces.Table";
    }

    public String getComponentType() {
        return "javax.faces.HtmlDataTable";
    }

    protected void setProperties(UIComponent component) {
        super.setProperties(component);
        javax.faces.component.UIData data = null;
        try {
            data = (javax.faces.component.UIData) component;
        } catch (ClassCastException cce) {
            throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected: javax.faces.component.UIData.  Perhaps you're missing a tag?");
        }

        if (first != null) {
            data.setValueExpression("first", first);
        }
        if (rows != null) {
            data.setValueExpression("rows", rows);
        }
        if (value != null) {
            data.setValueExpression("value", value);
        }
        if (_var != null) {
            data.setVar(_var);
        }
        if (bgcolor != null) {
            data.setValueExpression("bgcolor", bgcolor);
        }
        if (border != null) {
            data.setValueExpression("border", border);
        }
        if (captionClass != null) {
            data.setValueExpression("captionClass", captionClass);
        }
        if (captionStyle != null) {
            data.setValueExpression("captionStyle", captionStyle);
        }
        if (cellpadding != null) {
            data.setValueExpression("cellpadding", cellpadding);
        }
        if (cellspacing != null) {
            data.setValueExpression("cellspacing", cellspacing);
        }
        if (columnClasses != null) {
            data.setValueExpression("columnClasses", columnClasses);
        }
        if (dir != null) {
            data.setValueExpression("dir", dir);
        }
        if (footerClass != null) {
            data.setValueExpression("footerClass", footerClass);
        }
        if (frame != null) {
            data.setValueExpression("frame", frame);
        }
        if (headerClass != null) {
            data.setValueExpression("headerClass", headerClass);
        }
        if (lang != null) {
            data.setValueExpression("lang", lang);
        }
        if (onclick != null) {
            data.setValueExpression("onclick", onclick);
        }
        if (ondblclick != null) {
            data.setValueExpression("ondblclick", ondblclick);
        }
        if (onkeydown != null) {
            data.setValueExpression("onkeydown", onkeydown);
        }
        if (onkeypress != null) {
            data.setValueExpression("onkeypress", onkeypress);
        }
        if (onkeyup != null) {
            data.setValueExpression("onkeyup", onkeyup);
        }
        if (onmousedown != null) {
            data.setValueExpression("onmousedown", onmousedown);
        }
        if (onmousemove != null) {
            data.setValueExpression("onmousemove", onmousemove);
        }
        if (onmouseout != null) {
            data.setValueExpression("onmouseout", onmouseout);
        }
        if (onmouseover != null) {
            data.setValueExpression("onmouseover", onmouseover);
        }
        if (onmouseup != null) {
            data.setValueExpression("onmouseup", onmouseup);
        }
        if (rowClasses != null) {
            data.setValueExpression("rowClasses", rowClasses);
        }
        if (rules != null) {
            data.setValueExpression("rules", rules);
        }
        if (style != null) {
            data.setValueExpression("style", style);
        }
        if (styleClass != null) {
            data.setValueExpression("styleClass", styleClass);
        }
        if (summary != null) {
            data.setValueExpression("summary", summary);
        }
        if (title != null) {
            data.setValueExpression("title", title);
        }
        if (width != null) {
            data.setValueExpression("width", width);
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
        this.first = null;
        this.rows = null;
        this.value = null;
        this._var = null;

        // rendered attributes
        this.bgcolor = null;
        this.border = null;
        this.captionClass = null;
        this.captionStyle = null;
        this.cellpadding = null;
        this.cellspacing = null;
        this.columnClasses = null;
        this.dir = null;
        this.footerClass = null;
        this.frame = null;
        this.headerClass = null;
        this.lang = null;
        this.onclick = null;
        this.ondblclick = null;
        this.onkeydown = null;
        this.onkeypress = null;
        this.onkeyup = null;
        this.onmousedown = null;
        this.onmousemove = null;
        this.onmouseout = null;
        this.onmouseover = null;
        this.onmouseup = null;
        this.rowClasses = null;
        this.rules = null;
        this.style = null;
        this.styleClass = null;
        this.summary = null;
        this.title = null;
        this.width = null;
    }

    public String getDebugString() {
        return "id: " + this.getId() + " class: " + this.getClass().getName();
    }

}
