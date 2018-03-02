package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.DictionaryInfoListModel;

import java.util.List;

/**
 * Iceman
 * 2018/2/27
 */
public class DictionaryInfoListBO extends BasePageResponse {

    private List<DictionaryInfoListModel> dictionaryInfoList;

    public DictionaryInfoListBO() {
    }

    public DictionaryInfoListBO( List<DictionaryInfoListModel> dictionaryInfoList ) {
        this.dictionaryInfoList = dictionaryInfoList;
    }

    public List<DictionaryInfoListModel> getDictionaryInfoList() {
        return dictionaryInfoList;
    }

    public void setDictionaryInfoList( List<DictionaryInfoListModel> dictionaryInfoList ) {
        this.dictionaryInfoList = dictionaryInfoList;
    }

}
