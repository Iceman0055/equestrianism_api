package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.AssetTypeInfoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/11.
 */
public class AssetTypeInfoListBO extends BasePageResponse {

    private List<AssetTypeInfoListModel> assetTypeList;

    public AssetTypeInfoListBO() {
    }

    public AssetTypeInfoListBO( List<AssetTypeInfoListModel> assetTypeList ) {
        this.assetTypeList = assetTypeList;
    }

    public List<AssetTypeInfoListModel> getAssetTypeList() {
        return assetTypeList;
    }

    public void setAssetTypeList(List<AssetTypeInfoListModel> assetTypeList) {
        this.assetTypeList = assetTypeList;
    }
}
