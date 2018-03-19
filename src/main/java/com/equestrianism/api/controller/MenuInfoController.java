package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.AssetTypeInfoComboBoxBO;
import com.equestrianism.api.model.bo.AssetTypeInfoDetailBO;
import com.equestrianism.api.model.bo.AssetTypeInfoListBO;
import com.equestrianism.api.model.bo.MenuInfoListBO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoAddVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoDeleteVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoListVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoUpdateVO;
import com.equestrianism.api.service.AssetTypeInfoService;
import com.equestrianism.api.service.MenuInfoService;
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
@RequestMapping( "/menuInfo" )
public class MenuInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MenuInfoController.class);

    @Autowired
    private MenuInfoService menuInfoService;

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list() {
        LOGGER.info( "【AssetTypeInfoController】【list】begin" );
        try {
            MenuInfoListBO response = menuInfoService.menuList();
            LOGGER.info( "【AssetTypeInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【AssetTypeInfoController】【list】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
