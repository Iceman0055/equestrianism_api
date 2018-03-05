package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.HostInfoDetailBO;
import com.equestrianism.api.model.bo.HostInfoListBO;
import com.equestrianism.api.model.vo.host_info.*;
import com.equestrianism.api.service.HostInfoService;
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
 * Created by Chenzq on 2018/3/4.
 */
@Controller
@RequestMapping( "/hostInfo" )
public class HostInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( HostInfoController.class );

    @Autowired
    private HostInfoService hostInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody HostInfoAddVO hostInfoAddVo ) {
        hostInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【HostInfoController】【add】inputs : " + hostInfoAddVo.toJsonString() );
        try {
            if ( hostInfoService.addHostInfo(hostInfoAddVo) ) {
                LOGGER.info( "【HostInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HostInfoController】【add】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HostInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody HostInfoUpdateVO hostInfoUpdateVo ) {
        hostInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【HostInfoController】【update】inputs : " + hostInfoUpdateVo.toJsonString() );
        try {
            if ( hostInfoService.updateHostInfo( hostInfoUpdateVo ) ) {
                LOGGER.info( "【HostInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HostInfoController】【update】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HostInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody HostInfoDeleteVO hostInfoDeleteVo ) {
        LOGGER.info( "【HostInfoController】【delete】inputs : " + hostInfoDeleteVo.toJsonString() );
        try {
            if ( hostInfoService.removeHostInfo( hostInfoDeleteVo ) ) {
                LOGGER.info( "【HostInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HostInfoController】【delete】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HostInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( HostInfoListVO hostInfoListVo ) throws UnsupportedEncodingException {
        LOGGER.info( "【HostInfoController】【list】inputs : " + hostInfoListVo.toJsonString() );
        try {
            if ( hostInfoListVo.getHostName() != null && !"".equals( hostInfoListVo.getHostName() ) ) {
                hostInfoListVo.setHostName( new String( hostInfoListVo.getHostName().getBytes( "ISO-8859-1" ), "UTF-8" ) );
            }
            HostInfoListBO response = hostInfoService.hostInfoList( hostInfoListVo );
            LOGGER.info( "【HostInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【HostInfoController】【list】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( HostInfoDetailVO hostInfoDetailVo ) {
        LOGGER.info( "【HostInfoController】【detail】inputs : " + hostInfoDetailVo.toJsonString() );
        try {
            HostInfoDetailBO response = hostInfoService.hostDetail( hostInfoDetailVo );
            LOGGER.info( "【HostInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【HostInfoController】【detail】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
