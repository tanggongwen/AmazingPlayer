package com.mahuahudong.res.subscriptions;

public class NewsImageDetailHide {
    public NewsImageDetailHide(boolean hide){
        this.hide = hide;
    }
    private boolean hide = false;

    public boolean isHide() {
        return hide;
    }

    public void setHide(boolean hide) {
        this.hide = hide;
    }
}
