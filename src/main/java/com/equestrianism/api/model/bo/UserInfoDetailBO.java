package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/1/24
 */
public class UserInfoDetailBO extends BaseObject {

    private String userId;
    private String jobNumber;
    private String loginName;
    private String realname;
    private String departmentId;
    private String roleId;
    private String contactWay;
    private String email;
    private Integer status;

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId ) {
        this.userId = userId;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber( String jobNumber ) {
        this.jobNumber = jobNumber;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname( String realname ) {
        this.realname = realname;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay( String contactWay ) {
        this.contactWay = contactWay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName( String loginName ) {
        this.loginName = loginName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId( String departmentId ) {
        this.departmentId = departmentId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId( String roleId ) {
        this.roleId = roleId;
    }
}
