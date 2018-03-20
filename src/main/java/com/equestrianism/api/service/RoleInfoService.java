package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.RoleInfoComboBoxBO;
import com.equestrianism.api.model.bo.RoleInfoDetailBO;
import com.equestrianism.api.model.bo.RoleInfoListBO;
import com.equestrianism.api.model.bo.RoleInfoMenuListBO;
import com.equestrianism.api.model.vo.*;

import java.util.List;

/**
 * Created by Chenzq on 2018/1/22.
 */
public interface RoleInfoService {

    Boolean addRoleInfo(RoleInfoAddVO roleInfoAddVo) throws BaseException;

    Boolean updateRoleInfo( RoleInfoUpdateVO roleInfoUpdateVo ) throws BaseException;

    Boolean removeRoleInfo( RoleInfoDeleteVO roleInfoDeleteVo ) throws BaseException;

    RoleInfoListBO roleInfoList( RoleInfoListVO roleInfoListVo ) throws BaseException;

    RoleInfoComboBoxBO comboBox() throws BaseException;

    RoleInfoDetailBO roleDetail( RoleInfoDetailVO roleInfoDetailVo ) throws BaseException;

    RoleInfoMenuListBO menuList(String roleId) throws BaseException;

    Boolean updateMenu(RoleInfoUpdateMenuVO roleInfoUpdateMenuVo) throws BaseException;
}
