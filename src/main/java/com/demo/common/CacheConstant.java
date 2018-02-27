package com.demo.common;


/**
 * author : Sdniu
 * date   : 2017/7/21.
 * description :
 */
public class CacheConstant {
    /**
     * 门店cache
     */
    public static final String USER_CACHE = "user_cache";

    /**
     * 微信wx_refresh_token
     */
    public static final String WX_REFRESH_TOKEN = "wx_refresh_token";
    /**
     * 微信wx_js_api_ticket
     */
    public static final String WX_JS_API_TICKET = "wx_js_api_ticket";
    /**
     * 发送验证码之前 准备工作,防止被攻击
     */
    public static final String VERIFY_CODE_SEND_BEFORE = "verify_code_send_before";

    /**
     * 验证码存储缓存
     */
    public static final String VERIFY_CODE_CACHE = "verify_code_cache";
    /**
     * 验证码存储缓存
     */
    public static final String VERIFY_CODE_EMAIL_CACHE = "verify_code_email_cache";

    /**
     * 商家产生的优惠券
     */
    public static final String PROMOTIONS_COUPON_SALES_CACHE = "promotion_coupon_sales_cache";

    /**
     * 商家产生的优惠券属性
     */
    public static final String PROMOTIONS_COUPON_DEF_ATTR_CACHE = "promotion_coupon_def_attr_cache";

    /**
     * 条件参数的值
     */
    public static final String PROMOTIONS_CONDITION_ARGS_VALUE_CACHE = "promotion_condition_args_value_cache";

    /**
     * 动作参数的值
     */

    public static final String PROMOTIONS_ACTION_ARGS_VALUE_CACHE = "promotion_action_args_value_cache";

    /**
     * 条件参数
     */
    public static final String PROMOTIONS_CONDITION_ARGS_CACHE = "promotion_condition_args_cache";

    /**
     * 动作参数
     */
    public static final String PROMOTIONS_ACTION_ARGS_CACHE = "promotion_action_args_cache";

    /**
     * 优惠规则
     */
    public static final String PROMOTIONS_RULE_CACHE = "promotion_rule_cache";

    public static final String PROMOTIONS_USAGE_RULE_CACHE = "promotion_usage_rule_cache";
    /**
     * 优惠类型
     */
    public static final String PROMOTIONS_TYPE_CACHE = "promotion_type_cache";


    /**
     * 优惠条件缓存
     */
    public static final String PROMOTIONS_CONDITION_CACHE = "promotion_condition_cache";


    /**
     * 优惠动作缓存
     */
    public static final String PROMOTIONS_ACTION_CACHE = "promotion_action_cache";


    /**
     * 商家优惠缓存
     */
    public static final String PROMOTIONS_SALE_CACHE = "promotion_sale_cache";

    /**
     * 编号拓展缓存
     */
    public static final String SEQ_EXPANSION_CACHE = "seq_expansion_cache_";

    /**
     * 编号缓存
     */
    public static final String SEQ_NUM_CACHE = "seq_number_cache";

    /**
     * 规格引擎规则cache
     */
    public static final String RULE_ENGINE_CACHE = "rule_engine_cache";
    /**
     * 订单头缓存
     */
    public static final String ORDER_HEADER_CACHE = "order_header_cache";
    /**
     *
     */
    public static final String ORDER_LINE_CACHE_PRE = "order_line_cache";

    public static final String getOrderLineCacheName(String headerId) {
        return ORDER_LINE_CACHE_PRE + "_" + headerId;
    }

    /**
     * 用户缓存 ,key useId
     */
    public static final String USER_CACHE_NAME = "user_cache";

    /**
     * 购物车,name= CacheConstant.SHOP_CART_CACHE
     */
    public static final String SHOP_CART_CACHE = "shop_cart_cache";

    /**
     * 映射 tableToken=>tableId,storeId
     */
    public static final String STORE_TABLEID_TABLETOKEN = "table_id_tabletoken";
    /**
     * 门店下的菜品_{storeId},key是itemId
     */
    public static final String STORE_MENU_ITEM_CACHE_NAME = "store_item_cache";
    /**
     * 门店规格缓存_{storeId},key是itemId
     */
    public static final String STORE_SPE_CACHE_NAME = "store_spe_cache";
    /**
     * 门店TAG缓存_{storeId},key是itemId
     */
    public static final String STORE_TAG_CACHE_NAME = "store_tag_cache";
    /**
     * 门店信息_{storeId} ,key是itemId
     */
    public static final String STORE_INFO_CACHE_NAME = "store_info_cache";
    /**
     * 门店分类_{storeId},key是itemId,只存 id, itemId,categoryId
     */
    public static final String STORE_MENU_ITEM_CATEGORY_CACHE_NAME = "store_item_category_cache";

    /**
     * 门店的所有分类 _{storeId},key 是categoryId ,存储完整的Category
     */
    public static final String STORE_MENU_CATEGORY_CACHE_NAME = "store_category_cache";

    /**
     * 门店菜品图片_{storeId},key是itemId
     */
    public static final String STORE_MENU_PIC_CACHE_NAME = "store_menu_pic_cache";

    /**
     * 存储当前餐桌下所有的参与用户id,key user_id,
     */
    public static final String TABLE_STATUS_INFO_USER_LIST = "table_status_user_list";

    /**
     * 存储当前餐桌信息,key tableId,未剪枝
     *
     * @see com.esudian.dto.org.TableStatusDto
     */
    public static final String TABLE_STATUS_INFO_CACHE = "table_status_info";

    /**
     * 菜单规格
     *
     * @see com.esudian.domain.meu.CiipMeuItemSpecifications
     */
    public static final String MEU_SPECIFICATIONS_CACHE = "meu_specification";
    /**
     * 菜品缓存 key itemId
     *
     * @see com.esudian.domain.meu.CiipMeuItems
     */
    public static final String MEU_ITEM_CACHE = "meu_item_cache";
    /**
     * 部门缓存 key departmentId
     *
     * @see com.esudian.domain.org.CiipOrgDepartments
     */
    public static final String ORG_DEPT_CHACHE = "org_department_cache";

    /**
     * 餐桌缓存 key tableId
     */
    public static final String ORG_TABLE_CACHE = "org_table_cache";

    /**
     * aliyun 相关OSS STS token
     */
    public static final String ALIYUN_OSS_STS_TOKEN = "aliyun_oss_sts_token";

    /**
     * 组合菜品缓存
     */
    public static final String MEU_ITEM_COMBO_CACHE = "meu_item_combo_cache";

    /**
     * 签约子商户配置信息缓存
     */
    public static final String ORG_SIGNED_SUB_MERCHANTS_CACHE = "org_signed_sub_merchants_cache";

    /**
     * OAuthentication缓存
     */
    public static final String OAUTH_CACHE = "OAuthentication";
}
