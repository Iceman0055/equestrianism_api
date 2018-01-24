package com.equestrianism.api.model.vo;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/1/24
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class DepartmentInfoListVO extends BasePageViewModel {

    private String departmentName;
    private Integer status;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName( String departmentName ) {
        this.departmentName = departmentName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

}
