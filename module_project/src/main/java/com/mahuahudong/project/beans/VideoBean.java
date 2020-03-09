package com.mahuahudong.project.beans;

import java.io.Serializable;
import java.util.List;

public class VideoBean implements Serializable {
    private String cover;
    private String title;
    private String point;
    private String intro;
    private String videoId;
    private String videoUrl;
    private String currentCount;
    private boolean asMovie;
    private List<VideoBean> videoBeans;

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public List<VideoBean> getVideoBeans() {
        return videoBeans;
    }

    public void setVideoBeans(List<VideoBean> videoBeans) {
        this.videoBeans = videoBeans;
    }

    public boolean isAsMovie() {
        return asMovie;
    }

    public void setAsMovie(boolean asMovie) {
        this.asMovie = asMovie;
    }

    public String getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(String currentCount) {
        this.currentCount = currentCount;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
