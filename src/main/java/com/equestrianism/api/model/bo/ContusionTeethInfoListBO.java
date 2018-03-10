package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.ContusionTeethInfoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/9.
 */
public class ContusionTeethInfoListBO extends BasePageResponse {

    private List<ContusionTeethInfoListModel> contusionTeethList;

    public ContusionTeethInfoListBO() {
    }

    public ContusionTeethInfoListBO( List<ContusionTeethInfoListModel> contusionTeethList ) {
        this.contusionTeethList = contusionTeethList;
    }


    public List<ContusionTeethInfoListModel> getContusionTeethList() {
        return contusionTeethList;
    }

    public void setContusionTeethList(List<ContusionTeethInfoListModel> contusionTeethList) {
        this.contusionTeethList = contusionTeethList;
    }
}
