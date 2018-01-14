package com.equestrianism.api.service.impl;

import com.equestrianism.api.dao.UserInfoMapper;
import com.equestrianism.api.model.po.UserInfoEntity;
import com.equestrianism.api.model.vo.UserInfoAddVO;
import com.equestrianism.api.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

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
                userInfoAddVo.getRoleId(), userInfoAddVo.getEmail(), userInfoAddVo.getContactWay() );
        Integer insertCount = userInfoMapper.insert( userInfoEntity );
        if ( insertCount > 0 ) {
            return true;
        }
        return false;
    }
}
