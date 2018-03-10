package com.equestrianism.api.model.vo.asset_type_info;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/11.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class AssetTypeInfoUpdateVO extends AssetTypeInfoAddVO {

    private Integer typeId;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
