package com.mahuahudong.res.beans;

import com.mahuahudong.res.beans.NewsMapBean.NewsLsBean.ClassicNewsBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VideoMapBean implements Serializable {

    private List<ClassicNewsBean> more;
    private List<ClassicNewsBean> rank;
    private List<ClassicNewsBean> recommend;

    public List<ClassicNewsBean> getMore() {
        return more;
    }

    public void setMore(List<ClassicNewsBean> more) {
        this.more = more;
    }

    public List<ClassicNewsBean> getRank() {
        return rank;
    }

    public void setRank(List<ClassicNewsBean> rank) {
        this.rank = rank;
    }

    public List<ClassicNewsBean> getRecommend() {
        return recommend;
    }

    public void setRecommend(List<ClassicNewsBean> recommend) {
        this.recommend = recommend;
    }

    public static class VideoBean implements Serializable{
        /**
         * commentCount :
         * detailsUrl :
         * isCollect :
         * isComment : 0
         * isExternal :
         * isSVideo : 0
         * issueTimeStamp : 1572335593
         * likeCount :
         * mPictures : ["http://dev-rgw.zhcs.csbtv.com/zhcs/images/638767272697139200.jpg"]
         * newsBrief : 总裁的替嫁新娘：哲宇霸气，一把抱住笑笑，不停安慰她
         * newsId : 638767280104280064
         * newsSrc : 智慧长沙
         * newsTitle : 总裁的替嫁新娘：哲宇霸气，一把抱住笑笑，不停安慰她
         * newsType : 2
         * pageUrl :
         * shareH5 : https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin
         * shareImg : http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D
         * shareText : 智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。
         * showForm :
         * tag : 0
         * timeDif : 1795680
         * videoTime :
         * videoUrl : 总裁的替嫁新娘：哲宇霸气，一把抱住笑笑，不停安慰她
         * viewCount : 7921
         * whetherLike :
         */

        private String commentCount;
        private String detailsUrl;
        private String isCollect;
        private String isComment;
        private String isExternal;
        private String isSVideo;
        private String issueTimeStamp;
        private String likeCount;
        private String newsBrief;
        private String newsId;
        private String newsSrc;
        private String newsTitle;
        private String newsType;
        private String pageUrl;
        private String shareH5;
        private String shareImg;
        private String shareText;
        private String showForm;
        private String tag;
        private String timeDif;
        private String videoTime;
        private String videoUrl;
        private String viewCount;
        private String whetherLike;
        private List<String> mPictures = new ArrayList<>();

        public String getCommentCount() {
            return commentCount;
        }

        public void setCommentCount(String commentCount) {
            this.commentCount = commentCount;
        }

        public String getDetailsUrl() {
            return detailsUrl;
        }

        public void setDetailsUrl(String detailsUrl) {
            this.detailsUrl = detailsUrl;
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

        public String getIsExternal() {
            return isExternal;
        }

        public void setIsExternal(String isExternal) {
            this.isExternal = isExternal;
        }

        public String getIsSVideo() {
            return isSVideo;
        }

        public void setIsSVideo(String isSVideo) {
            this.isSVideo = isSVideo;
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

        public String getPageUrl() {
            return pageUrl;
        }

        public void setPageUrl(String pageUrl) {
            this.pageUrl = pageUrl;
        }

        public String getShareH5() {
            return shareH5;
        }

        public void setShareH5(String shareH5) {
            this.shareH5 = shareH5;
        }

        public String getShareImg() {
            return shareImg;
        }

        public void setShareImg(String shareImg) {
            this.shareImg = shareImg;
        }

        public String getShareText() {
            return shareText;
        }

        public void setShareText(String shareText) {
            this.shareText = shareText;
        }

        public String getShowForm() {
            return showForm;
        }

        public void setShowForm(String showForm) {
            this.showForm = showForm;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getTimeDif() {
            return timeDif;
        }

        public void setTimeDif(String timeDif) {
            this.timeDif = timeDif;
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

}
