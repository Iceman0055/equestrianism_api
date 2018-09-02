package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Created by Chenzq on 2018/9/2.
 */
public class AssetDetailEntity extends BasePO {

    private String assetDetailId = UUID.randomUUID().toString().replace( "-", "" );
    private String assetId;
    private String batchNumber;
    private Integer scrapType;
    private String createUser;

    public AssetDetailEntity() {
    }

    public AssetDetailEntity( String assetId, String batchNumber, Integer scrapType, String createUser ) {
        this.assetDetailId = UUID.randomUUID().toString().replace( "-", "" );
        this.assetId = assetId;
        this.batchNumber = batchNumber;
        this.scrapType = scrapType;
        this.createUser = createUser;
    }

    public String getAssetDetailId() {
        return assetDetailId;
    }

    public void setAssetDetailId(String assetDetailId) {
        this.assetDetailId = assetDetailId;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Integer getScrapType() {
        return scrapType;
    }

    public void setScrapType(Integer scrapType) {
        this.scrapType = scrapType;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }
}
