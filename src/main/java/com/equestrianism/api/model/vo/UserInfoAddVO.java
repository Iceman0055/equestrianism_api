package com.equestrianism.api.model.vo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/1/15.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class UserInfoAddVO extends BaseViewModel {

    private String jobNumber;
    private String realname;
    private String loginName;
    private String loginPassword;
    private String departmentId;
    private String roleId;
    private String email;
    private String contactWay;

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
