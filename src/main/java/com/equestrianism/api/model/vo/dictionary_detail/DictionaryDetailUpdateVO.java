package com.equestrianism.api.model.vo.dictionary_detail;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/1
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class DictionaryDetailUpdateVO extends DictionaryDetailAddVO {

    private Integer dictionaryDetailId;

    public Integer getDictionaryDetailId() {
        return dictionaryDetailId;
    }

    public void setDictionaryDetailId( Integer dictionaryDetailId ) {
        this.dictionaryDetailId = dictionaryDetailId;
    }

}
