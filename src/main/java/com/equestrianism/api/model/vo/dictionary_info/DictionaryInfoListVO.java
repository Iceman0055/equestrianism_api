package com.equestrianism.api.model.vo.dictionary_info;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/2/27
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class DictionaryInfoListVO extends BasePageViewModel {

    private String typeCode;
    private String typeName;

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode( String typeCode ) {
        this.typeCode = typeCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName( String typeName ) {
        this.typeName = typeName;
    }

}
