package com.mahuahudong.res.beans;

import java.io.Serializable;

public class AskLawLikeBean implements Serializable {
    private String count;
    private boolean liked;

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
