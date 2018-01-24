package com.equestrianism.api.service.impl;

import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.RoleInfoMapper;
import com.equestrianism.api.model.bo.RoleInfoComboBoxBO;
import com.equestrianism.api.model.bo.RoleInfoDetailBO;
import com.equestrianism.api.model.bo.RoleInfoListBO;
import com.equestrianism.api.model.model.RoleInfoComboBoxModel;
import com.equestrianism.api.model.model.RoleInfoListModel;
import com.equestrianism.api.model.po.RoleInfoEntity;
import com.equestrianism.api.model.vo.*;
import com.equestrianism.api.service.RoleInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/1/22.
 */
@Service( "roleInfoService" )
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @Override
    public Boolean addRoleInfo( RoleInfoAddVO roleInfoAddVo ) {
        RoleInfoEntity roleInfoEntity = new RoleInfoEntity( roleInfoAddVo.getRoleName(),
                roleInfoAddVo.getShortName(), roleInfoAddVo.getRemark() );
        Integer insertCount = roleInfoMapper.insert( roleInfoEntity );
        if ( insertCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateRoleInfo( RoleInfoUpdateVO roleInfoUpdateVo ) {
        RoleInfoEntity roleInfoEntity = new RoleInfoEntity( roleInfoUpdateVo.getRoleId(),
                roleInfoUpdateVo.getRoleName(), roleInfoUpdateVo.getShortName(), roleInfoUpdateVo.getRemark() );
        Integer updateCount = roleInfoMapper.updateBySelective( roleInfoEntity );
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean removeRoleInfo( RoleInfoDeleteVO roleInfoDeleteVo ) {
        RoleInfoEntity roleInfoEntity = new RoleInfoEntity( roleInfoDeleteVo.getRoleId() );
        roleInfoEntity.setDeleteFlag( roleInfoDeleteVo.getDeleteFlag() );
        roleInfoEntity.setStatus( roleInfoDeleteVo.getStatus() );
        Integer updateCount = roleInfoMapper.updateBySelective( roleInfoEntity );
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public RoleInfoListBO roleInfoList( RoleInfoListVO roleInfoListVo ) {
        roleInfoListVo.calculateBeginIndex();
        List<RoleInfoListModel> roleInfoList = roleInfoMapper.selectRoleListByPage( roleInfoListVo );
        Integer totalRecorders = roleInfoMapper.countRoleListByPage( roleInfoListVo );
        RoleInfoListBO responseBo = new RoleInfoListBO( roleInfoList );
        responseBo.setTotalRecorders( totalRecorders );
        responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, roleInfoListVo.getPageRecorders() ) );
        return responseBo;
    }

    @Override
    public RoleInfoComboBoxBO comboBox() {
        List<RoleInfoComboBoxModel> roleList = roleInfoMapper.selectRoleListByComboBox();
        return new RoleInfoComboBoxBO( roleList );
    }

    @Override
    public RoleInfoDetailBO roleDetail( RoleInfoDetailVO roleInfoDetailVo ) {
        return roleInfoMapper.selectRoleInfoByRoleId( roleInfoDetailVo.getRoleId() );
    }

}
