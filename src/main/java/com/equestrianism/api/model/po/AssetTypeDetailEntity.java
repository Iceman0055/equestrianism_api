package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

/**
 * Created by Chenzq on 2018/3/12.
 */
public class AssetTypeDetailEntity extends BasePO {

    private Integer typeDetailId;
    private String typeDetailName;
    private Integer typeId;
    private String remark;

    public AssetTypeDetailEntity() {
    }

    public AssetTypeDetailEntity( Integer typeDetailId ) {
        this.typeDetailId = typeDetailId;
    }

    public AssetTypeDetailEntity( String typeDetailName, Integer typeId, String remark ) {
        this.typeDetailName = typeDetailName;
        this.typeId = typeId;
        this.remark = remark;
    }

    public AssetTypeDetailEntity( Integer typeDetailId, String typeDetailName, String remark ) {
        this.typeDetailName = typeDetailName;
        this.typeDetailId = typeDetailId;
        this.remark = remark;
    }

    public Integer getTypeDetailId() {
        return typeDetailId;
    }

    public void setTypeDetailId(Integer typeDetailId) {
        this.typeDetailId = typeDetailId;
    }

    public String getTypeDetailName() {
        return typeDetailName;
    }

    public void setTypeDetailName(String typeDetailName) {
        this.typeDetailName = typeDetailName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
