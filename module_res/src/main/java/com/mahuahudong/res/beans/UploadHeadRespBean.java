package com.mahuahudong.res.beans;

import java.io.Serializable;

public class UploadHeadRespBean implements Serializable {

    /**
     * code : 200
     * basename : 2020030524587052.jpg
     * url : http://img.xxx.dec/upload/avatar/2020/03/05/big/2020030524587052.jpg
     */

    private String code;
    private String basename;
    private String url;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBasename() {
        return basename;
    }

    public void setBasename(String basename) {
        this.basename = basename;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
