package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.Date;

public class Markbean implements Serializable {
    public class NColumnBookmark implements Serializable {
        /**
         * 书签ID(BOOKMARK_ID,VARCHAR,36)
         */
        private String bookmarkId;

        /**
         * 栏目ID(COLUMN_ID,VARCHAR,36)
         */
        private String columnId;

        /**
         * 书签名称(BOOKMARK_NAME,VARCHAR,100)
         */
        private String bookmarkName;

        /**
         * 缩略图文件名(THUM_FILE,VARCHAR,100)
         */
        private String thumFile;

        /**
         * 缩略图URL：缩略图，即封面。(THUM_URL,VARCHAR,255)
         */
        private String thumUrl;

        /**
         * 跳转URL(SKIP_URL,VARCHAR,255)
         */
        private String skipUrl;

        /**
         * 排序号(SEQ,INTEGER,10)
         */
        private Integer seq;

        /**
         * 创建人(CRT_USER_CODE,VARCHAR,36)
         */
        private String crtUserCode;

        /**
         * 创建机构(CRT_ORG_CODE,VARCHAR,36)
         */
        private String crtOrgCode;

        /**
         * 创建日期(CRT_DATE,DATE,10)
         */
        private Date crtDate;

        /**
         * 修改人(UPD_USER_CODE,VARCHAR,36)
         */
        private String updUserCode;

        /**
         * 修改机构(UPD_ORG_CODE,VARCHAR,36)
         */
        private String updOrgCode;

        /**
         * 修改日期(UPD_DATE,DATE,10)
         */
        private Date updDate;

        private static final long serialVersionUID = 1L;


        public String getId() {
            return this.bookmarkId;
        }

        public void setId(String bookmarkId) {
            this.bookmarkId = bookmarkId == null ? null : bookmarkId.trim();
        }

        public String getBookmarkId() {
            return bookmarkId;
        }

        public void setBookmarkId(String bookmarkId) {
            this.bookmarkId = bookmarkId == null ? null : bookmarkId.trim();
        }

        public String getColumnId() {
            return columnId;
        }

        public void setColumnId(String columnId) {
            this.columnId = columnId == null ? null : columnId.trim();
        }

        public String getBookmarkName() {
            return bookmarkName;
        }

        public void setBookmarkName(String bookmarkName) {
            this.bookmarkName = bookmarkName == null ? null : bookmarkName.trim();
        }

        public String getThumFile() {
            return thumFile;
        }

        public void setThumFile(String thumFile) {
            this.thumFile = thumFile == null ? null : thumFile.trim();
        }

        public String getThumUrl() {
            return thumUrl;
        }

        public void setThumUrl(String thumUrl) {
            this.thumUrl = thumUrl == null ? null : thumUrl.trim();
        }

        public String getSkipUrl() {
            return skipUrl;
        }

        public void setSkipUrl(String skipUrl) {
            this.skipUrl = skipUrl == null ? null : skipUrl.trim();
        }

        public Integer getSeq() {
            return seq;
        }

        public void setSeq(Integer seq) {
            this.seq = seq;
        }

        public String getCrtUserCode() {
            return crtUserCode;
        }

        public void setCrtUserCode(String crtUserCode) {
            this.crtUserCode = crtUserCode == null ? null : crtUserCode.trim();
        }

        public String getCrtOrgCode() {
            return crtOrgCode;
        }

        public void setCrtOrgCode(String crtOrgCode) {
            this.crtOrgCode = crtOrgCode == null ? null : crtOrgCode.trim();
        }

        public Date getCrtDate() {
            return crtDate;
        }

        public void setCrtDate(Date crtDate) {
            this.crtDate = crtDate;
        }

        public String getUpdUserCode() {
            return updUserCode;
        }

        public void setUpdUserCode(String updUserCode) {
            this.updUserCode = updUserCode == null ? null : updUserCode.trim();
        }

        public String getUpdOrgCode() {
            return updOrgCode;
        }

        public void setUpdOrgCode(String updOrgCode) {
            this.updOrgCode = updOrgCode == null ? null : updOrgCode.trim();
        }

        public Date getUpdDate() {
            return updDate;
        }

        public void setUpdDate(Date updDate) {
            this.updDate = updDate;
        }

    }
}
