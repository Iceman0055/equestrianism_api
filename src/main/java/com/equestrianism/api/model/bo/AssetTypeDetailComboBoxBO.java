package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.AssetTypeDetailComboBoxModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/12.
 */
public class AssetTypeDetailComboBoxBO extends BaseObject {

    private List<AssetTypeDetailComboBoxModel> typeDetailList;

    public AssetTypeDetailComboBoxBO() {
    }

    public AssetTypeDetailComboBoxBO( List<AssetTypeDetailComboBoxModel> typeDetailList ) {
        this.typeDetailList = typeDetailList;
    }

    public List<AssetTypeDetailComboBoxModel> getTypeDetailList() {
        return typeDetailList;
    }

    public void setTypeDetailList(List<AssetTypeDetailComboBoxModel> typeDetailList) {
        this.typeDetailList = typeDetailList;
    }
}
