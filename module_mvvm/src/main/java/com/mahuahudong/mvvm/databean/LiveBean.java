package com.mahuahudong.mvvm.databean;

import java.io.Serializable;

public class LiveBean implements Serializable {
    private String liveId;
    private String liveHot;
    private String liveOwner;
    private String liveIntro;
    private String liveUrl;
    private String cover;

    public String getLiveUrl() {
        return liveUrl;
    }

    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
    }

    public String getLiveIntro() {
        return liveIntro;
    }

    public void setLiveIntro(String liveIntro) {
        this.liveIntro = liveIntro;
    }

    public String getLiveOwner() {
        return liveOwner;
    }

    public void setLiveOwner(String liveOwner) {
        this.liveOwner = liveOwner;
    }

    public String getLiveHot() {
        return liveHot;
    }

    public void setLiveHot(String liveHot) {
        this.liveHot = liveHot;
    }

    public String getLiveId() {
        return liveId;
    }

    public void setLiveId(String liveId) {
        this.liveId = liveId;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
