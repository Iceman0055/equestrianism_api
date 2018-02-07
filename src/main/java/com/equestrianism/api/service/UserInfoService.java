package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.UserInfoDetailBO;
import com.equestrianism.api.model.bo.UserInfoListBO;
import com.equestrianism.api.model.vo.*;

/**
 * Created by Chenzq on 2018/1/15.
 */
public interface UserInfoService {

    Boolean addUserInfo( UserInfoAddVO userInfoAddVo ) throws BaseException;

    Boolean updateUserInfo( UserInfoUpdateVO userInfoUpdateVo ) throws BaseException;

    Boolean removeUserInfo( UserInfoDeleteVO userInfoDeleteVo ) throws BaseException;

    UserInfoListBO userInfoList( UserInfoListVO userInfoListVo ) throws BaseException;

    UserInfoDetailBO userDetail( UserInfoDetailVO userInfoDetailVo ) throws BaseException;
    
}