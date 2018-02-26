package com.demo.common.lookupcode;

/**
 * author : Sdniu
 * date   : 2017/11/2.
 * description : 退款状态
 */
public class OrderRefundStatus {
    /**
     * 已申请
     */
    public static final String APPLIED = "APPLIED";
    /**
     * 平台审核通过
     */
    public static final String PF_APPROVED = "PF_APPROVED";
    /**
     * 平台审核拒绝
     */
    public static final String PF_REJECTED = "PF_REJECTED";
    /**
     * 商家审核通过
     */
    public static final String MCHT_APPROVED = "MCHT_APPROVED";
    /**
     * 商家审核拒绝
     */
    public static final String MCHT_REJECTED = "MCHT_REJECTED";
    /**
     * 退款中
     */
    public static final String REFUNDING = "REFUNDING";

    /**
     * 已退款
     */
    public static final String REFUNDED = "REFUNDED";
}
