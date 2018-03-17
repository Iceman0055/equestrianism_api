package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.TreatmentInfoListModel;
import com.equestrianism.api.model.po.TreatmentInfoEntity;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/17.
 */
public interface TreatmentInfoMapper {

    Integer insert( TreatmentInfoEntity treatmentInfoEntity );

    Integer updateBySelective( TreatmentInfoEntity treatmentInfoEntity );

    List<TreatmentInfoListModel> selectTreatmentListByPage(TreatmentInfoListVO treatmentInfoListVo);

    Integer countTreatmentListByPage(TreatmentInfoListVO treatmentInfoListVo);

    TreatmentInfoEntity selectByPrimaryKey(String treatmentId);
}
