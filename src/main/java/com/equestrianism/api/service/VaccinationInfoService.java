package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.VaccinationInfoDetailBO;
import com.equestrianism.api.model.bo.VaccinationInfoListBO;
import com.equestrianism.api.model.vo.vaccination_info.*;

/**
 * Created by Chenzq on 2018/3/10.
 */
public interface VaccinationInfoService {

    Boolean addVaccinationInfo( VaccinationInfoAddVO vaccinationInfoAddVo ) throws BaseException;

    Boolean updateVaccinationInfo( VaccinationInfoUpdateVO vaccinationInfoUpdateVo ) throws BaseException;

    Boolean removeVaccinationInfo( VaccinationInfoDeleteVO vaccinationInfoDeleteVo ) throws BaseException;

    VaccinationInfoListBO vaccinationInfoList(VaccinationInfoListVO vaccinationInfoListVo) throws BaseException;

    VaccinationInfoDetailBO vaccinationInfoDetail(VaccinationInfoDetailVO vaccinationInfoDetailVo) throws BaseException;

}
