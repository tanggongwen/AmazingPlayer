package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class AddNewsCommontBean implements Serializable {

    /**
     * cancelThTime : 0
     * commentedNews : {"auditor":"string","commentCount":"string","crtDate":"2019-11-25T07:24:15.858Z","crtOrgCode":"string","crtUserCode":"string","details":"string","detailsUrl":"string","id":"string","isCollect":"string","isComment":"string","isDispAdver":"string","isExternal":"string","isRecoLabel":"string","isSVideo":"string","isTop":"string","isVote":"string","issueTime":"2019-11-25T07:24:15.858Z","issueTimeStamp":"string","likeCount":"string","livecastUrl":"string","mPictures":["string"],"newsBrief":"string","newsId":"string","newsKeyword":"string","newsLabel":"string","newsMan":"string","newsNo":"string","newsSrc":"string","newsTitle":"string","newsType":"string","pageFile":"string","pageUrl":"string","showForm":"string","specType":"string","status":"string","tag":"string","templId":"string","thumFile":"string","thumUrl":"string","timeDif":"string","updDate":"2019-11-25T07:24:15.858Z","updOrgCode":"string","updUserCode":"string","videoFile":"string","videoTime":"string","videoUrl":"string","viewCount":"string","whetherLike":"string"}
     * crtDate : 2019-11-25T07:24:15.858Z
     * crtOrgCode : string
     * crtUserCode : string
     * discussContent : string
     * discussId : string
     * hasLike : string
     * id : string
     * issueTimeStamp : string
     * likeCount : 0
     * newsId : string
     * newsTitle : string
     * status : string
     * updDate : 2019-11-25T07:24:15.858Z
     * updOrgCode : string
     * updUserCode : string
     * userInfo : {"petName":"string","profilePhoto":"string","userId":"string"}
     */

    private int cancelThTime;
    private CommentedNewsBean commentedNews;
    private String crtDate;
    private String crtOrgCode;
    private String crtUserCode;
    private String discussContent;
    private String discussId;
    private String hasLike;
    private String id;
    private String issueTimeStamp;
    private int likeCount;
    private String newsId;
    private String newsTitle;
    private String status;
    private String updDate;
    private String updOrgCode;
    private String updUserCode;
    private UserInfoBean userInfo;

    public int getCancelThTime() {
        return cancelThTime;
    }

    public void setCancelThTime(int cancelThTime) {
        this.cancelThTime = cancelThTime;
    }

    public CommentedNewsBean getCommentedNews() {
        return commentedNews;
    }

    public void setCommentedNews(CommentedNewsBean commentedNews) {
        this.commentedNews = commentedNews;
    }

    public String getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(String crtDate) {
        this.crtDate = crtDate;
    }

    public String getCrtOrgCode() {
        return crtOrgCode;
    }

    public void setCrtOrgCode(String crtOrgCode) {
        this.crtOrgCode = crtOrgCode;
    }

    public String getCrtUserCode() {
        return crtUserCode;
    }

    public void setCrtUserCode(String crtUserCode) {
        this.crtUserCode = crtUserCode;
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

    public String getHasLike() {
        return hasLike;
    }

    public void setHasLike(String hasLike) {
        this.hasLike = hasLike;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIssueTimeStamp() {
        return issueTimeStamp;
    }

    public void setIssueTimeStamp(String issueTimeStamp) {
        this.issueTimeStamp = issueTimeStamp;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdDate() {
        return updDate;
    }

    public void setUpdDate(String updDate) {
        this.updDate = updDate;
    }

    public String getUpdOrgCode() {
        return updOrgCode;
    }

    public void setUpdOrgCode(String updOrgCode) {
        this.updOrgCode = updOrgCode;
    }

    public String getUpdUserCode() {
        return updUserCode;
    }

    public void setUpdUserCode(String updUserCode) {
        this.updUserCode = updUserCode;
    }

    public UserInfoBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBean userInfo) {
        this.userInfo = userInfo;
    }

    public static class CommentedNewsBean {
        /**
         * auditor : string
         * commentCount : string
         * crtDate : 2019-11-25T07:24:15.858Z
         * crtOrgCode : string
         * crtUserCode : string
         * details : string
         * detailsUrl : string
         * id : string
         * isCollect : string
         * isComment : string
         * isDispAdver : string
         * isExternal : string
         * isRecoLabel : string
         * isSVideo : string
         * isTop : string
         * isVote : string
         * issueTime : 2019-11-25T07:24:15.858Z
         * issueTimeStamp : string
         * likeCount : string
         * livecastUrl : string
         * mPictures : ["string"]
         * newsBrief : string
         * newsId : string
         * newsKeyword : string
         * newsLabel : string
         * newsMan : string
         * newsNo : string
         * newsSrc : string
         * newsTitle : string
         * newsType : string
         * pageFile : string
         * pageUrl : string
         * showForm : string
         * specType : string
         * status : string
         * tag : string
         * templId : string
         * thumFile : string
         * thumUrl : string
         * timeDif : string
         * updDate : 2019-11-25T07:24:15.858Z
         * updOrgCode : string
         * updUserCode : string
         * videoFile : string
         * videoTime : string
         * videoUrl : string
         * viewCount : string
         * whetherLike : string
         */

        private String auditor;
        private String commentCount;
        private String crtDate;
        private String crtOrgCode;
        private String crtUserCode;
        private String details;
        private String detailsUrl;
        private String id;
        private String isCollect;
        private String isComment;
        private String isDispAdver;
        private String isExternal;
        private String isRecoLabel;
        private String isSVideo;
        private String isTop;
        private String isVote;
        private String issueTime;
        private String issueTimeStamp;
        private String likeCount;
        private String livecastUrl;
        private String newsBrief;
        private String newsId;
        private String newsKeyword;
        private String newsLabel;
        private String newsMan;
        private String newsNo;
        private String newsSrc;
        private String newsTitle;
        private String newsType;
        private String pageFile;
        private String pageUrl;
        private String showForm;
        private String specType;
        private String status;
        private String tag;
        private String templId;
        private String thumFile;
        private String thumUrl;
        private String timeDif;
        private String updDate;
        private String updOrgCode;
        private String updUserCode;
        private String videoFile;
        private String videoTime;
        private String videoUrl;
        private String viewCount;
        private String whetherLike;
        private List<String> mPictures;

        public String getAuditor() {
            return auditor;
        }

        public void setAuditor(String auditor) {
            this.auditor = auditor;
        }

        public String getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(String commentCount) {
            this.commentCount = commentCount;
        }

        public String getCrtDate() {
            return crtDate;
        }

        public void setCrtDate(String crtDate) {
            this.crtDate = crtDate;
        }

        public String getCrtOrgCode() {
            return crtOrgCode;
        }

        public void setCrtOrgCode(String crtOrgCode) {
            this.crtOrgCode = crtOrgCode;
        }

        public String getCrtUserCode() {
            return crtUserCode;
        }

        public void setCrtUserCode(String crtUserCode) {
            this.crtUserCode = crtUserCode;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public String getDetailsUrl() {
            return detailsUrl;
        }

        public void setDetailsUrl(String detailsUrl) {
            this.detailsUrl = detailsUrl;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIsCollect() {
            return isCollect;
        }

        public void setIsCollect(String isCollect) {
            this.isCollect = isCollect;
        }

        public String getIsComment() {
            return isComment;
        }

        public void setIsComment(String isComment) {
            this.isComment = isComment;
        }

        public String getIsDispAdver() {
            return isDispAdver;
        }

        public void setIsDispAdver(String isDispAdver) {
            this.isDispAdver = isDispAdver;
        }

        public String getIsExternal() {
            return isExternal;
        }

        public void setIsExternal(String isExternal) {
            this.isExternal = isExternal;
        }

        public String getIsRecoLabel() {
            return isRecoLabel;
        }

        public void setIsRecoLabel(String isRecoLabel) {
            this.isRecoLabel = isRecoLabel;
        }

        public String getIsSVideo() {
            return isSVideo;
        }

        public void setIsSVideo(String isSVideo) {
            this.isSVideo = isSVideo;
        }

        public String getIsTop() {
            return isTop;
        }

        public void setIsTop(String isTop) {
            this.isTop = isTop;
        }

        public String getIsVote() {
            return isVote;
        }

        public void setIsVote(String isVote) {
            this.isVote = isVote;
        }

        public String getIssueTime() {
            return issueTime;
        }

        public void setIssueTime(String issueTime) {
            this.issueTime = issueTime;
        }

        public String getIssueTimeStamp() {
            return issueTimeStamp;
        }

        public void setIssueTimeStamp(String issueTimeStamp) {
            this.issueTimeStamp = issueTimeStamp;
        }

        public String getLikeCount() {
            return likeCount;
        }

        public void setLikeCount(String likeCount) {
            this.likeCount = likeCount;
        }

        public String getLivecastUrl() {
            return livecastUrl;
        }

        public void setLivecastUrl(String livecastUrl) {
            this.livecastUrl = livecastUrl;
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

        public String getNewsKeyword() {
            return newsKeyword;
        }

        public void setNewsKeyword(String newsKeyword) {
            this.newsKeyword = newsKeyword;
        }

        public String getNewsLabel() {
            return newsLabel;
        }

        public void setNewsLabel(String newsLabel) {
            this.newsLabel = newsLabel;
        }

        public String getNewsMan() {
            return newsMan;
        }

        public void setNewsMan(String newsMan) {
            this.newsMan = newsMan;
        }

        public String getNewsNo() {
            return newsNo;
        }

        public void setNewsNo(String newsNo) {
            this.newsNo = newsNo;
        }

        public String getNewsSrc() {
            return newsSrc;
        }

        public void setNewsSrc(String newsSrc) {
            this.newsSrc = newsSrc;
        }

        public String getNewsTitle() {
            return newsTitle;
        }

        public void setNewsTitle(String newsTitle) {
            this.newsTitle = newsTitle;
        }

        public String getNewsType() {
            return newsType;
        }

        public void setNewsType(String newsType) {
            this.newsType = newsType;
        }

        public String getPageFile() {
            return pageFile;
        }

        public void setPageFile(String pageFile) {
            this.pageFile = pageFile;
        }

        public String getPageUrl() {
            return pageUrl;
        }

        public void setPageUrl(String pageUrl) {
            this.pageUrl = pageUrl;
        }

        public String getShowForm() {
            return showForm;
        }

        public void setShowForm(String showForm) {
            this.showForm = showForm;
        }

        public String getSpecType() {
            return specType;
        }

        public void setSpecType(String specType) {
            this.specType = specType;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getTemplId() {
            return templId;
        }

        public void setTemplId(String templId) {
            this.templId = templId;
        }

        public String getThumFile() {
            return thumFile;
        }

        public void setThumFile(String thumFile) {
            this.thumFile = thumFile;
        }

        public String getThumUrl() {
            return thumUrl;
        }

        public void setThumUrl(String thumUrl) {
            this.thumUrl = thumUrl;
        }

        public String getTimeDif() {
            return timeDif;
        }

        public void setTimeDif(String timeDif) {
            this.timeDif = timeDif;
        }

        public String getUpdDate() {
            return updDate;
        }

        public void setUpdDate(String updDate) {
            this.updDate = updDate;
        }

        public String getUpdOrgCode() {
            return updOrgCode;
        }

        public void setUpdOrgCode(String updOrgCode) {
            this.updOrgCode = updOrgCode;
        }

        public String getUpdUserCode() {
            return updUserCode;
        }

        public void setUpdUserCode(String updUserCode) {
            this.updUserCode = updUserCode;
        }

        public String getVideoFile() {
            return videoFile;
        }

        public void setVideoFile(String videoFile) {
            this.videoFile = videoFile;
        }

        public String getVideoTime() {
            return videoTime;
        }

        public void setVideoTime(String videoTime) {
            this.videoTime = videoTime;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public String getViewCount() {
            return viewCount;
        }

        public void setViewCount(String viewCount) {
            this.viewCount = viewCount;
        }

        public String getWhetherLike() {
            return whetherLike;
        }

        public void setWhetherLike(String whetherLike) {
            this.whetherLike = whetherLike;
        }

        public List<String> getMPictures() {
            return mPictures;
        }

        public void setMPictures(List<String> mPictures) {
            this.mPictures = mPictures;
        }
    }

    public static class UserInfoBean {
        /**
         * petName : string
         * profilePhoto : string
         * userId : string
         */

        private String petName;
        private String profilePhoto;
        private String userId;

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

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}
