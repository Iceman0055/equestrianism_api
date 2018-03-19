package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/20.
 */
public class MenuInfoListModel extends BaseObject {

    private Integer menuId;
    private String menuName;
    private Integer sort;
    private List<MenuInfoListPreModel> subMenuList;

    public MenuInfoListModel() {
    }

    public MenuInfoListModel( Integer menuId, String menuName, Integer sort, List<MenuInfoListPreModel> subMenuList ) {
        this.subMenuList = subMenuList;
    }

    public List<MenuInfoListPreModel> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<MenuInfoListPreModel> subMenuList) {
        this.subMenuList = subMenuList;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}
