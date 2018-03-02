package com.equestrianism.api.model.vo.dictionary_detail;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/2/28
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class DictionaryDetailAddVO extends BaseViewModel {

    private Integer dictionaryId;
    private String itemCode;
    private String itemValue;

    public Integer getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId( Integer dictionaryId ) {
        this.dictionaryId = dictionaryId;
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
}
