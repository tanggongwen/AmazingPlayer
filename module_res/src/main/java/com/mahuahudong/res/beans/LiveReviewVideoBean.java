package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class LiveReviewVideoBean implements Serializable {
    private String type;
    private List<LiveReviewVideoItemBean> videoList;

    public List<LiveReviewVideoItemBean> getVideoList() {
        return videoList;
    }

    public void setVideoList(List<LiveReviewVideoItemBean> videoList) {
        this.videoList = videoList;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
