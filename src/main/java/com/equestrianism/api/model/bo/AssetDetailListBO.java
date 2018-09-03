package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.AssetDetailListModel;

import java.util.List;

/**
 * Iceman
 * 2018/9/3
 */
public class AssetDetailListBO extends BasePageResponse {

    private List<AssetDetailListModel> assetDetailList;

    public AssetDetailListBO() {
    }

    public AssetDetailListBO( List<AssetDetailListModel> assetDetailList ) {
        this.assetDetailList = assetDetailList;
    }

    public List< AssetDetailListModel > getAssetDetailList() {
        return assetDetailList;
    }

    public void setAssetDetailList( List< AssetDetailListModel > assetDetailList ) {
        this.assetDetailList = assetDetailList;
    }

}
