package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.AssetTypeDetailComboBoxModel;
import com.equestrianism.api.model.model.AssetTypeDetailListModel;
import com.equestrianism.api.model.po.AssetTypeDetailEntity;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/12.
 */
public interface AssetTypeDetailMapper {

    Integer insert( AssetTypeDetailEntity assetTypeDetailEntity );

    Integer updateBySelective( AssetTypeDetailEntity assetTypeDetailEntity );

    List<AssetTypeDetailListModel> selectAssetTypeDetailListByPage(AssetTypeDetailListVO assetTypeDetailListVo);

    Integer countAssetTypeDetailListByPage(AssetTypeDetailListVO assetTypeDetailListVo);

    AssetTypeDetailEntity selectByPrimaryKey(Integer typeDetailId);

    List<AssetTypeDetailComboBoxModel> selectByComboBox(Integer typeId);

}
