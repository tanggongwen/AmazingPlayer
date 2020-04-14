package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class LiveListBean implements Serializable {

    /**
     * code : 200
     * list : {"total":12,"row":[{"lid":"1","title":"户外直播","name":"asd","pop":"12000","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"},{"lid":"2","title":"动画","name":"硕大的","pop":"10000","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"},{"lid":"3","title":"真人秀","name":"二位","pop":"7000","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"},{"lid":"4","title":"吃播","name":"放过大","pop":"6666","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"},{"lid":"5","title":"吃播","name":"梵蒂冈","pop":"6666","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"},{"lid":"6","title":"吃播","name":"是打撒","pop":"6666","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"}]}
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
         * total : 12
         * row : [{"lid":"1","title":"户外直播","name":"asd","pop":"12000","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"},{"lid":"2","title":"动画","name":"硕大的","pop":"10000","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"},{"lid":"3","title":"真人秀","name":"二位","pop":"7000","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"},{"lid":"4","title":"吃播","name":"放过大","pop":"6666","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"},{"lid":"5","title":"吃播","name":"梵蒂冈","pop":"6666","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"},{"lid":"6","title":"吃播","name":"是打撒","pop":"6666","pic":"https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png"}]
         */

        private int total;
        private List<LiveRowBean> row;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<LiveRowBean> getRow() {
            return row;
        }

        public void setRow(List<LiveRowBean> row) {
            this.row = row;
        }

        public static class LiveRowBean {
            /**
             * lid : 1
             * title : 户外直播
             * name : asd
             * pop : 12000
             * pic : https://rpic.douyucdn.cn/asrpic/200403/485503_1704.png
             */

            private String lid;
            private String title;
            private String name;
            private String pop;
            private String pic;

            public String getLid() {
                return lid;
            }

            public void setLid(String lid) {
                this.lid = lid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPop() {
                return pop;
            }

            public void setPop(String pop) {
                this.pop = pop;
            }

            public String getPic() {
                return pic;
            }

            public void setPic(String pic) {
                this.pic = pic;
            }
        }
    }
}
