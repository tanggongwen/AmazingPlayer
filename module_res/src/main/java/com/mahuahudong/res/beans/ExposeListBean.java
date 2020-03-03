package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class ExposeListBean implements Serializable {
    /**
     * attaches : [{"attachFile":"fsd","attachId":"1","attachType":"1","attachUrl":"fsd","crtDate":null,"crtOrgCode":null,"crtUserCode":null,"id":"1","status":null,"tipoffId":"1","updDate":null,"updOrgCode":null,"updUserCode":null}]
     * crtDate : null
     * crtOrgCode : null
     * crtUserCode : null
     * id : 1
     * status : 1
     * tipoffAddr : dfsa
     * tipoffContent : dfasfas
     * tipoffDate : 2019-11-01 20:17:32
     * tipoffId : 1
     * tipoffTitle : 3rwe
     * tipoffUserId : 638679886042632192
     * tipoffUserName : sdfsa
     * updDate : null
     * updOrgCode : null
     * updUserCode : null
     * userMobile : 18684711216
     */

    private Object crtDate;
    private Object crtOrgCode;
    private Object crtUserCode;
    private String id;
    private String status;
    private String tipoffAddr;
    private String tipoffContent;
    private String tipoffDate;
    private String tipoffId;
    private String tipoffTitle;
    private String tipoffUserId;
    private String tipoffUserName;
    private Object updDate;
    private Object updOrgCode;
    private Object updUserCode;
    private String userMobile;
    private List<ExposeExtraBean> attaches;

    public Object getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(Object crtDate) {
        this.crtDate = crtDate;
    }

    public Object getCrtOrgCode() {
        return crtOrgCode;
    }

    public void setCrtOrgCode(Object crtOrgCode) {
        this.crtOrgCode = crtOrgCode;
    }

    public Object getCrtUserCode() {
        return crtUserCode;
    }

    public void setCrtUserCode(Object crtUserCode) {
        this.crtUserCode = crtUserCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipoffAddr() {
        return tipoffAddr;
    }

    public void setTipoffAddr(String tipoffAddr) {
        this.tipoffAddr = tipoffAddr;
    }

    public String getTipoffContent() {
        return tipoffContent;
    }

    public void setTipoffContent(String tipoffContent) {
        this.tipoffContent = tipoffContent;
    }

    public String getTipoffDate() {
        return tipoffDate;
    }

    public void setTipoffDate(String tipoffDate) {
        this.tipoffDate = tipoffDate;
    }

    public String getTipoffId() {
        return tipoffId;
    }

    public void setTipoffId(String tipoffId) {
        this.tipoffId = tipoffId;
    }

    public String getTipoffTitle() {
        return tipoffTitle;
    }

    public void setTipoffTitle(String tipoffTitle) {
        this.tipoffTitle = tipoffTitle;
    }

    public String getTipoffUserId() {
        return tipoffUserId;
    }

    public void setTipoffUserId(String tipoffUserId) {
        this.tipoffUserId = tipoffUserId;
    }

    public String getTipoffUserName() {
        return tipoffUserName;
    }

    public void setTipoffUserName(String tipoffUserName) {
        this.tipoffUserName = tipoffUserName;
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

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public List<ExposeExtraBean> getAttaches() {
        return attaches;
    }

    public void setAttaches(List<ExposeExtraBean> attaches) {
        this.attaches = attaches;
    }
}
