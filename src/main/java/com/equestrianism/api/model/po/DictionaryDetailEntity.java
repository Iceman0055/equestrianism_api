package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;
import org.apache.poi.util.StringUtil;

import java.util.regex.Pattern;

/**
 * Iceman
 * 2018/2/23
 */
public class DictionaryDetailEntity extends BasePO {

    private Integer dictionaryDetailId;
    private String itemCode;
    private String itemValue;
    private Integer dictionaryId;

    public DictionaryDetailEntity() {
    }

    public DictionaryDetailEntity( Integer dictionaryDetailId ) {
        this.dictionaryDetailId = dictionaryDetailId;
    }

    public DictionaryDetailEntity( String itemValue, Integer dictionaryId ) {
        this.itemValue = itemValue;
        this.dictionaryId = dictionaryId;
    }

    public DictionaryDetailEntity( String itemCode, String itemValue, Integer dictionaryId ) {
        this.itemCode = itemCode;
        this.itemValue = itemValue;
        this.dictionaryId = dictionaryId;
    }

    public String generateItemCode() {
        Integer tempCode = Integer.parseInt(this.itemCode) + 1;
        if ( tempCode < 10 ) {
            return "0" + tempCode;
        }
        return tempCode.toString();
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
