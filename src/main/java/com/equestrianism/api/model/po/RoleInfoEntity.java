package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Iceman
 * 2018/1/22
 */
public class RoleInfoEntity extends BasePO {

    private String roleId = UUID.randomUUID().toString().replace( "-", "" );
    private String roleName;
    private String shortName;
    private String remark;

    public RoleInfoEntity() {
    }

    public RoleInfoEntity( String roleId ) {
        this.roleId = roleId;
    }

    public RoleInfoEntity( String roleName, String shortName, String remark ) {
        this( UUID.randomUUID().toString().replace( "-", "" ), roleName, shortName, remark );
    }

    public RoleInfoEntity( String roleId, String roleName, String shortName, String remark ) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.shortName = shortName;
        this.remark = remark;
    }

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
