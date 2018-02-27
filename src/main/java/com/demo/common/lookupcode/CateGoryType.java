package com.demo.common.lookupcode;

/**
 * author : Sdniu
 * date   : 2017/7/26.
 * description :
 */
public enum CateGoryType {
    /**
     * 餐具
     */
    TABLE_WARE("TABLE_WARE", "餐具"),

    /**
     * 用户不可称重
     */
    WEIGHT_DISABLE("WEIGHT_DISABLE", "用户不可称重"),
    /**
     * 用户可称重
     */
    WEIGHT_ENABLE("WEIGHT_ENABLE", "用户可称重"),
    /**
     * 普通
     */
    NORMAL("NORMAL", "普通菜品");
    public String lookupCode;
    public String meaning;

    CateGoryType(String lookupCode, String meaning) {
        this.lookupCode = lookupCode;
        this.meaning = meaning;
    }
}
