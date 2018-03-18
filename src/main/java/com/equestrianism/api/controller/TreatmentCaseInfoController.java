package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoAddVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoDeleteVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoListVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoUpdateVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoAddVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoDeleteVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoListVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoUpdateVO;
import com.equestrianism.api.service.AssetTypeInfoService;
import com.equestrianism.api.service.TreatmentCaseInfoService;
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
 * Created by Chenzq on 2018/3/18.
 */
@Controller
@RequestMapping( "/treatmentCaseInfo" )
public class TreatmentCaseInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( TreatmentCaseInfoController.class );

    @Autowired
    private TreatmentCaseInfoService treatmentCaseInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody TreatmentCaseInfoAddVO treatmentCaseInfoAddVo ) {
        treatmentCaseInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【TreatmentCaseInfoController】【add】【inputs】" + treatmentCaseInfoAddVo.toJsonString() );
        try {
            if ( treatmentCaseInfoService.addTreatmentCaseInfo(treatmentCaseInfoAddVo) ) {
                LOGGER.info( "【TreatmentCaseInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentCaseInfoController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【TreatmentCaseInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody TreatmentCaseInfoUpdateVO treatmentCaseInfoUpdateVo ) {
        treatmentCaseInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【TreatmentCaseInfoController】【update】begin " + treatmentCaseInfoUpdateVo.toJsonString() );
        try {
            if ( treatmentCaseInfoService.updateTreatmentCaseInfo(treatmentCaseInfoUpdateVo )) {
                LOGGER.info( "【TreatmentCaseInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentCaseInfoController】【update】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【TreatmentCaseInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody TreatmentCaseInfoDeleteVO treatmentCaseInfoDeleteVo ) {
        LOGGER.info( "【TreatmentCaseInfoController】【delete】inputs : " + treatmentCaseInfoDeleteVo.toJsonString() );
        try {
            if ( treatmentCaseInfoService.removeTreatmentCaseInfo(treatmentCaseInfoDeleteVo ) ) {
                LOGGER.info( "【TreatmentCaseInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentCaseInfoController】【delete】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【TreatmentCaseInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( TreatmentCaseInfoListVO treatmentCaseInfoListVo ) throws UnsupportedEncodingException {
        LOGGER.info( "【TreatmentCaseInfoController】【list】inputs : " + treatmentCaseInfoListVo.toJsonString() );
        try {
            if ( treatmentCaseInfoListVo.getTitleTag() != null && !"".equals( treatmentCaseInfoListVo.getTitleTag() ) ) {
                treatmentCaseInfoListVo.setTitleTag(new String(treatmentCaseInfoListVo.getTitleTag().getBytes("ISO-8859-1"), "UTF-8"));
            }
            TreatmentCaseInfoListBO response = treatmentCaseInfoService.treatmentCaseInfoList(treatmentCaseInfoListVo );
            LOGGER.info( "【TreatmentCaseInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentCaseInfoController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( String treatmentCaseId ) {
        LOGGER.info( "【AssetTypeInfoController】【detail】inputs : " + treatmentCaseId );
        try {
            TreatmentCaseInfoDetailBO response = treatmentCaseInfoService.treatmentCaseInfoDetail(treatmentCaseId);
            LOGGER.info( "【TreatmentCaseInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentCaseInfoController】【detail】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
