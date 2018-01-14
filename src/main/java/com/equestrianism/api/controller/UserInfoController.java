package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.vo.UserInfoAddVO;
import com.equestrianism.api.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Chenzq on 2018/1/15.
 */
@Controller
@RequestMapping( "/userInfo" )
public class UserInfoController extends BaseController {

    @Autowired
    private UserInfoService userInfoServices;

    @RequestMapping( value = "/add", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> add( UserInfoAddVO userInfoAddVo ) {
        if ( userInfoServices.addUserInfo( userInfoAddVo ) ) {
            return ContainerUtils.buildResSuccessMap();
        }
        return ContainerUtils.buildResFailMap( "操作失败" );
    }


}
