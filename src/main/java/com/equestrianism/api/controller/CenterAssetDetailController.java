package com.equestrianism.api.controller;

import com.equestrianism.api.constants.AssetTypeEnum;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.AssetDetailListBO;
import com.equestrianism.api.model.vo.asset_detail.AssetDetailListVO;
import com.equestrianism.api.service.AssetDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Map<String, Object> list( AssetDetailListVO assetDetailListVo ) {
        assetDetailListVo.setAssetType( AssetTypeEnum.CENTER_ASSET_TYPE.type);
        LOGGER.info("【CenterAssetDetailController】【list】inputs : " + assetDetailListVo.toJsonString());
        try {
            AssetDetailListBO response = assetDetailService.assetDetailList( assetDetailListVo);
            LOGGER.info("【CenterAssetDetailController】【list】result : " + response.toJsonString());
            return ContainerUtils.buildResSuccessMap(response);
        } catch (BaseException e) {
            LOGGER.error("【CenterAssetDetailController】【list】【exception】", e);
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/scrap", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> scrap( String assetDetailId ) {
        LOGGER.info("【CenterAssetDetailController】【scrap】inputs : " + assetDetailId);
        try {
            if ( assetDetailService.scrap( assetDetailId ) ) {
                LOGGER.info("【CenterAssetDetailController】【scrap】result : SUCCESS " );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch (BaseException e) {
            LOGGER.error("【CenterAssetDetailController】【scrap】【exception】", e);
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info("【CenterAssetDetailController】【scrap】result : fail");
        return ContainerUtils.buildResFailMap();
    }

}
