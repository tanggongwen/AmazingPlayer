package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class LiveStationColumnBean implements Serializable {

    /**
     * colVO : {"columnDesc":"","columnId":"634125710499385344","columnName":"声音日志"}
     * listForm : 2
     * proLs : [{"announcer":"","mediaCount":0,"progBrief":"12313","progId":"638787450113757184","progName":"测试1111","skipType":"","skipUrl":"","thumUrl":"http://dev-rgw.zhcs.csbtv.com/zhcs/images/638787445852344320.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149140395&Signature=%2FQ%2Bsn56a8%2Ba3xSB%2FlmWPFEXcse8%3D"}]
     */

    private ColVOBean colVO;
    private String listForm;
    private List<ProLsBean> proLs;

    public ColVOBean getColVO() {
        return colVO;
    }

    public void setColVO(ColVOBean colVO) {
        this.colVO = colVO;
    }

    public String getListForm() {
        return listForm;
    }

    public void setListForm(String listForm) {
        this.listForm = listForm;
    }

    public List<ProLsBean> getProLs() {
        return proLs;
    }

    public void setProLs(List<ProLsBean> proLs) {
        this.proLs = proLs;
    }

    public static class ColVOBean implements Serializable{
        /**
         * columnDesc :
         * columnId : 634125710499385344
         * columnName : 声音日志
         */

        private String columnDesc;
        private String columnId;
        private String columnName;
        private String columnPicUrl;

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

        public String getColumnPicUrl() {
            return columnPicUrl;
        }

        public void setColumnPicUrl(String columnPicUrl) {
            this.columnPicUrl = columnPicUrl;
        }
    }

    public static class ProLsBean implements Serializable {
        /**
         * announcer :
         * mediaCount : 0
         * progBrief : 12313
         * progId : 638787450113757184
         * progName : 测试1111
         * skipType :
         * skipUrl :
         * thumUrl : http://dev-rgw.zhcs.csbtv.com/zhcs/images/638787445852344320.jpg?AWSAccessKeyId=W665ISTJ7KL08YZ4Z66I&Expires=3149140395&Signature=%2FQ%2Bsn56a8%2Ba3xSB%2FlmWPFEXcse8%3D
         */

        private String announcer;
        private int mediaCount;
        private String progBrief;
        private String progId;
        private String progName;
        private String skipType;
        private String skipUrl;
        private String thumUrl;

        public String getAnnouncer() {
            return announcer;
        }

        public void setAnnouncer(String announcer) {
            this.announcer = announcer;
        }

        public int getMediaCount() {
            return mediaCount;
        }

        public void setMediaCount(int mediaCount) {
            this.mediaCount = mediaCount;
        }

        public String getProgBrief() {
            return progBrief;
        }

        public void setProgBrief(String progBrief) {
            this.progBrief = progBrief;
        }

        public String getProgId() {
            return progId;
        }

        public void setProgId(String progId) {
            this.progId = progId;
        }

        public String getProgName() {
            return progName;
        }

        public void setProgName(String progName) {
            this.progName = progName;
        }

        public String getSkipType() {
            return skipType;
        }

        public void setSkipType(String skipType) {
            this.skipType = skipType;
        }

        public String getSkipUrl() {
            return skipUrl;
        }

        public void setSkipUrl(String skipUrl) {
            this.skipUrl = skipUrl;
        }

        public String getThumUrl() {
            return thumUrl;
        }

        public void setThumUrl(String thumUrl) {
            this.thumUrl = thumUrl;
        }
    }
}
