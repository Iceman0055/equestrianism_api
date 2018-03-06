package com.equestrianism.api.model.vo.horse_prize_info;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/7.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HorsePrizeInfoUpdateVO extends HorsePrizeInfoAddVO {

    private String horsePrizeId;

    public String getHorsePrizeId() {
        return horsePrizeId;
    }

    public void setHorsePrizeId(String horsePrizeId) {
        this.horsePrizeId = horsePrizeId;
    }

}
