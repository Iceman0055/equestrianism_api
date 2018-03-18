package com.equestrianism.api.model.model.horse_resume;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class HorseResumePrizeModel extends BaseObject {

    private String eventDate;
    private String eventName;
    private String eventPlace;
    private String prizeName;

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName;
    }

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
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
}
