/*
 * #{copyright}#
 */
package com.demo.common;

/**
 * 订单状态枚举.
 *
 * @author chenjingxiong
 */
public enum OrderStatus {

    /**
     * 已下单.
     */
    ORDERED("ORDERED"),
    /**
     * 进行中
     */
    IN_PROCESS("IN_PROCESS"),
    /**
     * 取消.
     */
    CANCELED("CANCELED"),
    /**
     * 未支付.
     */
    UNPAID("UNPAID"),
    /**
     * 已支付.
     */
    PAID("PAID"),
    /**
     * 部分支付.
     */
    PARTIAL_PAID("PARTIAL_PAID"),
    /**
     * 完成.
     */
    COMPLETED("COMPLETED");

    private String value;

    OrderStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
