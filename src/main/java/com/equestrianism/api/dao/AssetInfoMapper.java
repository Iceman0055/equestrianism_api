package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.AssetInfoListModel;
import com.equestrianism.api.model.po.AssetInfoEntity;
import com.equestrianism.api.model.vo.asset_info.AssetInfoListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/14.
 */
public interface AssetInfoMapper {

    Integer insert( AssetInfoEntity assetInfoEntity );

    Integer updateBySelective( AssetInfoEntity assetInfoEntity );

    List<AssetInfoListModel> selectAssetInfoListByPage(AssetInfoListVO assetInfoListVo);

    Integer countAssetInfoListByPage(AssetInfoListVO assetInfoListVo);

    AssetInfoEntity selectByPrimaryKey(String assetId);

}
