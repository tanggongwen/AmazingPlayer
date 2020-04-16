package com.mahuahudong.res.beans;

import java.io.Serializable;

public class MyTrendReqBean implements Serializable {
    private String size;
    private String page;
    private String lid;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }
}
