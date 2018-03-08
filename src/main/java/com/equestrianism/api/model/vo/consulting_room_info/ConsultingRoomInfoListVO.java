package com.equestrianism.api.model.vo.consulting_room_info;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/8
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ConsultingRoomInfoListVO extends BasePageViewModel {

    private String name;
    private String shortName;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName( String shortName ) {
        this.shortName = shortName;
    }

}
