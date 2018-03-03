package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.DictionaryInfoModel;

import java.util.List;

/**
 * Iceman
 * 2018/3/2
 */
public class DictionaryInfoAllBO extends BaseObject {

    private List<DictionaryInfoModel> dictionaryInfoList;

    public List< DictionaryInfoModel > getDictionaryInfoList() {
        return dictionaryInfoList;
    }

    public void setDictionaryInfoList( List< DictionaryInfoModel > dictionaryInfoList ) {
        this.dictionaryInfoList = dictionaryInfoList;
    }

}
