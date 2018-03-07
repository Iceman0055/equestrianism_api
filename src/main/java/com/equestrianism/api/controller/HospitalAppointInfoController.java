package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.vo.*;
import com.equestrianism.api.model.vo.hospital_appoint_info.*;
import com.equestrianism.api.service.HospitalAppointInfoService;
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
 * Iceman
 * 2018/3/7
 */
@Controller
@RequestMapping( "/appointInfo" )
public class HospitalAppointInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( RoleInfoController.class );

    @Autowired
    private HospitalAppointInfoService hospitalAppointInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody HospitalAppointInfoAddVO hospitalAppointInfoAddVo ) {
        hospitalAppointInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【HospitalAppointInfoController】【add】inputs : " + hospitalAppointInfoAddVo.toJsonString() );
        try {
            if ( hospitalAppointInfoService.addHospitalAppointInfo( hospitalAppointInfoAddVo ) ) {
                LOGGER.info( "【HospitalAppointInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HospitalAppointInfoController】【add】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HospitalAppointInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody HospitalAppointInfoUpdateVO hospitalAppointInfoUpdateVo ) {
        hospitalAppointInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【HospitalAppointInfoController】【update】inputs : " + hospitalAppointInfoUpdateVo.toJsonString() );
        try {
            if ( hospitalAppointInfoService.updateHospitalAppointInfo( hospitalAppointInfoUpdateVo ) ) {
                LOGGER.info( "【HospitalAppointInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HospitalAppointInfoController】【update】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HospitalAppointInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody HospitalAppointInfoDeleteVO hospitalAppointInfoDeleteVo ) {
        LOGGER.info( "【HospitalAppointInfoController】【delete】inputs : " + hospitalAppointInfoDeleteVo.toJsonString() );
        try {
            if ( hospitalAppointInfoService.removeHospitalAppointInfo( hospitalAppointInfoDeleteVo ) ) {
                LOGGER.info( "【HospitalAppointInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HospitalAppointInfoController】【delete】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HospitalAppointInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( HospitalAppointInfoListVO hospitalAppointInfoListVo ) {
        LOGGER.info( "【HospitalAppointInfoController】【list】inputs : " + hospitalAppointInfoListVo.toJsonString() );
        try {
            HospitalAppointInfoListBO response = hospitalAppointInfoService.hospitalAppointInfoList( hospitalAppointInfoListVo );
            LOGGER.info( "【HospitalAppointInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【HospitalAppointInfoController】【list】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( HospitalAppointInfoDetailVO hospitalAppointInfoDetailVo ) {
        LOGGER.info( "【HospitalAppointInfoController】【detail】inputs : " + hospitalAppointInfoDetailVo.toJsonString() );
        try {
            HospitalAppointInfoDetailBO response = hospitalAppointInfoService.hospitalAppointInfoDetail( hospitalAppointInfoDetailVo );
            LOGGER.info( "【HospitalAppointInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【HospitalAppointInfoController】【detail】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }


}
