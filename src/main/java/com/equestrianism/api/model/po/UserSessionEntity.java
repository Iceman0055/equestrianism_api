package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Created by Chenzq on 2018/3/21.
 */
public class UserSessionEntity extends BasePO {

    private String id = UUID.randomUUID().toString().replace( "-", "" );
    private String userId;
    private String sessionId;

    public UserSessionEntity() {
    }

    public UserSessionEntity( String userId, String sessionId ) {
        this( UUID.randomUUID().toString().replace( "-", "" ), userId, sessionId );
    }

    public UserSessionEntity( String id, String userId, String sessionId ) {
        this.id = id;
        this.userId = userId;
        this.sessionId = sessionId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
