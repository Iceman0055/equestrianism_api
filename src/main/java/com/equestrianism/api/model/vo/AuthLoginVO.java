package com.equestrianism.api.model.vo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/21.
 */
public class AuthLoginVO extends BaseObject {

    private String loginName;
    private String loginPassword;

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
}
