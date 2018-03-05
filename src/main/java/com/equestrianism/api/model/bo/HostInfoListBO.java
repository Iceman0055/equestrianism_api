package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.HostInfoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/4.
 */
public class HostInfoListBO extends BasePageResponse {

    private List<HostInfoListModel> hostInfoList;

    public HostInfoListBO() {
    }

    public HostInfoListBO( List<HostInfoListModel> hostInfoList ) {
        this.hostInfoList = hostInfoList;
    }

    public List<HostInfoListModel> getHostInfoList() {
        return hostInfoList;
    }

    public void setHostInfoList(List<HostInfoListModel> hostInfoList) {
        this.hostInfoList = hostInfoList;
    }
}
