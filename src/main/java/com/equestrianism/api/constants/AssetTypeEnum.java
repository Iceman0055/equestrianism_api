package com.equestrianism.api.constants;

/**
 * Created by Chenzq on 2018/3/14.
 */
public enum AssetTypeEnum {

    CENTER_ASSET_TYPE( 1, "马术中心固定资产" ),
    HOSPITAL_ASSET_TYPE( 2, "马医院固定资产" ),
    CONSUMABLE_ASSET_TYPE( 3, "马医院消耗品资产" )
    ;
    public Integer type;
    public String note;

    AssetTypeEnum( Integer type, String note ) {
        this.type = type;
        this.note = note;
    }

}
