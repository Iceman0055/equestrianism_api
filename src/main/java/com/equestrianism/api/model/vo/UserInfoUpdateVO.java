package com.equestrianism.api.model.vo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/1/21.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class UserInfoUpdateVO extends UserInfoAddVO {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
