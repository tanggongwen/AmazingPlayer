package com.mahuahudong.res.beans;

import java.io.Serializable;

public class NewsBean implements Serializable {
    private String videoUrl;

    private String cover;

    public  NewsBean(String url,String cover){
        this.videoUrl = url;
        this.cover = cover;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getCover() {
        return cover;
    }
}
