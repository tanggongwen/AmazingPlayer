package com.mahuahudong.res.beans;

import java.io.Serializable;

public class NewsImageBean implements Serializable {
    private int commontCount;
    private String title;
    private String imageUrl;


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCommontCount() {
        return commontCount;
    }

    public void setCommontCount(int commontCount) {
        this.commontCount = commontCount;
    }
}
