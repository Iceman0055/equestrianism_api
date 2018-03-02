package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/3/1
 */
public class DictionaryDetailInfoBO extends BaseObject {

    private Integer dictionaryDetailId;
    private String itemCode;
    private String itemValue;
    private Integer dictionaryId;

    public DictionaryDetailInfoBO() {
    }

    public DictionaryDetailInfoBO( Integer dictionaryDetailId, String itemCode, String itemValue, Integer dictionaryId ) {
        this.dictionaryDetailId = dictionaryDetailId;
        this.dictionaryId = dictionaryId;
        this.itemCode = itemCode;
        this.itemValue = itemValue;
    }

    public Integer getDictionaryDetailId() {
        return dictionaryDetailId;
    }

    public void setDictionaryDetailId( Integer dictionaryDetailId ) {
        this.dictionaryDetailId = dictionaryDetailId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode( String itemCode ) {
        this.itemCode = itemCode;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue( String itemValue ) {
        this.itemValue = itemValue;
    }

    public Integer getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId( Integer dictionaryId ) {
        this.dictionaryId = dictionaryId;
    }

}
