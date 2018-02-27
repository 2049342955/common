/*
 * #{copyright}#
 */
package com.demo.common;

/**
 * 订单行状态枚举.
 *
 * @author chenjingxiong
 */
public enum OrderLineStatus {

    /**
     * 待烹饪
     */
    WAIT_COOK("WAIT_COOK"),
    /**
     * 取消.
     */
    WITHDRAW("WITHDRAW"),
    /**
     * 烹饪中.
     */
    COOKING("COOKING"),
    /**
     * 烹饪完成，待上菜
     */
    WAIT_SERVE("WAIT_SERVE"),
    /**
     * 已上菜.
     */
    SERVED("SERVED"),
    /**
     * 完成.
     */
    COMPLETED("COMPLETED");

    private String value;

    OrderLineStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
