package com.mahuahudong.res.beans;

/**
 * Created by Devlin_n on 2017/6/1.
 */

public class ShortVideoBean {

    private String title;
    private String url;
    private String thumb;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public ShortVideoBean(String title, String thumb, String url) {
        this.title = title;
        this.url = url;
        this.thumb = thumb;

    }
}
