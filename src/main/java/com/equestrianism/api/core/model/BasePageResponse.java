package com.equestrianism.api.core.model;

/**
 * Created by Chenzq on 2018/1/21.
 */
public class BasePageResponse extends BaseObject {

    private Integer totalRecorders;
    private Integer totalPages;

    public Integer getTotalRecorders() {
        return totalRecorders;
    }

    public void setTotalRecorders(Integer totalRecorders) {
        this.totalRecorders = totalRecorders;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

}
