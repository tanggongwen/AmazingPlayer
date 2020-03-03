package com.mahuahudong.res.beans;

import java.io.Serializable;

public class PushTokenBean implements Serializable {

    /**
     * termType : 1
     * deviceToken : aaaaaaaaaaaaaaaaaaaaaa
     * userId : 17376584982
     */

    private String termType;
    private String deviceToken;
    private String userId;

    public String getTermType() {
        return termType;
    }

    public void setTermType(String termType) {
        this.termType = termType;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
