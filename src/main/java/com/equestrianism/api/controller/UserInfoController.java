package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.UserInfoListBO;
import com.equestrianism.api.model.vo.*;
import com.equestrianism.api.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Chenzq on 2018/1/15.
 */
@Controller
@RequestMapping( "/userInfo" )
public class UserInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( UserInfoController.class );

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map< String, Object > add( @RequestBody UserInfoAddVO userInfoAddVo ) {
        userInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【UserInfoController】【add】inputs : " + userInfoAddVo.toJsonString() );
        if ( userInfoService.addUserInfo( userInfoAddVo ) ) {
            LOGGER.info( "【UserInfoController】【add】result : success" );
            return ContainerUtils.buildResSuccessMap();
        }
        LOGGER.info( "【UserInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap( "操作失败" );
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map< String, Object > update( @RequestBody UserInfoUpdateVO userInfoUpdateVo ) {
        userInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【UserInfoController】【update】inputs : " + userInfoUpdateVo.toJsonString() );
        if ( userInfoService.updateUserInfo( userInfoUpdateVo ) ) {
            LOGGER.info( "【UserInfoController】【update】result : success" );
            return ContainerUtils.buildResSuccessMap();
        }
        LOGGER.info( "【UserInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap( "操作失败" );
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map< String, Object > delete( @RequestBody UserInfoDeleteVO userInfoDeleteVo ) {
        LOGGER.info( "【UserInfoController】【delete】inputs : " + userInfoDeleteVo.toJsonString() );
        if ( userInfoService.removeUserInfo( userInfoDeleteVo ) ) {
            LOGGER.info( "【UserInfoController】【delete】result : success" );
            return ContainerUtils.buildResSuccessMap();
        }
        LOGGER.info( "【UserInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap( "操作失败" );
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map< String, Object > list( UserInfoListVO userInfoListVo ) {
        LOGGER.info( "【UserInfoController】【list】inputs : " + userInfoListVo.toJsonString() );
        UserInfoListBO response = userInfoService.userInfoList( userInfoListVo );
        LOGGER.info( "【UserInfoController】【list】result : " + response.toJsonString() );
        return ContainerUtils.buildResSuccessMap( response );
    }

}
