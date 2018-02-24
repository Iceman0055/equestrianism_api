package com.equestrianism.api.model.vo.dictionary_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/2/24
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class DictionaryInfoAddVO extends BaseViewModel {

    private String typeCode;
    private String typeName;
    private Integer sort;
    private String remark;

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

    public Integer getSort() {
        return sort;
    }

    public void setSort( Integer sort ) {
        this.sort = sort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark( String remark ) {
        this.remark = remark;
    }

}
