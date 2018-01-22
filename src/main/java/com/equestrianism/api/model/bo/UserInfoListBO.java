package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.UserInfoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/1/21.
 */
public class UserInfoListBO extends BasePageResponse {

    private List<UserInfoListModel> userInfoList;

    public UserInfoListBO(){
    }

    public UserInfoListBO( List<UserInfoListModel> userInfoList ) {
        this.userInfoList = userInfoList;
    }

    public List<UserInfoListModel> getUserInfoList() {
        return userInfoList;
    }

    public void setUserInfoList(List<UserInfoListModel> userInfoList) {
        this.userInfoList = userInfoList;
    }

}
