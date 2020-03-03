package com.mahuahudong.res.beans;

import java.io.Serializable;

public class LiveStationColumnProgBean implements Serializable {

    /**
     * announcer :
     * mediaCount : 0
     * progBrief : 12313
     * progId : 638787450113757184
     * progName : 测试1111
     * thumUrl : http://dev-rgw.zhcs.csbtv.com/zhcs/images/638787445852344320.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149140395&Signature=%2FQ%2Bsn56a8%2Ba3xSB%2FlmWPFEXcse8%3D
     */

    private String announcer;
    private int mediaCount;
    private String progBrief;
    private String progId;
    private String progName;
    private String skipType;
    private String skipUrl;
    private String thumUrl;
    private boolean isCollected;

    public String getAnnouncer() {
        return announcer;
    }

    public void setAnnouncer(String announcer) {
        this.announcer = announcer;
    }

    public int getMediaCount() {
        return mediaCount;
    }

    public void setMediaCount(int mediaCount) {
        this.mediaCount = mediaCount;
    }

    public String getProgBrief() {
        return progBrief;
    }

    public void setProgBrief(String progBrief) {
        this.progBrief = progBrief;
    }

    public String getProgId() {
        return progId;
    }

    public void setProgId(String progId) {
        this.progId = progId;
    }

    public String getProgName() {
        return progName;
    }

    public void setProgName(String progName) {
        this.progName = progName;
    }

    public String getThumUrl() {
        return thumUrl;
    }

    public void setThumUrl(String thumUrl) {
        this.thumUrl = thumUrl;
    }


    public boolean isCollected() {
        return isCollected;
    }

    public void setCollected(boolean collected) {
        isCollected = collected;
    }

    public String getSkipUrl() {
        return skipUrl;
    }

    public void setSkipUrl(String skipUrl) {
        this.skipUrl = skipUrl;
    }

    public String getSkipType() {
        return skipType;
    }

    public void setSkipType(String skipType) {
        this.skipType = skipType;
    }
}
