package com.mahuahudong.res.beans;

import java.io.Serializable;

public class ProductDetailBean implements Serializable {

    /**
     * buyUrl : dfds
     * consultTel : 123242432
     * pageUrl : https://pics2.baidu.com/feed/42166d224f4a20a436dbf106545f9624730ed03a.jpeg?token=65039c4147e73e0e7d3fca3dd3c92935&s=920A63E802730D967B68B108030030D3
     * prdContent : 法律产品测试
     * prdDesc : 法律产品测试
     * prdForm : 政法在线
     * prdId : 1
     * prdName : 法律产品测试
     * prdShow : 呈现形式
     * srvTerm : 1年
     */

    private String buyUrl;
    private String consultTel;
    private String pageUrl;
    private String prdContent;
    private String prdDesc;
    private String prdForm;
    private String prdId;
    private String prdName;
    private String prdShow;
    private String srvTerm;

    public String getBuyUrl() {
        return buyUrl;
    }

    public void setBuyUrl(String buyUrl) {
        this.buyUrl = buyUrl;
    }

    public String getConsultTel() {
        return consultTel;
    }

    public void setConsultTel(String consultTel) {
        this.consultTel = consultTel;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getPrdContent() {
        return prdContent;
    }

    public void setPrdContent(String prdContent) {
        this.prdContent = prdContent;
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    public String getPrdForm() {
        return prdForm;
    }

    public void setPrdForm(String prdForm) {
        this.prdForm = prdForm;
    }

    public String getPrdId() {
        return prdId;
    }

    public void setPrdId(String prdId) {
        this.prdId = prdId;
    }

    public String getPrdName() {
        return prdName;
    }

    public void setPrdName(String prdName) {
        this.prdName = prdName;
    }

    public String getPrdShow() {
        return prdShow;
    }

    public void setPrdShow(String prdShow) {
        this.prdShow = prdShow;
    }

    public String getSrvTerm() {
        return srvTerm;
    }

    public void setSrvTerm(String srvTerm) {
        this.srvTerm = srvTerm;
    }
}
