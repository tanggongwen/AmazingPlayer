package com.mahuahudong.res.beans;

import java.io.Serializable;

public class CommontBean implements Serializable {


    private String discussId;

    private String discussContent;


    private String newsId;


    private String newsTitle;

    private String newsType;

    /**
     * 状态:1 提交 2 审核 3 屏蔽（默认）(STATUS,VARCHAR,10)
     */
    private String status;

    private Integer likeCount;

    private String hasLike;

    private String issueTimeStamp;
    private String issueTime;

    private String thumUrl;

    private String isSVideo;

    private String crtDate;

    private DiscussUserVO userInfo;

    public DiscussUserVO getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(DiscussUserVO userInfo) {
        this.userInfo = userInfo;
    }

    public String getThumUrl() {
        return thumUrl;
    }

    public void setThumUrl(String thumUrl) {
        this.thumUrl = thumUrl;
    }

    public String getIssueTimeStamp() {
        return issueTimeStamp;
    }

    public void setIssueTimeStamp(String issueTimeStamp) {
        this.issueTimeStamp = issueTimeStamp;
    }

    public String getHasLike() {
        return hasLike;
    }

    public void setHasLike(String hasLike) {
        this.hasLike = hasLike;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    public String getDiscussContent() {
        return discussContent;
    }

    public void setDiscussContent(String discussContent) {
        this.discussContent = discussContent;
    }

    public String getDiscussId() {
        return discussId;
    }

    public void setDiscussId(String discussId) {
        this.discussId = discussId;
    }

    public String getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(String crtDate) {
        this.crtDate = crtDate;
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType;
    }

    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    public String getIsSVideo() {
        return isSVideo;
    }

    public void setIsSVideo(String isSVideo) {
        this.isSVideo = isSVideo;
    }

    public static class DiscussUserVO implements Serializable{
        private String userId;

        private String petName;

        private String profilePhoto;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getPetName() {
            return petName;
        }

        public void setPetName(String petName) {
            this.petName = petName;
        }

        public String getProfilePhoto() {
            return profilePhoto;
        }

        public void setProfilePhoto(String profilePhoto) {
            this.profilePhoto = profilePhoto;
        }
    }
}
