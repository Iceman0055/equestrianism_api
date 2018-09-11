package com.equestrianism.api.model.vo.asset_detail;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/9/11
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class AssetDetailScrapVO extends BaseViewModel {

    private String assetDetailId;

    public String getAssetDetailId() {
        return assetDetailId;
    }

    public void setAssetDetailId( String assetDetailId ) {
        this.assetDetailId = assetDetailId;
    }
}
