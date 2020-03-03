package com.mahuahudong.res.beans;

import java.io.Serializable;

public class LiveStationRelatedBean implements Serializable {

    /**
     * announcer :
     * mediaCount : 0
     * progBrief : 小食光 ∙ 今日份开胃健脾丸
     * progId : 641296843673833472
     * progName : 小食光 ∙ 今日份开胃健脾丸
     * skipType :
     * skipUrl :
     * thumUrl : http://dev-rgw.zhcs.csbtv.com/zhcs/images/641296837831168000.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149738680&Signature=F3GdrSxq%2FZ%2F6ZOQ7D4RFJdj4k0U%3D
     */

    private String announcer;
    private int mediaCount;
    private String progBrief;
    private String progId;
    private String progName;
    private String skipType;
    private String skipUrl;
    private String thumUrl;

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

    public String getSkipType() {
        return skipType;
    }

    public void setSkipType(String skipType) {
        this.skipType = skipType;
    }

    public String getSkipUrl() {
        return skipUrl;
    }

    public void setSkipUrl(String skipUrl) {
        this.skipUrl = skipUrl;
    }

    public String getThumUrl() {
        return thumUrl;
    }

    public void setThumUrl(String thumUrl) {
        this.thumUrl = thumUrl;
    }
}
