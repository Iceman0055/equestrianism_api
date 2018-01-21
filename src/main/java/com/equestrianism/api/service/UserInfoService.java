package com.equestrianism.api.service;

import com.equestrianism.api.model.bo.UserInfoListBO;
import com.equestrianism.api.model.vo.UserInfoAddVO;
import com.equestrianism.api.model.vo.UserInfoDeleteVO;
import com.equestrianism.api.model.vo.UserInfoListVO;
import com.equestrianism.api.model.vo.UserInfoUpdateVO;

/**
 * Created by Chenzq on 2018/1/15.
 */
public interface UserInfoService {

    Boolean addUserInfo( UserInfoAddVO userInfoAddVo );

    Boolean updateUserInfo( UserInfoUpdateVO userInfoUpdateVo );

    Boolean removeUserInfo( UserInfoDeleteVO userInfoDeleteVo );

    UserInfoListBO userInfoList( UserInfoListVO userInfoListVo );
}