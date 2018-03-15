package com.equestrianism.api.model.vo.asset_info;

import com.equestrianism.api.core.model.BaseViewModel;
import com.equestrianism.api.model.model.AssetInfoInventoryModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/16.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class AssetInfoInventoryVO extends BaseViewModel {

    private List<AssetInfoInventoryModel> inventoryList;
    private Integer assetType;

    public List<AssetInfoInventoryModel> getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(List<AssetInfoInventoryModel> inventoryList) {
        this.inventoryList = inventoryList;
    }

    public Integer getAssetType() {
        return assetType;
    }

    public void setAssetType(Integer assetType) {
        this.assetType = assetType;
    }
}
