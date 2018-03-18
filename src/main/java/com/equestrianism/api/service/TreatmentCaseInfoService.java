package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.TreatmentCaseInfoDetailBO;
import com.equestrianism.api.model.bo.TreatmentCaseInfoListBO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoAddVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoDeleteVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoListVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoUpdateVO;

/**
 * Created by Chenzq on 2018/3/18.
 */
public interface TreatmentCaseInfoService {

    Boolean addTreatmentCaseInfo(TreatmentCaseInfoAddVO treatmentCaseInfoAddVo) throws BaseException;

    Boolean updateTreatmentCaseInfo(TreatmentCaseInfoUpdateVO treatmentCaseInfoUpdateVo) throws BaseException;

    Boolean removeTreatmentCaseInfo(TreatmentCaseInfoDeleteVO treatmentCaseInfoDeleteVo) throws BaseException;

    TreatmentCaseInfoListBO treatmentCaseInfoList(TreatmentCaseInfoListVO treatmentCaseInfoListVo) throws BaseException;

    TreatmentCaseInfoDetailBO treatmentCaseInfoDetail(String treatmentCaseId) throws BaseException;
}
