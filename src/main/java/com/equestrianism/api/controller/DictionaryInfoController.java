package com.equestrianism.api.controller;

import com.equestrianism.api.controller.valid.HorseInfoValid;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoAddVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoUpdateVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoAddVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoUpdateVO;
import com.equestrianism.api.service.DictionaryInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Iceman
 * 2018/2/23
 */
@Controller
@RequestMapping( "/dictionaryInfo" )
public class DictionaryInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( DictionaryInfoController.class );

    @Autowired
    private DictionaryInfoService dictionaryInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> add( DictionaryInfoAddVO dictionaryInfoAddVo ) {
        dictionaryInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【DictionaryInfoController】【add】【inputs】" + dictionaryInfoAddVo.toJsonString() );
        try {
            if ( dictionaryInfoService.addDictionaryInfo( dictionaryInfoAddVo ) ) {
                LOGGER.info( "【DictionaryInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【DictionaryInfoController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【DictionaryInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> update( DictionaryInfoUpdateVO dictionaryInfoUpdateVo ) {
        dictionaryInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【DictionaryInfoController】【update】begin " + dictionaryInfoUpdateVo.toJsonString() );
        try {
            if ( dictionaryInfoService.updateDictionaryInfo( dictionaryInfoUpdateVo ) ) {
                LOGGER.info( "【DictionaryInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【DictionaryInfoController】【update】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【DictionaryInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

}
