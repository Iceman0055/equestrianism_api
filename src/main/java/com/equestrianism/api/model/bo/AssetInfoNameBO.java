package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/16.
 */
public class AssetInfoNameBO extends BaseObject {

    private String assetId;
    private String assetName;

    public AssetInfoNameBO() {
    }

    public AssetInfoNameBO( String assetId, String assetName ) {
        this.assetId = assetId;
        this.assetName = assetName;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }
}
