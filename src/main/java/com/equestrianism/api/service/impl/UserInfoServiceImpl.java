package com.equestrianism.api.service.impl;

import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.UserInfoMapper;
import com.equestrianism.api.model.bo.UserInfoDetailBO;
import com.equestrianism.api.model.bo.UserInfoListBO;
import com.equestrianism.api.model.model.UserInfoListModel;
import com.equestrianism.api.model.po.UserInfoEntity;
import com.equestrianism.api.model.vo.*;
import com.equestrianism.api.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/1/15.
 */
@Service( "userInfoService" )
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public Boolean addUserInfo( UserInfoAddVO userInfoAddVo ) {
        UserInfoEntity userInfoEntity = new UserInfoEntity( userInfoAddVo.getJobNumber(), userInfoAddVo.getRealname(),
                userInfoAddVo.getLoginName(), userInfoAddVo.getLoginPassword(), userInfoAddVo.getDepartmentId(),
                userInfoAddVo.getRoleId(), userInfoAddVo.getEmail(), userInfoAddVo.getContactWay(), userInfoAddVo.getAccessId() );
        Integer insertCount = userInfoMapper.insert( userInfoEntity );
        if ( insertCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateUserInfo( UserInfoUpdateVO userInfoUpdateVo ) {
        UserInfoEntity userInfoEntity = new UserInfoEntity( userInfoUpdateVo.getUserId(), userInfoUpdateVo.getJobNumber(),
                userInfoUpdateVo.getRealname(), userInfoUpdateVo.getLoginName(), userInfoUpdateVo.getLoginPassword(),
                userInfoUpdateVo.getDepartmentId(), userInfoUpdateVo.getRoleId(), userInfoUpdateVo.getEmail(),
                userInfoUpdateVo.getContactWay(), userInfoUpdateVo.getUserId() );
        Integer updateCount = userInfoMapper.updateBySelective( userInfoEntity );
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean removeUserInfo( UserInfoDeleteVO userInfoDeleteVo ) {
        UserInfoEntity userInfoEntity = new UserInfoEntity( userInfoDeleteVo.getUserId() );
        userInfoEntity.setDeleteFlag( userInfoDeleteVo.getDeleteFlag() );
        userInfoEntity.setStatus( userInfoDeleteVo.getStatus() );
        Integer updateCount = userInfoMapper.updateBySelective( userInfoEntity );
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public UserInfoListBO userInfoList( UserInfoListVO userInfoListVo ) {
        userInfoListVo.calculateBeginIndex();
        List<UserInfoListModel> userInfoList = userInfoMapper.selectUserListByPage(userInfoListVo);
        Integer totalRecorders = userInfoMapper.countUserListByPage( userInfoListVo );
        UserInfoListBO responseBo = new UserInfoListBO( userInfoList );
        responseBo.setTotalRecorders( totalRecorders );
        responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, userInfoListVo.getPageRecorders() ) );
        return responseBo;
    }

    @Override
    public UserInfoDetailBO userDetail( UserInfoDetailVO userInfoDetailVo ) {
        return userInfoMapper.selectUserInfoByUserId( userInfoDetailVo.getUserId() );
    }

}
