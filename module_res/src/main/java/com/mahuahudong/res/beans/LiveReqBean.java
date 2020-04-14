package com.mahuahudong.res.beans;

import java.io.Serializable;

public class LiveReqBean implements Serializable {
    private String page;
    private String size;


    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
