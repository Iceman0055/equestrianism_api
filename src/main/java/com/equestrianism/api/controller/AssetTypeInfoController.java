package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoAddVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoDeleteVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoListVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoUpdateVO;
import com.equestrianism.api.service.AssetTypeInfoService;
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
 * Created by Chenzq on 2018/3/11.
 */
@Controller
@RequestMapping( "/assetTypeInfo" )
public class AssetTypeInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AssetTypeInfoController.class);

    @Autowired
    private AssetTypeInfoService assetTypeInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody AssetTypeInfoAddVO assetTypeInfoAddVo ) {
        assetTypeInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【AssetTypeInfoController】【add】【inputs】" + assetTypeInfoAddVo.toJsonString() );
        try {
            if ( assetTypeInfoService.addAssetTypeInfo(assetTypeInfoAddVo) ) {
                LOGGER.info( "【AssetTypeInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeInfoController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【AssetTypeInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody AssetTypeInfoUpdateVO assetTypeInfoUpdateVo ) {
        assetTypeInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【AssetTypeInfoController】【update】begin " + assetTypeInfoUpdateVo.toJsonString() );
        try {
            if ( assetTypeInfoService.updateAssetTypeInfo(assetTypeInfoUpdateVo)) {
                LOGGER.info( "【AssetTypeInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeInfoController】【update】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【AssetTypeInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody AssetTypeInfoDeleteVO assetTypeInfoDeleteVo ) {
        LOGGER.info( "【AssetTypeInfoController】【delete】inputs : " + assetTypeInfoDeleteVo.toJsonString() );
        try {
            if ( assetTypeInfoService.removeAssetTypeInfo(assetTypeInfoDeleteVo) ) {
                LOGGER.info( "【AssetTypeInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeInfoController】【delete】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【AssetTypeInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( AssetTypeInfoListVO assetTypeInfoListVo ) throws UnsupportedEncodingException {
        LOGGER.info( "【AssetTypeInfoController】【list】inputs : " + assetTypeInfoListVo.toJsonString() );
        try {
            if ( assetTypeInfoListVo.getTypeName() != null && !"".equals( assetTypeInfoListVo.getTypeName() ) ) {
                assetTypeInfoListVo.setTypeName( new String( assetTypeInfoListVo.getTypeName().getBytes( "ISO-8859-1" ), "UTF-8" ) );
            }
            AssetTypeInfoListBO response = assetTypeInfoService.assetTypeInfoList(assetTypeInfoListVo);
            LOGGER.info( "【AssetTypeInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeInfoController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( Integer typeId ) {
        LOGGER.info( "【AssetTypeInfoController】【detail】inputs : " + typeId );
        try {
            AssetTypeInfoDetailBO response = assetTypeInfoService.assetTypeInfoDetail(typeId);
            LOGGER.info( "【AssetTypeInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeInfoController】【detail】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/comboBox", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> comboBox() {
        LOGGER.info( "【AssetTypeInfoController】【comboBox】begin " );
        try {
            AssetTypeInfoComboBoxBO response = assetTypeInfoService.comboBox();
            LOGGER.info( "【AssetTypeInfoController】【comboBox】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeInfoController】【comboBox】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
