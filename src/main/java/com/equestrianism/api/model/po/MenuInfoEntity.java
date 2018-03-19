package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

/**
 * Created by Chenzq on 2018/3/20.
 */
public class MenuInfoEntity extends BasePO {

    private Integer menuId;
    private String menuName;
    private Integer preMenuId;
    private Integer level;
    private Integer sort;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getPreMenuId() {
        return preMenuId;
    }

    public void setPreMenuId(Integer preMenuId) {
        this.preMenuId = preMenuId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
