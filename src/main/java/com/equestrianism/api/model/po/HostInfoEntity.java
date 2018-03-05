package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Iceman
 * 2018/3/2
 */
public class HostInfoEntity extends BasePO {

    private String hostId = UUID.randomUUID().toString().replace( "-", "" );
    private String hostName;
    private Integer sex;
    private String occupation;
    private String contactWay;
    private String address;
    private String horseId;

    public HostInfoEntity() {
    }

    public HostInfoEntity( String hostId ) {
        this.hostId = hostId;
    }

    public HostInfoEntity( String hostName, Integer sex, String occupation, String contactWay, String address, String horseId ) {
        this( UUID.randomUUID().toString().replace( "-", "" ), hostName, sex, occupation, contactWay, address, horseId );
    }

    public HostInfoEntity( String hostId, String hostName, Integer sex, String occupation, String contactWay, String address, String horseId ) {
        this.hostId = hostId;
        this.hostName = hostName;
        this.address = address;
        this.sex = sex;
        this.contactWay = contactWay;
        if ( horseId == null || horseId.equals( "" ) ) {
            this.horseId = "";
        } else {
            this.horseId = horseId;
        }
        this.occupation = occupation;
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
