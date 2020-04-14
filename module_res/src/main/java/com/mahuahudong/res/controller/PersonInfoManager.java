package com.mahuahudong.res.controller;

import com.mahuahudong.res.GsonUtil;
import com.mahuahudong.res.SPUtils;
import com.mahuahudong.res.StringUtils;

import com.mahuahudong.res.beans.UserBean;
import com.mahuahudong.res.constants.Constants;
import com.mahuahudong.res.constants.SpConstants;

import java.util.HashMap;
import java.util.Map;

public enum PersonInfoManager {
    INSTANCE;
    private UserBean userBean;
    private String token;



    public String getToken() {
        return SPUtils.getInstance().getString(Constants.TYPE_TOKEO,"");
    }


    public Map getHeader(){
        Map<String,String> headerMap = new HashMap<>();
        headerMap.put("token",PersonInfoManager.INSTANCE.getToken());
        headerMap.put("tokensource","Android");
        if (null!=PersonInfoManager.INSTANCE.getUserBean()){
            headerMap.put("username",PersonInfoManager.INSTANCE.getUserBean().getInfo().getUsername());
        }else {
            headerMap.put("username","");
        }
        return headerMap;
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


    public String getUserToken(){
        if (StringUtils.isEmpty(PersonInfoManager.INSTANCE.getToken())){
            return "";
        }else {
            return "Bearer "+PersonInfoManager.INSTANCE.getToken();
        }
    }

}
