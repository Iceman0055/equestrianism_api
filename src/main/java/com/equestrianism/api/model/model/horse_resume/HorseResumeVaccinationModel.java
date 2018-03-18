package com.equestrianism.api.model.model.horse_resume;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class HorseResumeVaccinationModel extends BaseObject {

    private String operateDate;
    private String operatePlace;
    private String name;
    private String realname;

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatePlace() {
        return operatePlace;
    }

    public void setOperatePlace(String operatePlace) {
        this.operatePlace = operatePlace;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }
}
