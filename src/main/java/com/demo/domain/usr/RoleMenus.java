package com.demo.domain.usr;

import com.demo.domain.BaseDomain;

import javax.persistence.*;

@Table(name = "role_menus")
public class RoleMenus extends BaseDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select REPLACE(uuid(),'-','')")
    private String id;

    @Column(name = "role_id")
    private String roleId;

    @Column(name = "menu_id")
    private String menuId;

    private Integer status;

    private Integer versions;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return role_id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * @return menu_id
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}