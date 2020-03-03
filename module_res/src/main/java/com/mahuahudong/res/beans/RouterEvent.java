package com.mahuahudong.res.beans;

import java.io.Serializable;

public class RouterEvent implements Serializable {


    /**
     * actionType : 1
     * content : id或者url
     */

    private String actionType;
    private String content;

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
