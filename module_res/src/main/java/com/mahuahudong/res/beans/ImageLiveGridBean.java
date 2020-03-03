package com.mahuahudong.res.beans;

import java.io.Serializable;

public class ImageLiveGridBean implements Serializable {
    /**
     * attachType : 1
     * attachUrl : http://dev-rgw.zhcs.csbtv.com/zhcs/images/642373786263490560.gif
     * pageUrl :
     */

    private String attachType;
    private String attachUrl;
    private String pageUrl;

    public String getAttachType() {
        return attachType;
    }

    public void setAttachType(String attachType) {
        this.attachType = attachType;
    }

    public String getAttachUrl() {
        return attachUrl;
    }

    public void setAttachUrl(String attachUrl) {
        this.attachUrl = attachUrl;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }
}
