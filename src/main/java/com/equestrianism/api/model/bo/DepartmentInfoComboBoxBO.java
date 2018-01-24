package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.DepartmentInfoComboBoxModel;

import java.util.List;

/**
 * Iceman
 * 2018/1/24
 */
public class DepartmentInfoComboBoxBO extends BaseObject {

    private List<DepartmentInfoComboBoxModel> departmentList;

    public DepartmentInfoComboBoxBO() {
    }

    public DepartmentInfoComboBoxBO( List<DepartmentInfoComboBoxModel> departmentList ) {
        this.departmentList = departmentList;
    }

    public List< DepartmentInfoComboBoxModel > getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList( List< DepartmentInfoComboBoxModel > departmentList ) {
        this.departmentList = departmentList;
    }
}
