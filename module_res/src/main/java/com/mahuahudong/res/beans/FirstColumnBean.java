package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FirstColumnBean implements Serializable {

    /**
     * code : 200
     * tab : [{"list_id":"1","list_name":"电影"},{"list_id":"2","list_name":"电视剧"},{"list_id":"3","list_name":"动漫"},{"list_id":"4","list_name":"综艺"},{"list_id":"5","list_name":"微电影"},{"list_id":"6","list_name":"新闻"},{"list_id":"7","list_name":"明星"},{"list_id":"8","list_name":"剧情"},{"list_id":"9","list_name":"演员"},{"list_id":"10","list_name":"角色"},{"list_id":"11","list_name":"专题"},{"list_id":"12","list_name":"节目"},{"list_id":"13","list_name":"直播"},{"list_id":"15","list_name":"最新"},{"list_id":"16","list_name":"榜单"}]
     */

    private String code;
    private ArrayList<TabBean> tab;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<TabBean> getTab() {
        return tab;
    }

    public void setTab(ArrayList<TabBean> tab) {
        this.tab = tab;
    }

    public static class TabBean implements Serializable{
        /**
         * list_id : 1
         * list_name : 电影
         */

        private String list_id;
        private String list_name;

        public String getList_id() {
            return list_id;
        }

        public void setList_id(String list_id) {
            this.list_id = list_id;
        }

        public String getList_name() {
            return list_name;
        }

        public void setList_name(String list_name) {
            this.list_name = list_name;
        }
    }
}
