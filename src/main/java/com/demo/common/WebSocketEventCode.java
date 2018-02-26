package com.demo.common;

/**
 * author : Sdniu
 * date   : 2017/8/7.
 * description :
 */
public enum WebSocketEventCode {
    /**
     * 每个门店下的餐桌状态信息list推送
     */
    TABLE_STATUS_LIST_EVENT("table_status_list","table_status_list_event"),
    /**
     * 每一桌的餐桌状态信息推送
     */
    TABLE_STATUS_ITEM_EVENT("table_status_item","table_status_item_event"),
    /**
     * 购物车推送事件
     */
    SHOP_CART_EVENT("shop_cart", "shop_cart_event"),
    /**
     * 订单推送
     */
    ORDER_EVENT("order", "order_event"),
    /**
     * 服务铃
     */
    SERVICE_BELL("shop_app", "service_bell"),
    /**
     * 付款
     */
    ORDER_PAY_EVENT("order_pay", "order_pay_event"),
    /**
     * 厨房看板（刷新）
     */
    COOKING_BOARD_REFRESH_EVENT("ckds_app", "cooking_board_refresh_event"),
    /**
     * 上菜看板（刷新）
     */
    SERVING_BOARD_REFRESH_EVENT("ckds_app", "serving_board_refresh_event");

    public String key;
    public String code;

    WebSocketEventCode(String key, String code) {
        this.key = key;
        this.code = code;
    }

    public String getKey(String id) {
        return key + "_" + id;
    }

}
