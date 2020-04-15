package com.mahuahudong.res.beans;

import java.io.Serializable;

public class UserFocusBean implements Serializable {

    /**
     * code : 200
     * msg : 关注成功
     */

    private String code;
    private String msg;

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
}
