package com.equestrianism.api.controller;

import com.equestrianism.api.controller.valid.FeederInfoValid;
import com.equestrianism.api.controller.valid.HorsePrizeInfoValid;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.FeederInfoDetailBO;
import com.equestrianism.api.model.bo.FeederInfoListBO;
import com.equestrianism.api.model.bo.HorsePrizeInfoDetailBO;
import com.equestrianism.api.model.bo.HorsePrizeInfoListBO;
import com.equestrianism.api.model.vo.feeder_info.*;
import com.equestrianism.api.model.vo.horse_prize_info.*;
import com.equestrianism.api.service.HorsePrizeInfoService;
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
 * 2018/3/6
 */
@Controller
@RequestMapping( "/horsePrizeInfo" )
public class HorsePrizeInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( HorsePrizeInfoController.class );

    @Autowired
    private HorsePrizeInfoService horsePrizeInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> add( HorsePrizeInfoAddVO horsePrizeInfoAddVo ) {
        horsePrizeInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【HorsePrizeInfoController】【add】begin" );
        try {
            if ( horsePrizeInfoService.addHorsePrizeInfo( HorsePrizeInfoValid.horsePrizeInfoAddValid( horsePrizeInfoAddVo ) ) ) {
                LOGGER.info( "【HorsePrizeInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HorsePrizeInfoController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HorsePrizeInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> update( HorsePrizeInfoUpdateVO horsePrizeInfoUpdateVo ) {
        horsePrizeInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【HorsePrizeInfoController】【update】begin " + horsePrizeInfoUpdateVo.getHorsePrizeId() );
        try {
            if ( horsePrizeInfoService.updateHorsePrizeInfo(HorsePrizeInfoValid.horsePrizeInfoUpdateValid(horsePrizeInfoUpdateVo)) ) {
                LOGGER.info( "【HorsePrizeInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HorsePrizeInfoController】【update】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HorsePrizeInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody HorsePrizeInfoDeleteVO horsePrizeInfoDeleteVo ) {
        LOGGER.info( "【HorsePrizeInfoController】【delete】inputs : " + horsePrizeInfoDeleteVo.toJsonString() );
        try {
            if ( horsePrizeInfoService.removeHorsePrizeInfo(horsePrizeInfoDeleteVo ) ) {
                LOGGER.info( "【HorsePrizeInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【HorsePrizeInfoController】【delete】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【HorsePrizeInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( HorsePrizeInfoListVO horsePrizeInfoListVo ) throws UnsupportedEncodingException {
        if ( horsePrizeInfoListVo.getEventName() != null && !"".equals(horsePrizeInfoListVo.getEventName()) ) {
            horsePrizeInfoListVo.setEventName(new String(horsePrizeInfoListVo.getEventName().getBytes("ISO-8859-1"), "UTF-8"));
        }
        LOGGER.info( "【HorsePrizeInfoController】【list】inputs : " + horsePrizeInfoListVo.toJsonString() );
        try {
            HorsePrizeInfoListBO response = horsePrizeInfoService.horsePrizeInfoList(horsePrizeInfoListVo );
            LOGGER.info( "【HorsePrizeInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【HorsePrizeInfoController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( HorsePrizeInfoDetailVO horsePrizeInfoDetailVo ) {
        LOGGER.info( "【HorsePrizeInfoController】【detail】inputs : " + horsePrizeInfoDetailVo.toJsonString() );
        try {
            HorsePrizeInfoDetailBO response = horsePrizeInfoService.horsePrizeInfoDetail(horsePrizeInfoDetailVo );
            LOGGER.info( "【HorsePrizeInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【HorsePrizeInfoController】【detail】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }


}
