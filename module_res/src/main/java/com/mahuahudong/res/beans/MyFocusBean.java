package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class MyFocusBean implements Serializable {

    /**
     * code : 200
     * list : {"total":"1","rows":[{"id":"1","lid":"1","name":"不错哦","avatar":null,"addtime":"2020-04-14 17:33:35"}]}
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

    public static class ListBean implements Serializable{
        /**
         * total : 1
         * rows : [{"id":"1","lid":"1","name":"不错哦","avatar":null,"addtime":"2020-04-14 17:33:35"}]
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
             * lid : 1
             * name : 不错哦
             * avatar : null
             * addtime : 2020-04-14 17:33:35
             */

            private String id;
            private String lid;
            private String name;
            private String avatar;
            private String addtime;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getLid() {
                return lid;
            }

            public void setLid(String lid) {
                this.lid = lid;
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

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }
        }
    }
}
