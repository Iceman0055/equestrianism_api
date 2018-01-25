package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.vo.DepartmentInfoAddVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Chenzq on 2018/1/26.
 */
@Controller
@RequestMapping( "/horseInfo" )
public class HorseInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( HorseInfoController.class );

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody DepartmentInfoAddVO departmentInfoAddVo ) {
        departmentInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【DepartmentInfoController】【add】inputs : " + departmentInfoAddVo.toJsonString() );
        if ( departmentInfoService.addDepartmentInfo( departmentInfoAddVo ) ) {
            LOGGER.info( "【DepartmentInfoController】【add】result : success" );
            return ContainerUtils.buildResSuccessMap();
        }
        LOGGER.info( "【DepartmentInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

}
