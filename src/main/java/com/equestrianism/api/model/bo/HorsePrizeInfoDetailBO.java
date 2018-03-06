package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/7.
 */
public class HorsePrizeInfoDetailBO extends BaseObject {

    private String horsePrizeId;
    private String horseId;
    private String eventName;
    private String eventDate;
    private String eventPlace;
    private String prizeName;
    private String penaltyTerm;

    public String getHorsePrizeId() {
        return horsePrizeId;
    }

    public void setHorsePrizeId(String horsePrizeId) {
        this.horsePrizeId = horsePrizeId;
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

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }
}
