package com.equestrianism.api.service;

import com.equestrianism.api.model.bo.RoleInfoComboBoxBO;
import com.equestrianism.api.model.bo.RoleInfoDetailBO;
import com.equestrianism.api.model.bo.RoleInfoListBO;
import com.equestrianism.api.model.vo.*;

/**
 * Created by Chenzq on 2018/1/22.
 */
public interface RoleInfoService {

    Boolean addRoleInfo(RoleInfoAddVO roleInfoAddVo);

    Boolean updateRoleInfo( RoleInfoUpdateVO roleInfoUpdateVo );

    Boolean removeRoleInfo( RoleInfoDeleteVO roleInfoDeleteVo );

    RoleInfoListBO roleInfoList( RoleInfoListVO roleInfoListVo );

    RoleInfoComboBoxBO comboBox();

    RoleInfoDetailBO roleDetail( RoleInfoDetailVO roleInfoDetailVo );

}
