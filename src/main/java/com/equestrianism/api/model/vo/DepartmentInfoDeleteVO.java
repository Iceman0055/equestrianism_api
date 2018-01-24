package com.equestrianism.api.model.vo;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/1/23
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class DepartmentInfoDeleteVO extends BaseViewModel {

    private String departmentId;
    private Integer deleteFlag;
    private Integer status;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId( String departmentId ) {
        this.departmentId = departmentId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag( Integer deleteFlag ) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }
}
