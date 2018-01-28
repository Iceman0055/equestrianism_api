package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.vo.horse_info.HorseInfoAddVO;
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
            if ( horseInfoService.addHorseInfo(horseInfoAddVo) ) {
                LOGGER.info( "【HorseInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch (IOException e) {
            LOGGER.error( "【HorseInfoController】【exception】", e );
        }
        LOGGER.info( "【HorseInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

}
