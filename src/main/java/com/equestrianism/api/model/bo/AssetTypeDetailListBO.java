package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.AssetTypeDetailListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/12.
 */
public class AssetTypeDetailListBO extends BasePageResponse {

    private List<AssetTypeDetailListModel> assetTypeDetailList;

    public AssetTypeDetailListBO() {
    }

    public AssetTypeDetailListBO( List<AssetTypeDetailListModel> assetTypeDetailList ) {
        this.assetTypeDetailList = assetTypeDetailList;
    }

    public List<AssetTypeDetailListModel> getAssetTypeDetailList() {
        return assetTypeDetailList;
    }

    public void setAssetTypeDetailList(List<AssetTypeDetailListModel> assetTypeDetailList) {
        this.assetTypeDetailList = assetTypeDetailList;
    }
}
