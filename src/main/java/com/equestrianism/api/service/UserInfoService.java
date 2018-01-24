package com.equestrianism.api.service;

import com.equestrianism.api.model.bo.UserInfoDetailBO;
import com.equestrianism.api.model.bo.UserInfoListBO;
import com.equestrianism.api.model.vo.*;

/**
 * Created by Chenzq on 2018/1/15.
 */
public interface UserInfoService {

    Boolean addUserInfo( UserInfoAddVO userInfoAddVo );

    Boolean updateUserInfo( UserInfoUpdateVO userInfoUpdateVo );

    Boolean removeUserInfo( UserInfoDeleteVO userInfoDeleteVo );

    UserInfoListBO userInfoList( UserInfoListVO userInfoListVo );

    UserInfoDetailBO userDetail( UserInfoDetailVO userInfoDetailVo );
    
}