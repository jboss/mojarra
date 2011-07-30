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


public class CommandLinkTag extends UIComponentELTag {


    // Setter Methods
    // PROPERTY: action
    private javax.el.MethodExpression action;
    public void setAction(javax.el.MethodExpression action) {
        this.action = action;
    }

    // PROPERTY: actionListener
    private javax.el.MethodExpression actionListener;
    public void setActionListener(javax.el.MethodExpression actionListener) {
        this.actionListener = actionListener;
    }

    // PROPERTY: immediate
    private javax.el.ValueExpression immediate;
    public void setImmediate(javax.el.ValueExpression immediate) {
        this.immediate = immediate;
    }

    // PROPERTY: value
    private javax.el.ValueExpression value;
    public void setValue(javax.el.ValueExpression value) {
        this.value = value;
    }

    // PROPERTY: accesskey
    private javax.el.ValueExpression accesskey;
    public void setAccesskey(javax.el.ValueExpression accesskey) {
        this.accesskey = accesskey;
    }

    // PROPERTY: charset
    private javax.el.ValueExpression charset;
    public void setCharset(javax.el.ValueExpression charset) {
        this.charset = charset;
    }

    // PROPERTY: coords
    private javax.el.ValueExpression coords;
    public void setCoords(javax.el.ValueExpression coords) {
        this.coords = coords;
    }

    // PROPERTY: dir
    private javax.el.ValueExpression dir;
    public void setDir(javax.el.ValueExpression dir) {
        this.dir = dir;
    }

    // PROPERTY: disabled
    private javax.el.ValueExpression disabled;
    public void setDisabled(javax.el.ValueExpression disabled) {
        this.disabled = disabled;
    }

    // PROPERTY: hreflang
    private javax.el.ValueExpression hreflang;
    public void setHreflang(javax.el.ValueExpression hreflang) {
        this.hreflang = hreflang;
    }

    // PROPERTY: lang
    private javax.el.ValueExpression lang;
    public void setLang(javax.el.ValueExpression lang) {
        this.lang = lang;
    }

    // PROPERTY: onblur
    private javax.el.ValueExpression onblur;
    public void setOnblur(javax.el.ValueExpression onblur) {
        this.onblur = onblur;
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

    // PROPERTY: onfocus
    private javax.el.ValueExpression onfocus;
    public void setOnfocus(javax.el.ValueExpression onfocus) {
        this.onfocus = onfocus;
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

    // PROPERTY: rel
    private javax.el.ValueExpression rel;
    public void setRel(javax.el.ValueExpression rel) {
        this.rel = rel;
    }

    // PROPERTY: rev
    private javax.el.ValueExpression rev;
    public void setRev(javax.el.ValueExpression rev) {
        this.rev = rev;
    }

    // PROPERTY: shape
    private javax.el.ValueExpression shape;
    public void setShape(javax.el.ValueExpression shape) {
        this.shape = shape;
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

    // PROPERTY: tabindex
    private javax.el.ValueExpression tabindex;
    public void setTabindex(javax.el.ValueExpression tabindex) {
        this.tabindex = tabindex;
    }

    // PROPERTY: target
    private javax.el.ValueExpression target;
    public void setTarget(javax.el.ValueExpression target) {
        this.target = target;
    }

    // PROPERTY: title
    private javax.el.ValueExpression title;
    public void setTitle(javax.el.ValueExpression title) {
        this.title = title;
    }

    // PROPERTY: type
    private javax.el.ValueExpression type;
    public void setType(javax.el.ValueExpression type) {
        this.type = type;
    }


    // General Methods
    public String getRendererType() {
        return "javax.faces.Link";
    }

    public String getComponentType() {
        return "javax.faces.HtmlCommandLink";
    }

    protected void setProperties(UIComponent component) {
        super.setProperties(component);
        javax.faces.component.UICommand command = null;
        try {
            command = (javax.faces.component.UICommand) component;
        } catch (ClassCastException cce) {
            throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected: javax.faces.component.UICommand.  Perhaps you're missing a tag?");
        }

        if (action != null) {
            command.setActionExpression(action);
        }
        if (actionListener != null) {
            command.addActionListener(new MethodExpressionActionListener(actionListener));
        }
        if (immediate != null) {
            command.setValueExpression("immediate", immediate);
        }
        if (value != null) {
            command.setValueExpression("value", value);
        }
        if (accesskey != null) {
            command.setValueExpression("accesskey", accesskey);
        }
        if (charset != null) {
            command.setValueExpression("charset", charset);
        }
        if (coords != null) {
            command.setValueExpression("coords", coords);
        }
        if (dir != null) {
            command.setValueExpression("dir", dir);
        }
        if (disabled != null) {
            command.setValueExpression("disabled", disabled);
        }
        if (hreflang != null) {
            command.setValueExpression("hreflang", hreflang);
        }
        if (lang != null) {
            command.setValueExpression("lang", lang);
        }
        if (onblur != null) {
            command.setValueExpression("onblur", onblur);
        }
        if (onclick != null) {
            command.setValueExpression("onclick", onclick);
        }
        if (ondblclick != null) {
            command.setValueExpression("ondblclick", ondblclick);
        }
        if (onfocus != null) {
            command.setValueExpression("onfocus", onfocus);
        }
        if (onkeydown != null) {
            command.setValueExpression("onkeydown", onkeydown);
        }
        if (onkeypress != null) {
            command.setValueExpression("onkeypress", onkeypress);
        }
        if (onkeyup != null) {
            command.setValueExpression("onkeyup", onkeyup);
        }
        if (onmousedown != null) {
            command.setValueExpression("onmousedown", onmousedown);
        }
        if (onmousemove != null) {
            command.setValueExpression("onmousemove", onmousemove);
        }
        if (onmouseout != null) {
            command.setValueExpression("onmouseout", onmouseout);
        }
        if (onmouseover != null) {
            command.setValueExpression("onmouseover", onmouseover);
        }
        if (onmouseup != null) {
            command.setValueExpression("onmouseup", onmouseup);
        }
        if (rel != null) {
            command.setValueExpression("rel", rel);
        }
        if (rev != null) {
            command.setValueExpression("rev", rev);
        }
        if (shape != null) {
            command.setValueExpression("shape", shape);
        }
        if (style != null) {
            command.setValueExpression("style", style);
        }
        if (styleClass != null) {
            command.setValueExpression("styleClass", styleClass);
        }
        if (tabindex != null) {
            command.setValueExpression("tabindex", tabindex);
        }
        if (target != null) {
            command.setValueExpression("target", target);
        }
        if (title != null) {
            command.setValueExpression("title", title);
        }
        if (type != null) {
            command.setValueExpression("type", type);
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
        this.action = null;
        this.actionListener = null;
        this.immediate = null;
        this.value = null;

        // rendered attributes
        this.accesskey = null;
        this.charset = null;
        this.coords = null;
        this.dir = null;
        this.disabled = null;
        this.hreflang = null;
        this.lang = null;
        this.onblur = null;
        this.onclick = null;
        this.ondblclick = null;
        this.onfocus = null;
        this.onkeydown = null;
        this.onkeypress = null;
        this.onkeyup = null;
        this.onmousedown = null;
        this.onmousemove = null;
        this.onmouseout = null;
        this.onmouseover = null;
        this.onmouseup = null;
        this.rel = null;
        this.rev = null;
        this.shape = null;
        this.style = null;
        this.styleClass = null;
        this.tabindex = null;
        this.target = null;
        this.title = null;
        this.type = null;
    }

    public String getDebugString() {
        return "id: " + this.getId() + " class: " + this.getClass().getName();
    }

}
