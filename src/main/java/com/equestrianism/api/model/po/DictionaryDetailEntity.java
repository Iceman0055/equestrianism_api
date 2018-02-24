package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

/**
 * Iceman
 * 2018/2/23
 */
public class DictionaryDetailEntity extends BasePO {

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
