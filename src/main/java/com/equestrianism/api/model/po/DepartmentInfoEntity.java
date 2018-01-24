package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Iceman
 * 2018/1/23
 */
public class DepartmentInfoEntity extends BasePO {

    private String departmentId = UUID.randomUUID().toString().replace( "-", "" );
    private String departmentName;
    private String shortName;
    private String remark;

    public DepartmentInfoEntity() {
    }

    public DepartmentInfoEntity( String departmentId ) {
        this.departmentId = departmentId;
    }

    public DepartmentInfoEntity( String departmentName, String shortName, String remark ) {
        this( UUID.randomUUID().toString().replace( "-", "" ), departmentName, shortName, remark );
    }

    public DepartmentInfoEntity( String departmentId, String departmentName, String shortName, String remark ) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.shortName = shortName;
        this.remark = remark;
    }

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

    public String getRemark() {
        return remark;
    }

    public void setRemark( String remark ) {
        this.remark = remark;
    }
}
