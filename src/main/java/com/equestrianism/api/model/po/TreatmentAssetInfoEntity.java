package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Created by Chenzq on 2018/3/17.
 */
public class TreatmentAssetInfoEntity extends BasePO {

    private String treatmentAssetId = UUID.randomUUID().toString().replace( "-", "" );
    private String treatmentId;
    private Integer assetType;
    private String assetId;
    private Integer count;

    public TreatmentAssetInfoEntity() {
    }

    public TreatmentAssetInfoEntity( String treatmentAssetId ) {
        this.treatmentAssetId = treatmentAssetId;
    }

    public TreatmentAssetInfoEntity( String treatmentId, Integer assetType, String assetId, Integer count ) {
        this( UUID.randomUUID().toString().replace( "-", "" ), treatmentId, assetType, assetId, count );
    }

    public TreatmentAssetInfoEntity( String treatmentAssetId, String treatmentId, Integer assetType, String assetId, Integer count ) {
        this.treatmentAssetId = treatmentAssetId;
        this.treatmentId = treatmentId;
        this.assetType = assetType;
        this.assetId = assetId;
        this.count = count;
    }

    public String getTreatmentAssetId() {
        return treatmentAssetId;
    }

    public void setTreatmentAssetId(String treatmentAssetId) {
        this.treatmentAssetId = treatmentAssetId;
    }

    public String getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }

    public Integer getAssetType() {
        return assetType;
    }

    public void setAssetType(Integer assetType) {
        this.assetType = assetType;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
