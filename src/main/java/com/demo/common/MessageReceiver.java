package com.demo.common;

/**
 * author : Sdniu
 * date   : 2017/7/24.
 * description :
 */
public enum MessageReceiver {

    CART_PUT("shop_cart_", "CART_PUT"),
    CART_REMOVE("shop_cart_","CART_REMOVE"),
    CART_CLEAR("shop_cart_","CART_CLEAR");
    public String keyPrefix;
    public String event;

    MessageReceiver(String keyPrefix, String event) {
        this.keyPrefix = keyPrefix;
        this.event = event;
    }

}
