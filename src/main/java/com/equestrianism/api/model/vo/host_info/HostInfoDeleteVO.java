package com.equestrianism.api.model.vo.host_info;

import com.equestrianism.api.core.model.BaseViewModel;

/**
 * Created by Chenzq on 2018/3/4.
 */
public class HostInfoDeleteVO extends BaseViewModel {

    private String hostId;
    private Integer deleteFlag;
    private Integer status;

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
