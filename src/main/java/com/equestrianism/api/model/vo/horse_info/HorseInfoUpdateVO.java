package com.equestrianism.api.model.vo.horse_info;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/1/29
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HorseInfoUpdateVO extends HorseInfoAddVO {

    private String horseId;

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId( String horseId ) {
        this.horseId = horseId;
    }

}
