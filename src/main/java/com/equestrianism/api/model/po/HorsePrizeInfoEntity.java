package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by Chenzq on 2018/3/6.
 */
public class HorsePrizeInfoEntity extends BasePO {

    private String horsePrizeId = UUID.randomUUID().toString().replace( "-", "" );
    private String horseId;
    private String eventName;
    private String eventDate;
    private String eventPlace;
    private String prizeName;
    private String penaltyTerm;
    private String awarder;
    private byte[] descImage;

    public HorsePrizeInfoEntity() {
    }

    public HorsePrizeInfoEntity( String horsePrizeId ) {
        this.horsePrizeId = horsePrizeId;
    }

    public HorsePrizeInfoEntity( String horseId, String eventName, String eventDate,
                                 String eventPlace, String prizeName, String penaltyTerm, String awarder,
                                 MultipartFile descImage ) throws IOException {
        this( UUID.randomUUID().toString().replace( "-", "" ), horseId, eventName, eventDate, eventPlace, prizeName,
                penaltyTerm, awarder, descImage );
    }

    public HorsePrizeInfoEntity( String horsePrizeId, String horseId, String eventName, String eventDate,
                                 String eventPlace, String prizeName, String penaltyTerm, String awarder,
                                 MultipartFile descImage ) throws IOException {
        this.horsePrizeId = horsePrizeId;
        this.horseId = horseId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventPlace = eventPlace;
        this.prizeName = prizeName;
        this.penaltyTerm = penaltyTerm;
        this.awarder = awarder;
        if ( descImage != null ) {
            this.descImage = descImage.getBytes();
        }
    }

    public String getHorsePrizeId() {
        return horsePrizeId;
    }

    public void setHorsePrizeId(String horsePrizeId) {
        this.horsePrizeId = horsePrizeId;
    }

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
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

    public String getAwarder() {
        return awarder;
    }

    public void setAwarder(String awarder) {
        this.awarder = awarder;
    }

    public byte[] getDescImage() {
        return descImage;
    }

    public void setDescImage(byte[] descImage) {
        this.descImage = descImage;
    }

}
