package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.AssetInfoDetailBO;
import com.equestrianism.api.model.bo.AssetInfoListBO;
import com.equestrianism.api.model.vo.asset_info.AssetInfoAddVO;
import com.equestrianism.api.model.vo.asset_info.AssetInfoDeleteVO;
import com.equestrianism.api.model.vo.asset_info.AssetInfoListVO;
import com.equestrianism.api.model.vo.asset_info.AssetInfoUpdateVO;

/**
 * Created by Chenzq on 2018/3/14.
 */
public interface AssetInfoService {

    Boolean addAssetInfo(AssetInfoAddVO assetInfoAddVo) throws BaseException;

    Boolean updateAssetInfo(AssetInfoUpdateVO assetInfoUpdateVo) throws BaseException;

    Boolean removeAssetInfo(AssetInfoDeleteVO assetInfoDeleteVo) throws BaseException;

    AssetInfoListBO assetInfoList(AssetInfoListVO assetInfoListVo) throws BaseException;

    AssetInfoDetailBO assetInfoDetail(String assetId) throws BaseException;

}
