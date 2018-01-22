package com.equestrianism.api.model.vo;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/1/22
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class RoleInfoUpdateVO extends RoleInfoAddVO {

    private String roleId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId( String roleId ) {
        this.roleId = roleId;
    }

}
