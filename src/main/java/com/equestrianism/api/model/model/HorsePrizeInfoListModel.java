package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/7.
 */
public class HorsePrizeInfoListModel extends BaseObject {

    private String horsePrizeId;
    private String horseName;
    private String eventName;
    private String eventDate;
    private String eventPlace;
    private String prizeName;
    private String penaltyTerm;

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getPenaltyTerm() {
        return penaltyTerm;
    }

    public void setPenaltyTerm(String penaltyTerm) {
        this.penaltyTerm = penaltyTerm;
    }

    public String getHorsePrizeId() {
        return horsePrizeId;
    }

    public void setHorsePrizeId(String horsePrizeId) {
        this.horsePrizeId = horsePrizeId;
    }
}
