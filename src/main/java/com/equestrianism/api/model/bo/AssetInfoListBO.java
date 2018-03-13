package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.AssetInfoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/14.
 */
public class AssetInfoListBO extends BasePageResponse {

    private List<AssetInfoListModel> assetInfoList;

    public AssetInfoListBO() {
    }

    public AssetInfoListBO( List<AssetInfoListModel> assetInfoList ) {
        this.assetInfoList = assetInfoList;
    }

    public List<AssetInfoListModel> getAssetInfoList() {
        return assetInfoList;
    }

    public void setAssetInfoList(List<AssetInfoListModel> assetInfoList) {
        this.assetInfoList = assetInfoList;
    }
}
