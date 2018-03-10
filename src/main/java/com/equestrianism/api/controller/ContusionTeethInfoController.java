package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.BrigandineInfoDetailBO;
import com.equestrianism.api.model.bo.BrigandineInfoListBO;
import com.equestrianism.api.model.bo.ContusionTeethInfoDetailBO;
import com.equestrianism.api.model.bo.ContusionTeethInfoListBO;
import com.equestrianism.api.model.vo.brigandine_info.*;
import com.equestrianism.api.model.vo.contusion_teeth_info.*;
import com.equestrianism.api.service.BrigandineInfoService;
import com.equestrianism.api.service.ContusionTeethInfoService;
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
@RequestMapping( "/contusionTeethInfo" )
public class ContusionTeethInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( ContusionTeethInfoController.class );

    @Autowired
    private ContusionTeethInfoService contusionTeethInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody ContusionTeethInfoAddVO contusionTeethInfoAddVo ) {
        contusionTeethInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【ContusionTeethInfoController】【add】inputs : " + contusionTeethInfoAddVo.toJsonString() );
        try {
            if ( contusionTeethInfoService.addContusionTeethInfo(contusionTeethInfoAddVo) ) {
                LOGGER.info( "【ContusionTeethInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【ContusionTeethInfoController】【add】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【ContusionTeethInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody ContusionTeethInfoUpdateVO contusionTeethInfoUpdateVo ) {
        contusionTeethInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【ContusionTeethInfoController】【update】inputs : " + contusionTeethInfoUpdateVo.toJsonString() );
        try {
            if ( contusionTeethInfoService.updateContusionTeethInfo(contusionTeethInfoUpdateVo) ) {
                LOGGER.info( "【ContusionTeethInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【ContusionTeethInfoController】【update】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【ContusionTeethInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody ContusionTeethInfoDeleteVO contusionTeethInfoDeleteVo ) {
        LOGGER.info( "【ContusionTeethInfoController】【delete】inputs : " + contusionTeethInfoDeleteVo.toJsonString() );
        try {
            if ( contusionTeethInfoService.removeContusionTeethInfo(contusionTeethInfoDeleteVo) ) {
                LOGGER.info( "【ContusionTeethInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【ContusionTeethInfoController】【delete】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【ContusionTeethInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( ContusionTeethInfoListVO contusionTeethInfoListVo ) {
        LOGGER.info( "【ContusionTeethInfoController】【list】inputs : " + contusionTeethInfoListVo.toJsonString() );
        try {
            ContusionTeethInfoListBO response = contusionTeethInfoService.contusionTeethInfoList(contusionTeethInfoListVo );
            LOGGER.info( "【ContusionTeethInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【ContusionTeethInfoController】【list】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( ContusionTeethInfoDetailVO contusionTeethInfoDetailVo ) {
        LOGGER.info( "【ContusionTeethInfoController】【detail】inputs : " + contusionTeethInfoDetailVo.toJsonString() );
        try {
            ContusionTeethInfoDetailBO response = contusionTeethInfoService.contusionTeethInfoDetail( contusionTeethInfoDetailVo );
            LOGGER.info( "【ContusionTeethInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【ContusionTeethInfoController】【detail】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
