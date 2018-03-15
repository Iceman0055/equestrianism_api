package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * Created by Chenzq on 2018/3/16.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class AssetInfoInventoryModel extends BaseObject {

    private String assetId;
    private Integer inventory;

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }
}
