package com.equestrianism.api.service.impl;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.dao.RoleMenuInfoMapper;
import com.equestrianism.api.dao.UserInfoMapper;
import com.equestrianism.api.dao.UserSessionMapper;
import com.equestrianism.api.model.bo.AuthLoginBO;
import com.equestrianism.api.model.po.UserInfoEntity;
import com.equestrianism.api.model.po.UserSessionEntity;
import com.equestrianism.api.model.vo.AuthLoginVO;
import com.equestrianism.api.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Chenzq on 2018/3/21.
 */
@Service( "registerService" )
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private RoleMenuInfoMapper roleMenuInfoMapper;

    @Autowired
    private UserSessionMapper userSessionMapper;

    @Override
    public AuthLoginBO login(AuthLoginVO authLoginVo) throws BaseException {
        UserInfoEntity userInfoEntity = new UserInfoEntity();
        userInfoEntity.setLoginName( authLoginVo.getLoginName() );
        userInfoEntity.setLoginPassword( authLoginVo.getLoginPassword() );
        userInfoEntity = userInfoMapper.selectByCondition( userInfoEntity );
        if ( userInfoEntity == null || userInfoEntity.getRoleId() == null ) {
            return null;
        }
        List<Integer> menuList = roleMenuInfoMapper.selectByRoleId( userInfoEntity.getRoleId() );
        if ( menuList == null || menuList.size() == 0 ) {
            return null;
        }
        String sessionId = UUID.randomUUID().toString().replace( "-", "" );
        UserSessionEntity userSessionEntity = new UserSessionEntity( userInfoEntity.getUserId(), sessionId );
        userSessionMapper.insert( userSessionEntity );
        AuthLoginBO authRegisterBO = new AuthLoginBO();
        authRegisterBO.setMenuList( menuList );
        authRegisterBO.setRealname( userInfoEntity.getRealname() );
        authRegisterBO.setSessionId( sessionId );
        authRegisterBO.setUserId( userInfoEntity.getUserId() );
        return authRegisterBO;
    }
}
