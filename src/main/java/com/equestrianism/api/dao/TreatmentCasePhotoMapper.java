package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.TreatmentCasePhotoListModel;
import com.equestrianism.api.model.po.TreatmentCasePhotoEntity;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCasePhotoListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/17.
 */
public interface TreatmentCasePhotoMapper {

    Integer insert( TreatmentCasePhotoEntity treatmentCasePhotoEntity );

    Integer updateBySelective( TreatmentCasePhotoEntity treatmentCasePhotoEntity );

    List<TreatmentCasePhotoListModel> selectByTreatmentCaseId(TreatmentCasePhotoListVO treatmentCasePhotoListVo);
}
