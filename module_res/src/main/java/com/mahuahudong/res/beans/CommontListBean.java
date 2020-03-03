package com.mahuahudong.res.beans;

import java.io.Serializable;

public class CommontListBean implements Serializable {
    /**
     * cancelThTime : null
     * crtDate : null
     * crtOrgCode : null
     * crtUserCode : 18684711216
     * discussContent : 但是风飒
     * discussId : 1
     * id : 1
     * newsId : 636959947829153792
     * newsTitle : 互联网大会
     * status : 1
     * thumbUpTime : null
     * updDate : null
     * updOrgCode : null
     * updUserCode : null
     */

    private Object cancelThTime;
    private String crtDate;
    private Object crtOrgCode;
    private String crtUserCode;
    private String discussContent;
    private String discussId;
    private String id;
    private String newsId;
    private String newsTitle;
    private String status;
    private int thumbUpTime;
    private Object updDate;
    private Object updOrgCode;
    private Object updUserCode;
    private NewsListBean commentedNews;
    private String hasLike;

    public Object getCancelThTime() {
        return cancelThTime;
    }

    public void setCancelThTime(Object cancelThTime) {
        this.cancelThTime = cancelThTime;
    }

    public String getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(String crtDate) {
        this.crtDate = crtDate;
    }

    public Object getCrtOrgCode() {
        return crtOrgCode;
    }

    public void setCrtOrgCode(Object crtOrgCode) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getThumbUpTime() {
        return thumbUpTime;
    }

    public void setThumbUpTime(int thumbUpTime) {
        this.thumbUpTime = thumbUpTime;
    }

    public Object getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Object updDate) {
        this.updDate = updDate;
    }

    public Object getUpdOrgCode() {
        return updOrgCode;
    }

    public void setUpdOrgCode(Object updOrgCode) {
        this.updOrgCode = updOrgCode;
    }

    public Object getUpdUserCode() {
        return updUserCode;
    }

    public void setUpdUserCode(Object updUserCode) {
        this.updUserCode = updUserCode;
    }

    public NewsListBean getCommentedNews() {
        return commentedNews;
    }

    public void setCommentedNews(NewsListBean commentedNews) {
        this.commentedNews = commentedNews;
    }

    public String getHasLike() {
        return hasLike;
    }

    public void setHasLike(String hasLike) {
        this.hasLike = hasLike;
    }
}
