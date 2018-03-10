package com.equestrianism.api.controller;

import com.equestrianism.api.core.container.BaseController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ContainerUtils;
import com.equestrianism.api.model.bo.VaccinationInfoDetailBO;
import com.equestrianism.api.model.bo.VaccinationInfoListBO;
import com.equestrianism.api.model.vo.vaccination_info.*;
import com.equestrianism.api.service.VaccinationInfoService;
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
 * Created by Chenzq on 2018/3/10.
 */
@Controller
@RequestMapping( "/vaccinationInfo" )
public class VaccinationInfoController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger( VaccinationInfoController.class);

    @Autowired
    private VaccinationInfoService vaccinationInfoService;

    @RequestMapping( value = "/add", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> add( @RequestBody VaccinationInfoAddVO vaccinationInfoAddVo ) {
        vaccinationInfoAddVo.setAccessId( getAccessId() );
        LOGGER.info( "【VaccinationInfoController】【add】inputs : " + vaccinationInfoAddVo.toJsonString() );
        try {
            if ( vaccinationInfoService.addVaccinationInfo(vaccinationInfoAddVo)) {
                LOGGER.info( "【VaccinationInfoController】【add】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【VaccinationInfoController】【add】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【VaccinationInfoController】【add】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/update", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> update( @RequestBody VaccinationInfoUpdateVO vaccinationInfoUpdateVo ) {
        vaccinationInfoUpdateVo.setAccessId( getAccessId() );
        LOGGER.info( "【VaccinationInfoController】【update】inputs : " + vaccinationInfoUpdateVo.toJsonString() );
        try {
            if ( vaccinationInfoService.updateVaccinationInfo(vaccinationInfoUpdateVo)) {
                LOGGER.info( "【VaccinationInfoController】【update】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【VaccinationInfoController】【update】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【VaccinationInfoController】【update】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/delete", method = RequestMethod.POST, produces = "application/json" )
    @ResponseBody
    public Map<String, Object> delete( @RequestBody VaccinationInfoDeleteVO vaccinationInfoDeleteVo ) {
        LOGGER.info( "【VaccinationInfoController】【delete】inputs : " + vaccinationInfoDeleteVo.toJsonString() );
        try {
            if ( vaccinationInfoService.removeVaccinationInfo(vaccinationInfoDeleteVo)) {
                LOGGER.info( "【VaccinationInfoController】【delete】result : success" );
                return ContainerUtils.buildResSuccessMap();
            }
        } catch ( BaseException e ) {
            LOGGER.error( "【VaccinationInfoController】【delete】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
        LOGGER.info( "【VaccinationInfoController】【delete】result : fail" );
        return ContainerUtils.buildResFailMap();
    }

    @RequestMapping( value = "/list", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> list( VaccinationInfoListVO vaccinationInfoListVo ) {
        LOGGER.info( "【VaccinationInfoController】【list】inputs : " + vaccinationInfoListVo.toJsonString() );
        try {
            VaccinationInfoListBO response = vaccinationInfoService.vaccinationInfoList(vaccinationInfoListVo);
            LOGGER.info( "【VaccinationInfoController】【list】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【VaccinationInfoController】【list】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

    @RequestMapping( value = "/detail", method = RequestMethod.GET )
    @ResponseBody
    public Map<String, Object> detail( VaccinationInfoDetailVO vaccinationInfoDetailVo ) {
        LOGGER.info( "【VaccinationInfoController】【detail】inputs : " + vaccinationInfoDetailVo.toJsonString() );
        try {
            VaccinationInfoDetailBO response = vaccinationInfoService.vaccinationInfoDetail( vaccinationInfoDetailVo);
            LOGGER.info( "【VaccinationInfoController】【detail】result : " + response.toJsonString() );
            return ContainerUtils.buildResSuccessMap( response );
        } catch ( BaseException e ) {
            LOGGER.error( "【VaccinationInfoController】【detail】【Exception】", e );
            return ContainerUtils.buildResFailMap();
        }
    }

}
