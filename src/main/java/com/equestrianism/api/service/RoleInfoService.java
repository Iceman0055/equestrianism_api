package com.equestrianism.api.service;

import com.equestrianism.api.model.bo.RoleInfoListBO;
import com.equestrianism.api.model.bo.UserInfoListBO;
import com.equestrianism.api.model.vo.RoleInfoAddVO;
import com.equestrianism.api.model.vo.RoleInfoDeleteVO;
import com.equestrianism.api.model.vo.RoleInfoListVO;
import com.equestrianism.api.model.vo.RoleInfoUpdateVO;

/**
 * Created by Chenzq on 2018/1/22.
 */
public interface RoleInfoService {

    Boolean addRoleInfo(RoleInfoAddVO roleInfoAddVo);

    Boolean updateRoleInfo( RoleInfoUpdateVO roleInfoUpdateVo );

    Boolean removeUserInfo( RoleInfoDeleteVO roleInfoDeleteVo );

    RoleInfoListBO roleInfoList( RoleInfoListVO roleInfoListVo );

}
