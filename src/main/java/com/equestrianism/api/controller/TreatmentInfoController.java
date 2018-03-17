package com.equestrianism.api.controller;

import com.equestrianism.api.constants.AssetTypeEnum;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoAddVO;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoDeleteVO;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoListVO;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoUpdateVO;
import com.equestrianism.api.service.TreatmentInfoService;
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
 * Created by Chenzq on 2018/3/17.
 */
@Controller
@RequestMapping( "/treatmentInfo" )
public class TreatmentInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( TreatmentInfoController.class );

    @Autowired
    private TreatmentInfoService treatmentInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody TreatmentInfoAddVO treatmentInfoAddVo ) {
        treatmentInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【TreatmentInfoController】【add】【inputs】" + treatmentInfoAddVo.toJsonString() );
        try {
            TreatmentInfoAddBO response = treatmentInfoService.addTreatmentInfo( treatmentInfoAddVo );
            LOGGER.info( "【TreatmentInfoController】【add】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentInfoController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody TreatmentInfoUpdateVO treatmentInfoUpdateVo ) {
        treatmentInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【TreatmentInfoController】【update】begin " + treatmentInfoUpdateVo.toJsonString() );
        try {
            if ( treatmentInfoService.updateTreatmentInfo(treatmentInfoUpdateVo) ) {
                LOGGER.info( "【TreatmentInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentInfoController】【update】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【TreatmentInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody TreatmentInfoDeleteVO treatmentInfoDeleteVo ) {
        LOGGER.info( "【TreatmentInfoController】【delete】inputs : " + treatmentInfoDeleteVo.toJsonString() );
        try {
            if ( treatmentInfoService.removeTreatmentInfo(treatmentInfoDeleteVo) ) {
                LOGGER.info( "【TreatmentInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentInfoController】【delete】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【TreatmentInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( TreatmentInfoListVO treatmentInfoListVo ) throws UnsupportedEncodingException {
        LOGGER.info( "【TreatmentInfoController】【list】inputs : " + treatmentInfoListVo.toJsonString() );
        try {
            if ( treatmentInfoListVo.getTreatName() != null && !"".equals( treatmentInfoListVo.getTreatName() ) ) {
                treatmentInfoListVo.setTreatName(new String(treatmentInfoListVo.getTreatName().getBytes("ISO-8859-1"), "UTF-8"));
            }
            TreatmentInfoListBO response = treatmentInfoService.treatmentInfoList(treatmentInfoListVo);
            LOGGER.info( "【TreatmentInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentInfoController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( String treatmentId ) {
        LOGGER.info( "【TreatmentInfoController】【detail】inputs : " + treatmentId );
        try {
            TreatmentInfoDetailBO response = treatmentInfoService.treatmentInfoDetail(treatmentId);
            LOGGER.info( "【TreatmentInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentInfoController】【detail】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/hospitalAsset", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> hospitalAsset( String treatmentId ) {
        LOGGER.info( "【TreatmentInfoController】【hospitalAsset】inputs : " + treatmentId );
        try {
            TreatmentAssetListBO response = treatmentInfoService.assetList(treatmentId, AssetTypeEnum.HOSPITAL_ASSET_TYPE.type);
            LOGGER.info( "【TreatmentInfoController】【hospitalAsset】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentInfoController】【hospitalAsset】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/consumableAsset", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> consumableAsset( String treatmentId ) {
        LOGGER.info( "【TreatmentInfoController】【consumableAsset】inputs : " + treatmentId );
        try {
            TreatmentAssetListBO response = treatmentInfoService.assetList(treatmentId, AssetTypeEnum.CONSUMABLE_ASSET_TYPE.type);
            LOGGER.info( "【TreatmentInfoController】【consumableAsset】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【TreatmentInfoController】【consumableAsset】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
