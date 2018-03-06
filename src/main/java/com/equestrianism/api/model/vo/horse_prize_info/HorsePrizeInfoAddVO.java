package com.equestrianism.api.model.vo.horse_prize_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.web.multipart.MultipartFile;

/**
 * Iceman
 * 2018/3/6
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HorsePrizeInfoAddVO extends BaseViewModel {

    private String horseId;
    private String eventName;
    private String eventDate;
    private String eventPlace;
    private String prizeName;
    private String penaltyTerm;
    private String awarder;
    private MultipartFile descImage;

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId( String horseId ) {
        this.horseId = horseId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName( String eventName ) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate( String eventDate ) {
        this.eventDate = eventDate;
    }

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace( String eventPlace ) {
        this.eventPlace = eventPlace;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName( String prizeName ) {
        this.prizeName = prizeName;
    }

    public String getPenaltyTerm() {
        return penaltyTerm;
    }

    public void setPenaltyTerm( String penaltyTerm ) {
        this.penaltyTerm = penaltyTerm;
    }

    public String getAwarder() {
        return awarder;
    }

    public void setAwarder( String awarder ) {
        this.awarder = awarder;
    }

    public MultipartFile getDescImage() {
        return descImage;
    }

    public void setDescImage( MultipartFile descImage ) {
        this.descImage = descImage;
    }

}
