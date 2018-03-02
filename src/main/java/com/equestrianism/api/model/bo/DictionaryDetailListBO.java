package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.DictionaryDetailListModel;

import java.util.List;

/**
 * Iceman
 * 2018/3/1
 */
public class DictionaryDetailListBO extends BasePageResponse {

    private List<DictionaryDetailListModel> dictionaryDetailList;

    public DictionaryDetailListBO() {
    }

    public DictionaryDetailListBO( List<DictionaryDetailListModel> dictionaryDetailList ) {
        this.dictionaryDetailList = dictionaryDetailList;
    }

    public List< DictionaryDetailListModel > getDictionaryDetailList() {
        return dictionaryDetailList;
    }

    public void setDictionaryDetailList( List< DictionaryDetailListModel > dictionaryDetailList ) {
        this.dictionaryDetailList = dictionaryDetailList;
    }

}
