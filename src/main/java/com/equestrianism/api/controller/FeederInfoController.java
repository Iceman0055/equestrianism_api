package com.equestrianism.api.controller;

import com.equestrianism.api.controller.valid.FeederInfoValid;
import com.equestrianism.api.controller.valid.HorseInfoValid;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.FeederInfoDetailBO;
import com.equestrianism.api.model.bo.FeederInfoListBO;
import com.equestrianism.api.model.bo.HorseInfoDetailBO;
import com.equestrianism.api.model.bo.HorseInfoListBO;
import com.equestrianism.api.model.vo.feeder_info.*;
import com.equestrianism.api.model.vo.horse_info.*;
import com.equestrianism.api.service.FeederInfoService;
import com.equestrianism.api.service.HorseInfoService;
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
 * 2018/3/5
 */
@Controller
@RequestMapping( "/feederInfo" )
public class FeederInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( FeederInfoController.class );

    @Autowired
    private FeederInfoService feederInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> add( FeederInfoAddVO feederInfoAddVo ) {
        feederInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【FeederInfoController】【add】begin" );
        try {
            if ( feederInfoService.addFeederInfo( FeederInfoValid.feederInfoAddValid( feederInfoAddVo ) ) ) {
                LOGGER.info( "【FeederInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【FeederInfoController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【FeederInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> update( FeederInfoUpdateVO feederInfoUpdateVo ) {
        feederInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【FeederInfoController】【update】begin " + feederInfoUpdateVo.getHorseId() );
        try {
            if ( feederInfoService.updateFeederInfo( FeederInfoValid.feederInfoUpdateValid( feederInfoUpdateVo ) ) ) {
                LOGGER.info( "【FeederInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【FeederInfoController】【update】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【FeederInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody FeederInfoDeleteVO feederInfoDeleteVo ) {
        LOGGER.info( "【FeederInfoController】【delete】inputs : " + feederInfoDeleteVo.toJsonString() );
        try {
            if ( feederInfoService.removeFeederInfo( feederInfoDeleteVo ) ) {
                LOGGER.info( "【FeederInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【FeederInfoController】【delete】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【FeederInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( FeederInfoListVO feederInfoListVo ) {
        LOGGER.info( "【FeederInfoController】【list】inputs : " + feederInfoListVo.toJsonString() );
        try {
            FeederInfoListBO response = feederInfoService.feederInfoList( feederInfoListVo );
            LOGGER.info( "【FeederInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【FeederInfoController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( FeederInfoDetailVO feederInfoDetailVo ) {
        LOGGER.info( "【FeederInfoController】【detail】inputs : " + feederInfoDetailVo.toJsonString() );
        try {
            FeederInfoDetailBO response = feederInfoService.feederInfoDetail( feederInfoDetailVo );
            LOGGER.info( "【FeederInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【FeederInfoController】【detail】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
