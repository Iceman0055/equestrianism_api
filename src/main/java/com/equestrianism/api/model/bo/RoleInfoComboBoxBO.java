package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.RoleInfoComboBoxModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/1/23.
 */
public class RoleInfoComboBoxBO extends BaseObject {

    private List<RoleInfoComboBoxModel> roleList;

    public RoleInfoComboBoxBO() {
    }

    public RoleInfoComboBoxBO( List<RoleInfoComboBoxModel> roleList ) {
        this.roleList = roleList;
    }

    public List<RoleInfoComboBoxModel> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<RoleInfoComboBoxModel> roleList) {
        this.roleList = roleList;
    }
}
