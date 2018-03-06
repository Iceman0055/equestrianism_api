package com.equestrianism.api.model.vo.horse_prize_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/7.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HorsePrizeInfoDeleteVO extends BaseViewModel {

    private String horsePrizeId;
    private Integer deleteFlag;
    private Integer status;

    public String getHorsePrizeId() {
        return horsePrizeId;
    }

    public void setHorsePrizeId(String horsePrizeId) {
        this.horsePrizeId = horsePrizeId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
