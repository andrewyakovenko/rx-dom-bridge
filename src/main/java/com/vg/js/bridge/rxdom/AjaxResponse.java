package com.vg.js.bridge.rxdom;

import org.stjs.javascript.XMLHttpRequest;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.DOMEvent;

@STJSBridge
@SyntheticType
public class AjaxResponse {

    public Object response;
    public int status;
    public String responseType;
    public XMLHttpRequest xhr;
    public DOMEvent originalEvent;

}
