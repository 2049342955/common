package com.demo.common;

/**
 * Created by luye on 2017/12/18.
 */
public enum VerifyCodeEventEnums {

    //用户注册-验证码
    COMP_USR_REGISTER_EVENT("auth_server", "register");

    public String application;
    public String event;

    VerifyCodeEventEnums(String application, String event) {
        this.application = application;
        this.event = event;
    }

    public String getKey(String id) {
        return this.application + "_" + this.event + "_" + id;
    }

}
