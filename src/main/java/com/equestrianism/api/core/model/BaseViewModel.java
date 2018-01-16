package com.equestrianism.api.core.model;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * Created by Chenzq on 2018/1/15.
 */
public class BaseViewModel extends BaseObject implements Serializable {

    private static final long serialVersionUID = - 488465188259319809L;

    private String sessionId;
    private String userId;
    private HttpServletRequest request;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId( String sessionId ) {
        this.sessionId = sessionId;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest( HttpServletRequest request ) {
        this.request = request;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId ) {
        this.userId = userId;
    }
}
