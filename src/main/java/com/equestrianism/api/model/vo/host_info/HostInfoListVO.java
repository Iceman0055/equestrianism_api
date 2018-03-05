package com.equestrianism.api.model.vo.host_info;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/4.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HostInfoListVO extends BasePageViewModel {

    private String hostName;
    private String contactWay;

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

}
