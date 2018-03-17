package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.TreatmentAssetListBO;
import com.equestrianism.api.model.bo.TreatmentInfoAddBO;
import com.equestrianism.api.model.bo.TreatmentInfoDetailBO;
import com.equestrianism.api.model.bo.TreatmentInfoListBO;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoAddVO;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoDeleteVO;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoListVO;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoUpdateVO;

/**
 * Created by Chenzq on 2018/3/17.
 */
public interface TreatmentInfoService {

    TreatmentInfoAddBO addTreatmentInfo(TreatmentInfoAddVO treatmentInfoAddVo) throws BaseException;

    Boolean updateTreatmentInfo(TreatmentInfoUpdateVO treatmentInfoUpdateVo) throws BaseException;

    Boolean removeTreatmentInfo(TreatmentInfoDeleteVO treatmentInfoDeleteVo) throws BaseException;

    TreatmentInfoListBO treatmentInfoList(TreatmentInfoListVO treatmentInfoListVo) throws BaseException;

    TreatmentInfoDetailBO treatmentInfoDetail(String treatmentId) throws BaseException;

    TreatmentAssetListBO assetList(String treatmentId, Integer type) throws BaseException;
}
