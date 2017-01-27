package com.vg.js.bridge.rxdom;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Rx {

    public static class DOM {

        native public static com.vg.js.bridge.Rx.Observable<AjaxResponse> ajax(String url);

        native public static com.vg.js.bridge.Rx.Observable<AjaxResponse> ajax(RequestOptions settings);

        native public static com.vg.js.bridge.Rx.Observable<AjaxResponse> get(String url);

        native public static com.vg.js.bridge.Rx.Observable<AjaxResponse> get(RequestOptions settings);

        native public static com.vg.js.bridge.Rx.Observable<AjaxResponse> post(String url, Object data);

        native public static com.vg.js.bridge.Rx.Observable<AjaxResponse> post(RequestOptions settings);

        native public static <T> com.vg.js.bridge.Rx.Observable<T> getJSON(String url);

    }

}
