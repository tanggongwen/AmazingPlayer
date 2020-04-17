package com.mahuahudong.project.config.http;


import com.mahuahudong.res.beans.AddTrendRespBean;
import com.mahuahudong.res.beans.AddTrendbean;
import com.mahuahudong.res.beans.FirstColumnBean;
import com.mahuahudong.res.beans.LiveListBean;
import com.mahuahudong.res.beans.LiveReqBean;
import com.mahuahudong.res.beans.MyFocusBean;
import com.mahuahudong.res.beans.MyFocusReqBean;
import com.mahuahudong.res.beans.MyTrendReqBean;
import com.mahuahudong.res.beans.MyTrendsBean;
import com.mahuahudong.res.beans.RegisterRqBean;
import com.mahuahudong.res.beans.SedColumnBean;
import com.mahuahudong.res.beans.SedReqBean;
import com.mahuahudong.res.beans.UserBean;
import com.mahuahudong.project.config.datasource.HomeHttpDataSource;
import com.mahuahudong.project.config.http.service.HomeApiService;
import com.mahuahudong.res.beans.UserFocusBean;
import com.mahuahudong.res.beans.UserFocusReqBean;
import com.mahuahudong.res.beans.VideoDetailBean;
import com.mahuahudong.res.beans.VideoDetailReqBean;
import com.mahuahudong.res.beans.VideoHomeReqBean;
import com.mahuahudong.res.beans.VideoRespBean;
import com.mahuahudong.res.controller.PersonInfoManager;

import io.reactivex.Observable;

/**
 * Created by tanggongwen on 2019/9/17.
 */
public class HomeHttpDataSourceImpl implements HomeHttpDataSource {
    private HomeApiService apiService;
    private volatile static HomeHttpDataSourceImpl INSTANCE = null;

    public static HomeHttpDataSourceImpl getInstance(HomeApiService apiService) {
        if (INSTANCE == null) {
            synchronized (HomeHttpDataSourceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new HomeHttpDataSourceImpl(apiService);
                }
            }
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    private HomeHttpDataSourceImpl(HomeApiService apiService) {
        this.apiService = apiService;
    }


    @Override
    public Observable<UserBean> register(String username, String password) {
        RegisterRqBean registerRqBean = new RegisterRqBean();
        registerRqBean.setUsername(username);
        registerRqBean.setPassword(password);
        return apiService.register(PersonInfoManager.INSTANCE.getHeader(),registerRqBean);
    }

    @Override
    public Observable<UserBean> login(String username, String password) {
        RegisterRqBean registerRqBean = new RegisterRqBean();
        registerRqBean.setUsername(username);
        registerRqBean.setPassword(password);
        return apiService.login(PersonInfoManager.INSTANCE.getHeader(),registerRqBean);
    }

    @Override
    public Observable<FirstColumnBean> getFirstColumn() {
        return apiService.getFirstColumn(PersonInfoManager.INSTANCE.getHeader());
    }

    @Override
    public Observable<SedColumnBean> getSecendColumn(String pid) {
        SedReqBean sedReqBean = new SedReqBean();
        sedReqBean.setPid(pid);
        return apiService.getSecendColumn(PersonInfoManager.INSTANCE.getHeader(),sedReqBean);
    }

    @Override
    public Observable<VideoRespBean> getVideoHomeDatas(String pid, String page, String size) {
        VideoHomeReqBean videoHomeReqBean = new VideoHomeReqBean();
        videoHomeReqBean.setPid(pid);
        videoHomeReqBean.setPage(page);
        videoHomeReqBean.setSize(size);
        return apiService.getVideoHome(PersonInfoManager.INSTANCE.getHeader(),videoHomeReqBean);
    }

    @Override
    public Observable<VideoDetailBean> getVideoDetail( String vid) {
        VideoDetailReqBean videoDetailReqBean = new VideoDetailReqBean();
        videoDetailReqBean.setVid(vid);
        return apiService.getVideoDetail(PersonInfoManager.INSTANCE.getHeader(),videoDetailReqBean);
    }

    @Override
    public Observable<LiveListBean> getLiveList(String page, String size) {
        LiveReqBean liveReqBean = new LiveReqBean();
        liveReqBean.setPage(page);
        liveReqBean.setSize(size);
        return apiService.getLiveList(PersonInfoManager.INSTANCE.getHeader(),liveReqBean);
    }

    @Override
    public Observable<MyFocusBean> getFocusList(String page, String size, String lid) {
        MyFocusReqBean myFocusReqBean = new MyFocusReqBean();
        myFocusReqBean.setPage(page);
        myFocusReqBean.setSize(size);
        myFocusReqBean.setLid(lid);
        return apiService.getMyFocusList(PersonInfoManager.INSTANCE.getHeader(),myFocusReqBean);
    }

    @Override
    public Observable<UserFocusBean> addFocus(String lid) {
        UserFocusReqBean userFocusReqBean = new UserFocusReqBean();
        userFocusReqBean.setLid(lid);
        return apiService.addFocus(PersonInfoManager.INSTANCE.getHeader(),userFocusReqBean);
    }

    @Override
    public Observable<MyTrendsBean> getMyTrends(String page, String size, String lid) {
        MyTrendReqBean myTrendReqBean = new MyTrendReqBean();
        myTrendReqBean.setPage(page);
        myTrendReqBean.setSize(size);
        myTrendReqBean.setLid(lid);
        return apiService.getMyTrendList(PersonInfoManager.INSTANCE.getHeader(),myTrendReqBean);
    }

    @Override
    public Observable<AddTrendbean> addTrend(String content) {
        AddTrendbean addTrendbean = new AddTrendbean();
        addTrendbean.setContent(content);
        return apiService.addTrend(PersonInfoManager.INSTANCE.getHeader(),addTrendbean);
    }
}
