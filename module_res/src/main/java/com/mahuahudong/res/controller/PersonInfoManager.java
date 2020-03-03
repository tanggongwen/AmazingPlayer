package com.mahuahudong.res.controller;

import com.mahuahudong.res.GsonUtil;
import com.mahuahudong.res.SPUtils;
import com.mahuahudong.res.StringUtils;
import com.mahuahudong.res.beans.MyCommunityBean;
import com.mahuahudong.res.beans.UserBean;
import com.mahuahudong.res.constants.Constants;
import com.mahuahudong.res.constants.SpConstants;

public enum PersonInfoManager {
    INSTANCE;
    private UserBean userBean;
    private String token;



    public String getToken() {
        return SPUtils.getInstance().getString(Constants.TYPE_TOKEO,"");
    }

    public void setToken(String token) {
        SPUtils.getInstance().put(Constants.TYPE_TOKEO,token);
    }

    public UserBean getUserBean() {
        return GsonUtil.GsonToBean(SPUtils.getInstance().getString(SpConstants.KEY_USER,""), UserBean.class);
    }

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
        SPUtils.getInstance().put(SpConstants.KEY_USER,GsonUtil.GsonString(userBean));
    }


    public void setUserCommunityBean(MyCommunityBean communityBean){
        SPUtils.getInstance().put(SpConstants.KEY_COMMUNITY_BEAN,GsonUtil.GsonString(communityBean));
    }


    public MyCommunityBean getUserCommunityBean(){
        return GsonUtil.GsonToBean(SPUtils.getInstance().getString(SpConstants.KEY_COMMUNITY_BEAN,""), MyCommunityBean.class);
    }

    public String getUserToken(){
        if (StringUtils.isEmpty(PersonInfoManager.INSTANCE.getToken())){
            return "";
        }else {
            return "Bearer "+PersonInfoManager.INSTANCE.getToken();
        }
    }

    public String getUserTokenForH5(){
        if (StringUtils.isEmpty(PersonInfoManager.INSTANCE.getToken())){
            return "";
        }else {
            return PersonInfoManager.INSTANCE.getToken();
        }
    }
}
