package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class MissionDetailBean implements Serializable {


    /**
     * ls : [{"crtDate":"2020-01-07 11:41:12","oneOpPoint":1,"taskActiTitle":"每日签到"},{"crtDate":"2020-01-07 11:10:29","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 10:05:34","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:56:25","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:55:49","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:54:32","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:40:19","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:39:53","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:39:50","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:39:40","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:39:36","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:21:03","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:19:53","oneOpPoint":1,"taskActiTitle":"发表评论"},{"crtDate":"2020-01-07 09:19:30","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:19:18","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:18:13","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:17:36","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"},{"crtDate":"2020-01-07 09:17:30","oneOpPoint":1,"taskActiTitle":"发表评论"},{"crtDate":"2020-01-07 09:17:22","oneOpPoint":1,"taskActiTitle":"阅读文章或视频"}]
     * time : 2020年01月07日
     */

    private String time;
    private List<LsBean> ls;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<LsBean> getLs() {
        return ls;
    }

    public void setLs(List<LsBean> ls) {
        this.ls = ls;
    }

    public static class LsBean {
        /**
         * crtDate : 2020-01-07 11:41:12
         * oneOpPoint : 1
         * taskActiTitle : 每日签到
         */

        private String crtDate;
        private int oneOpPoint;
        private String taskActiTitle;

        public String getCrtDate() {
            return crtDate;
        }

        public void setCrtDate(String crtDate) {
            this.crtDate = crtDate;
        }

        public int getOneOpPoint() {
            return oneOpPoint;
        }

        public void setOneOpPoint(int oneOpPoint) {
            this.oneOpPoint = oneOpPoint;
        }

        public String getTaskActiTitle() {
            return taskActiTitle;
        }

        public void setTaskActiTitle(String taskActiTitle) {
            this.taskActiTitle = taskActiTitle;
        }
    }
}
