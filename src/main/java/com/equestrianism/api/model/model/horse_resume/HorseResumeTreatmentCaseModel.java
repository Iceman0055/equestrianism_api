package com.equestrianism.api.model.model.horse_resume;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class HorseResumeTreatmentCaseModel extends BaseObject {

    private String operateDate;
    private String realname;
    private String titleTag;
    private String place;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTitleTag() {
        return titleTag;
    }

    public void setTitleTag(String titleTag) {
        this.titleTag = titleTag;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }
}
