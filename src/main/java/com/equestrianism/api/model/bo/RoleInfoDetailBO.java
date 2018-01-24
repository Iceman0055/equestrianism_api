package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/1/24
 */
public class RoleInfoDetailBO extends BaseObject {

    private String roleId;
    private String roleName;
    private String shortName;
    private String remark;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId( String roleId ) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName( String roleName ) {
        this.roleName = roleName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName( String shortName ) {
        this.shortName = shortName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark( String remark ) {
        this.remark = remark;
    }

}
