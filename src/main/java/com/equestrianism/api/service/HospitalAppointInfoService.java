package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.HospitalAppointInfoDetailBO;
import com.equestrianism.api.model.bo.HospitalAppointInfoListBO;
import com.equestrianism.api.model.vo.hospital_appoint_info.*;

/**
 * Iceman
 * 2018/3/7
 */
public interface HospitalAppointInfoService {

    Boolean addHospitalAppointInfo( HospitalAppointInfoAddVO hospitalAppointInfoAddVo ) throws BaseException;

    Boolean updateHospitalAppointInfo( HospitalAppointInfoUpdateVO hospitalAppointInfoUpdateVo ) throws BaseException;

    Boolean removeHospitalAppointInfo( HospitalAppointInfoDeleteVO hospitalAppointInfoDeleteVo ) throws BaseException;

    HospitalAppointInfoListBO hospitalAppointInfoList( HospitalAppointInfoListVO hospitalAppointInfoListVo ) throws BaseException;

    HospitalAppointInfoDetailBO hospitalAppointInfoDetail( HospitalAppointInfoDetailVO hospitalAppointInfoDetailVo ) throws BaseException;

}
