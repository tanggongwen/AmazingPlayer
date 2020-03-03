package com.mahuahudong.mvvm.utils.constant;


import com.mahuahudong.res.R;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.io.Serializable;

public enum ShareEnum implements Serializable {
    SHARE_WECHAT(R.drawable.icon_share_wechat,"微信好友","",SHARE_MEDIA.WEIXIN),
    SHARE_PENGYOUQUAN(R.drawable.icon_share_pengyouquan,"朋友圈","",SHARE_MEDIA.WEIXIN_CIRCLE),
    SHARE_QQZONE(R.drawable.icon_share_qqzone,"QQ空间","",SHARE_MEDIA.QZONE),
    SHARE_QQ(R.drawable.icon_share_qq,"QQ好友","",SHARE_MEDIA.QQ),
    SHARE_FAVORITE(R.drawable.icon_share_favorite,"收藏","",null),
    SHARE_COMPLAIN(R.drawable.icon_share_tousu,"投诉","",null),
    SHARE_FAVORITED(R.drawable.icon_share_favorited,"收藏","",null);


    private int shareRes;
    private String shareTip;
    private String shareExtra;
    private SHARE_MEDIA shareMedia;
    ShareEnum(int shareRes, String shareTip, String extra, SHARE_MEDIA share_media){
        this.shareRes = shareRes;
        this.shareTip = shareTip;
        this.shareExtra=extra;
        this.shareMedia  = share_media;
    }

    public String getShareTip() {
        return shareTip;
    }

    public void setShareTip(String shareTip) {
        this.shareTip = shareTip;
    }

    public int getShareRes() {
        return shareRes;
    }

    public void setShareRes(int shareRes) {
        this.shareRes = shareRes;
    }

    public String getShareExtra() {
        return shareExtra;
    }

    public void setShareExtra(String shareExtra) {
        this.shareExtra = shareExtra;
    }

    public SHARE_MEDIA getShareMedia() {
        return shareMedia;
    }

    public void setShareMedia(SHARE_MEDIA shareMedia) {
        this.shareMedia = shareMedia;
    }
}
