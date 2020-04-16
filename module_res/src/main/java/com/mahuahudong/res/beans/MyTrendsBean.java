package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class MyTrendsBean implements Serializable {

    /**
     * code : 200
     * list : {"total":"1","rows":[{"id":"1","uid":"1","name":"不错哦","avatar":"xxx.png","content":"测测测测测","created_at":"2020-04-14 17:33:35"}]}
     */

    private String code;
    private ListBean list;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListBean getList() {
        return list;
    }

    public void setList(ListBean list) {
        this.list = list;
    }

    public static class ListBean {
        /**
         * total : 1
         * rows : [{"id":"1","uid":"1","name":"不错哦","avatar":"xxx.png","content":"测测测测测","created_at":"2020-04-14 17:33:35"}]
         */

        private String total;
        private List<RowsBean> rows;

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
            /**
             * id : 1
             * uid : 1
             * name : 不错哦
             * avatar : xxx.png
             * content : 测测测测测
             * created_at : 2020-04-14 17:33:35
             */

            private String id;
            private String uid;
            private String name;
            private String avatar;
            private String content;
            private String created_at;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getCreated_at() {
                return created_at;
            }

            public void setCreated_at(String created_at) {
                this.created_at = created_at;
            }
        }
    }
}
