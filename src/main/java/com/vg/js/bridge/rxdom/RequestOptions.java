package com.vg.js.bridge.rxdom;

import com.vg.js.bridge.Rx;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge
@SyntheticType
public class RequestOptions {

    public static final String GET = "GET";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static final String PATCH = "PATCH";
    public static final String DELETE = "DELETE";
    public static final String RESPONSE_TYPE_JSON = "json";
    public static final String RESPONSE_TYPE_TEXT = "text";
    public static final String RESPONSE_TYPE_BLOB = "blob";

    public boolean async;
    public Object body;
    public boolean crossDomain;
    public boolean withCredentials;
    public Object headers;
    public String method;
    public String password;
    public Rx.Observer progressObserver;
    public String responseType;
    public int timeout;
    public String url;
    public String user;

}
