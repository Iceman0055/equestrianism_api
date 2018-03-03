package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

import java.util.List;

/**
 * Iceman
 * 2018/3/2
 */
public class DictionaryInfoModel extends BaseObject {

    private Integer dictionaryId;
    private String typeCode;
    private String typeName;
    private List<DictionaryDetailModel> dictionaryDetailList;

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

    public List< DictionaryDetailModel > getDictionaryDetailList() {
        return dictionaryDetailList;
    }

    public void setDictionaryDetailList( List< DictionaryDetailModel > dictionaryDetailList ) {
        this.dictionaryDetailList = dictionaryDetailList;
    }
}
