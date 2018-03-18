package com.equestrianism.api.controller;

import com.equestrianism.api.controller.valid.HorseInfoValid;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.TreatmentCaseInfoDetailBO;
import com.equestrianism.api.model.bo.TreatmentCasePhotoAddBO;
import com.equestrianism.api.model.bo.TreatmentCasePhotoListBO;
import com.equestrianism.api.model.vo.consulting_room_info.ConsultingRoomInfoDeleteVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoAddVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCasePhotoAddVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCasePhotoDeleteVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCasePhotoListVO;
import com.equestrianism.api.service.HorseInfoService;
import com.equestrianism.api.service.TreatmentCasePhotoService;
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
 * Created by Chenzq on 2018/3/18.
 */
@Controller
@RequestMapping( "/treatmentCasePhoto" )
public class TreatmentCasePhotoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HorseInfoController.class);

    @Autowired
    private TreatmentCasePhotoService treatmentCasePhotoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> add( TreatmentCasePhotoAddVO treatmentCasePhotoAddVo ) throws IOException {
        treatmentCasePhotoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【TreatmentCasePhotoController】【add】begin" );
        try {
            TreatmentCasePhotoAddBO treatmentCasePhotoAddBo = treatmentCasePhotoService.addTreatmentCasePhoto( treatmentCasePhotoAddVo );
            LOGGER.info( "【TreatmentCasePhotoController】【add】result" + treatmentCasePhotoAddBo.toJsonString() );
            return ContainerUtils.buildResSuccessMap( treatmentCasePhotoAddBo );
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentCasePhotoController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( TreatmentCasePhotoListVO treatmentCasePhotoListVo ) {
        LOGGER.info( "【TreatmentCasePhotoController】【list】inputs : " + treatmentCasePhotoListVo.toJsonString() );
        try {
            TreatmentCasePhotoListBO response = treatmentCasePhotoService.treatmentCasePhotoList(treatmentCasePhotoListVo);
            LOGGER.info( "【TreatmentCasePhotoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentCasePhotoController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody TreatmentCasePhotoDeleteVO treatmentCasePhotoDeleteVo ) {
        LOGGER.info( "【TreatmentCasePhotoController】【delete】inputs : " + treatmentCasePhotoDeleteVo );
        try {
            if ( treatmentCasePhotoService.removeTreatmentCasePhoto( treatmentCasePhotoDeleteVo.getCasePhotoId() ) ) {
                LOGGER.info( "【TreatmentCasePhotoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentCasePhotoController】【delete】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【TreatmentCasePhotoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

}
