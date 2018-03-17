package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.TreatmentInfoAddAssetModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/17.
 */
public class TreatmentAssetListBO extends BaseObject {

    private List<TreatmentInfoAddAssetModel> assetList;

    public TreatmentAssetListBO() {
    }

    public TreatmentAssetListBO( List<TreatmentInfoAddAssetModel> assetList ) {
        this.assetList = assetList;
    }

    public List<TreatmentInfoAddAssetModel> getAssetList() {
        return assetList;
    }

    public void setAssetList(List<TreatmentInfoAddAssetModel> assetList) {
        this.assetList = assetList;
    }
}
