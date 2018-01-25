package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.vo.*;
import com.equestrianism.api.service.DepartmentInfoService;
import com.equestrianism.api.service.RoleInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Iceman
 * 2018/1/23
 */
@Controller
@RequestMapping( "/departmentInfo" )
public class DepartmentInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( DepartmentInfoController.class );

    @Autowired
    private DepartmentInfoService departmentInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody DepartmentInfoAddVO departmentInfoAddVo ) {
        departmentInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【DepartmentInfoController】【add】inputs : " + departmentInfoAddVo.toJsonString() );
        if ( departmentInfoService.addDepartmentInfo( departmentInfoAddVo ) ) {
            LOGGER.info( "【DepartmentInfoController】【add】result : success" );
            return ContainerUtils.buildResSuccessMap();
        }
        LOGGER.info( "【DepartmentInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody DepartmentInfoUpdateVO departmentInfoUpdateVo ) {
        departmentInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【DepartmentInfoController】【update】inputs : " + departmentInfoUpdateVo.toJsonString() );
        if ( departmentInfoService.updateDepartmentInfo( departmentInfoUpdateVo ) ) {
            LOGGER.info( "【DepartmentInfoController】【update】result : success" );
            return ContainerUtils.buildResSuccessMap();
        }
        LOGGER.info( "【DepartmentInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody DepartmentInfoDeleteVO departmentInfoDeleteVO ) {
        LOGGER.info( "【DepartmentInfoController】【delete】inputs : " + departmentInfoDeleteVO.toJsonString() );
        if ( departmentInfoService.removeDepartmentInfo( departmentInfoDeleteVO ) ) {
            LOGGER.info( "【DepartmentInfoController】【delete】result : success" );
            return ContainerUtils.buildResSuccessMap();
        }
        LOGGER.info( "【DepartmentInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( DepartmentInfoListVO departmentInfoListVo ) throws UnsupportedEncodingException {
        LOGGER.info( "【DepartmentInfoController】【list】inputs : " + departmentInfoListVo.toJsonString() );
        DepartmentInfoListBO response = departmentInfoService.departmentInfoList( departmentInfoListVo );
        LOGGER.info( "【DepartmentInfoController】【list】result : " + response.toJsonString() );
        return ContainerUtils.buildResSuccessMap( response );
    }

    @RequestMapping( value = "/comboBox", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> comboBox() {
        LOGGER.info( "【DepartmentInfoController】【comboBox】begin" );
        DepartmentInfoComboBoxBO response = departmentInfoService.comboBox();
        LOGGER.info( "【DepartmentInfoController】【comboBox】result : " + response.toJsonString() );
        return ContainerUtils.buildResSuccessMap( response );
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( DepartmentInfoDetailVO departmentInfoDetailVo ) {
        LOGGER.info( "【DepartmentInfoController】【detail】inputs : " + departmentInfoDetailVo.toJsonString() );
        DepartmentInfoDetailBO response = departmentInfoService.departmentDetail( departmentInfoDetailVo );
        LOGGER.info( "【DepartmentInfoController】【detail】result : " + response.toJsonString() );
        return ContainerUtils.buildResSuccessMap( response );
    }

}
