package com.demo.common;

/**
 * author : Sdniu
 * date   : 2017/8/17.
 * description : 单位分类
 */
public enum UomClassTypeCode {

    WEIGHT("WEIGHT", "重量"),
    QUANTITY("QUANTITY", "数量"),
    VOLUME("VOLUME", "体积");

    UomClassTypeCode(String code, String meaning) {
        this.code = code;
        this.meaning = meaning;
    }

    public String code;
    public String meaning;

}
