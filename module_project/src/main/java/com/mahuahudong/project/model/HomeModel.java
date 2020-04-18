package com.mahuahudong.project.model;

import androidx.annotation.NonNull;

import com.mahuahudong.mvvm.base.BaseModel;
import com.mahuahudong.res.beans.AddTrendbean;
import com.mahuahudong.res.beans.FirstColumnBean;
import com.mahuahudong.res.beans.LiveListBean;
import com.mahuahudong.res.beans.MyFocusBean;
import com.mahuahudong.res.beans.MyTrendsBean;
import com.mahuahudong.res.beans.SedColumnBean;
import com.mahuahudong.res.beans.UpdateUserRespBean;
import com.mahuahudong.res.beans.UploadHeadRespBean;
import com.mahuahudong.res.beans.UserBean;
import com.mahuahudong.project.config.datasource.HomeHttpDataSource;
import com.mahuahudong.project.config.datasource.HomeLocalDataSource;
import com.mahuahudong.res.beans.UserFocusBean;
import com.mahuahudong.res.beans.VideoDetailBean;
import com.mahuahudong.res.beans.VideoRespBean;

import java.util.Set;

import io.reactivex.Observable;


/**
 * MVVM的Model层，统一模块的数据仓库，包含网络数据和本地数据
 * Created by tanggongwen on 2019/9/17.
 */
public class HomeModel extends BaseModel implements HomeHttpDataSource, HomeLocalDataSource {
    private volatile static HomeModel INSTANCE = null;
    private final HomeHttpDataSource mHttpDataSource;

    private final HomeLocalDataSource mLocalDataSource;

    private HomeModel(@NonNull HomeHttpDataSource httpDataSource,
                      @NonNull HomeLocalDataSource localDataSource) {
        this.mHttpDataSource = httpDataSource;
        this.mLocalDataSource = localDataSource;
    }

    public static HomeModel getInstance(HomeHttpDataSource httpDataSource,
                                        HomeLocalDataSource localDataSource) {
        if (INSTANCE == null) {
            synchronized (HomeModel.class) {
                if (INSTANCE == null) {
                    INSTANCE = new HomeModel(httpDataSource, localDataSource);
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public Set<String> getSearchHistoryList() {
        return mLocalDataSource.getSearchHistoryList();
    }

    @Override
    public void addSearchHistory(String searchHistory) {
        mLocalDataSource.addSearchHistory(searchHistory);
    }

    @Override
    public void clearSearchHistory() {
        mLocalDataSource.clearSearchHistory();
    }


    @Override
    public Observable<UserBean> register(String username, String password) {
        return mHttpDataSource.register(username,password);
    }

    @Override
    public Observable<UserBean> login(String username, String password) {
        return mHttpDataSource.login(username,password);
    }

    @Override
    public Observable<FirstColumnBean> getFirstColumn() {
        return mHttpDataSource.getFirstColumn();
    }

    @Override
    public Observable<SedColumnBean> getSecendColumn(String pid) {
        return mHttpDataSource.getSecendColumn(pid);
    }

    @Override
    public Observable<VideoRespBean> getVideoHomeDatas(String pid, String page, String size) {
        return mHttpDataSource.getVideoHomeDatas(pid,page,size);
    }

    @Override
    public Observable<VideoDetailBean> getVideoDetail( String vid) {
        return mHttpDataSource.getVideoDetail(vid);
    }

    @Override
    public Observable<LiveListBean> getLiveList(String page, String size) {
        return mHttpDataSource.getLiveList(page,size);
    }

    @Override
    public Observable<MyFocusBean> getFocusList(String page, String size, String lid) {
        return mHttpDataSource.getFocusList(page,size,lid);
    }

    @Override
    public Observable<UserFocusBean> addFocus(String lid) {
        return mHttpDataSource.addFocus(lid);
    }

    @Override
    public Observable<MyTrendsBean> getMyTrends(String page, String size, String lid) {
        return mHttpDataSource.getMyTrends(page,size,lid);
    }

    @Override
    public Observable<AddTrendbean> addTrend(String content) {
        return mHttpDataSource.addTrend(content);
    }

    @Override
    public Observable<UploadHeadRespBean> uploadHead(String filePath) {
        return mHttpDataSource.uploadHead(filePath);
    }

    @Override
    public Observable<UpdateUserRespBean> updateUser(String signature, String nickname, String avatar) {
        return mHttpDataSource.updateUser(signature,nickname,avatar);
    }
}
