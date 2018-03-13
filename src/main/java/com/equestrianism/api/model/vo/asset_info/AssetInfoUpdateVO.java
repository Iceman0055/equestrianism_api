package com.equestrianism.api.model.vo.asset_info;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/14.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class AssetInfoUpdateVO extends AssetInfoAddVO {

    private String assetId;

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

}
