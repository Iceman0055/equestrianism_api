package com.equestrianism.api.model.vo.host_info;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/4.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HostInfoUpdateVO extends HostInfoAddVO {

    private String hostId;

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

}
