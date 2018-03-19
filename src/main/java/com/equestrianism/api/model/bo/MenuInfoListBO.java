package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.MenuInfoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/20.
 */
public class MenuInfoListBO extends BaseObject {

    private List<MenuInfoListModel> menuList;

    public MenuInfoListBO() {
    }

    public MenuInfoListBO( List<MenuInfoListModel> menuList ) {
        this.menuList = menuList;
    }

    public List<MenuInfoListModel> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuInfoListModel> menuList) {
        this.menuList = menuList;
    }
}
