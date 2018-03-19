package com.equestrianism.api.model.model.horse_resume;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/20.
 */
public class HorseResumeTreatmentInfoModel extends BaseObject {

    private String beginDate;
    private String treatName;
    private String treatDesc;
    private String realname;

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getTreatDesc() {
        return treatDesc;
    }

    public void setTreatDesc(String treatDesc) {
        this.treatDesc = treatDesc;
    }

    public String getTreatName() {
        return treatName;
    }

    public void setTreatName(String treatName) {
        this.treatName = treatName;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }
}
