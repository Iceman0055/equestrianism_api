package com.equestrianism.api.model.vo.asset_type_detail;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/12.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class AssetTypeDetailListVO extends BasePageViewModel {

    private Integer typeId;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
