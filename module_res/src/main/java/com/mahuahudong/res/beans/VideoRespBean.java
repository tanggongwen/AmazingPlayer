package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class VideoRespBean implements Serializable {

    /**
     * code : 200
     * tab : {"total":"28755","rows":[{"vid":"89402","name":"黑色闪电第一季","aliases":"","actor":"克里斯蒂尼·亚当斯,达蒙·冈普顿,琪娜·安妮·麦克兰","dire":"SalimAkil","score":"3.0","scorer":"9","pop":"3562","pic":"http://pc3.songziwu.com/uploads/vod/2019-07-16/5d2d39c4ee32b.jpg","time":"2019-05-13 10:42:37"},{"vid":"44188","name":"鬼吹灯之黄皮子坟","aliases":"Candle in the Tomb: The Weasel Grave/The tomb of Ghost Blows Out the Light","actor":"阮经天,徐璐,郝好,刘潮,尚铁龙","dire":"管虎,费振翔","score":"5.2","scorer":"27465","pop":"1769","pic":"http://pc3.songziwu.com/uploads/vod/2019-07-15/5d2c2617bbf87.jpg","time":"2019-11-22 09:02:40"},{"vid":"1738","name":"郑和下西洋","aliases":"","actor":"罗嘉良,唐国强,杜雨露","dire":"马骁","score":"8.7","scorer":"20","pop":"238","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c011d93201d2.jpg","time":"2011-09-14 16:09:54"},{"vid":"4802","name":"巴哥正传","aliases":"","actor":"巩汉林,李颖,虞梦,李颖 Ying Li(I)","dire":"英达","score":"6.5","scorer":"528","pop":"5507","pic":"http://pc3.songziwu.com/uploads/vod/2019-03-29/5c9d2fcf20c2b.jpg","time":"2012-05-21 10:14:51"},{"vid":"1537","name":"爸爸闭翳","aliases":"Fathers And Sons/开心老爸","actor":"欧阳震华,王喜,蒙嘉慧,杨怡","dire":"梅小青","score":"7.4","scorer":"3362","pop":"5252","pic":"http://pc3.songziwu.com/uploads/vod/2019-03-29/5c9d308a34c71.jpg","time":"2011-09-14 16:07:08"},{"vid":"1102","name":"谜","aliases":"","actor":"石原里美,山本裕典","dire":"片山修","score":"8.8","scorer":"88","pop":"9950","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c00c3cfb6649.jpg","time":"2011-06-24 18:34:32"}],"rec":[{"vid":"44805","name":"庆余年","aliases":"","pic":"http://ykimg.alicdn.com/develop/image/2020-03-12/c51b8d34cd4a4deaa4714c816042a72e.jpg"},{"vid":"109267","name":"两世欢","aliases":"The Love Lasts Two Minds","pic":"http://pc3.songziwu.com/uploads/vod/2020-02-21/5e4fdc186799b.jpeg"}]}
     */

    private String code;
    private TabBean tab;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public TabBean getTab() {
        return tab;
    }

    public void setTab(TabBean tab) {
        this.tab = tab;
    }

    public static class TabBean implements Serializable{
        /**
         * total : 28755
         * rows : [{"vid":"89402","name":"黑色闪电第一季","aliases":"","actor":"克里斯蒂尼·亚当斯,达蒙·冈普顿,琪娜·安妮·麦克兰","dire":"SalimAkil","score":"3.0","scorer":"9","pop":"3562","pic":"http://pc3.songziwu.com/uploads/vod/2019-07-16/5d2d39c4ee32b.jpg","time":"2019-05-13 10:42:37"},{"vid":"44188","name":"鬼吹灯之黄皮子坟","aliases":"Candle in the Tomb: The Weasel Grave/The tomb of Ghost Blows Out the Light","actor":"阮经天,徐璐,郝好,刘潮,尚铁龙","dire":"管虎,费振翔","score":"5.2","scorer":"27465","pop":"1769","pic":"http://pc3.songziwu.com/uploads/vod/2019-07-15/5d2c2617bbf87.jpg","time":"2019-11-22 09:02:40"},{"vid":"1738","name":"郑和下西洋","aliases":"","actor":"罗嘉良,唐国强,杜雨露","dire":"马骁","score":"8.7","scorer":"20","pop":"238","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c011d93201d2.jpg","time":"2011-09-14 16:09:54"},{"vid":"4802","name":"巴哥正传","aliases":"","actor":"巩汉林,李颖,虞梦,李颖 Ying Li(I)","dire":"英达","score":"6.5","scorer":"528","pop":"5507","pic":"http://pc3.songziwu.com/uploads/vod/2019-03-29/5c9d2fcf20c2b.jpg","time":"2012-05-21 10:14:51"},{"vid":"1537","name":"爸爸闭翳","aliases":"Fathers And Sons/开心老爸","actor":"欧阳震华,王喜,蒙嘉慧,杨怡","dire":"梅小青","score":"7.4","scorer":"3362","pop":"5252","pic":"http://pc3.songziwu.com/uploads/vod/2019-03-29/5c9d308a34c71.jpg","time":"2011-09-14 16:07:08"},{"vid":"1102","name":"谜","aliases":"","actor":"石原里美,山本裕典","dire":"片山修","score":"8.8","scorer":"88","pop":"9950","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c00c3cfb6649.jpg","time":"2011-06-24 18:34:32"}]
         * rec : [{"vid":"44805","name":"庆余年","aliases":"","pic":"http://ykimg.alicdn.com/develop/image/2020-03-12/c51b8d34cd4a4deaa4714c816042a72e.jpg"},{"vid":"109267","name":"两世欢","aliases":"The Love Lasts Two Minds","pic":"http://pc3.songziwu.com/uploads/vod/2020-02-21/5e4fdc186799b.jpeg"}]
         */

        private String total;
        private List<RowsBean> rows;
        private List<RecBean> rec;

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

        public List<RecBean> getRec() {
            return rec;
        }

        public void setRec(List<RecBean> rec) {
            this.rec = rec;
        }

        public static class RowsBean implements Serializable{
            /**
             * vid : 89402
             * name : 黑色闪电第一季
             * aliases :
             * actor : 克里斯蒂尼·亚当斯,达蒙·冈普顿,琪娜·安妮·麦克兰
             * dire : SalimAkil
             * score : 3.0
             * scorer : 9
             * pop : 3562
             * pic : http://pc3.songziwu.com/uploads/vod/2019-07-16/5d2d39c4ee32b.jpg
             * time : 2019-05-13 10:42:37
             */

            private String vid;
            private String name;
            private String aliases;
            private String actor;
            private String dire;
            private String score;
            private String scorer;
            private String pop;
            private String pic;
            private String time;

            public String getVid() {
                return vid;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAliases() {
                return aliases;
            }

            public void setAliases(String aliases) {
                this.aliases = aliases;
            }

            public String getActor() {
                return actor;
            }

            public void setActor(String actor) {
                this.actor = actor;
            }

            public String getDire() {
                return dire;
            }

            public void setDire(String dire) {
                this.dire = dire;
            }

            public String getScore() {
                return score;
            }

            public void setScore(String score) {
                this.score = score;
            }

            public String getScorer() {
                return scorer;
            }

            public void setScorer(String scorer) {
                this.scorer = scorer;
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

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class RecBean {
            /**
             * vid : 44805
             * name : 庆余年
             * aliases :
             * pic : http://ykimg.alicdn.com/develop/image/2020-03-12/c51b8d34cd4a4deaa4714c816042a72e.jpg
             */

            private String vid;
            private String name;
            private String aliases;
            private String pic;

            public String getVid() {
                return vid;
            }

            public void setVid(String vid) {
                this.vid = vid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAliases() {
                return aliases;
            }

            public void setAliases(String aliases) {
                this.aliases = aliases;
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
