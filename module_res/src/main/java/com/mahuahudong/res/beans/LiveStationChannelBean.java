package com.mahuahudong.res.beans;

import java.io.Serializable;

public class LiveStationChannelBean implements Serializable {

    /**
     * nextPro : 阿紫土味情话
     * nextProTP : 19:45:11-20:30:11
     * onlinePro :
     * onlineProTP :
     * radioBrief : 123123213
     * radioId : 639122573501796352
     * radioName : 测试
     * radioUrl : 12313
     * thumUrl : http://dev-rgw.zhcs.csbtv.com/zhcs/images/639122509425414144.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149220280&Signature=ExQsJKqaRHC7R61FnYtDHbcQg%2Fc%3D
     */

    private String nextPro;
    private String nextProTP;
    private String onlinePro;
    private String onlineProTP;
    private String radioBrief;
    private String radioId;
    private String radioName;
    private String radioUrl;
    private String thumUrl;

    public String getNextPro() {
        return nextPro;
    }

    public void setNextPro(String nextPro) {
        this.nextPro = nextPro;
    }

    public String getNextProTP() {
        return nextProTP;
    }

    public void setNextProTP(String nextProTP) {
        this.nextProTP = nextProTP;
    }

    public String getOnlinePro() {
        return onlinePro;
    }

    public void setOnlinePro(String onlinePro) {
        this.onlinePro = onlinePro;
    }

    public String getOnlineProTP() {
        return onlineProTP;
    }

    public void setOnlineProTP(String onlineProTP) {
        this.onlineProTP = onlineProTP;
    }

    public String getRadioBrief() {
        return radioBrief;
    }

    public void setRadioBrief(String radioBrief) {
        this.radioBrief = radioBrief;
    }

    public String getRadioId() {
        return radioId;
    }

    public void setRadioId(String radioId) {
        this.radioId = radioId;
    }

    public String getRadioName() {
        return radioName;
    }

    public void setRadioName(String radioName) {
        this.radioName = radioName;
    }

    public String getRadioUrl() {
        return radioUrl;
    }

    public void setRadioUrl(String radioUrl) {
        this.radioUrl = radioUrl;
    }

    public String getThumUrl() {
        return thumUrl;
    }

    public void setThumUrl(String thumUrl) {
        this.thumUrl = thumUrl;
    }
}
