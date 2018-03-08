package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/9.
 */
public class BrigandineInfoListModel extends BaseObject {

    private String brigandineId;
    private String brigandineDate;
    private String horseName;
    private String realname;

    public String getBrigandineId() {
        return brigandineId;
    }

    public void setBrigandineId(String brigandineId) {
        this.brigandineId = brigandineId;
    }

    public String getBrigandineDate() {
        return brigandineDate;
    }

    public void setBrigandineDate(String brigandineDate) {
        this.brigandineDate = brigandineDate;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

}
