package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/21.
 */
public class RoleInfoMenuListBO extends BaseObject {

    private List<Integer> menuList;

    public RoleInfoMenuListBO() {
    }

    public RoleInfoMenuListBO( List<Integer> menuList ) {
        this.menuList = menuList;
    }

    public List<Integer> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Integer> menuList) {
        this.menuList = menuList;
    }
}
