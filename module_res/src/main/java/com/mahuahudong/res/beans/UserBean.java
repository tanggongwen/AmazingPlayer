package com.mahuahudong.res.beans;

import java.io.Serializable;

public class UserBean implements Serializable {

    /**
     * code : 200
     * msg : 注册成功
     * token : e05a223a3fff2c9bd72395f4baaa5866
     * info : {"userid":"478","username":"zjj2338829","nickname":"麻花小主730269","pic":"0.png"}
     */

    private String code;
    private String msg;
    private String token;
    private InfoBean info;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * userid : 478
         * username : zjj2338829
         * nickname : 麻花小主730269
         * pic : 0.png
         */

        private String userid;
        private String username;
        private String nickname;
        private String pic;

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }
    }
}
