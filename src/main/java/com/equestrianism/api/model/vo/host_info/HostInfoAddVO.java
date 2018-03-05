package com.equestrianism.api.model.vo.host_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/4.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HostInfoAddVO extends BaseViewModel {

    private String hostName;
    private Integer sex;
    private String occupation;
    private String contactWay;
    private String address;
    private String horseId;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }

}
