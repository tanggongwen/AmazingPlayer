package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class ColumnBean implements Serializable{

    /**
     * bookMarkList : []
     * children : []
     * columnCode : 1111111111
     * columnDesc :
     * columnId : 000000000000000002
     * columnName : 推荐
     * columnPicName :
     * columnPicUrl :
     * columnType : 1
     * crtDate : 2019-10-23  00:00:00
     * crtOrgCode :
     * crtUserCode : admin
     * id : 000000000000000002
     * isDefault : 1
     * isFocusPict : 2
     * isSort : 1
     * pColumnId : 000000000000000001
     * path : /000000000000000001/000000000000000002
     * rank : 2
     * seq : 1
     * status : 1
     * updDate : 2019-10-31  00:00:00
     * updOrgCode :
     * updUserCode : admin
     */

    private String columnCode;
    private String columnDesc;
    private String columnId;
    private String columnName;
    private String columnPicName;
    private String columnPicUrl;
    private String columnType;
    private String crtDate;
    private String crtOrgCode;
    private String crtUserCode;
    private String id;
    private String isDefault;
    private String isFocusPict;
    private String isSort;
    private String pColumnId;
    private String path;
    private int rank;
    private String seq;
    private String status;
    private String updDate;
    private String updOrgCode;
    private String updUserCode;
    private List<Markbean> bookMarkList;
    private List<ColumnBean> children;

    public String getColumnCode() {
        return columnCode;
    }

    public void setColumnCode(String columnCode) {
        this.columnCode = columnCode;
    }

    public String getColumnDesc() {
        return columnDesc;
    }

    public void setColumnDesc(String columnDesc) {
        this.columnDesc = columnDesc;
    }

    public String getColumnId() {
        return columnId;
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnPicName() {
        return columnPicName;
    }

    public void setColumnPicName(String columnPicName) {
        this.columnPicName = columnPicName;
    }

    public String getColumnPicUrl() {
        return columnPicUrl;
    }

    public void setColumnPicUrl(String columnPicUrl) {
        this.columnPicUrl = columnPicUrl;
    }

    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    public String getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(String crtDate) {
        this.crtDate = crtDate;
    }

    public String getCrtOrgCode() {
        return crtOrgCode;
    }

    public void setCrtOrgCode(String crtOrgCode) {
        this.crtOrgCode = crtOrgCode;
    }

    public String getCrtUserCode() {
        return crtUserCode;
    }

    public void setCrtUserCode(String crtUserCode) {
        this.crtUserCode = crtUserCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    public String getIsFocusPict() {
        return isFocusPict;
    }

    public void setIsFocusPict(String isFocusPict) {
        this.isFocusPict = isFocusPict;
    }

    public String getIsSort() {
        return isSort;
    }

    public void setIsSort(String isSort) {
        this.isSort = isSort;
    }

    public String getPColumnId() {
        return pColumnId;
    }

    public void setPColumnId(String pColumnId) {
        this.pColumnId = pColumnId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdDate() {
        return updDate;
    }

    public void setUpdDate(String updDate) {
        this.updDate = updDate;
    }

    public String getUpdOrgCode() {
        return updOrgCode;
    }

    public void setUpdOrgCode(String updOrgCode) {
        this.updOrgCode = updOrgCode;
    }

    public String getUpdUserCode() {
        return updUserCode;
    }

    public void setUpdUserCode(String updUserCode) {
        this.updUserCode = updUserCode;
    }

    public List<Markbean> getBookMarkList() {
        return bookMarkList;
    }

    public void setBookMarkList(List<Markbean> bookMarkList) {
        this.bookMarkList = bookMarkList;
    }

    public List<ColumnBean> getChildren() {
        return children;
    }

    public void setChildren(List<ColumnBean> children) {
        this.children = children;
    }

}
