package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailAddVO;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailDeleteVO;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailListVO;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailUpdateVO;
import com.equestrianism.api.service.AssetTypeDetailService;
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
 * Created by Chenzq on 2018/3/12.
 */
@Controller
@RequestMapping( "/assetTypeDetail" )
public class AssetTypeDetailController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( AssetTypeDetailController.class );

    @Autowired
    private AssetTypeDetailService assetTypeDetailService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody AssetTypeDetailAddVO assetTypeDetailAddVo ) {
        assetTypeDetailAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【AssetTypeDetailController】【add】【inputs】" + assetTypeDetailAddVo.toJsonString() );
        try {
            if ( assetTypeDetailService.addAssetTypeDetail(assetTypeDetailAddVo)) {
                LOGGER.info( "【AssetTypeDetailController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeDetailController】【add】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【AssetTypeDetailController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody AssetTypeDetailUpdateVO assetTypeDetailUpdateVo ) {
        assetTypeDetailUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【AssetTypeDetailController】【update】begin " + assetTypeDetailUpdateVo.toJsonString() );
        try {
            if ( assetTypeDetailService.updateAssetTypeDetail(assetTypeDetailUpdateVo) ) {
                LOGGER.info( "【AssetTypeDetailController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeDetailController】【update】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【AssetTypeDetailController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody AssetTypeDetailDeleteVO assetTypeDetailDeleteVo ) {
        LOGGER.info( "【AssetTypeDetailController】【delete】inputs : " + assetTypeDetailDeleteVo.toJsonString() );
        try {
            if ( assetTypeDetailService.removeAssetTypeDetail(assetTypeDetailDeleteVo)) {
                LOGGER.info( "【AssetTypeDetailController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeDetailController】【delete】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【AssetTypeDetailController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( AssetTypeDetailListVO assetTypeDetailListVo ) {
        LOGGER.info( "【AssetTypeDetailController】【list】inputs : " + assetTypeDetailListVo.toJsonString() );
        try {
            AssetTypeDetailListBO response = assetTypeDetailService.assetTypeDetailList(assetTypeDetailListVo);
            LOGGER.info( "【AssetTypeDetailController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeDetailController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( Integer typeDetailId ) {
        LOGGER.info( "【AssetTypeDetailController】【detail】inputs : " + typeDetailId );
        try {
            AssetTypeDetailInfoBO response = assetTypeDetailService.assetTypeDetailInfo(typeDetailId);
            LOGGER.info( "【AssetTypeDetailController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeDetailController】【detail】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/comboBox", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> comboBox( Integer typeId ) {
        LOGGER.info( "【AssetTypeDetailController】【comboBox】inputs : " + typeId );
        try {
            AssetTypeDetailComboBoxBO response = assetTypeDetailService.comboBox(typeId);
            LOGGER.info( "【AssetTypeDetailController】【comboBox】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeDetailController】【comboBox】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
