package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/1/24
 */
public class DepartmentInfoComboBoxModel extends BaseObject {

    private String departmentId;
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName( String departmentName ) {
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId( String departmentId ) {
        this.departmentId = departmentId;
    }

}
