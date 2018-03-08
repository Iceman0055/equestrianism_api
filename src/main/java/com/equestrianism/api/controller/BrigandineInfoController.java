package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.vo.brigandine_info.*;
import com.equestrianism.api.service.BrigandineInfoService;
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
 * Created by Chenzq on 2018/3/9.
 */
@Controller
@RequestMapping( "/brigandineInfo" )
public class BrigandineInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( BrigandineInfoController.class);

    @Autowired
    private BrigandineInfoService brigandineInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody BrigandineInfoAddVO brigandineInfoAddVo ) {
        brigandineInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【BrigandineInfoController】【add】inputs : " + brigandineInfoAddVo.toJsonString() );
        try {
            if ( brigandineInfoService.addBrigandineInfo( brigandineInfoAddVo)) {
                LOGGER.info( "【BrigandineInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【BrigandineInfoController】【add】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【BrigandineInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody BrigandineInfoUpdateVO brigandineInfoUpdateVo ) {
        brigandineInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【BrigandineInfoController】【update】inputs : " + brigandineInfoUpdateVo.toJsonString() );
        try {
            if ( brigandineInfoService.updateBrigandineInfo( brigandineInfoUpdateVo)) {
                LOGGER.info( "【BrigandineInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【BrigandineInfoController】【update】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【BrigandineInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody BrigandineInfoDeleteVO brigandineInfoDeleteVo ) {
        LOGGER.info( "【BrigandineInfoController】【delete】inputs : " + brigandineInfoDeleteVo.toJsonString() );
        try {
            if ( brigandineInfoService.removeBrigandineInfo( brigandineInfoDeleteVo)) {
                LOGGER.info( "【BrigandineInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【BrigandineInfoController】【delete】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【BrigandineInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( BrigandineInfoListVO brigandineInfoListVo ) {
        LOGGER.info( "【BrigandineInfoController】【list】inputs : " + brigandineInfoListVo.toJsonString() );
        try {
            BrigandineInfoListBO response = brigandineInfoService.brigandineInfoList( brigandineInfoListVo);
            LOGGER.info( "【BrigandineInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【BrigandineInfoController】【list】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( BrigandineInfoDetailVO brigandineInfoDetailVo ) {
        LOGGER.info( "【BrigandineInfoController】【detail】inputs : " + brigandineInfoDetailVo.toJsonString() );
        try {
            BrigandineInfoDetailBO response = brigandineInfoService.brigandineInfoDetail( brigandineInfoDetailVo );
            LOGGER.info( "【BrigandineInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【BrigandineInfoController】【detail】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
