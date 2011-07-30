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


public class SelectManyListboxTag extends UIComponentELTag {


    // Setter Methods
    // PROPERTY: converter
    private javax.el.ValueExpression converter;
    public void setConverter(javax.el.ValueExpression converter) {
        this.converter = converter;
    }

    // PROPERTY: converterMessage
    private javax.el.ValueExpression converterMessage;
    public void setConverterMessage(javax.el.ValueExpression converterMessage) {
        this.converterMessage = converterMessage;
    }

    // PROPERTY: immediate
    private javax.el.ValueExpression immediate;
    public void setImmediate(javax.el.ValueExpression immediate) {
        this.immediate = immediate;
    }

    // PROPERTY: required
    private javax.el.ValueExpression required;
    public void setRequired(javax.el.ValueExpression required) {
        this.required = required;
    }

    // PROPERTY: requiredMessage
    private javax.el.ValueExpression requiredMessage;
    public void setRequiredMessage(javax.el.ValueExpression requiredMessage) {
        this.requiredMessage = requiredMessage;
    }

    // PROPERTY: validator
    private javax.el.MethodExpression validator;
    public void setValidator(javax.el.MethodExpression validator) {
        this.validator = validator;
    }

    // PROPERTY: validatorMessage
    private javax.el.ValueExpression validatorMessage;
    public void setValidatorMessage(javax.el.ValueExpression validatorMessage) {
        this.validatorMessage = validatorMessage;
    }

    // PROPERTY: value
    private javax.el.ValueExpression value;
    public void setValue(javax.el.ValueExpression value) {
        this.value = value;
    }

    // PROPERTY: valueChangeListener
    private javax.el.MethodExpression valueChangeListener;
    public void setValueChangeListener(javax.el.MethodExpression valueChangeListener) {
        this.valueChangeListener = valueChangeListener;
    }

