package com.equestrianism.api.model.vo.asset_detail;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/9/3
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class AssetDetailListVO extends BasePageViewModel {

    private Integer typeId;
    private Integer typeDetailId;
    private String assetName;
    private String assetNumber;
    private String barCode;
    private Integer assetType;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId( Integer typeId ) {
        this.typeId = typeId;
    }

    public Integer getTypeDetailId() {
        return typeDetailId;
    }

    public void setTypeDetailId( Integer typeDetailId ) {
        this.typeDetailId = typeDetailId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName( String assetName ) {
        this.assetName = assetName;
    }

    public Integer getAssetType() {
        return assetType;
    }

    public void setAssetType( Integer assetType ) {
        this.assetType = assetType;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode( String barCode ) {
        this.barCode = barCode;
    }

    public String getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber( String assetNumber ) {
        this.assetNumber = assetNumber;
    }
}
