package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/20.
 */
public class MenuInfoListPreModel extends BaseObject {

    private Integer subMenuId;
    private String subMenuName;
    private Integer subSort;

    public MenuInfoListPreModel() {
    }

    public MenuInfoListPreModel( Integer subMenuId, String subMenuName, Integer subSort ) {
        this.subMenuId = subMenuId;
        this.subSort = subSort;
        this.subMenuName = subMenuName;
    }

    public Integer getSubMenuId() {
        return subMenuId;
    }

    public void setSubMenuId(Integer subMenuId) {
        this.subMenuId = subMenuId;
    }

    public String getSubMenuName() {
        return subMenuName;
    }

    public void setSubMenuName(String subMenuName) {
        this.subMenuName = subMenuName;
    }

    public Integer getSubSort() {
        return subSort;
    }

    public void setSubSort(Integer subSort) {
        this.subSort = subSort;
    }
}
