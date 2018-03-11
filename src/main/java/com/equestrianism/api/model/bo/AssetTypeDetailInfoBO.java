package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/12.
 */
public class AssetTypeDetailInfoBO extends BaseObject {

    private Integer typeDetailId;
    private String typeDetailName;
    private Integer typeId;
    private String remark;

    public AssetTypeDetailInfoBO() {
    }

    public AssetTypeDetailInfoBO( Integer typeDetailId, String typeDetailName, Integer typeId, String remark ) {
        this.typeDetailId = typeDetailId;
        this.typeDetailName = typeDetailName;
        this.typeId = typeId;
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeDetailName() {
        return typeDetailName;
    }

    public void setTypeDetailName(String typeDetailName) {
        this.typeDetailName = typeDetailName;
    }

    public Integer getTypeDetailId() {
        return typeDetailId;
    }

    public void setTypeDetailId(Integer typeDetailId) {
        this.typeDetailId = typeDetailId;
    }
}
