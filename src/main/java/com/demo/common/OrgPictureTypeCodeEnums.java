package com.demo.common;

/**
 * author : Sdniu
 * date   : 2017/7/24.
 * description : OrgPic type
 */
public enum OrgPictureTypeCodeEnums {
    /**
     * 门店身份证正面
     */
    STORE_ID1(SourceRefCode.STORE, "ID1"),
    /**
     * 门店身份证方面
     */
    STORE_ID2(SourceRefCode.STORE, "ID2"),
    /**
     * 门店营业执照
     */
    STORE_BL(SourceRefCode.STORE, "BL"),
    /**
     * 门店食品许可证
     */
    STORE_FHL(SourceRefCode.STORE, "FHL"),
    /**
     * 门店就餐环境图片
     */
    SHOP_SP(SourceRefCode.STORE, "SP"),
//    /**
//     * 商家注册
//     */
//    COMPANY_REGISTER_SP("CR", "SP"),
    /**
     * 商家注册-身份证
     */
    COMPANY_REGISTER_ID(SourceRefCode.COMPANY_REGISTER, "ID"),
    /**
     * 商家注册-门店营业执照
     */
    COMPANY_REGISTER_BL(SourceRefCode.COMPANY_REGISTER, "BL"),
    /**
     * 商家注册-门店食品许可证
     */
    COMPANY_REGISTER_FHL(SourceRefCode.COMPANY_REGISTER, "FHL");
    public String sourceRefCode;
    public String pictureTypeCode;

    OrgPictureTypeCodeEnums(String sourceRefCode, String pictureTypeCode) {
        this.sourceRefCode = sourceRefCode;
        this.pictureTypeCode = pictureTypeCode;
    }
}
