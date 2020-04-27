package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class ReplyRespBean implements Serializable {

    /**
     * code : 200
     * list : {"total":"1","rows":[{"id":"1","userid":"1","nickname":"不错哦","tid":"1","addtime":"2020-04-14 17:33:35","content":"撒旦法师法"}]}
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
         * rows : [{"id":"1","userid":"1","nickname":"不错哦","tid":"1","addtime":"2020-04-14 17:33:35","content":"撒旦法师法"}]
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
             * userid : 1
             * nickname : 不错哦
             * tid : 1
             * addtime : 2020-04-14 17:33:35
             * content : 撒旦法师法
             */

            private String id;
            private String userid;
            private String nickname;
            private String tid;
            private String addtime;
            private String content;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUserid() {
                return userid;
            }

            public void setUserid(String userid) {
                this.userid = userid;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getTid() {
                return tid;
            }

            public void setTid(String tid) {
                this.tid = tid;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }
    }
}
