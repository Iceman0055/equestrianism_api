package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/14.
 */
public class UserInfoComboBoxModel extends BaseObject {

    private String userId;
    private String realname;

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
