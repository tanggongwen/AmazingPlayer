package com.mahuahudong.res.constants;

public enum LikeTypeEnum {
    TYPE_COMMONT("1"),//左文右图
    TYPE_VIDEO("2"),
    TYPE_SHORTVIDEO("3");
    private String type;
    LikeTypeEnum(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
