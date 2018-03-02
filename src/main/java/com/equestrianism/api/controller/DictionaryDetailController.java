package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.DictionaryDetailInfoBO;
import com.equestrianism.api.model.bo.DictionaryDetailListBO;
import com.equestrianism.api.model.bo.DictionaryInfoListBO;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailAddVO;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailDeleteVO;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailListVO;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailUpdateVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoAddVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoDeleteVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoListVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoUpdateVO;
import com.equestrianism.api.service.DictionaryDetailService;
import com.equestrianism.api.service.DictionaryInfoService;
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
 * 2018/2/23
 */
@Controller
@RequestMapping( "/dictionaryDetail" )
public class DictionaryDetailController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( DictionaryDetailController.class );

    @Autowired
    private DictionaryDetailService dictionaryDetailService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody DictionaryDetailAddVO dictionaryDetailAddVo ) {
        dictionaryDetailAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【DictionaryDetailController】【add】【inputs】" + dictionaryDetailAddVo.toJsonString() );
        try {
            if ( dictionaryDetailService.addDictionaryDetail( dictionaryDetailAddVo ) ) {
                LOGGER.info( "【DictionaryDetailController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【DictionaryDetailController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【DictionaryDetailController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody DictionaryDetailUpdateVO dictionaryDetailUpdateVo ) {
        dictionaryDetailUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【DictionaryDetailController】【update】begin " + dictionaryDetailUpdateVo.toJsonString() );
        try {
            if ( dictionaryDetailService.updateDictionaryDetail( dictionaryDetailUpdateVo ) ) {
                LOGGER.info( "【DictionaryDetailController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【DictionaryDetailController】【update】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【DictionaryDetailController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody DictionaryDetailDeleteVO dictionaryDetailDeleteVo ) {
        LOGGER.info( "【DictionaryDetailController】【delete】inputs : " + dictionaryDetailDeleteVo.toJsonString() );
        try {
            if ( dictionaryDetailService.removeDictionaryDetail( dictionaryDetailDeleteVo ) ) {
                LOGGER.info( "【DictionaryDetailController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【DictionaryDetailController】【delete】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【DictionaryDetailController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( DictionaryDetailListVO dictionaryDetailListVo ) {
        LOGGER.info( "【DictionaryDetailController】【list】inputs : " + dictionaryDetailListVo.toJsonString() );
        try {
            DictionaryDetailListBO response = dictionaryDetailService.dictionaryDetailList( dictionaryDetailListVo );
            LOGGER.info( "【DictionaryDetailController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【DictionaryDetailController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( Integer dictionaryDetailId ) {
        LOGGER.info( "【DictionaryDetailController】【detail】inputs : " + dictionaryDetailId );
        try {
            DictionaryDetailInfoBO response = dictionaryDetailService.dictionaryDetailInfo( dictionaryDetailId );
            LOGGER.info( "【DictionaryDetailController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【DictionaryDetailController】【detail】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
