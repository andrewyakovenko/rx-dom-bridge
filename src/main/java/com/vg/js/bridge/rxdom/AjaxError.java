package com.vg.js.bridge.rxdom;

import org.stjs.javascript.XMLHttpRequest;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.DOMEvent;

@STJSBridge
@SyntheticType
public class AjaxError {

    public String type;
    public int status;
    public XMLHttpRequest xhr;
    public DOMEvent originalEvent;

}
