package com.equestrianism.api.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.vo.TestVO;
import com.equestrianism.api.model.vo.UserInfoAddVO;
import com.equestrianism.api.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Chenzq on 2018/1/15.
 */
@Controller
@RequestMapping( "/userInfo" )
public class UserInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( UserInfoController.class );

    @Autowired
    private UserInfoService userInfoServices;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody TestVO request ) {
        LOGGER.info( "【UserInfoController】【add】inputs : " + request );
//        JSONObject requestJson = JSONObject.parseObject( request );
//        JSON requestJson = JSON.parseObject( request );
//        UserInfoAddVO userInfoAddVo = JSONObject.toJavaObject( requestJson, UserInfoAddVO.class );
//        if ( userInfoServices.addUserInfo( userInfoAddVo ) ) {
//            return ContainerUtils.buildResSuccessMap();
//        }
        return ContainerUtils.buildResFailMap( "操作失败" );
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody UserInfoAddVO userInfoAddVo ) {
        LOGGER.info( "【UserInfoController】【add】inputs : " + userInfoAddVo.getJobNumber() );
        //        JSONObject requestJson = JSONObject.parseObject( request );
//        JSON requestJson = JSON.parseObject( request );
//        UserInfoAddVO userInfoAddVo = JSONObject.toJavaObject( requestJson, UserInfoAddVO.class );
//        if ( userInfoServices.addUserInfo( userInfoAddVo ) ) {
//            return ContainerUtils.buildResSuccessMap();
//        }
        return ContainerUtils.buildResFailMap( "操作失败" );
    }

    @RequestMapping( value = "/get", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> get(
            @RequestParam ( value = "jobNumber" ) String jobNumber,
            @RequestParam ( value = "realname" ) String realname,
            @RequestParam ( value = "loginName" ) String loginName,
            @RequestParam ( value = "loginPassword" ) String loginPassword,
            @RequestParam ( value = "departmentId" ) String departmentId,
            @RequestParam ( value = "roleId" ) String roleId ) {
        LOGGER.info( "【UserInfoController】【add】inputs : jobNumber " + jobNumber );
        //        JSONObject requestJson = JSONObject.parseObject( request );
        //        JSON requestJson = JSON.parseObject( request );
        //        UserInfoAddVO userInfoAddVo = JSONObject.toJavaObject( requestJson, UserInfoAddVO.class );
//        if ( userInfoServices.addUserInfo( userInfoAddVo ) ) {
//            return ContainerUtils.buildResSuccessMap();
//        }
        return ContainerUtils.buildResFailMap( "操作失败" );
    }


}
