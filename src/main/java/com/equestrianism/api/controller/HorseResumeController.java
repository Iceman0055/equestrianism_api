package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.HorseInfoDetailBO;
import com.equestrianism.api.model.bo.HorseInfoListBO;
import com.equestrianism.api.model.bo.HorseResumeListBO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoDetailVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoListVO;
import com.equestrianism.api.model.vo.horse_resume.HorseResumeDetailVO;
import com.equestrianism.api.model.vo.horse_resume.HorseResumeListVO;
import com.equestrianism.api.service.HorseInfoService;
import com.equestrianism.api.service.HorseResumeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Created by Chenzq on 2018/3/18.
 */
@Controller
@RequestMapping( "/horseResume" )
public class HorseResumeController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HorseResumeController.class);

    @Autowired
    private HorseResumeService horseResumeService;

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( HorseResumeListVO horseResumeListVo ) throws UnsupportedEncodingException {
        if ( horseResumeListVo.getHorseName() != null && !"".equals( horseResumeListVo.getHorseName() ) ) {
            horseResumeListVo.setHorseName(new String(horseResumeListVo.getHorseName().getBytes("ISO-8859-1"), "UTF-8"));
        }
        LOGGER.info( "【HorseResumeController】【list】inputs : " + horseResumeListVo.toJsonString() );
        try {
            HorseResumeListBO response = horseResumeService.horseResumeList(horseResumeListVo);
            LOGGER.info( "【HorseResumeController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap(response);
        } catch ( BaseException e ) {
            LOGGER.error( "【HorseResumeController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

//    @RequestMapping( value = "/detail", method = RequestMethod.GET )
//    @ResponseBody
//    public Map<String, Object> detail( HorseResumeDetailVO horseResumeDetailVo ) {
//        LOGGER.info( "【HorseResumeController】【detail】inputs : " + horseResumeDetailVo.toJsonString() );
//        try {
//            HorseInfoDetailBO response = horseResumeService.horseResumeDetail( horseResumeDetailVo );
//            LOGGER.info( "【HorseResumeController】【detail】result : " + response.toJsonString() );
//            return ContainerUtils.buildResSuccessMap( response );
//        } catch ( BaseException e ) {
//            LOGGER.error( "【HorseResumeController】【detail】【exception】", e );
//            return ContainerUtils.buildResFailMap();
//        }
//    }

}
