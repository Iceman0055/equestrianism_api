package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/3/1
 */
public class DictionaryDetailListModel extends BaseObject {

    private Integer dictionaryDetailId;
    private String itemCode;
    private String itemValue;
    private Integer dictionaryId;

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
