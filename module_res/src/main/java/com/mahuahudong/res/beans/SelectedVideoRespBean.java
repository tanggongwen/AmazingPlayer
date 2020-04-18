package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class SelectedVideoRespBean implements Serializable {

    /**
     * code : 200
     * list : {"total":"106117","rows":[{"vid":"1","name":"爱情能再触电吗","aliases":"","actor":"卞贞秀,郑灿宇,金泰妍,边宇民,李英幼,李相宇,朴哲民,李东勋,申珠雅","dire":"","score":"7.1","scorer":"90","pop":"139","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c012428ac213.jpg","time":"2010-01-31 01:33:58"},{"vid":"2","name":"侏罗纪公园1-3","aliases":"","actor":"杰夫·戈德布拉姆,塞缪尔·杰克逊","dire":"","score":"7.6","scorer":"96","pop":"4228","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c012427ea2ac.jpg","time":"2010-02-07 11:09:18"},{"vid":"3","name":"中国刑侦1号案","aliases":"","actor":"丁勇岱,余小雪,王虎城,谢伟才","dire":"陈国军","score":"7.0","scorer":"69","pop":"5006","pic":"http://pc3.songziwu.com/uploads/vod/2019-05-27/5ceb4d57f2f27.jpg","time":"2018-09-08 00:44:13"},{"vid":"4","name":"作女","aliases":"","actor":"袁立,苗圃,傅彪,田海蓉,王洛勇,伍宇娟","dire":"马进","score":"0.0","scorer":"8","pop":"7100","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c0124267b101.jpg","time":"2010-03-28 01:52:27"},{"vid":"5","name":"罪之缘","aliases":"","actor":"吴军,曾黎,樊志起,刘敏涛","dire":"张多福","score":"0.0","scorer":"9","pop":"788","pic":"http://pc3.songziwu.com/uploads/vod/2019-05-27/5ceb4d91d2eac.jpg","time":"2018-09-05 19:54:32"},{"vid":"6","name":"阻击罪恶","aliases":"阻击","actor":"董勇,刘孜,程煜,李琳,廖京生","dire":"李源","score":"0.0","scorer":"3","pop":"84","pic":"http://pc3.songziwu.com/uploads/vod/2019-03-29/5c9d30e1b3627.jpg","time":"2010-03-28 01:52:28"},{"vid":"7","name":"中国志愿者","aliases":"","actor":"付小健,王加宾,王杰","dire":"付小健","score":"7.1","scorer":"85","pop":"89","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c0124241c8ed.jpg","time":"2010-03-28 01:52:32"},{"vid":"8","name":"战友","aliases":"老班长","actor":"任程伟,韩雯雯,陈锐,丁军","dire":"程绍刚,孙文学","score":"0.0","scorer":"2","pop":"77","pic":"http://pc3.songziwu.com/uploads/vod/2019-03-29/5c9d30e1ac1c9.jpg","time":"2010-03-28 01:52:38"},{"vid":"9","name":"正义令天下","aliases":"","actor":"周杰,俞飞鸿,盖丽丽,项斌","dire":"周小兵","score":"0.0","scorer":"22","pop":"69","pic":"http://pc3.songziwu.com/uploads/vod/2019-05-27/5ceb2b407b7fb.jpg","time":"2019-03-20 19:55:19"},{"vid":"10","name":"终极背叛","aliases":"","actor":"张岩,王姬,吴晓敏","dire":"","score":"6.7","scorer":"39","pop":"76","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c012422416ca.jpg","time":"2010-03-28 01:52:45"}]}
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
         * total : 106117
         * rows : [{"vid":"1","name":"爱情能再触电吗","aliases":"","actor":"卞贞秀,郑灿宇,金泰妍,边宇民,李英幼,李相宇,朴哲民,李东勋,申珠雅","dire":"","score":"7.1","scorer":"90","pop":"139","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c012428ac213.jpg","time":"2010-01-31 01:33:58"},{"vid":"2","name":"侏罗纪公园1-3","aliases":"","actor":"杰夫·戈德布拉姆,塞缪尔·杰克逊","dire":"","score":"7.6","scorer":"96","pop":"4228","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c012427ea2ac.jpg","time":"2010-02-07 11:09:18"},{"vid":"3","name":"中国刑侦1号案","aliases":"","actor":"丁勇岱,余小雪,王虎城,谢伟才","dire":"陈国军","score":"7.0","scorer":"69","pop":"5006","pic":"http://pc3.songziwu.com/uploads/vod/2019-05-27/5ceb4d57f2f27.jpg","time":"2018-09-08 00:44:13"},{"vid":"4","name":"作女","aliases":"","actor":"袁立,苗圃,傅彪,田海蓉,王洛勇,伍宇娟","dire":"马进","score":"0.0","scorer":"8","pop":"7100","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c0124267b101.jpg","time":"2010-03-28 01:52:27"},{"vid":"5","name":"罪之缘","aliases":"","actor":"吴军,曾黎,樊志起,刘敏涛","dire":"张多福","score":"0.0","scorer":"9","pop":"788","pic":"http://pc3.songziwu.com/uploads/vod/2019-05-27/5ceb4d91d2eac.jpg","time":"2018-09-05 19:54:32"},{"vid":"6","name":"阻击罪恶","aliases":"阻击","actor":"董勇,刘孜,程煜,李琳,廖京生","dire":"李源","score":"0.0","scorer":"3","pop":"84","pic":"http://pc3.songziwu.com/uploads/vod/2019-03-29/5c9d30e1b3627.jpg","time":"2010-03-28 01:52:28"},{"vid":"7","name":"中国志愿者","aliases":"","actor":"付小健,王加宾,王杰","dire":"付小健","score":"7.1","scorer":"85","pop":"89","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c0124241c8ed.jpg","time":"2010-03-28 01:52:32"},{"vid":"8","name":"战友","aliases":"老班长","actor":"任程伟,韩雯雯,陈锐,丁军","dire":"程绍刚,孙文学","score":"0.0","scorer":"2","pop":"77","pic":"http://pc3.songziwu.com/uploads/vod/2019-03-29/5c9d30e1ac1c9.jpg","time":"2010-03-28 01:52:38"},{"vid":"9","name":"正义令天下","aliases":"","actor":"周杰,俞飞鸿,盖丽丽,项斌","dire":"周小兵","score":"0.0","scorer":"22","pop":"69","pic":"http://pc3.songziwu.com/uploads/vod/2019-05-27/5ceb2b407b7fb.jpg","time":"2019-03-20 19:55:19"},{"vid":"10","name":"终极背叛","aliases":"","actor":"张岩,王姬,吴晓敏","dire":"","score":"6.7","scorer":"39","pop":"76","pic":"http://pc3.songziwu.com/uploads/vod/2018-11-30/5c012422416ca.jpg","time":"2010-03-28 01:52:45"}]
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
             * vid : 1
             * name : 爱情能再触电吗
             * aliases :
             * actor : 卞贞秀,郑灿宇,金泰妍,边宇民,李英幼,李相宇,朴哲民,李东勋,申珠雅
             * dire :
             * score : 7.1
             * scorer : 90
             * pop : 139
             * pic : http://pc3.songziwu.com/uploads/vod/2018-11-30/5c012428ac213.jpg
             * time : 2010-01-31 01:33:58
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
    }
}
