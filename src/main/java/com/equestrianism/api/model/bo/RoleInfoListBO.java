package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.RoleInfoListModel;

import java.util.List;

/**
 * Iceman
 * 2018/1/22
 */
public class RoleInfoListBO extends BasePageResponse {

    private List<RoleInfoListModel> roleInfoList;

    public RoleInfoListBO() {
    }

    public RoleInfoListBO( List<RoleInfoListModel> roleInfoList ) {
        this.roleInfoList = roleInfoList;
    }

    public List< RoleInfoListModel > getRoleInfoList() {
        return roleInfoList;
    }

    public void setRoleInfoList( List< RoleInfoListModel > roleInfoList ) {
        this.roleInfoList = roleInfoList;
    }

}
