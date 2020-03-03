package com.mahuahudong.project.model;

import androidx.annotation.NonNull;

import com.mahuahudong.mvvm.base.BaseModel;
import com.mahuahudong.project.config.datasource.HomeHttpDataSource;
import com.mahuahudong.project.config.datasource.HomeLocalDataSource;

import java.util.Set;


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



}
