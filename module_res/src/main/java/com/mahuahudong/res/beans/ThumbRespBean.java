package com.mahuahudong.res.beans;

import java.io.Serializable;

public class ThumbRespBean implements Serializable {

    /**
     * code : 200
     * up : 1
     * msg : 点赞成功
     */

    private String code;
    private String up;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUp() {
        return up;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
