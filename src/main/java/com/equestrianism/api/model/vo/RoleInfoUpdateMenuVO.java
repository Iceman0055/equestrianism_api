package com.equestrianism.api.model.vo;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/21.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class RoleInfoUpdateMenuVO extends BaseViewModel {

    private String roleId;
    private List<Integer> deleteMenuList;
    private List<Integer> addMenuList;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public List<Integer> getDeleteMenuList() {
        return deleteMenuList;
    }

    public void setDeleteMenuList(List<Integer> deleteMenuList) {
        this.deleteMenuList = deleteMenuList;
    }

    public List<Integer> getAddMenuList() {
        return addMenuList;
    }

    public void setAddMenuList(List<Integer> addMenuList) {
        this.addMenuList = addMenuList;
    }
}
