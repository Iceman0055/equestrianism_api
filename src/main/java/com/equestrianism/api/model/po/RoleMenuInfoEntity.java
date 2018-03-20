package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

/**
 * Created by Chenzq on 2018/3/20.
 */
public class RoleMenuInfoEntity extends BasePO {

    private Integer roleMenuId;
    private String roleId;
    private Integer menuId;

    public Integer getRoleMenuId() {
        return roleMenuId;
    }

    public void setRoleMenuId(Integer roleMenuId) {
        this.roleMenuId = roleMenuId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
