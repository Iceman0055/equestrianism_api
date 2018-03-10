package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.AssetTypeInfoComboBoxModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/11.
 */
public class AssetTypeInfoComboBoxBO extends BaseObject {

    private List<AssetTypeInfoComboBoxModel> assetTypeList;

    public AssetTypeInfoComboBoxBO() {
    }

    public AssetTypeInfoComboBoxBO( List<AssetTypeInfoComboBoxModel> assetTypeList ) {
        this.assetTypeList = assetTypeList;
    }

    public List<AssetTypeInfoComboBoxModel> getAssetTypeList() {
        return assetTypeList;
    }

    public void setAssetTypeList(List<AssetTypeInfoComboBoxModel> assetTypeList) {
        this.assetTypeList = assetTypeList;
    }
}
