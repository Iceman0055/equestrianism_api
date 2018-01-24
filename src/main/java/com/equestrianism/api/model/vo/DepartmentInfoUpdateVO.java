package com.equestrianism.api.model.vo;


/**
 * Iceman
 * 2018/1/23
 */
public class DepartmentInfoUpdateVO extends DepartmentInfoAddVO {

    private String departmentId;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId( String departmentId ) {
        this.departmentId = departmentId;
    }
}
