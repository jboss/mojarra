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
 * <p>Renders child components in a table, starting a new
 * row after the specified number of columns.</p>
 * <p>By default, the <code>rendererType</code> property must be set to "<code>javax.faces.Grid</code>".
 * This value can be changed by calling the <code>setRendererType()</code> method.</p>
 */
public class HtmlPanelGrid extends javax.faces.component.UIPanel {



    private static final String OPTIMIZED_PACKAGE = "javax.faces.component.";

    public HtmlPanelGrid() {
        super();
        setRendererType("javax.faces.Grid");
    }


    /**
     * <p>The standard component type for this component.</p>
     */
    public static final String COMPONENT_TYPE = "javax.faces.HtmlPanelGrid";


    private java.lang.String bgcolor;
    /**
     * <p>Return the value of the <code>bgcolor</code> property.</p>
     * <p>Contents: Name or code of the background color for this table.
     */
    public java.lang.String getBgcolor() {
        if (null != this.bgcolor) {
            return this.bgcolor;
        }
        ValueExpression _ve = getValueExpression("bgcolor");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>bgcolor</code> property.</p>
     */
    public void setBgcolor(java.lang.String bgcolor) {
        this.bgcolor = bgcolor;
        handleAttribute("bgcolor", bgcolor);
    }


    private java.lang.Integer border;
    /**
     * <p>Return the value of the <code>border</code> property.</p>
     * <p>Contents: Width (in pixels) of the border to be drawn
     * around this table.
     */
    public int getBorder() {
        if (null != this.border) {
            return this.border;
        }
        ValueExpression _ve = getValueExpression("border");
        if (_ve != null) {
            return (java.lang.Integer) _ve.getValue(getFacesContext().getELContext());
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /**
     * <p>Set the value of the <code>border</code> property.</p>
     */
    public void setBorder(int border) {
        this.border = border;
        handleAttribute("border", border);
    }


    private java.lang.String captionClass;
    /**
     * <p>Return the value of the <code>captionClass</code> property.</p>
     * <p>Contents: Space-separated list of CSS style class(es) that will be
     * applied to any caption generated for this table.
     */
    public java.lang.String getCaptionClass() {
        if (null != this.captionClass) {
            return this.captionClass;
        }
        ValueExpression _ve = getValueExpression("captionClass");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>captionClass</code> property.</p>
     */
    public void setCaptionClass(java.lang.String captionClass) {
        this.captionClass = captionClass;
    }


    private java.lang.String captionStyle;
    /**
     * <p>Return the value of the <code>captionStyle</code> property.</p>
     * <p>Contents: CSS style(s) to be applied when this caption is rendered.
     */
    public java.lang.String getCaptionStyle() {
        if (null != this.captionStyle) {
            return this.captionStyle;
        }
        ValueExpression _ve = getValueExpression("captionStyle");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>captionStyle</code> property.</p>
     */
    public void setCaptionStyle(java.lang.String captionStyle) {
        this.captionStyle = captionStyle;
    }


    private java.lang.String cellpadding;
    /**
     * <p>Return the value of the <code>cellpadding</code> property.</p>
     * <p>Contents: Definition of how much space the user agent should
     * leave between the border of each cell and its contents.
     */
    public java.lang.String getCellpadding() {
        if (null != this.cellpadding) {
            return this.cellpadding;
        }
        ValueExpression _ve = getValueExpression("cellpadding");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>cellpadding</code> property.</p>
     */
    public void setCellpadding(java.lang.String cellpadding) {
        this.cellpadding = cellpadding;
        handleAttribute("cellpadding", cellpadding);
    }


    private java.lang.String cellspacing;
    /**
     * <p>Return the value of the <code>cellspacing</code> property.</p>
     * <p>Contents: Definition of how much space the user agent should
     * leave between the left side of the table and the
     * leftmost column, the top of the table and the top of
     * the top side of the topmost row, and so on for the
     * right and bottom of the table.  It also specifies
     * the amount of space to leave between cells.
     */
    public java.lang.String getCellspacing() {
        if (null != this.cellspacing) {
            return this.cellspacing;
        }
        ValueExpression _ve = getValueExpression("cellspacing");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>cellspacing</code> property.</p>
     */
    public void setCellspacing(java.lang.String cellspacing) {
        this.cellspacing = cellspacing;
        handleAttribute("cellspacing", cellspacing);
    }


    private java.lang.String columnClasses;
    /**
     * <p>Return the value of the <code>columnClasses</code> property.</p>
     * <p>Contents: Comma-delimited list of CSS style classes that will be applied
     * to the columns of this table.  A space separated list of
     * classes may also be specified for any individual column.  If
     * the number of elements in this list is less than the number of
     * columns specified in the "columns" attribute, no "class"
     * attribute is output for each column greater than the number of
     * elements in the list.  If the number of elements in the list
     * is greater than the number of columns specified in the
     * "columns" attribute, the elements at the posisiton in the list
     * after the value of the "columns" attribute are ignored.
     */
    public java.lang.String getColumnClasses() {
        if (null != this.columnClasses) {
            return this.columnClasses;
        }
        ValueExpression _ve = getValueExpression("columnClasses");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>columnClasses</code> property.</p>
     */
    public void setColumnClasses(java.lang.String columnClasses) {
        this.columnClasses = columnClasses;
    }


    private java.lang.Integer columns;
    /**
     * <p>Return the value of the <code>columns</code> property.</p>
     * <p>Contents: The number of columns to render before
     * starting a new row.
     */
    public int getColumns() {
        if (null != this.columns) {
            return this.columns;
        }
        ValueExpression _ve = getValueExpression("columns");
        if (_ve != null) {
            return (java.lang.Integer) _ve.getValue(getFacesContext().getELContext());
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /**
     * <p>Set the value of the <code>columns</code> property.</p>
     */
    public void setColumns(int columns) {
        this.columns = columns;
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


    private java.lang.String footerClass;
    /**
     * <p>Return the value of the <code>footerClass</code> property.</p>
     * <p>Contents: Space-separated list of CSS style class(es) that will be
     * applied to any footer generated for this table.
     */
    public java.lang.String getFooterClass() {
        if (null != this.footerClass) {
            return this.footerClass;
        }
        ValueExpression _ve = getValueExpression("footerClass");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>footerClass</code> property.</p>
     */
    public void setFooterClass(java.lang.String footerClass) {
        this.footerClass = footerClass;
    }


    private java.lang.String frame;
    /**
     * <p>Return the value of the <code>frame</code> property.</p>
     * <p>Contents: Code specifying which sides of the frame surrounding
     * this table will be visible.  Valid values are:
     * none (no sides, default value); above (top side only);
     * below (bottom side only); hsides (top and bottom sides
     * only); vsides (right and left sides only); lhs (left
     * hand side only); rhs (right hand side only); box
     * (all four sides); and border (all four sides).
     */
    public java.lang.String getFrame() {
        if (null != this.frame) {
            return this.frame;
        }
        ValueExpression _ve = getValueExpression("frame");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>frame</code> property.</p>
     */
    public void setFrame(java.lang.String frame) {
        this.frame = frame;
        handleAttribute("frame", frame);
    }


    private java.lang.String headerClass;
    /**
     * <p>Return the value of the <code>headerClass</code> property.</p>
     * <p>Contents: Space-separated list of CSS style class(es) that will be
     * applied to any header generated for this table.
     */
    public java.lang.String getHeaderClass() {
        if (null != this.headerClass) {
            return this.headerClass;
        }
        ValueExpression _ve = getValueExpression("headerClass");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>headerClass</code> property.</p>
     */
    public void setHeaderClass(java.lang.String headerClass) {
        this.headerClass = headerClass;
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
        handleAttribute("onclick", onclick);
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


    private java.lang.String rowClasses;
    /**
     * <p>Return the value of the <code>rowClasses</code> property.</p>
     * <p>Contents: Comma-delimited list of CSS style classes that will be applied
     * to the rows of this table.  A space separated list of classes
     * may also be specified for any individual row.  Thes styles are
     * applied, in turn, to each row in the table.  For example, if
     * the list has two elements, the first style class in the list
     * is applied to the first row, the second to the second row, the
     * first to the third row, the second to the fourth row, etc.  In
     * other words, we keep iterating through the list until we reach
     * the end, and then we start at the beginning again.
     */
    public java.lang.String getRowClasses() {
        if (null != this.rowClasses) {
            return this.rowClasses;
        }
        ValueExpression _ve = getValueExpression("rowClasses");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>rowClasses</code> property.</p>
     */
    public void setRowClasses(java.lang.String rowClasses) {
        this.rowClasses = rowClasses;
    }


    private java.lang.String rules;
    /**
     * <p>Return the value of the <code>rules</code> property.</p>
     * <p>Contents: Code specifying which rules will appear between cells
     * within this table.  Valid values are:  none (no rules,
     * default value); groups (between row groups); rows
     * (between rows only); cols (between columns only); and
     * all (between all rows and columns).
     */
    public java.lang.String getRules() {
        if (null != this.rules) {
            return this.rules;
        }
        ValueExpression _ve = getValueExpression("rules");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>rules</code> property.</p>
     */
    public void setRules(java.lang.String rules) {
        this.rules = rules;
        handleAttribute("rules", rules);
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


    private java.lang.String summary;
    /**
     * <p>Return the value of the <code>summary</code> property.</p>
     * <p>Contents: Summary of this table's purpose and structure, for
     * user agents rendering to non-visual media such as
     * speech and Braille.
     */
    public java.lang.String getSummary() {
        if (null != this.summary) {
            return this.summary;
        }
        ValueExpression _ve = getValueExpression("summary");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>summary</code> property.</p>
     */
    public void setSummary(java.lang.String summary) {
        this.summary = summary;
        handleAttribute("summary", summary);
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


    private java.lang.String width;
    /**
     * <p>Return the value of the <code>width</code> property.</p>
     * <p>Contents: Width of the entire table, for visual user agents.
     */
    public java.lang.String getWidth() {
        if (null != this.width) {
            return this.width;
        }
        ValueExpression _ve = getValueExpression("width");
        if (_ve != null) {
            return (java.lang.String) _ve.getValue(getFacesContext().getELContext());
        } else {
            return null;
        }
    }

    /**
     * <p>Set the value of the <code>width</code> property.</p>
     */
    public void setWidth(java.lang.String width) {
        this.width = width;
        handleAttribute("width", width);
    }


    private Object[] _values;

    public Object saveState(FacesContext _context) {
        if (_values == null) {
            _values = new Object[31];
        }
        _values[0] = super.saveState(_context);
        _values[1] = bgcolor;
        _values[2] = border;
        _values[3] = captionClass;
        _values[4] = captionStyle;
        _values[5] = cellpadding;
        _values[6] = cellspacing;
        _values[7] = columnClasses;
        _values[8] = columns;
        _values[9] = dir;
        _values[10] = footerClass;
        _values[11] = frame;
        _values[12] = headerClass;
        _values[13] = lang;
        _values[14] = onclick;
        _values[15] = ondblclick;
        _values[16] = onkeydown;
        _values[17] = onkeypress;
        _values[18] = onkeyup;
        _values[19] = onmousedown;
        _values[20] = onmousemove;
        _values[21] = onmouseout;
        _values[22] = onmouseover;
        _values[23] = onmouseup;
        _values[24] = rowClasses;
        _values[25] = rules;
        _values[26] = style;
        _values[27] = styleClass;
        _values[28] = summary;
        _values[29] = title;
        _values[30] = width;
        return _values;
}


    public void restoreState(FacesContext _context, Object _state) {
        _values = (Object[]) _state;
        super.restoreState(_context, _values[0]);
        this.bgcolor = (java.lang.String) _values[1];
        this.border = (java.lang.Integer) _values[2];
        this.captionClass = (java.lang.String) _values[3];
        this.captionStyle = (java.lang.String) _values[4];
        this.cellpadding = (java.lang.String) _values[5];
        this.cellspacing = (java.lang.String) _values[6];
        this.columnClasses = (java.lang.String) _values[7];
        this.columns = (java.lang.Integer) _values[8];
        this.dir = (java.lang.String) _values[9];
        this.footerClass = (java.lang.String) _values[10];
        this.frame = (java.lang.String) _values[11];
        this.headerClass = (java.lang.String) _values[12];
        this.lang = (java.lang.String) _values[13];
        this.onclick = (java.lang.String) _values[14];
        this.ondblclick = (java.lang.String) _values[15];
        this.onkeydown = (java.lang.String) _values[16];
        this.onkeypress = (java.lang.String) _values[17];
        this.onkeyup = (java.lang.String) _values[18];
        this.onmousedown = (java.lang.String) _values[19];
        this.onmousemove = (java.lang.String) _values[20];
        this.onmouseout = (java.lang.String) _values[21];
        this.onmouseover = (java.lang.String) _values[22];
        this.onmouseup = (java.lang.String) _values[23];
        this.rowClasses = (java.lang.String) _values[24];
        this.rules = (java.lang.String) _values[25];
        this.style = (java.lang.String) _values[26];
        this.styleClass = (java.lang.String) _values[27];
        this.summary = (java.lang.String) _values[28];
        this.title = (java.lang.String) _values[29];
        this.width = (java.lang.String) _values[30];
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
