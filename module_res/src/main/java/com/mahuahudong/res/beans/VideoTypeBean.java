package com.mahuahudong.res.beans;

import java.io.Serializable;

public class VideoTypeBean implements Serializable {

    private String title;
    private String typeId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }
}
