package com.equestrianism.api.model.vo;

import com.equestrianism.api.core.model.BaseViewModel;

/**
 * Iceman
 * 2018/1/22
 */
public class UserInfoDetailVO extends BaseViewModel {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId ) {
        this.userId = userId;
    }

}
