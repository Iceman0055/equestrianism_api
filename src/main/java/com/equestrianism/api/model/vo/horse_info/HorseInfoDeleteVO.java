package com.equestrianism.api.model.vo.horse_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/1/30
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HorseInfoDeleteVO extends BaseViewModel {

    private String horseId;
    private Integer deleteFlag;
    private Integer status;

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId( String horseId ) {
        this.horseId = horseId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag( Integer deleteFlag ) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

}
