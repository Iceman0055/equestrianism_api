package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.constants.RoleShortNameEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.UserInfoMapper;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.model.DepartmentInfoComboBoxModel;
import com.equestrianism.api.model.model.UserInfoComboBoxModel;
import com.equestrianism.api.model.model.UserInfoListModel;
import com.equestrianism.api.model.model.UserInfoVeterinarianModel;
import com.equestrianism.api.model.po.UserInfoEntity;
import com.equestrianism.api.model.vo.*;
import com.equestrianism.api.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/1/15.
 */
@Service( "userInfoService" )
public class UserInfoServiceImpl implements UserInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( UserInfoServiceImpl.class );

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public Boolean addUserInfo( UserInfoAddVO userInfoAddVo ) throws BaseException {
        UserInfoEntity userInfoEntity = new UserInfoEntity( userInfoAddVo.getJobNumber(), userInfoAddVo.getRealname(),
                userInfoAddVo.getLoginName(), userInfoAddVo.getLoginPassword(), userInfoAddVo.getDepartmentId(),
                userInfoAddVo.getRoleId(), userInfoAddVo.getEmail(), userInfoAddVo.getContactWay(), userInfoAddVo.getAccessId() );
        try {
            Integer insertCount = userInfoMapper.insert( userInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【UserInfoService】【addUserInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateUserInfo( UserInfoUpdateVO userInfoUpdateVo ) throws BaseException {
        UserInfoEntity userInfoEntity = new UserInfoEntity( userInfoUpdateVo.getUserId(), userInfoUpdateVo.getJobNumber(),
                userInfoUpdateVo.getRealname(), userInfoUpdateVo.getLoginName(), userInfoUpdateVo.getLoginPassword(),
                userInfoUpdateVo.getDepartmentId(), userInfoUpdateVo.getRoleId(), userInfoUpdateVo.getEmail(),
                userInfoUpdateVo.getContactWay(), userInfoUpdateVo.getUserId() );
        try {
            Integer updateCount = userInfoMapper.updateBySelective( userInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【UserInfoService】【updateUserInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeUserInfo( UserInfoDeleteVO userInfoDeleteVo ) throws BaseException {
        UserInfoEntity userInfoEntity = new UserInfoEntity( userInfoDeleteVo.getUserId() );
        userInfoEntity.setDeleteFlag( userInfoDeleteVo.getDeleteFlag() );
        userInfoEntity.setStatus( userInfoDeleteVo.getStatus() );
        try {
            Integer updateCount = userInfoMapper.updateBySelective( userInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【UserInfoService】【removeUserInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public UserInfoListBO userInfoList( UserInfoListVO userInfoListVo ) throws BaseException {
        userInfoListVo.calculateBeginIndex();
        try {
            List<UserInfoListModel> userInfoList = userInfoMapper.selectUserListByPage(userInfoListVo);
            Integer totalRecorders = userInfoMapper.countUserListByPage( userInfoListVo );
            UserInfoListBO responseBo = new UserInfoListBO( userInfoList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, userInfoListVo.getPageRecorders() ) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【UserInfoService】【userInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public UserInfoDetailBO userDetail( UserInfoDetailVO userInfoDetailVo ) throws BaseException {
        try {
            return userInfoMapper.selectUserInfoByUserId( userInfoDetailVo.getUserId() );
        } catch ( Exception e ) {
            LOGGER.error( "【UserInfoService】【userDetail】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public UserInfoVeterinarianBO getUserListByRole( RoleShortNameEnum roleShortNameEnum ) throws BaseException {
        List<UserInfoVeterinarianModel> veterinarianList = userInfoMapper.selectUserListByRole( roleShortNameEnum.shortName );
        if ( veterinarianList == null || veterinarianList.size() == 0 ) {
            return null;
        }
        return new UserInfoVeterinarianBO( veterinarianList );
    }

    @Override
    public UserInfoComboBoxBO comboBox(String departmentId) throws BaseException {
        try {
            List<UserInfoComboBoxModel> userList = userInfoMapper.selectUserListByComboBox( departmentId );
            return new UserInfoComboBoxBO( userList );
        } catch ( Exception e ) {
            LOGGER.error( "【UserInfoService】【comboBox】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

}
