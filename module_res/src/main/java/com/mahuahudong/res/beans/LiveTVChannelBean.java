package com.mahuahudong.res.beans;

import java.io.Serializable;

public class LiveTVChannelBean implements Serializable {

    /**
     * thumUrl : http://dev-rgw.zhcs.csbtv.com/zhcs/images/640128024511123456.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149460014&Signature=eFlLEpUvTzW3tWk8o3HwPK4YLuo%3D
     * tvBrief : 这里是长沙新闻频道
     * tvId : 637670102577319936
     * tvName : 长沙新闻频道
     * tvUrl : http://web.guangdianyun.tv/tv/?id=346
     */

    private String thumUrl;
    private String tvBrief;
    private String tvId;
    private String tvName;
    private String tvUrl;

    public String getThumUrl() {
        return thumUrl;
    }

    public void setThumUrl(String thumUrl) {
        this.thumUrl = thumUrl;
    }

    public String getTvBrief() {
        return tvBrief;
    }

    public void setTvBrief(String tvBrief) {
        this.tvBrief = tvBrief;
    }

    public String getTvId() {
        return tvId;
    }

    public void setTvId(String tvId) {
        this.tvId = tvId;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public String getTvUrl() {
        return tvUrl;
    }

    public void setTvUrl(String tvUrl) {
        this.tvUrl = tvUrl;
    }
}
