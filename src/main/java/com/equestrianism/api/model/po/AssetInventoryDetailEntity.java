package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Created by Chenzq on 2018/3/16.
 */
public class AssetInventoryDetailEntity extends BasePO {

    private String id = UUID.randomUUID().toString().replace( "-", "" );
    private String assetId;
    private Integer assetType;
    private Integer count;
    private Integer dcFlag;

    public AssetInventoryDetailEntity() {
    }

    public AssetInventoryDetailEntity( String id ) {
        this.id = id;
    }

    public AssetInventoryDetailEntity( String assetId, Integer assetType, Integer count, Integer dcFlag ) {
        this.id = UUID.randomUUID().toString().replace( "-", "" );
        this.assetId = assetId;
        this.assetType = assetType;
        this.count = count;
        this.dcFlag = dcFlag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public Integer getAssetType() {
        return assetType;
    }

    public void setAssetType(Integer assetType) {
        this.assetType = assetType;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getDcFlag() {
        return dcFlag;
    }

    public void setDcFlag(Integer dcFlag) {
        this.dcFlag = dcFlag;
    }
}
