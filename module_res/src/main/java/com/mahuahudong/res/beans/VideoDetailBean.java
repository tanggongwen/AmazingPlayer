package com.mahuahudong.res.beans;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class VideoDetailBean implements Serializable {

    /**
     * code : 200
     * detail : {"vid":"50156","type":"日剧","cate":"益智","name":"欢乐南极厨","remark":"更新至12集","aliases":"","keyword":"益智","actor":"浜野謙太,マキタスポーツ,田中要次,緋田康人","dire":"有働佳史","content":"舞台は、南極の昭和基地から離れる事1000キロ、標高3800ｍ、平均気温マイナス54度、世界で最も過酷な観測地帯と言われる「ドーム基地」。\r\n生物はおろかウイルスさえも生存する事が許されない、地の果てである。\r\nこの物語は、第38次隊の7人の「南極観測隊」の話である。\r\n7人のうち3人が研究者。後の4人は設営隊員（サポート要員）である。\r\nしかし、結局は、ただの7人のオジサンである。\r\nそんな、ただの7人のオジサンが、狭いドーム基地で1年間を一緒に暮らすのだ。\r\nこのドーム基地での楽しみといえば、みんなで美味しい料理を食べる時のみ。それ以外の、楽しみはほとんどない。\r\nあるのは、厳しさ・過酷さ・息苦しさ・ストレス・不安・心細さ。\r\n極限状況であるが、逃げる場所もなければ、頼る人も隊員以外にいない。\r\nそんなシチュエーション、蚊帳の外から見れば滑稽でしかないのだ。\r\n日本では考えられない事件が起こるが、最後は、主人公の西村隊員の美味しい料理を食する事で、7人が再び１つになっていく。\r\n実にダサくて、カッコよくて、でもバカバカしい、７人のオジサンの予測不可能なコメディドラマである。","url":[[{"count":"第01集","url":"https://v3.yongjiujiexi.com/share/p9aptWXJoRbWVX5s"}],[{"count":"第01集","url":"https://v3.yongjiujiexi.com/20190406/6Ig94bRa/index.m3u8"}],[{"count":"01","url":"https://dbx4.tyswmp.com/share/dl8W6pemWZMXzQ0d"},{"count":"02","url":"https://dbx4.tyswmp.com/share/eluVcfPYqDNruCQz"},{"count":"03","url":"https://dbx4.tyswmp.com/share/tJoJ5WbqsxaqpaW9"},{"count":"04","url":"https://dbx4.tyswmp.com/share/5mQ8IJCwemPxDskw"},{"count":"05","url":"https://dbx4.tyswmp.com/share/8JQdERmGuKjGppl3"},{"count":"06","url":"https://dbx3.tyswmp.com/share/aM6rJmLFFexnrSOc"},{"count":"07","url":"https://dbx3.tyswmp.com/share/28R5NAlmzIOUZdkm"},{"count":"08","url":"https://dbx3.tyswmp.com/share/v7Md2YQoXiizdDBj"},{"count":"09","url":"https://dbx3.tyswmp.com/share/BLuwXlqo73PX3KUm"},{"count":"10","url":"https://dbx3.tyswmp.com/share/WMEDfkkDwV0uSia6"},{"count":"11","url":"https://dbx3.tyswmp.com/share/7UQVJYSNu5Izzufl"},{"count":"12","url":"https://dbx3.tyswmp.com/share/AlUkkHYMr6HWP6ug"}],[{"count":"01","url":"https://dbx4.tyswmp.com/20190406/W1EIoTJ2/index.m3u8"},{"count":"02","url":"https://dbx4.tyswmp.com/20190413/EQuIzl35/index.m3u8"},{"count":"03","url":"https://dbx4.tyswmp.com/20190420/x4jaCVsv/index.m3u8"},{"count":"04","url":"https://dbx4.tyswmp.com/20190427/GoWrFtvg/index.m3u8"},{"count":"05","url":"https://dbx4.tyswmp.com/20190504/mD8VuuXT/index.m3u8"},{"count":"06","url":"https://dbx3.tyswmp.com/20190511/cCgosstL/index.m3u8"},{"count":"07","url":"https://dbx3.tyswmp.com/20190517/UNUl5Ij3/index.m3u8"},{"count":"08","url":"https://dbx3.tyswmp.com/20190524/KmcN5PuM/index.m3u8"},{"count":"09","url":"https://dbx3.tyswmp.com/20190531/qYYSJj2E/index.m3u8"},{"count":"10","url":"https://dbx3.tyswmp.com/20190608/la51Dqqq/index.m3u8"},{"count":"11","url":"https://dbx3.tyswmp.com/20190614/5CtHpuTF/index.m3u8"},{"count":"12","url":"https://dbx3.tyswmp.com/20190621/4qMbRrfX/index.m3u8"}]],"score":"0.0","scorer":"4","pop":"1895","pic":"http://pc3.songziwu.com/uploads/vod/2019-06-27/5d14469473b52.jpg","time":"2019-12-06 14:04:46","star":"1","up":"2","down":"4","filmtime":"","length":"0","weekday":"","stitle":"","skeyword":"","sdesc":"","atitle":"","akeyword":"","adesc":"","area":"日本","language":"日语对白 中文字幕","year":"2019","continue":"12","total":"更新至12","diantai":"","tvcont":"","tvexp":"","douban":"https://movie.douban.com/subject/30400834"}
     */

    private String code;
    private DetailBean detail;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DetailBean getDetail() {
        return detail;
    }

    public void setDetail(DetailBean detail) {
        this.detail = detail;
    }

    public static class DetailBean {
        /**
         * vid : 50156
         * type : 日剧
         * cate : 益智
         * name : 欢乐南极厨
         * remark : 更新至12集
         * aliases :
         * keyword : 益智
         * actor : 浜野謙太,マキタスポーツ,田中要次,緋田康人
         * dire : 有働佳史
         * content : 舞台は、南極の昭和基地から離れる事1000キロ、標高3800ｍ、平均気温マイナス54度、世界で最も過酷な観測地帯と言われる「ドーム基地」。
         生物はおろかウイルスさえも生存する事が許されない、地の果てである。
         この物語は、第38次隊の7人の「南極観測隊」の話である。
         7人のうち3人が研究者。後の4人は設営隊員（サポート要員）である。
         しかし、結局は、ただの7人のオジサンである。
         そんな、ただの7人のオジサンが、狭いドーム基地で1年間を一緒に暮らすのだ。
         このドーム基地での楽しみといえば、みんなで美味しい料理を食べる時のみ。それ以外の、楽しみはほとんどない。
         あるのは、厳しさ・過酷さ・息苦しさ・ストレス・不安・心細さ。
         極限状況であるが、逃げる場所もなければ、頼る人も隊員以外にいない。
         そんなシチュエーション、蚊帳の外から見れば滑稽でしかないのだ。
         日本では考えられない事件が起こるが、最後は、主人公の西村隊員の美味しい料理を食する事で、7人が再び１つになっていく。
         実にダサくて、カッコよくて、でもバカバカしい、７人のオジサンの予測不可能なコメディドラマである。
         * url : [[{"count":"第01集","url":"https://v3.yongjiujiexi.com/share/p9aptWXJoRbWVX5s"}],[{"count":"第01集","url":"https://v3.yongjiujiexi.com/20190406/6Ig94bRa/index.m3u8"}],[{"count":"01","url":"https://dbx4.tyswmp.com/share/dl8W6pemWZMXzQ0d"},{"count":"02","url":"https://dbx4.tyswmp.com/share/eluVcfPYqDNruCQz"},{"count":"03","url":"https://dbx4.tyswmp.com/share/tJoJ5WbqsxaqpaW9"},{"count":"04","url":"https://dbx4.tyswmp.com/share/5mQ8IJCwemPxDskw"},{"count":"05","url":"https://dbx4.tyswmp.com/share/8JQdERmGuKjGppl3"},{"count":"06","url":"https://dbx3.tyswmp.com/share/aM6rJmLFFexnrSOc"},{"count":"07","url":"https://dbx3.tyswmp.com/share/28R5NAlmzIOUZdkm"},{"count":"08","url":"https://dbx3.tyswmp.com/share/v7Md2YQoXiizdDBj"},{"count":"09","url":"https://dbx3.tyswmp.com/share/BLuwXlqo73PX3KUm"},{"count":"10","url":"https://dbx3.tyswmp.com/share/WMEDfkkDwV0uSia6"},{"count":"11","url":"https://dbx3.tyswmp.com/share/7UQVJYSNu5Izzufl"},{"count":"12","url":"https://dbx3.tyswmp.com/share/AlUkkHYMr6HWP6ug"}],[{"count":"01","url":"https://dbx4.tyswmp.com/20190406/W1EIoTJ2/index.m3u8"},{"count":"02","url":"https://dbx4.tyswmp.com/20190413/EQuIzl35/index.m3u8"},{"count":"03","url":"https://dbx4.tyswmp.com/20190420/x4jaCVsv/index.m3u8"},{"count":"04","url":"https://dbx4.tyswmp.com/20190427/GoWrFtvg/index.m3u8"},{"count":"05","url":"https://dbx4.tyswmp.com/20190504/mD8VuuXT/index.m3u8"},{"count":"06","url":"https://dbx3.tyswmp.com/20190511/cCgosstL/index.m3u8"},{"count":"07","url":"https://dbx3.tyswmp.com/20190517/UNUl5Ij3/index.m3u8"},{"count":"08","url":"https://dbx3.tyswmp.com/20190524/KmcN5PuM/index.m3u8"},{"count":"09","url":"https://dbx3.tyswmp.com/20190531/qYYSJj2E/index.m3u8"},{"count":"10","url":"https://dbx3.tyswmp.com/20190608/la51Dqqq/index.m3u8"},{"count":"11","url":"https://dbx3.tyswmp.com/20190614/5CtHpuTF/index.m3u8"},{"count":"12","url":"https://dbx3.tyswmp.com/20190621/4qMbRrfX/index.m3u8"}]]
         * score : 0.0
         * scorer : 4
         * pop : 1895
         * pic : http://pc3.songziwu.com/uploads/vod/2019-06-27/5d14469473b52.jpg
         * time : 2019-12-06 14:04:46
         * star : 1
         * up : 2
         * down : 4
         * filmtime :
         * length : 0
         * weekday :
         * stitle :
         * skeyword :
         * sdesc :
         * atitle :
         * akeyword :
         * adesc :
         * area : 日本
         * language : 日语对白 中文字幕
         * year : 2019
         * continue : 12
         * total : 更新至12
         * diantai :
         * tvcont :
         * tvexp :
         * douban : https://movie.douban.com/subject/30400834
         */

        private String vid;
        private String type;
        private String cate;
        private String name;
        private String remark;
        private String aliases;
        private String keyword;
        private String actor;
        private String dire;
        private String content;
        private String score;
        private String scorer;
        private String pop;
        private String pic;
        private String time;
        private String star;
        private String up;
        private String down;
        private String filmtime;
        private String length;
        private String weekday;
        private String stitle;
        private String skeyword;
        private String sdesc;
        private String atitle;
        private String akeyword;
        private String adesc;
        private String area;
        private String language;
        private String year;
        @SerializedName("continue")
        private String continueX;
        private String total;
        private String diantai;
        private String tvcont;
        private String tvexp;
        private String douban;
        private List<List<UrlBean>> url;
        private List<VideoRespBean.TabBean.RowsBean> related;
        private List<VideoRespBean.TabBean.RowsBean> recom;

        public String getVid() {
            return vid;
        }

        public void setVid(String vid) {
            this.vid = vid;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCate() {
            return cate;
        }

        public void setCate(String cate) {
            this.cate = cate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getAliases() {
            return aliases;
        }

        public void setAliases(String aliases) {
            this.aliases = aliases;
        }

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
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

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
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

        public String getStar() {
            return star;
        }

        public void setStar(String star) {
            this.star = star;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getDown() {
            return down;
        }

        public void setDown(String down) {
            this.down = down;
        }

        public String getFilmtime() {
            return filmtime;
        }

        public void setFilmtime(String filmtime) {
            this.filmtime = filmtime;
        }

        public String getLength() {
            return length;
        }

        public void setLength(String length) {
            this.length = length;
        }

        public String getWeekday() {
            return weekday;
        }

        public void setWeekday(String weekday) {
            this.weekday = weekday;
        }

        public String getStitle() {
            return stitle;
        }

        public void setStitle(String stitle) {
            this.stitle = stitle;
        }

        public String getSkeyword() {
            return skeyword;
        }

        public void setSkeyword(String skeyword) {
            this.skeyword = skeyword;
        }

        public String getSdesc() {
            return sdesc;
        }

        public void setSdesc(String sdesc) {
            this.sdesc = sdesc;
        }

        public String getAtitle() {
            return atitle;
        }

        public void setAtitle(String atitle) {
            this.atitle = atitle;
        }

        public String getAkeyword() {
            return akeyword;
        }

        public void setAkeyword(String akeyword) {
            this.akeyword = akeyword;
        }

        public String getAdesc() {
            return adesc;
        }

        public void setAdesc(String adesc) {
            this.adesc = adesc;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getContinueX() {
            return continueX;
        }

        public void setContinueX(String continueX) {
            this.continueX = continueX;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public String getDiantai() {
            return diantai;
        }

        public void setDiantai(String diantai) {
            this.diantai = diantai;
        }

        public String getTvcont() {
            return tvcont;
        }

        public void setTvcont(String tvcont) {
            this.tvcont = tvcont;
        }

        public String getTvexp() {
            return tvexp;
        }

        public void setTvexp(String tvexp) {
            this.tvexp = tvexp;
        }

        public String getDouban() {
            return douban;
        }

        public void setDouban(String douban) {
            this.douban = douban;
        }

        public List<List<UrlBean>> getUrl() {
            return url;
        }

        public void setUrl(List<List<UrlBean>> url) {
            this.url = url;
        }

        public List<VideoRespBean.TabBean.RowsBean> getRelated() {
            return related;
        }

        public void setRelated(List<VideoRespBean.TabBean.RowsBean> related) {
            this.related = related;
        }

        public List<VideoRespBean.TabBean.RowsBean> getRecom() {
            return recom;
        }

        public void setRecom(List<VideoRespBean.TabBean.RowsBean> recom) {
            this.recom = recom;
        }

        public static class UrlBean {
            /**
             * count : 第01集
             * url : https://v3.yongjiujiexi.com/share/p9aptWXJoRbWVX5s
             */

            private String count;
            private String url;

            public String getCount() {
                return count;
            }

            public void setCount(String count) {
                this.count = count;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
