package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.AuthLoginBO;
import com.equestrianism.api.model.vo.AuthLoginVO;
import com.equestrianism.api.service.RegisterService;
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
 * Created by Chenzq on 2018/3/21.
 */
@Controller
@RequestMapping( "/auth" )
public class LoginController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private RegisterService registerService;

    @RequestMapping( value = "/login", method = RequestMethod.POST )
    @ResponseBody
    public Map<String, Object> login( @RequestBody AuthLoginVO authLoginVo) {
        LOGGER.info( "【LoginController】【login】begin" );
        try {
            AuthLoginBO authRegisterBo = registerService.login(authLoginVo);
            if ( authRegisterBo != null ) {
                LOGGER.info( "【LoginController】【login】result : success" + authRegisterBo.toJsonString() );
                return ContainerUtils.buildResSuccessMap( authRegisterBo );
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【LoginController】【login】【exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【LoginController】【login】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

}
