package com.equestrianism.api.model.vo.consulting_room_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/8
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ConsultingRoomInfoAddVO extends BaseViewModel {

    private String name;
    private String shortName;
    private String remark;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark( String remark ) {
        this.remark = remark;
    }

}
