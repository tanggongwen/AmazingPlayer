package com.mahuahudong.module_live.entertainment.module;

import com.alibaba.fastjson.JSONObject;

/**
 * 点赞附件
 * Created by hzxuwen on 2016/3/30.
 */
public class LikeAttachment extends CustomAttachment {
    public LikeAttachment() {
        super(CustomAttachmentType.ADD_LIKE);
    }

    @Override
    protected void parseData(JSONObject data) {

    }

    @Override
    protected JSONObject packData() {
        return null;
    }
}