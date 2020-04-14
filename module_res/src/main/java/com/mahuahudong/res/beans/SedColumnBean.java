package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class SedColumnBean implements Serializable {

    /**
     * code : 200
     * tab : {"type":[{"tid":"25","name":"动作片"},{"tid":"26","name":"喜剧片"},{"tid":"27","name":"爱情片"},{"tid":"28","name":"科幻片"},{"tid":"29","name":"恐怖片"},{"tid":"30","name":"战争片"},{"tid":"31","name":"剧情片"},{"tid":"32","name":"纪录片"},{"tid":"33","name":"动画片"},{"tid":"84","name":"伦理片"}],"cate":[{"cid":"1","name":"悬疑"},{"cid":"2","name":"罪案"},{"cid":"3","name":"文艺"},{"cid":"4","name":"生活"},{"cid":"5","name":"青春"},{"cid":"6","name":"惊悚"},{"cid":"7","name":"动画"},{"cid":"8","name":"历史"},{"cid":"9","name":"冒险"},{"cid":"10","name":"言情"},{"cid":"11","name":"都市"},{"cid":"12","name":"励志"},{"cid":"13","name":"魔幻"},{"cid":"14","name":"灾难"},{"cid":"15","name":"古装"},{"cid":"16","name":"歌舞"},{"cid":"17","name":"美食"},{"cid":"18","name":"旅游"},{"cid":"19","name":"职场"},{"cid":"20","name":"神话"},{"cid":"21","name":"喜剧"},{"cid":"22","name":"犯罪"},{"cid":"23","name":"战争"},{"cid":"24","name":"军旅"},{"cid":"25","name":"益智"},{"cid":"26","name":"预告"},{"cid":"27","name":"家庭"},{"cid":"28","name":"偶像"},{"cid":"29","name":"校园"},{"cid":"30","name":"搞笑"},{"cid":"31","name":"热血"},{"cid":"32","name":"经典"},{"cid":"33","name":"谍战"},{"cid":"34","name":"科幻"},{"cid":"35","name":"穿越"},{"cid":"36","name":"恐怖"},{"cid":"37","name":"童话"},{"cid":"38","name":"刑侦"},{"cid":"39","name":"音乐"},{"cid":"40","name":"爱情"},{"cid":"41","name":"推理"},{"cid":"42","name":"伦理"},{"cid":"43","name":"原声"},{"cid":"44","name":"记录"},{"cid":"45","name":"剧情"},{"cid":"46","name":"竞技"},{"cid":"47","name":"时尚"},{"cid":"48","name":"明星"},{"cid":"49","name":"预告"},{"cid":"50","name":"武侠"},{"cid":"51","name":"动作"},{"cid":"52","name":"奇幻"},{"cid":"53","name":"其它"},{"cid":"54","name":"少女"},{"cid":"55","name":"商战"},{"cid":"56","name":"游戏"}],"year":["2020","2019","2018","2017","2016","2015","2014","2013","2009-1999","90年代","80年代","更早"],"state":["大陆","香港","台湾","美国","韩国","日本","泰国","新加坡","马来西亚","印度","英国","法国","加拿大"],"word":["A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0-9"]}
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

    public static class TabBean {
        private List<TypeBean> type;
        private List<CateBean> cate;
        private List<String> year;
        private List<String> state;
        private List<String> word;

        public List<TypeBean> getType() {
            return type;
        }

        public void setType(List<TypeBean> type) {
            this.type = type;
        }

        public List<CateBean> getCate() {
            return cate;
        }

        public void setCate(List<CateBean> cate) {
            this.cate = cate;
        }

        public List<String> getYear() {
            return year;
        }

        public void setYear(List<String> year) {
            this.year = year;
        }

        public List<String> getState() {
            return state;
        }

        public void setState(List<String> state) {
            this.state = state;
        }

        public List<String> getWord() {
            return word;
        }

        public void setWord(List<String> word) {
            this.word = word;
        }

        public static class TypeBean {
            /**
             * tid : 25
             * name : 动作片
             */

            private String tid;
            private String name;

            public String getTid() {
                return tid;
            }

            public void setTid(String tid) {
                this.tid = tid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class CateBean {
            /**
             * cid : 1
             * name : 悬疑
             */

            private String cid;
            private String name;

            public String getCid() {
                return cid;
            }

            public void setCid(String cid) {
                this.cid = cid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
