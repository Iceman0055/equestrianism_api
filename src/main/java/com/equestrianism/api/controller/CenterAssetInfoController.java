package com.equestrianism.api.controller;

import com.equestrianism.api.constants.AssetTypeEnum;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.AssetInfoDetailBO;
import com.equestrianism.api.model.bo.AssetInfoListBO;
import com.equestrianism.api.model.vo.asset_info.AssetInfoAddVO;
import com.equestrianism.api.model.vo.asset_info.AssetInfoDeleteVO;
import com.equestrianism.api.model.vo.asset_info.AssetInfoListVO;
import com.equestrianism.api.model.vo.asset_info.AssetInfoUpdateVO;
import com.equestrianism.api.service.AssetInfoService;
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
 * Created by Chenzq on 2018/3/14.
 */
@Controller
@RequestMapping( "/centerAssetInfo" )
public class CenterAssetInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( CenterAssetInfoController.class );

    @Autowired
    private AssetInfoService assetInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody AssetInfoAddVO assetInfoAddVo ) {
        assetInfoAddVo.setAccessId( getAccessId() );
        assetInfoAddVo.setAssetType(AssetTypeEnum.CENTER_ASSET_TYPE.type );
        LOGGER.info( "【CenterAssetInfoController】【add】【inputs】" + assetInfoAddVo.toJsonString() );
        try {
            if ( assetInfoService.addAssetInfo(assetInfoAddVo) ) {
                LOGGER.info( "【CenterAssetInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【CenterAssetInfoController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【CenterAssetInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody AssetInfoUpdateVO assetInfoUpdateVo ) {
        assetInfoUpdateVo.setAccessId( getAccessId() );
        assetInfoUpdateVo.setAssetType(AssetTypeEnum.CENTER_ASSET_TYPE.type );
        LOGGER.info( "【CenterAssetInfoController】【update】begin " + assetInfoUpdateVo.toJsonString() );
        try {
            if ( assetInfoService.updateAssetInfo(assetInfoUpdateVo) ) {
                LOGGER.info( "【CenterAssetInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【CenterAssetInfoController】【update】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【CenterAssetInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody AssetInfoDeleteVO assetInfoDeleteVo ) {
        LOGGER.info( "【CenterAssetInfoController】【delete】inputs : " + assetInfoDeleteVo.toJsonString() );
        try {
            if ( assetInfoService.removeAssetInfo(assetInfoDeleteVo) ) {
                LOGGER.info( "【CenterAssetInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【CenterAssetInfoController】【delete】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【CenterAssetInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( AssetInfoListVO assetInfoListVo ) {
        assetInfoListVo.setAssetType(AssetTypeEnum.CENTER_ASSET_TYPE.type );
        LOGGER.info( "【CenterAssetInfoController】【list】inputs : " + assetInfoListVo.toJsonString() );
        try {
            AssetInfoListBO response = assetInfoService.assetInfoList(assetInfoListVo);
            LOGGER.info( "【CenterAssetInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【CenterAssetInfoController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( String assetId ) {
        LOGGER.info( "【CenterAssetInfoController】【detail】inputs : " + assetId );
        try {
            AssetInfoDetailBO response = assetInfoService.assetInfoDetail( assetId );
            LOGGER.info( "【CenterAssetInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【CenterAssetInfoController】【detail】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
