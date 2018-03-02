package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/3/2
 */
public class DictionaryInfoDetailBO extends BaseObject {

    private Integer dictionaryId;
    private String typeCode;
    private String typeName;
    private Integer sort;
    private String remark;

    public DictionaryInfoDetailBO() {
    }

    public DictionaryInfoDetailBO( Integer dictionaryId, String typeCode, String typeName, Integer sort, String remark ) {
        this.dictionaryId = dictionaryId;
        this.typeCode = typeCode;
        this.typeName = typeName;
        this.sort = sort;
        this.remark = remark;
    }

    public Integer getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId( Integer dictionaryId ) {
        this.dictionaryId = dictionaryId;
    }

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
