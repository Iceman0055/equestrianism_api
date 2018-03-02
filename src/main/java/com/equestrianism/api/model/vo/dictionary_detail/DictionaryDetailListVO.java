package com.equestrianism.api.model.vo.dictionary_detail;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/1
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class DictionaryDetailListVO extends BasePageViewModel {

    private Integer dictionaryId;

    public Integer getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId( Integer dictionaryId ) {
        this.dictionaryId = dictionaryId;
    }

}
