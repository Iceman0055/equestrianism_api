package com.equestrianism.api.model.vo.horse_info;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/1/30
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HorseInfoListVO extends BasePageViewModel {

    private String passportNumber;
    private String horseName;

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber( String passportNumber ) {
        this.passportNumber = passportNumber;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName( String horseName ) {
        this.horseName = horseName;
    }

}
