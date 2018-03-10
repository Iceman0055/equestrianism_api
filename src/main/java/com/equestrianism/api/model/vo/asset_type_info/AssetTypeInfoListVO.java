package com.equestrianism.api.model.vo.asset_type_info;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/11.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class AssetTypeInfoListVO extends BasePageViewModel {

    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

}
