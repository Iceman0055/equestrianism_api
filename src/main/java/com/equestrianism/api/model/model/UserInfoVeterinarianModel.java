package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/3/7
 */
public class UserInfoVeterinarianModel extends BaseObject {

    private String userId;
    private String realname;

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId ) {
        this.userId = userId;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname( String realname ) {
        this.realname = realname;
    }

}
