package com.equestrianism.api.controller;

import com.equestrianism.api.constants.AssetTypeEnum;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.AssetInfoDetailBO;
import com.equestrianism.api.model.bo.AssetInfoListBO;
import com.equestrianism.api.model.bo.AssetInfoNameBO;
import com.equestrianism.api.model.vo.asset_info.*;
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
@RequestMapping( "/consumableAssetInfo" )
public class ConsumableAssetInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( ConsumableAssetInfoController.class );

    @Autowired
    private AssetInfoService assetInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody AssetInfoAddVO assetInfoAddVo ) {
        assetInfoAddVo.setAccessId( getAccessId() );
        assetInfoAddVo.setAssetType(AssetTypeEnum.CONSUMABLE_ASSET_TYPE.type );
        LOGGER.info( "【ConsumableAssetInfoController】【add】【inputs】" + assetInfoAddVo.toJsonString() );
        try {
            if ( assetInfoService.addAssetInfo(assetInfoAddVo) ) {
                LOGGER.info( "【ConsumableAssetInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsumableAssetInfoController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【ConsumableAssetInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody AssetInfoUpdateVO assetInfoUpdateVo ) {
        assetInfoUpdateVo.setAccessId( getAccessId() );
        assetInfoUpdateVo.setAssetType(AssetTypeEnum.CONSUMABLE_ASSET_TYPE.type );
        LOGGER.info( "【ConsumableAssetInfoController】【update】begin " + assetInfoUpdateVo.toJsonString() );
        try {
            if ( assetInfoService.updateAssetInfo(assetInfoUpdateVo) ) {
                LOGGER.info( "【ConsumableAssetInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsumableAssetInfoController】【update】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【ConsumableAssetInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody AssetInfoDeleteVO assetInfoDeleteVo ) {
        LOGGER.info( "【ConsumableAssetInfoController】【delete】inputs : " + assetInfoDeleteVo.toJsonString() );
        try {
            if ( assetInfoService.removeAssetInfo(assetInfoDeleteVo) ) {
                LOGGER.info( "【ConsumableAssetInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsumableAssetInfoController】【delete】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【ConsumableAssetInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( AssetInfoListVO assetInfoListVo ) {
        assetInfoListVo.setAssetType(AssetTypeEnum.CONSUMABLE_ASSET_TYPE.type );
        LOGGER.info( "【ConsumableAssetInfoController】【list】inputs : " + assetInfoListVo.toJsonString() );
        try {
            AssetInfoListBO response = assetInfoService.assetInfoList(assetInfoListVo);
            LOGGER.info( "【ConsumableAssetInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsumableAssetInfoController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( String assetId ) {
        LOGGER.info( "【ConsumableAssetInfoController】【detail】inputs : " + assetId );
        try {
            AssetInfoDetailBO response = assetInfoService.assetInfoDetail( assetId );
            LOGGER.info( "【ConsumableAssetInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsumableAssetInfoController】【detail】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/assetName", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> assetName( String barCode ) {
        LOGGER.info( "【ConsumableAssetInfoController】【assetName】inputs : " + barCode );
        try {
            AssetInfoNameBO response = assetInfoService.assetName( barCode, AssetTypeEnum.CONSUMABLE_ASSET_TYPE.type );
            LOGGER.info( "【ConsumableAssetInfoController】【assetName】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsumableAssetInfoController】【assetName】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/inventory", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> inventory( @RequestBody AssetInfoInventoryVO assetInfoInventoryVo ) {
        assetInfoInventoryVo.setAccessId( getAccessId() );
        assetInfoInventoryVo.setAssetType(AssetTypeEnum.CONSUMABLE_ASSET_TYPE.type );
        LOGGER.info( "【ConsumableAssetInfoController】【inventory】【inputs】" + assetInfoInventoryVo.toJsonString() );
        try {
            if ( assetInfoService.inventory( assetInfoInventoryVo ) ) {
                LOGGER.info( "【ConsumableAssetInfoController】【inventory】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【ConsumableAssetInfoController】【inventory】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【ConsumableAssetInfoController】【inventory】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

}
