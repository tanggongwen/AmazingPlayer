package com.mahuahudong.res.beans;

import java.io.Serializable;

public class VideoHomeReqBean implements Serializable {
    private String pid;
    private String page;
    private String size;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

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
