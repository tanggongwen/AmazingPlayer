package com.mahuahudong.res.beans;

import java.io.Serializable;

public class CollectBean implements Serializable {


    /**
     * announcer : 肖邦哥
     * brief : 安静的钢琴曲
     * favorDate : null
     * favorId : 222
     * favorType : 4
     * itemId : 640943785949401088
     * thumUrl : http://dev-rgw.zhcs.csbtv.com/zhcs/images/640943776235393024.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149654504&Signature=e%2BtHJx82i6e4Hn1odLaUBVKaLD8%3D
     * title : 安静的钢琴曲
     */
    private String announcer;
    private String brief;
    private String favorDate;
    private String favorId;
    private String favorType;
    private String itemId;
    private String thumUrl;
    private String title;
    private String newsType;
    private String isSVideo;

    public String getAnnouncer() {
        return announcer;
    }

    public void setAnnouncer(String announcer) {
        this.announcer = announcer;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getFavorDate() {
        return favorDate;
    }

    public void setFavorDate(String favorDate) {
        this.favorDate = favorDate;
    }

    public String getFavorId() {
        return favorId;
    }

    public void setFavorId(String favorId) {
        this.favorId = favorId;
    }

    public String getFavorType() {
        return favorType;
    }

    public void setFavorType(String favorType) {
        this.favorType = favorType;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getThumUrl() {
        return thumUrl;
    }

    public void setThumUrl(String thumUrl) {
        this.thumUrl = thumUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public String getIsSVideo() {
        return isSVideo;
    }

    public void setIsSVideo(String isSVideo) {
        this.isSVideo = isSVideo;
    }
}