    // PROPERTY: accesskey
    private javax.el.ValueExpression accesskey;
    public void setAccesskey(javax.el.ValueExpression accesskey) {
        this.accesskey = accesskey;
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

    // PROPERTY: disabledClass
    private javax.el.ValueExpression disabledClass;
    public void setDisabledClass(javax.el.ValueExpression disabledClass) {
        this.disabledClass = disabledClass;
    }

    // PROPERTY: enabledClass
    private javax.el.ValueExpression enabledClass;
    public void setEnabledClass(javax.el.ValueExpression enabledClass) {
        this.enabledClass = enabledClass;
    }

    // PROPERTY: label
    private javax.el.ValueExpression label;
    public void setLabel(javax.el.ValueExpression label) {
        this.label = label;
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

    // PROPERTY: onchange
    private javax.el.ValueExpression onchange;
    public void setOnchange(javax.el.ValueExpression onchange) {
        this.onchange = onchange;
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

    // PROPERTY: onselect
    private javax.el.ValueExpression onselect;
    public void setOnselect(javax.el.ValueExpression onselect) {
        this.onselect = onselect;
    }

    // PROPERTY: readonly
    private javax.el.ValueExpression readonly;
    public void setReadonly(javax.el.ValueExpression readonly) {
        this.readonly = readonly;
    }

    // PROPERTY: size
    private javax.el.ValueExpression size;
    public void setSize(javax.el.ValueExpression size) {
        this.size = size;
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

    // PROPERTY: title
    private javax.el.ValueExpression title;
    public void setTitle(javax.el.ValueExpression title) {
        this.title = title;
    }


    // General Methods
    public String getRendererType() {
        return "javax.faces.Listbox";
    }

    public String getComponentType() {
        return "javax.faces.HtmlSelectManyListbox";
    }

    protected void setProperties(UIComponent component) {
        super.setProperties(component);
        javax.faces.component.UISelectMany selectmany = null;
        try {
            selectmany = (javax.faces.component.UISelectMany) component;
        } catch (ClassCastException cce) {
            throw new IllegalStateException("Component " + component.toString() + " not expected type.  Expected: javax.faces.component.UISelectMany.  Perhaps you're missing a tag?");
        }

        if (converter != null) {
            if (!converter.isLiteralText()) {
                selectmany.setValueExpression("converter", converter);
            } else {
                Converter conv = FacesContext.getCurrentInstance().getApplication().createConverter(converter.getExpressionString());
                selectmany.setConverter(conv);
            }
        }

        if (converterMessage != null) {
            selectmany.setValueExpression("converterMessage", converterMessage);
        }
        if (immediate != null) {
            selectmany.setValueExpression("immediate", immediate);
        }
        if (required != null) {
            selectmany.setValueExpression("required", required);
        }
        if (requiredMessage != null) {
            selectmany.setValueExpression("requiredMessage", requiredMessage);
        }
        if (validator != null) {
            selectmany.addValidator(new MethodExpressionValidator(validator));
        }
        if (validatorMessage != null) {
            selectmany.setValueExpression("validatorMessage", validatorMessage);
        }
        if (value != null) {
            selectmany.setValueExpression("value", value);
        }
        if (valueChangeListener != null) {
            selectmany.addValueChangeListener(new MethodExpressionValueChangeListener(valueChangeListener));
        }
        if (accesskey != null) {
            selectmany.setValueExpression("accesskey", accesskey);
        }
        if (dir != null) {
            selectmany.setValueExpression("dir", dir);
        }
        if (disabled != null) {
            selectmany.setValueExpression("disabled", disabled);
        }
        if (disabledClass != null) {
            selectmany.setValueExpression("disabledClass", disabledClass);
        }
        if (enabledClass != null) {
            selectmany.setValueExpression("enabledClass", enabledClass);
        }
        if (label != null) {
            selectmany.setValueExpression("label", label);
        }
        if (lang != null) {
            selectmany.setValueExpression("lang", lang);
        }
        if (onblur != null) {
            selectmany.setValueExpression("onblur", onblur);
        }
        if (onchange != null) {
            selectmany.setValueExpression("onchange", onchange);
        }
        if (onclick != null) {
            selectmany.setValueExpression("onclick", onclick);
        }
        if (ondblclick != null) {
            selectmany.setValueExpression("ondblclick", ondblclick);
        }
        if (onfocus != null) {
            selectmany.setValueExpression("onfocus", onfocus);
        }
        if (onkeydown != null) {
            selectmany.setValueExpression("onkeydown", onkeydown);
        }
        if (onkeypress != null) {
            selectmany.setValueExpression("onkeypress", onkeypress);
        }
        if (onkeyup != null) {
            selectmany.setValueExpression("onkeyup", onkeyup);
        }
        if (onmousedown != null) {
            selectmany.setValueExpression("onmousedown", onmousedown);
        }
        if (onmousemove != null) {
            selectmany.setValueExpression("onmousemove", onmousemove);
        }
        if (onmouseout != null) {
            selectmany.setValueExpression("onmouseout", onmouseout);
        }
        if (onmouseover != null) {
            selectmany.setValueExpression("onmouseover", onmouseover);
        }
        if (onmouseup != null) {
            selectmany.setValueExpression("onmouseup", onmouseup);
        }
        if (onselect != null) {
            selectmany.setValueExpression("onselect", onselect);
        }
        if (readonly != null) {
            selectmany.setValueExpression("readonly", readonly);
        }
        if (size != null) {
            selectmany.setValueExpression("size", size);
        }
        if (style != null) {
            selectmany.setValueExpression("style", style);
        }
        if (styleClass != null) {
            selectmany.setValueExpression("styleClass", styleClass);
        }
        if (tabindex != null) {
            selectmany.setValueExpression("tabindex", tabindex);
        }
        if (title != null) {
            selectmany.setValueExpression("title", title);
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
        this.converter = null;
        this.converterMessage = null;
        this.immediate = null;
        this.required = null;
        this.requiredMessage = null;
        this.validator = null;
        this.validatorMessage = null;
        this.value = null;
        this.valueChangeListener = null;

        // rendered attributes
        this.accesskey = null;
        this.dir = null;
        this.disabled = null;
        this.disabledClass = null;
        this.enabledClass = null;
        this.label = null;
        this.lang = null;
        this.onblur = null;
        this.onchange = null;
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
        this.onselect = null;
        this.readonly = null;
        this.size = null;
        this.style = null;
        this.styleClass = null;
        this.tabindex = null;
        this.title = null;
    }

    public String getDebugString() {
        return "id: " + this.getId() + " class: " + this.getClass().getName();
    }

}
