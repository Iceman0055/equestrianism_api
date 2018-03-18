package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.TreatmentCasePhotoAddBO;
import com.equestrianism.api.model.bo.TreatmentCasePhotoListBO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCasePhotoAddVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCasePhotoListVO;

import java.io.IOException;

/**
 * Created by Chenzq on 2018/3/18.
 */
public interface TreatmentCasePhotoService {

    TreatmentCasePhotoAddBO addTreatmentCasePhoto(TreatmentCasePhotoAddVO treatmentCasePhotoAddVo) throws BaseException, IOException;

    Boolean updateTreatmentCasePhoto( String casePhotoId, String treatmentCaseId );

    TreatmentCasePhotoListBO treatmentCasePhotoList(TreatmentCasePhotoListVO treatmentCasePhotoListVo) throws BaseException;

    Boolean removeTreatmentCasePhoto(String casePhotoId) throws BaseException;
}
