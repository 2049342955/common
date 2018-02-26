package com.demo.error;

import com.pudding.core.exception.MultiLangException;
import com.pudding.core.exception.error.code.BaseErrorEntity;

/**
 * author : Sdniu
 * date   : 2017/7/18.
 * description :
 */
public enum CommonErrorsEnum implements BaseErrorEntity {
    AUTH_ERR("1002", "msg.error.common.auth_error"),
    RLOCK_HAS_LOCKED("1003", "msh.error.common.rlock_has_locked"),
    RLOCK_TRY_LOCK_ERROR("1004", "msg.error.common.rlock_try_lock_error"),
    RLOCK_GET_CONFIG_ERROR("1005", "msg.error.common.rlock_get_config_error"),
    WX_ERROR("1006", "msg.error.common.wx_error"),
    CANT_REMOVE_UN_NORMAL_ITEM("1007", "msg.error.cant_remove_un_normal_item"),
    ERROR_TABLE_AUTH_CODE("1008", "msg.error.error_table_auth_code"),
    CART_NOT_INIT("1009", "msg.error.cart_not_init"),
    CART_PUT_SPE_ERROR("1010", "msg.error.cat_put_spe_error"),
    CART_PUT_TAG_ERROR("1010", "msg.error.cat_put_tag_error"),
    NOT_FOUND_ITEM("1011", "msg.error.not_found_item"),
    /**
     * 没有找到可以撤单的数量
     */
    NOT_ORDERED_LINE_COUNT("1012", "msg.error.not_ordered_line_count"),
    /**
     * 非法撤销类型
     */
    CANT_WITHDRAW_TYPE("1013", "msg.error.cant_withdraw_type"),
    /**
     * 没有可以下厨的菜品
     */
    HAS_NOT_NOMARL_ITEM("1014", "msg.error.has_not_normal_item"),
    /**
     * 购物车为null
     */
    CART_IS_NULL("1015", "msg.error.user.shop_cart_is_null"),
    /**
     * 购物车行重量为null
     */
    WEIGHT_IS_NULL("1016", "msg.error.weight_is_null"),
    /**
     * 验证码操作对象不一致
     */
    ERROR_VERIFY_CODE_SENDER("1017", "msg.error.error_verify_code_sender"),
    ERROR_ORDER_PAID("1018", "msg.error.order_paid"),
    /**
     * 订单版本不一致
     */
    ERROR_ORDER_VERSION("1019", "msg.error.order_version"),
    /**
     * 当前没有进行中订单
     */
    ERROR_HAS_NOT_GOING_ORDER("1020", "msg.error.has_not_going_order");
    private String errorCode;
    private String messageCode;
    public MultiLangException exception;

    @Override
    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessageCode() {
        return messageCode;
    }

    CommonErrorsEnum(String errorCode, String messageCode) {
        this.errorCode = errorCode;
        this.messageCode = messageCode;
        this.exception = new MultiLangException(errorCode, messageCode);
    }

}
