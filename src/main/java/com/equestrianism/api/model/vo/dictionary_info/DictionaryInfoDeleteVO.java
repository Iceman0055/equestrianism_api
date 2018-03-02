package com.equestrianism.api.model.vo.dictionary_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/2/27
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class DictionaryInfoDeleteVO extends BaseViewModel {

    private Integer dictionaryId;
    private Integer deleteFlag;
    private Integer status;

    public Integer getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId( Integer dictionaryId ) {
        this.dictionaryId = dictionaryId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag( Integer deleteFlag ) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

}
