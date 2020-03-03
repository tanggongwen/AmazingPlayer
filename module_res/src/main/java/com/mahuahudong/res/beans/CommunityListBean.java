package com.mahuahudong.res.beans;

import java.io.Serializable;
import java.util.List;

public class CommunityListBean implements Serializable {

    /**
     * letter : A
     * ls : [{"areaAddr":"长沙市芙蓉区星沙大道东业上城五栋","areaId":"652601549482233922","areaName":"安子岭社区"},{"areaAddr":"长沙市车站南路565号","areaId":"652601549486428382","areaName":"阿弥岭社区"},{"areaAddr":"长沙市长沙县安沙中路与安沙南路交叉口东150米","areaId":"652601549490622551","areaName":"安沙"}]
     */

    private String letter;
    private List<CommunityBean> ls;

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public List<CommunityBean> getLs() {
        return ls;
    }

    public void setLs(List<CommunityBean> ls) {
        this.ls = ls;
    }

    public static class CommunityBean implements Serializable {
        /**
         * areaAddr : 长沙市芙蓉区星沙大道东业上城五栋
         * areaId : 652601549482233922
         * areaName : 安子岭社区
         */

        private String areaAddr;
        private String areaId;
        private String areaName;

        public String getAreaAddr() {
            return areaAddr;
        }

        public void setAreaAddr(String areaAddr) {
            this.areaAddr = areaAddr;
        }

        public String getAreaId() {
            return areaId;
        }

        public void setAreaId(String areaId) {
            this.areaId = areaId;
        }

        public String getAreaName() {
            return areaName;
        }

        public void setAreaName(String areaName) {
            this.areaName = areaName;
        }
    }
}
