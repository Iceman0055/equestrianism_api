package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/1/24
 */
public class DepartmentInfoListModel extends BaseObject {

    private String departmentId;
    private String departmentName;
    private String shortName;
    private Integer status;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId( String departmentId ) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName( String departmentName ) {
        this.departmentName = departmentName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName( String shortName ) {
        this.shortName = shortName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

}
