package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.UserInfoComboBoxModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/14.
 */
public class UserInfoComboBoxBO extends BaseObject {

    private List<UserInfoComboBoxModel> userList;

    public UserInfoComboBoxBO() {
    }

    public UserInfoComboBoxBO( List<UserInfoComboBoxModel> userList ) {
        this.userList = userList;
    }

    public List<UserInfoComboBoxModel> getUserList() {
        return userList;
    }

    public void setUserList(List<UserInfoComboBoxModel> userList) {
        this.userList = userList;
    }
}
