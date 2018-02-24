package com.equestrianism.api.model.vo.dictionary_info;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/2/24
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class DictionaryInfoUpdateVO extends DictionaryInfoAddVO {

    private Integer dictionaryId;

    public Integer getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId( Integer dictionaryId ) {
        this.dictionaryId = dictionaryId;
    }

}
