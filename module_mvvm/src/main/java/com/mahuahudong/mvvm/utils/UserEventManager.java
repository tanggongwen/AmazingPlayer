package com.mahuahudong.mvvm.utils;

import com.mahuahudong.mvvm.databean.UserEventBean;
import com.mahuahudong.mvvm.utils.constant.UserEventEnum;
import com.mahuahudong.mvvm.utils.database.UserEventDaoUtils;
import com.mahuahudong.res.SPUtils;
import com.mahuahudong.res.StringUtils;
import com.mahuahudong.res.constants.Constants;
import com.mahuahudong.res.controller.PersonInfoManager;

import java.util.List;

public enum UserEventManager {
    INSTANCE;
    private String columnId="000000000000000002";
    UserEventDaoUtils userEventDaoUtils = new UserEventDaoUtils(Utils.getContext());
    public void addEvent(UserEventEnum userEventEnum,String contentId,String accessTime,String endTime,String exted){
        UserEventBean userEventBean = new UserEventBean();
        if (null!=PersonInfoManager.INSTANCE.getUserBean()){
            userEventBean.setUserId(PersonInfoManager.INSTANCE.getUserBean().getUserId());
        }else {
            userEventBean.setUserId("");
        }
        userEventBean.setAccessSrc("1");
        userEventBean.setDeviceId(SystemUtil.getANDROID_ID(Utils.getContext()));
        userEventBean.setDeviceType("Android");
        userEventBean.setBrand(SystemUtil.getDeviceBrand());
        userEventBean.setDeviceOs("2");
        userEventBean.setOsVer(SystemUtil.getSystemVersion());
        userEventBean.setAppVer(SystemUtil.getVersionName(Utils.getContext()));
        userEventBean.setCarrier(SystemUtil.getProvidersName());
        userEventBean.setConnType(IntenetUtil.getNetworkState(Utils.getContext())+"");
        userEventBean.setGpsXy(SPUtils.getInstance().getString(Constants.LOCATION,""));
        userEventBean.setGpsType("1");
        userEventBean.setIpAddr(SystemUtil.getIpAddress(Utils.getContext()));
        userEventBean.setContentType(userEventEnum.getActionType());
        userEventBean.setColumnId(columnId);
        userEventBean.setContentId(contentId);
        if (StringUtils.isEmpty(accessTime)){
            userEventBean.setAccessTime(System.currentTimeMillis()+"");
        }else {
            userEventBean.setAccessTime(accessTime);
        }
        userEventBean.setEndTime(endTime);
        userEventBean.setStayTime("");
        userEventBean.setExtendField(exted);
        userEventDaoUtils.insertUserEvent(userEventBean);
    }

    public void addEvent(UserEventEnum userEventEnum,String contentId,String accessTime,String columnId,String endTime,String exted){
        UserEventBean userEventBean = new UserEventBean();
        if (null!=PersonInfoManager.INSTANCE.getUserBean()){
            userEventBean.setUserId(PersonInfoManager.INSTANCE.getUserBean().getUserId());
        }else {
            userEventBean.setUserId("");
        }
        userEventBean.setAccessSrc("1");
        userEventBean.setDeviceId(SystemUtil.getANDROID_ID(Utils.getContext()));
        userEventBean.setDeviceType("Android");
        userEventBean.setBrand(SystemUtil.getDeviceBrand());
        userEventBean.setDeviceOs("2");
        userEventBean.setOsVer(SystemUtil.getSystemVersion());
        userEventBean.setAppVer(SystemUtil.getVersionName(Utils.getContext()));
        userEventBean.setCarrier(SystemUtil.getProvidersName());
        userEventBean.setConnType(IntenetUtil.getNetworkState(Utils.getContext())+"");
        userEventBean.setGpsXy(SPUtils.getInstance().getString(Constants.LOCATION,""));
        userEventBean.setGpsType("1");
        userEventBean.setIpAddr(SystemUtil.getIpAddress(Utils.getContext()));
        userEventBean.setContentType(userEventEnum.getActionType());
        userEventBean.setColumnId(columnId);
        userEventBean.setContentId(contentId);
        if (StringUtils.isEmpty(accessTime)){
            userEventBean.setAccessTime(System.currentTimeMillis()+"");
        }else {
            userEventBean.setAccessTime(accessTime);
        }
        userEventBean.setEndTime(endTime);
        userEventBean.setStayTime("");
        userEventBean.setExtendField(exted);
        userEventDaoUtils.insertUserEvent(userEventBean);
    }


    public List<UserEventBean> getAllUserEvent(){
        return userEventDaoUtils.queryAllUserEventBean();
    }

    public void deleteAllUserEvent(){
        userEventDaoUtils.deleteAll();
    }

    public void setColumnId(String columnId) {
        this.columnId = columnId;
    }


    public String getColumnId(){
        return columnId;
    }
}
