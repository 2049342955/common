package com.demo.common;

/**
 * Created by luye on 2017/12/20.
 *
 * 用户默认角色定义
 *
 */
public class UserRoleType {

    public static final String ADMIN_ROLE = "SYSADMIN";  //平台系统管理员（包括所有权限，统称sysadmin）

    public static final String USER_ROLE = "USR";   //普通用户角色(非商户相关)
    public static final String REG_TEMP_ROLE = "REG_TEMP_ROLE";  //商户注册临时用户角色

    public static final String COMP_ADMIN_ROLE = "COMP_ADMIN";  //商户管理员（商家创建时的默认角色）

}
