package com.equestrianism.api.service;

import com.equestrianism.api.model.bo.AssetDetailListBO;
import com.equestrianism.api.model.vo.asset_detail.AssetDetailListVO;

/**
 * Iceman
 * 2018/9/3
 */
public interface AssetDetailService {

    AssetDetailListBO assetDetailList( AssetDetailListVO assetDetailListVo );

    Boolean scrap( String assetDetailId );

}
