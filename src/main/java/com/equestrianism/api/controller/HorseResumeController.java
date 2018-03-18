package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.HorseInfoDetailBO;
import com.equestrianism.api.model.bo.HorseInfoListBO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoDetailVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoListVO;
import com.equestrianism.api.service.HorseInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Chenzq on 2018/3/18.
 */
@Controller
@RequestMapping( "/horseResume" )
public class HorseResumeController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HorseResumeController.class);

    @Autowired
    private HorseInfoService horseInfoService;

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( HorseInfoListVO horseInfoListVo ) {
        LOGGER.info( "【HorseResumeController】【list】inputs : " + horseInfoListVo.toJsonString() );
        try {
            HorseInfoListBO response = horseInfoService.horseInfoList( horseInfoListVo );
            LOGGER.info( "【HorseResumeController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap(response);
        } catch ( BaseException e ) {
            LOGGER.error( "【HorseResumeController】【list】【exception】", e );
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
