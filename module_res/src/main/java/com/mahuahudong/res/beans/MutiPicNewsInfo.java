package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class MutiPicNewsInfo implements Serializable {

    /**
     * commentCount : 14
     * detailsUrl :
     * isCollect :
     * isComment :
     * isExternal :
     * isSVideo :
     * issueTimeStamp : 1573110623
     * likeCount : 0
     * mPictures : ["http://dev-rgw.zhcs.csbtv.com/zhcs/images/642018521999609856.jpg","http://dev-rgw.zhcs.csbtv.com/zhcs/images/642018536813891584.jpg","http://dev-rgw.zhcs.csbtv.com/zhcs/images/642018547484200960.jpg"]
     * mutiPicData : [{"content":"先来说说风光ix7的外观造型吧。新车使用了最新家族化设计语言，前脸采用了满天星式中网格栅设计，搭配两侧犀利且狭长的大灯组，看上去非常时尚大气。车头下方的\"L\"型折线设计很好地划分了区域，两侧的LED雾灯用一条镀铬饰条连接，层次很分明。","seq":0,"thumUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642018521999609856.jpg"},{"content":"如果说看前脸还不能显示出风光ix7的贵重大气，那么来到车身侧面，ix7看起来则特别厚重大气，长达近5米的车身透露着一种探险者这类中大型SUV的霸气。具体细节部分，风光ix7车身侧面采用了多腰线设计，车窗采用银色镀铬进行勾勒，轮眉线条延伸至车尾，营造出了很强的力量感。","seq":0,"thumUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642018536813891584.jpg"},{"content":"近两年，在消费升级和二胎政策的双重作用下，中型和中大型SUV市场表现出了空前繁荣。在市场驱动下，最近两年无论合资还是自主品牌，纷纷将触角深入B级SUV市场，市场上也因此诞生了一大批中大型SUV新产品，如荣威RX8、传祺GS8等等。","seq":0,"thumUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/642018547484200960.jpg"}]
     * newsBrief : 车长5米7座布局，试驾后列几条“鄙视”汉兰达的理由
     * newsId : 638334337808470016
     * newsSrc : 智慧长沙
     * newsTitle : 车长5米7座布局，试驾后列几条“鄙视”汉兰达的理由
     * newsType : 7
     * pageUrl :
     * shareH5 : https://baike.baidu.com/item/%E6%99%BA%E6%85%A7%E9%95%BF%E6%B2%99/19250827?fr=aladdin
     * shareImg : http://dev-rgw.zhcs.csbtv.com/zhcs/images/636968283924467712.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3148706673&Signature=JrAQe7gwV%2BSIQ8f04PEN7u1SJNU%3D
     * shareText : 智慧长沙app是一款由长沙广电正全力打造的最具本土影响力的新闻APP，通过智慧长沙app你可以轻松快速了解长沙市区最新新闻动态，提供电台直播、生活服务、缴费、智能交通、停车宝、星城圈等便民服务。
     * showForm :
     * tag : 0
     * timeDif : 1223344
     * videoTime :
     * videoUrl :
     * viewCount : 7102
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
    private List<String> mPictures;
    private List<MutiPicDataBean> mutiPicData;

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

    public List<MutiPicDataBean> getMutiPicData() {
        return mutiPicData;
    }

    public void setMutiPicData(List<MutiPicDataBean> mutiPicData) {
        this.mutiPicData = mutiPicData;
    }

    public static class MutiPicDataBean implements Serializable {
        /**
         * content : 先来说说风光ix7的外观造型吧。新车使用了最新家族化设计语言，前脸采用了满天星式中网格栅设计，搭配两侧犀利且狭长的大灯组，看上去非常时尚大气。车头下方的"L"型折线设计很好地划分了区域，两侧的LED雾灯用一条镀铬饰条连接，层次很分明。
         * seq : 0
         * thumUrl : http://dev-rgw.zhcs.csbtv.com/zhcs/images/642018521999609856.jpg
         */

        private String content;
        private int seq;
        private String thumUrl;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getSeq() {
            return seq;
        }

        public void setSeq(int seq) {
            this.seq = seq;
        }

        public String getThumUrl() {
            return thumUrl;
        }

        public void setThumUrl(String thumUrl) {
            this.thumUrl = thumUrl;
        }
    }
}
