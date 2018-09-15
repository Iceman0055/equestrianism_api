package com.equestrianism.api.controller;

import com.equestrianism.api.constants.AssetTypeEnum;
import com.equestrianism.api.constants.SystemParamsConstants;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.AssetDetailListBO;
import com.equestrianism.api.model.vo.asset_detail.AssetDetailListVO;
import com.equestrianism.api.model.vo.asset_detail.AssetDetailScrapVO;
import com.equestrianism.api.model.vo.asset_info.AssetInfoListVO;
import com.equestrianism.api.service.AssetDetailService;
import com.equestrianism.api.service.AssetInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Iceman
 * 2018/9/3
 */
@Controller
@RequestMapping( "/centerAssetDetail" )
public class CenterAssetDetailController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( CenterAssetDetailController.class );

    @Autowired
    private AssetDetailService assetDetailService;

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map< String, Object > list( AssetDetailListVO assetDetailListVo ) throws UnsupportedEncodingException {
        assetDetailListVo.setAssetType( AssetTypeEnum.CENTER_ASSET_TYPE.type );
        if ( assetDetailListVo.getAssetName() != null && ! "".equals( assetDetailListVo.getAssetName() ) ) {
            assetDetailListVo.setAssetName( new String( assetDetailListVo.getAssetName().getBytes( "ISO-8859-1" ), "UTF-8" ) );
        }
        LOGGER.info( "【CenterAssetDetailController】【list】inputs : " + assetDetailListVo.toJsonString() );
        try {
            AssetDetailListBO response = assetDetailService.assetDetailList( assetDetailListVo );
            LOGGER.info( "【CenterAssetDetailController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【CenterAssetDetailController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/scrap", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map< String, Object > scrap( @RequestBody AssetDetailScrapVO assetDetailScrapVo ) {
        LOGGER.info("【CenterAssetDetailController】【scrap】inputs : " + assetDetailScrapVo);
        try {
            if ( assetDetailService.scrap( assetDetailScrapVo.getAssetDetailId() ) ) {
                LOGGER.info( "【CenterAssetDetailController】【scrap】result : SUCCESS " );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【CenterAssetDetailController】【scrap】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【CenterAssetDetailController】【scrap】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/exportExcel", method = RequestMethod.GET )
    @ResponseBody
    public Map< String, Object > exportExcel( HttpServletResponse response, AssetDetailListVO assetDetailListVo ) throws UnsupportedEncodingException {
        assetDetailListVo.setAssetType(AssetTypeEnum.CENTER_ASSET_TYPE.type);
        response.setContentType("application/binary;charset=UTF-8");
        if ( assetDetailListVo.getAssetName() != null && !"".equals( assetDetailListVo.getAssetName() ) ) {
            assetDetailListVo.setAssetName(new String(assetDetailListVo.getAssetName().getBytes("ISO-8859-1"), "UTF-8"));
        }
        LOGGER.info("【CenterAssetInfoController】【exportExcel】【inputs】" + assetDetailListVo.toJsonString());
        try {
            ServletOutputStream out = response.getOutputStream();
            String fileName = new String( ( "固定资产明细_" + new SimpleDateFormat( "yyyy-MM-dd" ).format( new Date() ) ).getBytes(), "UTF-8" );
            response.setHeader( "Content-disposition", "attachment; filename=" + fileName + ".xls" );
            assetDetailService.exportExcel( SystemParamsConstants.ASSET_EXCEL_TITLE, out, assetDetailListVo );
            return ContainerUtils.buildResSuccessMap();
        } catch ( Exception e ) {
            LOGGER.error( "【CenterAssetInfoController】【exportExcel】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
