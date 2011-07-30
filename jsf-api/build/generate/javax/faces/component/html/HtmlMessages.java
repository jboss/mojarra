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
 * 
 * <p>By default, the <code>rendererType</code> property must be set to "<code>javax.faces.Messages</code>".
 * This value can be changed by calling the <code>setRendererType()</code> method.</p>
 */
public class HtmlMessages extends javax.faces.component.UIMessages {



    private static final String OPTIMIZED_PACKAGE = "javax.faces.component.";

    public HtmlMessages() {
        super();
        setRendererType("javax.faces.Messages");
    }


    /**
     * <p>The standard component type for this component.</p>
     */
    public static final String COMPONENT_TYPE = "javax.faces.HtmlMessages";


    private java.lang.String dir;
    /**
     * <p>Return the value of the <code>dir</code> property.</p>
     * <p>Contents: Direction indication for text that does not inherit directionality.
     * Valid values are "LTR" (left-to-right) and "RTL" (right-to-left).
     */
    public java.lang.String getDir() {
        if (null != this.dir) {
            return this.dir;
        }
        ValueExpression _ve = getValueExpression("dir");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>dir</code> property.</p>
     */
    public void setDir(java.lang.String dir) {
        this.dir = dir;
        handleAttribute("dir", dir);
    }


    private java.lang.String errorClass;
    /**
     * <p>Return the value of the <code>errorClass</code> property.</p>
     * <p>Contents: CSS style class to apply to any message
     * with a severity class of "ERROR".
     */
    public java.lang.String getErrorClass() {
        if (null != this.errorClass) {
            return this.errorClass;
        }
        ValueExpression _ve = getValueExpression("errorClass");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>errorClass</code> property.</p>
     */
    public void setErrorClass(java.lang.String errorClass) {
        this.errorClass = errorClass;
    }


    private java.lang.String errorStyle;
    /**
     * <p>Return the value of the <code>errorStyle</code> property.</p>
     * <p>Contents: CSS style(s) to apply to any message
     * with a severity class of "ERROR".
     */
    public java.lang.String getErrorStyle() {
        if (null != this.errorStyle) {
            return this.errorStyle;
        }
        ValueExpression _ve = getValueExpression("errorStyle");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>errorStyle</code> property.</p>
     */
    public void setErrorStyle(java.lang.String errorStyle) {
        this.errorStyle = errorStyle;
    }


    private java.lang.String fatalClass;
    /**
     * <p>Return the value of the <code>fatalClass</code> property.</p>
     * <p>Contents: CSS style class to apply to any message
     * with a severity class of "FATAL".
     */
    public java.lang.String getFatalClass() {
        if (null != this.fatalClass) {
            return this.fatalClass;
        }
        ValueExpression _ve = getValueExpression("fatalClass");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>fatalClass</code> property.</p>
     */
    public void setFatalClass(java.lang.String fatalClass) {
        this.fatalClass = fatalClass;
    }


    private java.lang.String fatalStyle;
    /**
     * <p>Return the value of the <code>fatalStyle</code> property.</p>
     * <p>Contents: CSS style(s) to apply to any message
     * with a severity class of "FATAL".
     */
    public java.lang.String getFatalStyle() {
        if (null != this.fatalStyle) {
            return this.fatalStyle;
        }
        ValueExpression _ve = getValueExpression("fatalStyle");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>fatalStyle</code> property.</p>
     */
    public void setFatalStyle(java.lang.String fatalStyle) {
        this.fatalStyle = fatalStyle;
    }


    private java.lang.String infoClass;
    /**
     * <p>Return the value of the <code>infoClass</code> property.</p>
     * <p>Contents: CSS style class to apply to any message
     * with a severity class of "INFO".
     */
    public java.lang.String getInfoClass() {
        if (null != this.infoClass) {
            return this.infoClass;
        }
        ValueExpression _ve = getValueExpression("infoClass");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>infoClass</code> property.</p>
     */
    public void setInfoClass(java.lang.String infoClass) {
        this.infoClass = infoClass;
    }


    private java.lang.String infoStyle;
    /**
     * <p>Return the value of the <code>infoStyle</code> property.</p>
     * <p>Contents: CSS style(s) to apply to any message
     * with a severity class of "INFO".
     */
    public java.lang.String getInfoStyle() {
        if (null != this.infoStyle) {
            return this.infoStyle;
        }
        ValueExpression _ve = getValueExpression("infoStyle");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>infoStyle</code> property.</p>
     */
    public void setInfoStyle(java.lang.String infoStyle) {
        this.infoStyle = infoStyle;
    }


    private java.lang.String lang;
    /**
     * <p>Return the value of the <code>lang</code> property.</p>
     * <p>Contents: Code describing the language used in the generated markup
     * for this component.
     */
    public java.lang.String getLang() {
        if (null != this.lang) {
            return this.lang;
        }
        ValueExpression _ve = getValueExpression("lang");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>lang</code> property.</p>
     */
    public void setLang(java.lang.String lang) {
        this.lang = lang;
        handleAttribute("lang", lang);
    }


    private java.lang.String layout;
    /**
     * <p>Return the value of the <code>layout</code> property.</p>
     * <p>Contents: The type of layout markup to use when rendering
     * error messages.  Valid values are "table" (an HTML
     * table) and "list" (an HTML list).  If not specified,
     * the default value is "list".
     */
    public java.lang.String getLayout() {
        if (null != this.layout) {
            return this.layout;
        }
        ValueExpression _ve = getValueExpression("layout");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return "list";
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
     * as the "class" attribute on generated markup.
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


    private java.lang.String title;
    /**
     * <p>Return the value of the <code>title</code> property.</p>
     * <p>Contents: Advisory title information about markup elements generated
     * for this component.
     */
    public java.lang.String getTitle() {
        if (null != this.title) {
            return this.title;
        }
        ValueExpression _ve = getValueExpression("title");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>title</code> property.</p>
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
        handleAttribute("title", title);
    }


    private java.lang.Boolean tooltip;
    /**
     * <p>Return the value of the <code>tooltip</code> property.</p>
     * <p>Contents: Flag indicating whether the detail portion of the
     * message should be displayed as a tooltip.
     */
    public boolean isTooltip() {
        if (null != this.tooltip) {
            return this.tooltip;
        }
        ValueExpression _ve = getValueExpression("tooltip");
        if (_ve != null) {
            return (java.lang.Boolean) _ve.getValue(getFacesContext().getELContext());
        } else {
            return false;
        }
    }

    /**
     * <p>Set the value of the <code>tooltip</code> property.</p>
     */
    public void setTooltip(boolean tooltip) {
        this.tooltip = tooltip;
    }


    private java.lang.String warnClass;
    /**
     * <p>Return the value of the <code>warnClass</code> property.</p>
     * <p>Contents: CSS style class to apply to any message
     * with a severity class of "WARN".
     */
    public java.lang.String getWarnClass() {
        if (null != this.warnClass) {
            return this.warnClass;
        }
        ValueExpression _ve = getValueExpression("warnClass");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>warnClass</code> property.</p>
     */
    public void setWarnClass(java.lang.String warnClass) {
        this.warnClass = warnClass;
    }


    private java.lang.String warnStyle;
    /**
     * <p>Return the value of the <code>warnStyle</code> property.</p>
     * <p>Contents: CSS style(s) to apply to any message
     * with a severity class of "WARN".
     */
    public java.lang.String getWarnStyle() {
        if (null != this.warnStyle) {
            return this.warnStyle;
        }
        ValueExpression _ve = getValueExpression("warnStyle");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>warnStyle</code> property.</p>
     */
    public void setWarnStyle(java.lang.String warnStyle) {
        this.warnStyle = warnStyle;
    }


    private Object[] _values;

    public Object saveState(FacesContext _context) {
        if (_values == null) {
            _values = new Object[16];
        }
        _values[0] = super.saveState(_context);
        _values[1] = dir;
        _values[2] = errorClass;
        _values[3] = errorStyle;
        _values[4] = fatalClass;
        _values[5] = fatalStyle;
        _values[6] = infoClass;
        _values[7] = infoStyle;
        _values[8] = lang;
        _values[9] = layout;
        _values[10] = style;
        _values[11] = styleClass;
        _values[12] = title;
        _values[13] = tooltip;
        _values[14] = warnClass;
        _values[15] = warnStyle;
        return _values;
}


    public void restoreState(FacesContext _context, Object _state) {
        _values = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.dir = (java.lang.String) _values[1];
        this.errorClass = (java.lang.String) _values[2];
        this.errorStyle = (java.lang.String) _values[3];
        this.fatalClass = (java.lang.String) _values[4];
        this.fatalStyle = (java.lang.String) _values[5];
        this.infoClass = (java.lang.String) _values[6];
        this.infoStyle = (java.lang.String) _values[7];
        this.lang = (java.lang.String) _values[8];
        this.layout = (java.lang.String) _values[9];
        this.style = (java.lang.String) _values[10];
        this.styleClass = (java.lang.String) _values[11];
        this.title = (java.lang.String) _values[12];
        this.tooltip = (java.lang.Boolean) _values[13];
        this.warnClass = (java.lang.String) _values[14];
        this.warnStyle = (java.lang.String) _values[15];
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
