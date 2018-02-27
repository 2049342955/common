package com.demo.common;

/**
 * author : Sdniu
 * date   : 2017/7/21.
 * description :
 */
public class RLockPrefixConstant {
    /**
     * 编号
     */
    public static final String SEQ_NUM_LOCK = "seq_number_";
    /**
     * 餐桌信息
     */
    public static final String TABLE_LOCK = "rlock_table_info_";
    /**
     * 购物车
     */
    public static final String SHOP_CART_LOCK = "shop_cart_lock_";
    /**
     * 订单整单
     */
    public static final String ORDER_SUMMARY_LOCK = "order_summary_lock_";
    /**
     * 订单行
     */
    public static final String ORDER_LINE_LOCK = "order_line_lock_";


    /**
     * 菜单分类锁
     */
    public static final String MENU_CATEGORY_SAVE_LOCK = "menu_category_save_lock_";

    /**
     * 菜单菜品锁
     */
    public static final String MENU_ITEM_SAVE_LOCK = "menu_item_save_lock_";

    /**
     * 门店员工锁
     */
    public static final String STORE_EMPLOYEE_SAVE_LOCK = "menu_item_save_lock_";

    /**
     * 同步付款请求表至付款表锁
     */
    public static final String PAY_REQUEST_TO_PAYMENT_SYNC_LOCK = "pay_request2payment_sync_lock_";

    /**
     * 同步付款表至商家收款表锁
     */
    public static final String PAYMENT_TO_RECEIVABLE_SYNC_LOCK = "pay_payment2receivable_sync_lock_";

    /**
     * 用户领取优惠券锁
     */
    public static final String COUPON_RECEIVE_LOCK = "coupon_receive_lock";

    /**
     * 修改优惠券状态的锁
     */
    public static final String COUPON_UPDATE_STATUS_LOCK = "coupons_update_status_lock_";


}
