package com.equestrianism.api.controller;

import com.equestrianism.api.constants.RoleShortNameEnum;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.UserInfoDetailBO;
import com.equestrianism.api.model.bo.UserInfoListBO;
import com.equestrianism.api.model.bo.UserInfoVeterinarianBO;
import com.equestrianism.api.model.vo.*;
import com.equestrianism.api.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
        try {
            if ( userInfoService.addUserInfo( userInfoAddVo ) ) {
                LOGGER.info( "【UserInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【UserInfoController】【add】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【UserInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap( "操作失败" );
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map< String, Object > update( @RequestBody UserInfoUpdateVO userInfoUpdateVo ) {
        userInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【UserInfoController】【update】inputs : " + userInfoUpdateVo.toJsonString() );
        try {
            if ( userInfoService.updateUserInfo( userInfoUpdateVo ) ) {
                LOGGER.info( "【UserInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【UserInfoController】【update】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【UserInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap( "操作失败" );
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map< String, Object > delete( @RequestBody UserInfoDeleteVO userInfoDeleteVo ) {
        LOGGER.info( "【UserInfoController】【delete】inputs : " + userInfoDeleteVo.toJsonString() );
        try {
            if ( userInfoService.removeUserInfo( userInfoDeleteVo ) ) {
                LOGGER.info( "【UserInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【UserInfoController】【delete】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【UserInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap( "操作失败" );
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( UserInfoListVO userInfoListVo ) {
        LOGGER.info( "【UserInfoController】【list】inputs : " + userInfoListVo.toJsonString() );
        try {
            UserInfoListBO response = userInfoService.userInfoList( userInfoListVo );
            LOGGER.info( "【UserInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【UserInfoController】【list】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( UserInfoDetailVO userInfoDetailVo ) {
        LOGGER.info( "【UserInfoController】【detail】inputs : " + userInfoDetailVo.toJsonString() );
        try {
            UserInfoDetailBO response = userInfoService.userDetail( userInfoDetailVo );
            LOGGER.info( "【UserInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【UserInfoController】【detail】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/veterinarian", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> veterinarian() {
        LOGGER.info( "【UserInfoController】【veterinarian】inputs : " );
        try {
            UserInfoVeterinarianBO response = userInfoService.getUserListByRole( RoleShortNameEnum.H_VETERINARIAN );
            LOGGER.info( "【UserInfoController】【veterinarian】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【UserInfoController】【veterinarian】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/feeder", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> feeder() {
        LOGGER.info( "【UserInfoController】【feeder】inputs : " );
        try {
            UserInfoVeterinarianBO response = userInfoService.getUserListByRole( RoleShortNameEnum.H_FEEDER );
            LOGGER.info( "【UserInfoController】【feeder】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【UserInfoController】【feeder】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
