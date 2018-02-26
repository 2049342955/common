package com.demo.common;

public class Constant {

    public static final String DELETED_FLAG_Y = "Y";
    public static final String DELETED_FLAG_N = "N";

    public static final String ENABLE_Y = "Y";
    public static final String ENABLE_N = "N";
    public static final String BOOLEAN_TRUE = "Y";
    public static final String BOOLEAN_FALSE = "N";

    public static final String DEFAULT_LANGUAGE_CODE = "zh_CN";  //默认语言为简体中文zh_CN
    public static final String DEFAULT_APPLICATION_ID = "CIIP";  //默认应用ID为CIIP

    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";  //默认日期格式
    public static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";  //默认时间格式

    // MDM相关的cache
    public static final String APPLICATION_CACHE_NAME = "cache_mdm_application";
    public static final String LOOKUP_CACHE_NAME = "cache_mdm_lookup";
    public static final String LANG_CACHE_NAME = "cache_mdm_language";
    public static final String MESSAGE_CACHE_NAME = "cache_mdm_message";
    public static final String PROFILE_OPTION_CACHE_NAME = "cache_mdm_profile_option";
    public static final String UOM_CLASS_CACHE_NAME = "cache_mdm_uom_class";
    public static final String UOM_CACHE_NAME = "cache_mdm_uom";

    public static final String ORDER_CACHE_NAME = "cache_order";

    public static final Integer DEFAULT_VERSIONS = 0;

    public static final String RDS_KEY_SEPARATOR = "_";

    /**
     * 来源系统标识 —— 用户系统/商家系统/门店系统/平台系统.
     */
    public static final String SRC_SYS_REF_CODE_USER = "USER";
    public static final String SRC_SYS_REF_CODE_ORG = "ORG";
    public static final String SRC_SYS_REF_CODE_STORE = "STORE";
    public static final String SRC_SYS_REF_CODE_PLATFORM = "PLATFORM";

    /**
     * 授权类型 微信 & 支付宝
     */
    public static final String SRC_ACCOUNT_TYPE_WX = "WX";
    public static final String SRC_ACCOUNT_TYPE_ZFB = "ZFB";

    public static final String TABLE_TOKEN_STORE_ID = "storeId";
    public static final String TABLE_TOKEN_TABLE_ID = "tableId";
    public static final String TABLE_TOKEN_HEADER = "TableAuthorization";

    //支付方式定义
    public static final String WX_PAY_METHOD_CODE = "WX";
    public static final String ZFB_PAY_METHOD_CODE = "ZFB";
    public static final String CASH_PAY_METHOD_CODE = "CASH";

    //默认支付币种-人名币
    public static final String DEFAULT_CURRENCY_CODE = "CNY";

    //微信支付API返回状态
    public static final String WX_API_RET_CODE_SUCCESS = "SUCCESS";

}
