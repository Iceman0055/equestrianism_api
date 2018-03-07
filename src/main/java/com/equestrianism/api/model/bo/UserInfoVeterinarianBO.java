package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.UserInfoVeterinarianModel;

import java.util.List;

/**
 * Iceman
 * 2018/3/7
 */
public class UserInfoVeterinarianBO extends BaseObject {

    private List<UserInfoVeterinarianModel> veterinarianList;

    public UserInfoVeterinarianBO() {
    }

    public UserInfoVeterinarianBO( List<UserInfoVeterinarianModel> veterinarianList ) {
        this.veterinarianList = veterinarianList;
    }

    public List< UserInfoVeterinarianModel > getVeterinarianList() {
        return veterinarianList;
    }

    public void setVeterinarianList( List< UserInfoVeterinarianModel > veterinarianList ) {
        this.veterinarianList = veterinarianList;
    }
}
