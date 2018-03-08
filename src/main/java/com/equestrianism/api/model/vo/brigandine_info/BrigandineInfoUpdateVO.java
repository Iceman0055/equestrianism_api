package com.equestrianism.api.model.vo.brigandine_info;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/9.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class BrigandineInfoUpdateVO extends BrigandineInfoAddVO {

    private String brigandineId;

    public String getBrigandineId() {
        return brigandineId;
    }

    public void setBrigandineId(String brigandineId) {
        this.brigandineId = brigandineId;
    }

}
