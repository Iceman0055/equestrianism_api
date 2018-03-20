package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/21.
 */
public class AuthLoginBO extends BaseObject {

    private String sessionId;
    private String userId;
    private String realname;
    private List<Integer> menuList;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public List<Integer> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Integer> menuList) {
        this.menuList = menuList;
    }

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
