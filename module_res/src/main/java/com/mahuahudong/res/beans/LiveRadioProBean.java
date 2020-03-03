package com.mahuahudong.res.beans;

import java.io.Serializable;

public class LiveRadioProBean implements Serializable {

    /**
     * announcer : 小白
     * progListId : 639786393748508672
     * progListName : 节目单2
     * progTime : 11:09:11-12:09:11
     */

    private String announcer;
    private String progListId;
    private String progListName;
    private String progTime;
    private String onlive;

    public String getAnnouncer() {
        return announcer;
    }

    public void setAnnouncer(String announcer) {
        this.announcer = announcer;
    }

    public String getProgListId() {
        return progListId;
    }

    public void setProgListId(String progListId) {
        this.progListId = progListId;
    }

    public String getProgListName() {
        return progListName;
    }

    public void setProgListName(String progListName) {
        this.progListName = progListName;
    }

    public String getProgTime() {
        return progTime;
    }

    public void setProgTime(String progTime) {
        this.progTime = progTime;
    }

    public String getOnlive() {
        return onlive;
    }

    public void setOnlive(String onlive) {
        this.onlive = onlive;
    }
}
