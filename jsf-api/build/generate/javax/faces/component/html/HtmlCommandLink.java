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
 * <p>Represents an HTML <code>a</code> element for a hyperlink that acts
 * like a submit button.  This component must be placed inside
 * a form, and requires JavaScript to be enabled in the client.</p>
 * <p>By default, the <code>rendererType</code> property must be set to "<code>javax.faces.Link</code>".
 * This value can be changed by calling the <code>setRendererType()</code> method.</p>
 */
public class HtmlCommandLink extends javax.faces.component.UICommand {



    private static final String OPTIMIZED_PACKAGE = "javax.faces.component.";

    public HtmlCommandLink() {
        super();
        setRendererType("javax.faces.Link");
    }


    /**
     * <p>The standard component type for this component.</p>
     */
    public static final String COMPONENT_TYPE = "javax.faces.HtmlCommandLink";


    private java.lang.String accesskey;
    /**
     * <p>Return the value of the <code>accesskey</code> property.</p>
     * <p>Contents: Access key that, when pressed, transfers focus
     * to this element.
     */
    public java.lang.String getAccesskey() {
        if (null != this.accesskey) {
            return this.accesskey;
        }
        ValueExpression _ve = getValueExpression("accesskey");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>accesskey</code> property.</p>
     */
    public void setAccesskey(java.lang.String accesskey) {
        this.accesskey = accesskey;
        handleAttribute("accesskey", accesskey);
    }


    private java.lang.String charset;
    /**
     * <p>Return the value of the <code>charset</code> property.</p>
     * <p>Contents: The character encoding of the resource designated
     * by this hyperlink.
     */
    public java.lang.String getCharset() {
        if (null != this.charset) {
            return this.charset;
        }
        ValueExpression _ve = getValueExpression("charset");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>charset</code> property.</p>
     */
    public void setCharset(java.lang.String charset) {
        this.charset = charset;
        handleAttribute("charset", charset);
    }


    private java.lang.String coords;
    /**
     * <p>Return the value of the <code>coords</code> property.</p>
     * <p>Contents: The position and shape of the hot spot on the screen
     * (for use in client-side image maps).
     */
    public java.lang.String getCoords() {
        if (null != this.coords) {
            return this.coords;
        }
        ValueExpression _ve = getValueExpression("coords");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>coords</code> property.</p>
     */
    public void setCoords(java.lang.String coords) {
        this.coords = coords;
        handleAttribute("coords", coords);
    }


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


    private java.lang.Boolean disabled;
    /**
     * <p>Return the value of the <code>disabled</code> property.</p>
     * <p>Contents: Flag indicating that this element must never
     * receive focus or be included in a subsequent
     * submit.
     */
    public boolean isDisabled() {
        if (null != this.disabled) {
            return this.disabled;
        }
        ValueExpression _ve = getValueExpression("disabled");
        if (_ve != null) {
            return (java.lang.Boolean) _ve.getValue(getFacesContext().getELContext());
        } else {
            return false;
        }
    }

    /**
     * <p>Set the value of the <code>disabled</code> property.</p>
     */
    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }


    private java.lang.String hreflang;
    /**
     * <p>Return the value of the <code>hreflang</code> property.</p>
     * <p>Contents: The language code of the resource designated
     * by this hyperlink.
     */
    public java.lang.String getHreflang() {
        if (null != this.hreflang) {
            return this.hreflang;
        }
        ValueExpression _ve = getValueExpression("hreflang");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>hreflang</code> property.</p>
     */
    public void setHreflang(java.lang.String hreflang) {
        this.hreflang = hreflang;
        handleAttribute("hreflang", hreflang);
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


    private java.lang.String onblur;
    /**
     * <p>Return the value of the <code>onblur</code> property.</p>
     * <p>Contents: Javascript code executed when this element loses focus.
     */
    public java.lang.String getOnblur() {
        if (null != this.onblur) {
            return this.onblur;
        }
        ValueExpression _ve = getValueExpression("onblur");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>onblur</code> property.</p>
     */
    public void setOnblur(java.lang.String onblur) {
        this.onblur = onblur;
        handleAttribute("onblur", onblur);
    }


    private java.lang.String onclick;
    /**
     * <p>Return the value of the <code>onclick</code> property.</p>
     * <p>Contents: Javascript code executed when a pointer button is
     * clicked over this element.
     */
    public java.lang.String getOnclick() {
        if (null != this.onclick) {
            return this.onclick;
        }
        ValueExpression _ve = getValueExpression("onclick");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>onclick</code> property.</p>
     */
    public void setOnclick(java.lang.String onclick) {
        this.onclick = onclick;
    }


    private java.lang.String ondblclick;
    /**
     * <p>Return the value of the <code>ondblclick</code> property.</p>
     * <p>Contents: Javascript code executed when a pointer button is
     * double clicked over this element.
     */
    public java.lang.String getOndblclick() {
        if (null != this.ondblclick) {
            return this.ondblclick;
        }
        ValueExpression _ve = getValueExpression("ondblclick");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>ondblclick</code> property.</p>
     */
    public void setOndblclick(java.lang.String ondblclick) {
        this.ondblclick = ondblclick;
        handleAttribute("ondblclick", ondblclick);
    }


    private java.lang.String onfocus;
    /**
     * <p>Return the value of the <code>onfocus</code> property.</p>
     * <p>Contents: Javascript code executed when this element receives focus.
     */
    public java.lang.String getOnfocus() {
        if (null != this.onfocus) {
            return this.onfocus;
        }
        ValueExpression _ve = getValueExpression("onfocus");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>onfocus</code> property.</p>
     */
    public void setOnfocus(java.lang.String onfocus) {
        this.onfocus = onfocus;
        handleAttribute("onfocus", onfocus);
    }


    private java.lang.String onkeydown;
    /**
     * <p>Return the value of the <code>onkeydown</code> property.</p>
     * <p>Contents: Javascript code executed when a key is
     * pressed down over this element.
     */
    public java.lang.String getOnkeydown() {
        if (null != this.onkeydown) {
            return this.onkeydown;
        }
        ValueExpression _ve = getValueExpression("onkeydown");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>onkeydown</code> property.</p>
     */
    public void setOnkeydown(java.lang.String onkeydown) {
        this.onkeydown = onkeydown;
        handleAttribute("onkeydown", onkeydown);
    }


    private java.lang.String onkeypress;
    /**
     * <p>Return the value of the <code>onkeypress</code> property.</p>
     * <p>Contents: Javascript code executed when a key is
     * pressed and released over this element.
     */
    public java.lang.String getOnkeypress() {
        if (null != this.onkeypress) {
            return this.onkeypress;
        }
        ValueExpression _ve = getValueExpression("onkeypress");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>onkeypress</code> property.</p>
     */
    public void setOnkeypress(java.lang.String onkeypress) {
        this.onkeypress = onkeypress;
        handleAttribute("onkeypress", onkeypress);
    }


    private java.lang.String onkeyup;
    /**
     * <p>Return the value of the <code>onkeyup</code> property.</p>
     * <p>Contents: Javascript code executed when a key is
     * released over this element.
     */
    public java.lang.String getOnkeyup() {
        if (null != this.onkeyup) {
            return this.onkeyup;
        }
        ValueExpression _ve = getValueExpression("onkeyup");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>onkeyup</code> property.</p>
     */
    public void setOnkeyup(java.lang.String onkeyup) {
        this.onkeyup = onkeyup;
        handleAttribute("onkeyup", onkeyup);
    }


    private java.lang.String onmousedown;
    /**
     * <p>Return the value of the <code>onmousedown</code> property.</p>
     * <p>Contents: Javascript code executed when a pointer button is
     * pressed down over this element.
     */
    public java.lang.String getOnmousedown() {
        if (null != this.onmousedown) {
            return this.onmousedown;
        }
        ValueExpression _ve = getValueExpression("onmousedown");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>onmousedown</code> property.</p>
     */
    public void setOnmousedown(java.lang.String onmousedown) {
        this.onmousedown = onmousedown;
        handleAttribute("onmousedown", onmousedown);
    }


    private java.lang.String onmousemove;
    /**
     * <p>Return the value of the <code>onmousemove</code> property.</p>
     * <p>Contents: Javascript code executed when a pointer button is
     * moved within this element.
     */
    public java.lang.String getOnmousemove() {
        if (null != this.onmousemove) {
            return this.onmousemove;
        }
        ValueExpression _ve = getValueExpression("onmousemove");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>onmousemove</code> property.</p>
     */
    public void setOnmousemove(java.lang.String onmousemove) {
        this.onmousemove = onmousemove;
        handleAttribute("onmousemove", onmousemove);
    }


    private java.lang.String onmouseout;
    /**
     * <p>Return the value of the <code>onmouseout</code> property.</p>
     * <p>Contents: Javascript code executed when a pointer button is
     * moved away from this element.
     */
    public java.lang.String getOnmouseout() {
        if (null != this.onmouseout) {
            return this.onmouseout;
        }
        ValueExpression _ve = getValueExpression("onmouseout");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>onmouseout</code> property.</p>
     */
    public void setOnmouseout(java.lang.String onmouseout) {
        this.onmouseout = onmouseout;
        handleAttribute("onmouseout", onmouseout);
    }


    private java.lang.String onmouseover;
    /**
     * <p>Return the value of the <code>onmouseover</code> property.</p>
     * <p>Contents: Javascript code executed when a pointer button is
     * moved onto this element.
     */
    public java.lang.String getOnmouseover() {
        if (null != this.onmouseover) {
            return this.onmouseover;
        }
        ValueExpression _ve = getValueExpression("onmouseover");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>onmouseover</code> property.</p>
     */
    public void setOnmouseover(java.lang.String onmouseover) {
        this.onmouseover = onmouseover;
        handleAttribute("onmouseover", onmouseover);
    }


    private java.lang.String onmouseup;
    /**
     * <p>Return the value of the <code>onmouseup</code> property.</p>
     * <p>Contents: Javascript code executed when a pointer button is
     * released over this element.
     */
    public java.lang.String getOnmouseup() {
        if (null != this.onmouseup) {
            return this.onmouseup;
        }
        ValueExpression _ve = getValueExpression("onmouseup");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>onmouseup</code> property.</p>
     */
    public void setOnmouseup(java.lang.String onmouseup) {
        this.onmouseup = onmouseup;
        handleAttribute("onmouseup", onmouseup);
    }


    private java.lang.String rel;
    /**
     * <p>Return the value of the <code>rel</code> property.</p>
     * <p>Contents: The relationship from the current document
     * to the anchor specified by this hyperlink.  The value of this attribute is a space-separated
     * list of link types.
     */
    public java.lang.String getRel() {
        if (null != this.rel) {
            return this.rel;
        }
        ValueExpression _ve = getValueExpression("rel");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>rel</code> property.</p>
     */
    public void setRel(java.lang.String rel) {
        this.rel = rel;
        handleAttribute("rel", rel);
    }


    private java.lang.String rev;
    /**
     * <p>Return the value of the <code>rev</code> property.</p>
     * <p>Contents: A reverse link from the anchor specified
     * by this hyperlink to the current document.
     * The value of this attribute is a space-separated
     * list of link types.
     */
    public java.lang.String getRev() {
        if (null != this.rev) {
            return this.rev;
        }
        ValueExpression _ve = getValueExpression("rev");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>rev</code> property.</p>
     */
    public void setRev(java.lang.String rev) {
        this.rev = rev;
        handleAttribute("rev", rev);
    }


    private java.lang.String shape;
    /**
     * <p>Return the value of the <code>shape</code> property.</p>
     * <p>Contents: The shape of the hot spot on the screen
     * (for use in client-side image maps).  Valid
     * values are:  default (entire region); rect
     * (rectangular region); circle (circular region);
     * and poly (polygonal region).
     */
    public java.lang.String getShape() {
        if (null != this.shape) {
            return this.shape;
        }
        ValueExpression _ve = getValueExpression("shape");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>shape</code> property.</p>
     */
    public void setShape(java.lang.String shape) {
        this.shape = shape;
        handleAttribute("shape", shape);
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


    private java.lang.String tabindex;
    /**
     * <p>Return the value of the <code>tabindex</code> property.</p>
     * <p>Contents: Position of this element in the tabbing order
     * for the current document.  This value must be
     * an integer between 0 and 32767.
     */
    public java.lang.String getTabindex() {
        if (null != this.tabindex) {
            return this.tabindex;
        }
        ValueExpression _ve = getValueExpression("tabindex");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>tabindex</code> property.</p>
     */
    public void setTabindex(java.lang.String tabindex) {
        this.tabindex = tabindex;
        handleAttribute("tabindex", tabindex);
    }


    private java.lang.String target;
    /**
     * <p>Return the value of the <code>target</code> property.</p>
     * <p>Contents: Name of a frame where the resource
     * retrieved via this hyperlink is to
     * be displayed.
     */
    public java.lang.String getTarget() {
        if (null != this.target) {
            return this.target;
        }
        ValueExpression _ve = getValueExpression("target");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>target</code> property.</p>
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
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


    private java.lang.String type;
    /**
     * <p>Return the value of the <code>type</code> property.</p>
     * <p>Contents: The content type of the resource designated
     * by this hyperlink.
     */
    public java.lang.String getType() {
        if (null != this.type) {
            return this.type;
        }
        ValueExpression _ve = getValueExpression("type");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>type</code> property.</p>
     */
    public void setType(java.lang.String type) {
        this.type = type;
        handleAttribute("type", type);
    }


    private Object[] _values;

    public Object saveState(FacesContext _context) {
        if (_values == null) {
            _values = new Object[29];
        }
        _values[0] = super.saveState(_context);
        _values[1] = accesskey;
        _values[2] = charset;
        _values[3] = coords;
        _values[4] = dir;
        _values[5] = disabled;
        _values[6] = hreflang;
        _values[7] = lang;
        _values[8] = onblur;
        _values[9] = onclick;
        _values[10] = ondblclick;
        _values[11] = onfocus;
        _values[12] = onkeydown;
        _values[13] = onkeypress;
        _values[14] = onkeyup;
        _values[15] = onmousedown;
        _values[16] = onmousemove;
        _values[17] = onmouseout;
        _values[18] = onmouseover;
        _values[19] = onmouseup;
        _values[20] = rel;
        _values[21] = rev;
        _values[22] = shape;
        _values[23] = style;
        _values[24] = styleClass;
        _values[25] = tabindex;
        _values[26] = target;
        _values[27] = title;
        _values[28] = type;
        return _values;
}


    public void restoreState(FacesContext _context, Object _state) {
        _values = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.accesskey = (java.lang.String) _values[1];
        this.charset = (java.lang.String) _values[2];
        this.coords = (java.lang.String) _values[3];
        this.dir = (java.lang.String) _values[4];
        this.disabled = (java.lang.Boolean) _values[5];
        this.hreflang = (java.lang.String) _values[6];
        this.lang = (java.lang.String) _values[7];
        this.onblur = (java.lang.String) _values[8];
        this.onclick = (java.lang.String) _values[9];
        this.ondblclick = (java.lang.String) _values[10];
        this.onfocus = (java.lang.String) _values[11];
        this.onkeydown = (java.lang.String) _values[12];
        this.onkeypress = (java.lang.String) _values[13];
        this.onkeyup = (java.lang.String) _values[14];
        this.onmousedown = (java.lang.String) _values[15];
        this.onmousemove = (java.lang.String) _values[16];
        this.onmouseout = (java.lang.String) _values[17];
        this.onmouseover = (java.lang.String) _values[18];
        this.onmouseup = (java.lang.String) _values[19];
        this.rel = (java.lang.String) _values[20];
        this.rev = (java.lang.String) _values[21];
        this.shape = (java.lang.String) _values[22];
        this.style = (java.lang.String) _values[23];
        this.styleClass = (java.lang.String) _values[24];
        this.tabindex = (java.lang.String) _values[25];
        this.target = (java.lang.String) _values[26];
        this.title = (java.lang.String) _values[27];
        this.type = (java.lang.String) _values[28];
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
