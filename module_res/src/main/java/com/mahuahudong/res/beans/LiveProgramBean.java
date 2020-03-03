package com.mahuahudong.res.beans;

import java.io.Serializable;

public class LiveProgramBean implements Serializable {


    /**
     * issueTime : 2019-11-06 15:14:40
     * newsBrief : 郎朗妻子吉娜素颜照曝光 卸浓妆很清纯似邻家女孩
     * newsId : 641656770758053888
     * newsTitle : 郎朗妻子吉娜素颜照曝光 卸浓妆很清纯似邻家女孩
     * thumUrl : http://dev-rgw.zhcs.csbtv.com/zhcs/images/641656750851887104.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149824491&Signature=r5u8eO3nxt%2BcYd94ErqkM45KYkI%3D
     */

    private String issueTime;
    private String newsBrief;
    private String newsId;
    private String newsTitle;
    private String thumUrl;

    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    public String getNewsBrief() {
        return newsBrief;
    }

    public void setNewsBrief(String newsBrief) {
        this.newsBrief = newsBrief;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getThumUrl() {
        return thumUrl;
    }

    public void setThumUrl(String thumUrl) {
        this.thumUrl = thumUrl;
    }
}
