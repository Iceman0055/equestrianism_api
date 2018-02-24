package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

/**
 * Iceman
 * 2018/2/23
 */
public class DictionaryInfoEntity extends BasePO {

    private Integer dictionaryId;
    private String typeCode;
    private String typeName;
    private Integer sort;
    private String remark;

    public DictionaryInfoEntity() {
    }

    public DictionaryInfoEntity( String typeCode, String typeName, Integer sort, String remark ) {
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
