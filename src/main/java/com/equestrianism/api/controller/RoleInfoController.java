package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.vo.*;
import com.equestrianism.api.service.RoleInfoService;
import com.equestrianism.api.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Chenzq on 2018/1/22.
 */
@Controller
@RequestMapping( "/roleInfo" )
public class RoleInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( RoleInfoController.class );

    @Autowired
    private RoleInfoService roleInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody RoleInfoAddVO roleInfoAddVo ) {
        roleInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【RoleInfoController】【add】inputs : " + roleInfoAddVo.toJsonString() );
        if ( roleInfoService.addRoleInfo( roleInfoAddVo ) ) {
            LOGGER.info( "【RoleInfoController】【add】result : success" );
            return ContainerUtils.buildResSuccessMap();
        }
        LOGGER.info( "【RoleInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody RoleInfoUpdateVO roleInfoUpdateVo ) {
        roleInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【RoleInfoController】【update】inputs : " + roleInfoUpdateVo.toJsonString() );
        if ( roleInfoService.updateRoleInfo(roleInfoUpdateVo) ) {
            LOGGER.info( "【RoleInfoController】【update】result : success" );
            return ContainerUtils.buildResSuccessMap();
        }
        LOGGER.info( "【RoleInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody RoleInfoDeleteVO roleInfoDeleteVo ) {
        LOGGER.info( "【RoleInfoController】【delete】inputs : " + roleInfoDeleteVo.toJsonString() );
        if ( roleInfoService.removeRoleInfo( roleInfoDeleteVo ) ) {
            LOGGER.info( "【RoleInfoController】【delete】result : success" );
            return ContainerUtils.buildResSuccessMap();
        }
        LOGGER.info( "【RoleInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( RoleInfoListVO roleInfoListVo ) {
        LOGGER.info( "【RoleInfoController】【list】inputs : " + roleInfoListVo.toJsonString() );
        RoleInfoListBO response = roleInfoService.roleInfoList(roleInfoListVo);
        LOGGER.info( "【RoleInfoController】【list】result : " + response.toJsonString() );
        return ContainerUtils.buildResSuccessMap( response );
    }

    @RequestMapping( value = "/comboBox", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> comboBox() {
        LOGGER.info( "【RoleInfoController】【comboBox】begin" );
        RoleInfoComboBoxBO response = roleInfoService.comboBox();
        LOGGER.info( "【RoleInfoController】【comboBox】result : " + response.toJsonString() );
        return ContainerUtils.buildResSuccessMap( response );
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( RoleInfoDetailVO roleInfoDetailVo ) {
        LOGGER.info( "【RoleInfoController】【detail】inputs : " + roleInfoDetailVo.toJsonString() );
        RoleInfoDetailBO response = roleInfoService.roleDetail( roleInfoDetailVo );
        LOGGER.info( "【RoleInfoController】【detail】result : " + response.toJsonString() );
        return ContainerUtils.buildResSuccessMap( response );
    }

}
