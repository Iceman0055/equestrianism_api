package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.AssetTypeDetailComboBoxBO;
import com.equestrianism.api.model.bo.AssetTypeDetailInfoBO;
import com.equestrianism.api.model.bo.AssetTypeDetailListBO;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailAddVO;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailDeleteVO;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailListVO;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailUpdateVO;

/**
 * Created by Chenzq on 2018/3/12.
 */
public interface AssetTypeDetailService {

    Boolean addAssetTypeDetail(AssetTypeDetailAddVO assetTypeDetailAddVo) throws BaseException;

    Boolean updateAssetTypeDetail(AssetTypeDetailUpdateVO assetTypeDetailUpdateVo) throws BaseException;

    Boolean removeAssetTypeDetail(AssetTypeDetailDeleteVO assetTypeDetailDeleteVo) throws BaseException;

    AssetTypeDetailListBO assetTypeDetailList(AssetTypeDetailListVO assetTypeDetailListVo) throws BaseException;

    AssetTypeDetailInfoBO assetTypeDetailInfo(Integer typeDetailId) throws BaseException;

    AssetTypeDetailComboBoxBO comboBox(Integer typeId) throws BaseException;

}
