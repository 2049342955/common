package com.demo.common;

/**
 * author : Sdniu
 * date   : 2017/7/22.
 * description :
 */
public enum TagSourceRefCodeEnums {
    /**
     * 菜品tag信息
     */
    ITEM(SourceRefCode.STORE, SourceRefCode.ITEM);
    public String sourceRefCode;
    public String sourceSubRefCode;

    TagSourceRefCodeEnums(String sourceRefCode, String sourceSubRefCode) {
        this.sourceRefCode = sourceRefCode;
        this.sourceSubRefCode = sourceSubRefCode;
    }
}
