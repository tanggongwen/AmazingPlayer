package com.mahuahudong.res.beans;

import java.io.Serializable;

public class UpdateBean implements Serializable {

    /**
     * downPath : /path
     * isNew : 1
     * isUpdate : 1
     * termType : 1
     * verDesc : 智慧长沙4.0
     * verId : 1
     * verName : v4.0
     * verNo : V4.0
     */

    private String downPath;
    private String isNew;
    private String isUpdate;
    private String termType;
    private String verDesc;
    private String verId;
    private String verName;
    private String verNo;

    public String getDownPath() {
        return downPath;
    }

    public void setDownPath(String downPath) {
        this.downPath = downPath;
    }

    public String getIsNew() {
        return isNew;
    }

    public void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public String getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(String isUpdate) {
        this.isUpdate = isUpdate;
    }

    public String getTermType() {
        return termType;
    }

    public void setTermType(String termType) {
        this.termType = termType;
    }

    public String getVerDesc() {
        return verDesc;
    }

    public void setVerDesc(String verDesc) {
        this.verDesc = verDesc;
    }

    public String getVerId() {
        return verId;
    }

    public void setVerId(String verId) {
        this.verId = verId;
    }

    public String getVerName() {
        return verName;
    }

    public void setVerName(String verName) {
        this.verName = verName;
    }

    public String getVerNo() {
        return verNo;
    }

    public void setVerNo(String verNo) {
        this.verNo = verNo;
    }
}
