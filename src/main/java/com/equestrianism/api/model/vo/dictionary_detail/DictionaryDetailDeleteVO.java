package com.equestrianism.api.model.vo.dictionary_detail;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/1
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class DictionaryDetailDeleteVO extends BaseViewModel {

    private Integer dictionaryDetailId;
    private Integer deleteFlag;
    private Integer status;

    public Integer getDictionaryDetailId() {
        return dictionaryDetailId;
    }

    public void setDictionaryDetailId( Integer dictionaryDetailId ) {
        this.dictionaryDetailId = dictionaryDetailId;
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
