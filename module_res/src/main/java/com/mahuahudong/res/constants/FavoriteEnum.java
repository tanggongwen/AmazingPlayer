package com.mahuahudong.res.constants;

import java.io.Serializable;

public enum FavoriteEnum implements Serializable {
    TYPE_NEWS("1"),//左文右图
    TYPE_VIDEO("2"),
    TYPE_LIVE("3"),
    TYPE_STATION("4");
    private String favoriteType;
    FavoriteEnum(String favoriteType){
        this.favoriteType = favoriteType;
    }

    public String getType() {
        return favoriteType;
    }

    public void setType(String favoriteType) {
        this.favoriteType = favoriteType;
    }
}
