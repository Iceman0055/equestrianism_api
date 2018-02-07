package com.equestrianism.api.controller;

import com.equestrianism.api.controller.valid.HorseInfoValid;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.HorseInfoDetailBO;
import com.equestrianism.api.model.bo.HorseInfoListBO;
import com.equestrianism.api.model.bo.RoleInfoListBO;
import com.equestrianism.api.model.vo.RoleInfoDeleteVO;
import com.equestrianism.api.model.vo.RoleInfoListVO;
import com.equestrianism.api.model.vo.RoleInfoUpdateVO;
import com.equestrianism.api.model.vo.horse_info.*;
import com.equestrianism.api.service.HorseInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

/**
 * Created by Chenzq on 2018/1/26.
 */
@Controller
@RequestMapping( "/horseInfo" )
public class HorseInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( HorseInfoController.class );

    @Autowired
    private HorseInfoService horseInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> add( HorseInfoAddVO horseInfoAddVo ) {
        horseInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【HorseInfoController】【add】begin" );
        try {
            if ( horseInfoService.addHorseInfo( HorseInfoValid.horseInfoAddValid( horseInfoAddVo ) ) ) {
                LOGGER.info( "【HorseInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HorseInfoController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HorseInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> update( HorseInfoUpdateVO horseInfoUpdateVo ) {
        horseInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【HorseInfoController】【update】begin" );
        try {
            if ( horseInfoService.updateHorseInfo( HorseInfoValid.horseInfoUpdateValid( horseInfoUpdateVo ) ) ) {
                LOGGER.info( "【HorseInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HorseInfoController】【update】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HorseInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody HorseInfoDeleteVO horseInfoDeleteVo ) {
        LOGGER.info( "【HorseInfoController】【delete】inputs : " + horseInfoDeleteVo.toJsonString() );
        try {
            if ( horseInfoService.removeHorseInfo( horseInfoDeleteVo ) ) {
                LOGGER.info( "【HorseInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HorseInfoController】【delete】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HorseInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( HorseInfoListVO horseInfoListVo ) {
        LOGGER.info( "【HorseInfoController】【list】inputs : " + horseInfoListVo.toJsonString() );
        try {
            HorseInfoListBO response = horseInfoService.horseInfoList( horseInfoListVo );
            LOGGER.info( "【HorseInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【HorseInfoController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( HorseInfoDetailVO horseInfoDetailVo ) {
        LOGGER.info( "【HorseInfoController】【detail】inputs : " + horseInfoDetailVo.toJsonString() );
        try {
            HorseInfoDetailBO response = horseInfoService.horseInfoDetail( horseInfoDetailVo );
            LOGGER.info( "【HorseInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【HorseInfoController】【detail】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
