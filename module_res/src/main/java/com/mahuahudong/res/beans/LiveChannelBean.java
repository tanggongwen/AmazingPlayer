package com.mahuahudong.res.beans;

import java.io.Serializable;

public class LiveChannelBean implements Serializable {
    private String title;
    private int channelId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }
}
