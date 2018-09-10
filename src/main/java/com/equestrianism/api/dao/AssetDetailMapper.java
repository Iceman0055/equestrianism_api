package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.AssetDetailListModel;
import com.equestrianism.api.model.po.AssetDetailEntity;
import com.equestrianism.api.model.vo.asset_detail.AssetDetailListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/9/2.
 */
public interface AssetDetailMapper {

    Integer insert( AssetDetailEntity assetDetailEntity );

    List<AssetDetailListModel> selectAssetDetailListByPage( AssetDetailListVO assetDetailListVo );

    Integer countAssetDetailListByPage( AssetDetailListVO assetDetailListVo );

    Integer updateScrapType( String assetDetailId );

    List<AssetDetailListModel> selectAssetDetailList(AssetDetailListVO assetDetailListVo);

}
