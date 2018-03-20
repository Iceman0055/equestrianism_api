package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.RoleInfoMapper;
import com.equestrianism.api.dao.RoleMenuInfoMapper;
import com.equestrianism.api.model.bo.RoleInfoComboBoxBO;
import com.equestrianism.api.model.bo.RoleInfoDetailBO;
import com.equestrianism.api.model.bo.RoleInfoListBO;
import com.equestrianism.api.model.bo.RoleInfoMenuListBO;
import com.equestrianism.api.model.model.RoleInfoComboBoxModel;
import com.equestrianism.api.model.model.RoleInfoListModel;
import com.equestrianism.api.model.po.RoleInfoEntity;
import com.equestrianism.api.model.po.RoleMenuInfoEntity;
import com.equestrianism.api.model.vo.*;
import com.equestrianism.api.service.RoleInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/1/22.
 */
@Service( "roleInfoService" )
public class RoleInfoServiceImpl implements RoleInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( RoleInfoServiceImpl.class );

    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @Autowired
    private RoleMenuInfoMapper roleMenuInfoMapper;

    @Override
    public Boolean addRoleInfo( RoleInfoAddVO roleInfoAddVo ) throws BaseException {
        RoleInfoEntity roleInfoEntity = new RoleInfoEntity( roleInfoAddVo.getRoleName(),
                roleInfoAddVo.getShortName(), roleInfoAddVo.getRemark() );
        try {
            Integer insertCount = roleInfoMapper.insert( roleInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【RoleInfoService】【addRoleInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateRoleInfo( RoleInfoUpdateVO roleInfoUpdateVo ) throws BaseException {
        RoleInfoEntity roleInfoEntity = new RoleInfoEntity( roleInfoUpdateVo.getRoleId(),
                roleInfoUpdateVo.getRoleName(), roleInfoUpdateVo.getShortName(), roleInfoUpdateVo.getRemark() );
        try {
            Integer updateCount = roleInfoMapper.updateBySelective( roleInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【RoleInfoService】【updateRoleInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeRoleInfo( RoleInfoDeleteVO roleInfoDeleteVo ) throws BaseException {
        RoleInfoEntity roleInfoEntity = new RoleInfoEntity( roleInfoDeleteVo.getRoleId() );
        roleInfoEntity.setDeleteFlag( roleInfoDeleteVo.getDeleteFlag() );
        roleInfoEntity.setStatus( roleInfoDeleteVo.getStatus() );
        try {
            Integer updateCount = roleInfoMapper.updateBySelective( roleInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【RoleInfoService】【removeRoleInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public RoleInfoListBO roleInfoList( RoleInfoListVO roleInfoListVo ) throws BaseException {
        roleInfoListVo.calculateBeginIndex();
        try {
            List<RoleInfoListModel> roleInfoList = roleInfoMapper.selectRoleListByPage( roleInfoListVo );
            Integer totalRecorders = roleInfoMapper.countRoleListByPage( roleInfoListVo );
            RoleInfoListBO responseBo = new RoleInfoListBO( roleInfoList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, roleInfoListVo.getPageRecorders() ) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【RoleInfoService】【roleInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public RoleInfoComboBoxBO comboBox() throws BaseException {
        try {
            List<RoleInfoComboBoxModel> roleList = roleInfoMapper.selectRoleListByComboBox();
            return new RoleInfoComboBoxBO( roleList );
        } catch ( Exception e ) {
            LOGGER.error( "【RoleInfoService】【comboBox】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public RoleInfoDetailBO roleDetail( RoleInfoDetailVO roleInfoDetailVo ) throws BaseException {
        try {
            return roleInfoMapper.selectRoleInfoByRoleId( roleInfoDetailVo.getRoleId() );
        } catch ( Exception e ) {
            LOGGER.error( "【RoleInfoService】【roleDetail】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public RoleInfoMenuListBO menuList(String roleId) throws BaseException {
        List<Integer> menuList = roleMenuInfoMapper.selectByRoleId( roleId );
        return new RoleInfoMenuListBO( menuList );
    }

    @Override
    public Boolean updateMenu(RoleInfoUpdateMenuVO roleInfoUpdateMenuVo) throws BaseException {
        List<Integer> deleteList = roleInfoUpdateMenuVo.getDeleteMenuList();
        List<Integer> insertList = roleInfoUpdateMenuVo.getAddMenuList();
        if ( deleteList != null && deleteList.size() > 0 ) {
            RoleMenuInfoEntity roleMenuInfoEntity;
            for ( Integer menuId : deleteList ) {
                roleMenuInfoEntity = new RoleMenuInfoEntity();
                roleMenuInfoEntity.setMenuId( menuId );
                roleMenuInfoEntity.setRoleId( roleInfoUpdateMenuVo.getRoleId() );
                roleMenuInfoEntity.setDeleteFlag( 1 );
                roleMenuInfoEntity.setStatus( 0 );
                roleMenuInfoMapper.updateBySelective( roleMenuInfoEntity );
            }
        }
        if ( insertList != null && insertList.size() > 0 ) {
            RoleMenuInfoEntity roleMenuInfoEntity;
            for ( Integer menuId : insertList ) {
                roleMenuInfoEntity = new RoleMenuInfoEntity();
                roleMenuInfoEntity.setMenuId( menuId );
                roleMenuInfoEntity.setRoleId( roleInfoUpdateMenuVo.getRoleId() );
                roleMenuInfoMapper.insert( roleMenuInfoEntity );
            }
        }
        return true;
    }

}
