package com.mahuahudong.res.beans;

import java.io.Serializable;

public class LiveProgramChildBean implements Serializable {

    /**
     * isNew :
     * newsId : 641591223290826752
     * newsTitle : 郎朗错位图引网友爆笑 被大提琴挡住似穿抹胸长裙
     */

    private String isNew;
    private String newsId;
    private String newsTitle;

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
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
}
