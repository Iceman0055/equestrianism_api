package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.DepartmentInfoListModel;

import java.util.List;

/**
 * Iceman
 * 2018/1/24
 */
public class DepartmentInfoListBO extends BasePageResponse {

    private List<DepartmentInfoListModel> departmentInfoList;

    public DepartmentInfoListBO() {
    }

    public DepartmentInfoListBO( List<DepartmentInfoListModel> departmentInfoList ) {
        this.departmentInfoList = departmentInfoList;
    }

    public List< DepartmentInfoListModel > getDepartmentInfoList() {
        return departmentInfoList;
    }

    public void setDepartmentInfoList( List< DepartmentInfoListModel > departmentInfoList ) {
        this.departmentInfoList = departmentInfoList;
    }
}
