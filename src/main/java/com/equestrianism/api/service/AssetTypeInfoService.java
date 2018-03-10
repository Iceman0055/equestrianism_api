package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.AssetTypeInfoComboBoxBO;
import com.equestrianism.api.model.bo.AssetTypeInfoDetailBO;
import com.equestrianism.api.model.bo.AssetTypeInfoListBO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoAddVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoDeleteVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoListVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoUpdateVO;

/**
 * Created by Chenzq on 2018/3/11.
 */
public interface AssetTypeInfoService {

    Boolean addAssetTypeInfo(AssetTypeInfoAddVO assetTypeInfoAddVo) throws BaseException;

    Boolean updateAssetTypeInfo(AssetTypeInfoUpdateVO assetTypeInfoUpdateVo) throws BaseException;

    Boolean removeAssetTypeInfo(AssetTypeInfoDeleteVO assetTypeInfoDeleteVo) throws BaseException;

    AssetTypeInfoListBO assetTypeInfoList(AssetTypeInfoListVO assetTypeInfoListVo) throws BaseException;

    AssetTypeInfoDetailBO assetTypeInfoDetail(Integer assetTypeId) throws BaseException;

    AssetTypeInfoComboBoxBO comboBox() throws BaseException;

}
