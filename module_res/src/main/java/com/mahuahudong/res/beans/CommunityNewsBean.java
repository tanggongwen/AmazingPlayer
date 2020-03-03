package com.mahuahudong.res.beans;

import com.mahuahudong.res.beans.NewsMapBean.NewsLsBean.ClassicNewsBean;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;

public class CommunityNewsBean implements Serializable {
    private CopyOnWriteArrayList<ClassicNewsBean> myNews;
    private CopyOnWriteArrayList<ClassicNewsBean> allNews;

    public CopyOnWriteArrayList<ClassicNewsBean> getAllNews() {
        return allNews;
    }

    public void setAllNews(CopyOnWriteArrayList<ClassicNewsBean> allNews) {
        this.allNews = allNews;
    }

    public CopyOnWriteArrayList<ClassicNewsBean> getMyNews() {
        return myNews;
    }

    public void setMyNews(CopyOnWriteArrayList<ClassicNewsBean> myNews) {
        this.myNews = myNews;
    }
}
