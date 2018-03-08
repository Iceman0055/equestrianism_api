package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.vo.*;
import com.equestrianism.api.model.vo.consulting_room_info.*;
import com.equestrianism.api.service.ConsultingRoomInfoService;
import com.equestrianism.api.service.DepartmentInfoService;
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
 * 2018/3/8
 */
@Controller
@RequestMapping( "/consultingRoomInfo" )
public class ConsultingRoomInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( ConsultingRoomInfoController.class );

    @Autowired
    private ConsultingRoomInfoService consultingRoomInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody ConsultingRoomInfoAddVO consultingRoomInfoAddVo ) {
        consultingRoomInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【ConsultingRoomInfoController】【add】inputs : " + consultingRoomInfoAddVo.toJsonString() );
        try {
            if ( consultingRoomInfoService.addConsultingRoomInfo( consultingRoomInfoAddVo ) ) {
                LOGGER.info( "【ConsultingRoomInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsultingRoomInfoController】【add】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【ConsultingRoomInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody ConsultingRoomInfoUpdateVO consultingRoomInfoUpdateVo ) {
        consultingRoomInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【ConsultingRoomInfoController】【update】inputs : " + consultingRoomInfoUpdateVo.toJsonString() );
        try {
            if ( consultingRoomInfoService.updateConsultingRoomInfo( consultingRoomInfoUpdateVo ) ) {
                LOGGER.info( "【ConsultingRoomInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsultingRoomInfoController】【update】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【ConsultingRoomInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody ConsultingRoomInfoDeleteVO consultingRoomInfoDeleteVo ) {
        LOGGER.info( "【ConsultingRoomInfoController】【delete】inputs : " + consultingRoomInfoDeleteVo.toJsonString() );
        try {
            if ( consultingRoomInfoService.removeConsultingRoomInfo( consultingRoomInfoDeleteVo ) ) {
                LOGGER.info( "【ConsultingRoomInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsultingRoomInfoController】【delete】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【ConsultingRoomInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( ConsultingRoomInfoListVO consultingRoomInfoListVo ) throws UnsupportedEncodingException {
        LOGGER.info( "【ConsultingRoomInfoController】【list】inputs : " + consultingRoomInfoListVo.toJsonString() );
        try {
            if ( consultingRoomInfoListVo.getName() != null && !"".equals( consultingRoomInfoListVo.getName() ) ) {
                consultingRoomInfoListVo.setName( new String( consultingRoomInfoListVo.getName().getBytes( "ISO-8859-1" ), "UTF-8" ) );
            }
            if ( consultingRoomInfoListVo.getShortName() != null && !"".equals( consultingRoomInfoListVo.getShortName() ) ) {
                consultingRoomInfoListVo.setShortName( new String( consultingRoomInfoListVo.getShortName().getBytes( "ISO-8859-1" ), "UTF-8" ) );
            }
            ConsultingRoomInfoListBO response = consultingRoomInfoService.consultingRoomInfoList( consultingRoomInfoListVo );
            LOGGER.info( "【ConsultingRoomInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsultingRoomInfoController】【list】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/comboBox", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> comboBox() {
        LOGGER.info( "【ConsultingRoomInfoController】【comboBox】begin" );
        try {
            ConsultingRoomInfoComboBoxBO response = consultingRoomInfoService.comboBox();
            LOGGER.info( "【ConsultingRoomInfoController】【comboBox】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsultingRoomInfoController】【comboBox】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( ConsultingRoomInfoDetailVO consultingRoomInfoDetailVo ) {
        LOGGER.info( "【ConsultingRoomInfoController】【detail】inputs : " + consultingRoomInfoDetailVo.toJsonString() );
        try {
            ConsultingRoomInfoDetailBO response = consultingRoomInfoService.consultingRoomInfoDetail( consultingRoomInfoDetailVo );
            LOGGER.info( "【ConsultingRoomInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsultingRoomInfoController】【detail】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
