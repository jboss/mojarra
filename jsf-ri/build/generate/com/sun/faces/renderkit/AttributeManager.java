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

package com.sun.faces.renderkit;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * This class contains mappings between the standard components
 * and the passthrough attributes associated with them.
 */
public class AttributeManager {

    private static Map<String,String[]> ATTRIBUTE_LOOKUP;
        static {
            HashMap<String,String[]> map = new HashMap<String,String[]>();
            map.put("CommandButton",
                    new String[] {
                            "accesskey",
                            "alt",
                            "dir",
                            "lang",
                            "onblur",
                            "onchange",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onselect",
                            "style",
                            "tabindex",
                            "title",
                });
            map.put("CommandLink",
                    new String[] {
                            "accesskey",
                            "charset",
                            "coords",
                            "dir",
                            "hreflang",
                            "lang",
                            "onblur",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "rel",
                            "rev",
                            "shape",
                            "style",
                            "tabindex",
                            "title",
                            "type",
                });
            map.put("DataTable",
                    new String[] {
                            "bgcolor",
                            "border",
                            "cellpadding",
                            "cellspacing",
                            "dir",
                            "frame",
                            "lang",
                            "onclick",
                            "ondblclick",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "rules",
                            "style",
                            "summary",
                            "title",
                            "width",
                });
            map.put("FormForm",
                    new String[] {
                            "accept",
                            "dir",
                            "enctype",
                            "lang",
                            "onclick",
                            "ondblclick",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onreset",
                            "onsubmit",
                            "style",
                            "target",
                            "title",
                });
            map.put("GraphicImage",
                    new String[] {
                            "alt",
                            "dir",
                            "height",
                            "lang",
                            "longdesc",
                            "onclick",
                            "ondblclick",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "style",
                            "title",
                            "usemap",
                            "width",
                });
            map.put("InputHidden",
                    new String[] {
                });
            map.put("InputSecret",
                    new String[] {
                            "accesskey",
                            "alt",
                            "dir",
                            "lang",
                            "maxlength",
                            "onblur",
                            "onchange",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onselect",
                            "size",
                            "style",
                            "tabindex",
                            "title",
                });
            map.put("InputText",
                    new String[] {
                            "accesskey",
                            "alt",
                            "dir",
                            "lang",
                            "maxlength",
                            "onblur",
                            "onchange",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onselect",
                            "size",
                            "style",
                            "tabindex",
                            "title",
                });
            map.put("InputTextarea",
                    new String[] {
                            "accesskey",
                            "cols",
                            "dir",
                            "lang",
                            "onblur",
                            "onchange",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onselect",
                            "rows",
                            "style",
                            "tabindex",
                            "title",
                });
            map.put("MessageMessage",
                    new String[] {
                            "dir",
                            "lang",
                            "style",
                            "title",
                });
            map.put("MessagesMessages",
                    new String[] {
                            "dir",
                            "lang",
                            "style",
                            "title",
                });
            map.put("OutputFormat",
                    new String[] {
                            "dir",
                            "lang",
                            "style",
                            "title",
                });
            map.put("OutputLabel",
                    new String[] {
                            "accesskey",
                            "dir",
                            "lang",
                            "onblur",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "style",
                            "tabindex",
                            "title",
                });
            map.put("OutputLink",
                    new String[] {
                            "accesskey",
                            "charset",
                            "coords",
                            "dir",
                            "hreflang",
                            "lang",
                            "onblur",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "rel",
                            "rev",
                            "shape",
                            "style",
                            "tabindex",
                            "title",
                            "type",
                });
            map.put("OutputText",
                    new String[] {
                            "dir",
                            "lang",
                            "style",
                            "title",
                });
            map.put("PanelGrid",
                    new String[] {
                            "bgcolor",
                            "border",
                            "cellpadding",
                            "cellspacing",
                            "dir",
                            "frame",
                            "lang",
                            "onclick",
                            "ondblclick",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "rules",
                            "style",
                            "summary",
                            "title",
                            "width",
                });
            map.put("PanelGroup",
                    new String[] {
                            "style",
                });
            map.put("SelectBooleanCheckbox",
                    new String[] {
                            "accesskey",
                            "dir",
                            "lang",
                            "onblur",
                            "onchange",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onselect",
                            "style",
                            "tabindex",
                            "title",
                });
            map.put("SelectManyCheckbox",
                    new String[] {
                            "accesskey",
                            "dir",
                            "lang",
                            "onblur",
                            "onchange",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onselect",
                            "tabindex",
                            "title",
                });
            map.put("SelectManyListbox",
                    new String[] {
                            "accesskey",
                            "dir",
                            "lang",
                            "onblur",
                            "onchange",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onselect",
                            "style",
                            "tabindex",
                            "title",
                });
            map.put("SelectManyMenu",
                    new String[] {
                            "accesskey",
                            "dir",
                            "lang",
                            "onblur",
                            "onchange",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onselect",
                            "style",
                            "tabindex",
                            "title",
                });
            map.put("SelectOneListbox",
                    new String[] {
                            "accesskey",
                            "dir",
                            "lang",
                            "onblur",
                            "onchange",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onselect",
                            "style",
                            "tabindex",
                            "title",
                });
            map.put("SelectOneMenu",
                    new String[] {
                            "accesskey",
                            "dir",
                            "lang",
                            "onblur",
                            "onchange",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onselect",
                            "style",
                            "tabindex",
                            "title",
                });
            map.put("SelectOneRadio",
                    new String[] {
                            "accesskey",
                            "dir",
                            "lang",
                            "onblur",
                            "onchange",
                            "onclick",
                            "ondblclick",
                            "onfocus",
                            "onkeydown",
                            "onkeypress",
                            "onkeyup",
                            "onmousedown",
                            "onmousemove",
                            "onmouseout",
                            "onmouseover",
                            "onmouseup",
                            "onselect",
                            "tabindex",
                            "title",
                });
            ATTRIBUTE_LOOKUP = Collections.unmodifiableMap(map);
        }

    public enum Key {
        COMMANDBUTTON("CommandButton"),
        COMMANDLINK("CommandLink"),
        DATATABLE("DataTable"),
        FORMFORM("FormForm"),
        GRAPHICIMAGE("GraphicImage"),
        INPUTHIDDEN("InputHidden"),
        INPUTSECRET("InputSecret"),
        INPUTTEXT("InputText"),
        INPUTTEXTAREA("InputTextarea"),
        MESSAGEMESSAGE("MessageMessage"),
        MESSAGESMESSAGES("MessagesMessages"),
        OUTPUTFORMAT("OutputFormat"),
        OUTPUTLABEL("OutputLabel"),
        OUTPUTLINK("OutputLink"),
        OUTPUTTEXT("OutputText"),
        PANELGRID("PanelGrid"),
        PANELGROUP("PanelGroup"),
        SELECTBOOLEANCHECKBOX("SelectBooleanCheckbox"),
        SELECTMANYCHECKBOX("SelectManyCheckbox"),
        SELECTMANYLISTBOX("SelectManyListbox"),
        SELECTMANYMENU("SelectManyMenu"),
        SELECTONELISTBOX("SelectOneListbox"),
        SELECTONEMENU("SelectOneMenu"),
        SELECTONERADIO("SelectOneRadio");
        private String key;
        Key(String key) {
            this.key = key;
        }
        public String value() {
            return this.key;
        }
    }


    public static String[] getAttributes(Key key) {
        return ATTRIBUTE_LOOKUP.get(key.value());
    }
}
