package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.AssetTypeInfoComboBoxModel;
import com.equestrianism.api.model.model.AssetTypeInfoListModel;
import com.equestrianism.api.model.po.AssetTypeInfoEntity;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/11.
 */
public interface AssetTypeInfoMapper {

    Integer insert( AssetTypeInfoEntity assetTypeInfoEntity );

    Integer updateBySelective( AssetTypeInfoEntity assetTypeInfoEntity );

    AssetTypeInfoEntity selectByPrimaryKey( Integer assetTypeId );

    List<AssetTypeInfoListModel> selectAssetTypeInfoListByPage(AssetTypeInfoListVO assetTypeInfoListVo);

    Integer countAssetTypeInfoListByPage(AssetTypeInfoListVO assetTypeInfoListVo);

    List<AssetTypeInfoComboBoxModel> selectAssetTypeListByComboBox();

    AssetTypeInfoEntity selectByName(String typeName);

}
