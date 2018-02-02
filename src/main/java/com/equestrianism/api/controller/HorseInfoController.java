package com.equestrianism.api.controller;

import com.equestrianism.api.controller.valid.HorseInfoValid;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.HorseInfoListBO;
import com.equestrianism.api.model.bo.RoleInfoListBO;
import com.equestrianism.api.model.vo.RoleInfoDeleteVO;
import com.equestrianism.api.model.vo.RoleInfoListVO;
import com.equestrianism.api.model.vo.RoleInfoUpdateVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoAddVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoDeleteVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoListVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoUpdateVO;
import com.equestrianism.api.service.HorseInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "multipart/form-data" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody HorseInfoAddVO horseInfoAddVo ) {
        horseInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【HorseInfoController】【add】inputs : " + horseInfoAddVo.toJsonString() );
        try {
            if ( horseInfoService.addHorseInfo( HorseInfoValid.horseInfoAddValid( horseInfoAddVo ) ) ) {
                LOGGER.info( "【HorseInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch (IOException e) {
            LOGGER.error( "【HorseInfoController】【add】【exception】", e );
        }
        LOGGER.info( "【HorseInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody HorseInfoUpdateVO horseInfoUpdateVo ) {
        horseInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【HorseInfoController】【update】inputs : " + horseInfoUpdateVo.toJsonString() );
        try {
            if ( horseInfoService.updateHorseInfo( HorseInfoValid.horseInfoUpdateValid( horseInfoUpdateVo ) ) ) {
                LOGGER.info( "【HorseInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( IOException e ) {
            LOGGER.error( "【HorseInfoController】【update】【exception】", e );
        }
        LOGGER.info( "【HorseInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody HorseInfoDeleteVO horseInfoDeleteVo ) {
        LOGGER.info( "【HorseInfoController】【delete】inputs : " + horseInfoDeleteVo.toJsonString() );
        if ( horseInfoService.removeHorseInfo( horseInfoDeleteVo ) ) {
            LOGGER.info( "【HorseInfoController】【delete】result : success" );
            return ContainerUtils.buildResSuccessMap();
        }
        LOGGER.info( "【HorseInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( HorseInfoListVO horseInfoListVo ) {
        LOGGER.info( "【HorseInfoController】【list】inputs : " + horseInfoListVo.toJsonString() );
        HorseInfoListBO response = horseInfoService.horseInfoList( horseInfoListVo );
        LOGGER.info( "【HorseInfoController】【list】result : " + response.toJsonString() );
        return ContainerUtils.buildResSuccessMap( response );
    }

}
