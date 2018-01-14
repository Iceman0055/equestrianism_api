package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Iceman
 * 2018/1/10
 */
public class UserInfoEntity extends BasePO {

    private String userId = UUID.randomUUID().toString().replace( "-", "" );
    private String jobNumber;
    private String realname;
    private String loginName;
    private String loginPassword;
    private String departmentId;
    private String roleId;
    private String email;
    private String contactWay;

    public UserInfoEntity() {
    }

    public UserInfoEntity( String jobNumber, String realname, String loginName, String loginPassword,
                           String departmentId, String roleId, String email, String contactWay ) {
        this.jobNumber = jobNumber;
        this.realname = realname;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.departmentId = departmentId;
        this.roleId = roleId;
        this.email = email;
        this.contactWay = contactWay;
    }

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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName( String loginName ) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword( String loginPassword ) {
        this.loginPassword = loginPassword;
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

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay( String contactWay ) {
        this.contactWay = contactWay;
    }
}
