package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/4.
 */
public class HostInfoDetailBO extends BaseObject {

    private String hostId;
    private String hostName;
    private Integer sex;
    private String occupation;
    private String contactWay;
    private String address;
    private String horseId;

    public HostInfoDetailBO() {
    }

    public HostInfoDetailBO( String hostId, String hostName, Integer sex, String occupation, String contactWay,
                             String address, String horseId ) {
        this.hostId = hostId;
        this.hostName = hostName;
        this.sex = sex;
        this.occupation = occupation;
        this.contactWay = contactWay;
        this.address = address;
        this.horseId = horseId;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

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
