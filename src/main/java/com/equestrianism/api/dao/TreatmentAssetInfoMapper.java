package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.TreatmentInfoAddAssetModel;
import com.equestrianism.api.model.po.TreatmentAssetInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by Chenzq on 2018/3/17.
 */
public interface TreatmentAssetInfoMapper {

    Integer insert( TreatmentAssetInfoEntity treatmentAssetInfoEntity );

    Integer updateBySelective( TreatmentAssetInfoEntity treatmentAssetInfoEntity );

    List<TreatmentInfoAddAssetModel> selectByTreatmentId(Map<String, Object> params);
}
