package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

/**
 * Created by Chenzq on 2018/3/11.
 */
public class AssetTypeInfoEntity extends BasePO {

    private Integer typeId;
    private String typeName;
    private String remark;

    public AssetTypeInfoEntity() {}

    public AssetTypeInfoEntity( Integer typeId ) {
        this.typeId = typeId;
    }

    public AssetTypeInfoEntity( String typeName, String remark ) {
        this.typeName = typeName;
        this.remark = remark;
    }

    public AssetTypeInfoEntity( Integer typeId, String typeName, String remark ) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
