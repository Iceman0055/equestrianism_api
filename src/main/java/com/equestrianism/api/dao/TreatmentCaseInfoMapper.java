package com.equestrianism.api.dao;

import com.equestrianism.api.model.bo.TreatmentCaseInfoDetailBO;
import com.equestrianism.api.model.model.TreatmentCaseInfoListModel;
import com.equestrianism.api.model.po.TreatmentCaseInfoEntity;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/17.
 */
public interface TreatmentCaseInfoMapper {

    Integer insert( TreatmentCaseInfoEntity treatmentCaseInfoEntity );

    Integer updateBySelective( TreatmentCaseInfoEntity treatmentCaseInfoEntity );

    List<TreatmentCaseInfoListModel> selectTreatmentCaseListByPage(TreatmentCaseInfoListVO treatmentCaseInfoListVo);

    Integer countTreatmentCaseListByPage(TreatmentCaseInfoListVO treatmentCaseInfoListVo);

    TreatmentCaseInfoDetailBO selectByPrimaryKey(String treatmentCaseId);
}
