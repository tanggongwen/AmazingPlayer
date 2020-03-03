package com.mahuahudong.project.config.local;


import com.mahuahudong.project.config.datasource.HomeLocalDataSource;
import com.mahuahudong.res.SPUtils;
import com.mahuahudong.res.constants.SpConstants;

import java.util.HashSet;
import java.util.Set;


/**
 * 本地数据源，可配合Room框架使用
 * Created by tanggongwen on 2019/9/17.
 */
public class HomeLocalDataSourceImpl implements HomeLocalDataSource {
    private volatile static HomeLocalDataSourceImpl INSTANCE = null;

    public static HomeLocalDataSourceImpl getInstance() {
        if (INSTANCE == null) {
            synchronized (HomeLocalDataSourceImpl.class) {
                if (INSTANCE == null) {
                    INSTANCE = new HomeLocalDataSourceImpl();
                }
            }
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }

    private HomeLocalDataSourceImpl() {
        //数据库Helper构建
    }


    @Override
    public Set<String> getSearchHistoryList() {
        return SPUtils.getInstance().getStringSet(SpConstants.KEY_SEARCHHISTORYS);
    }

    @Override
    public void addSearchHistory(String keyWord) {
        Set<String> strings = SPUtils.getInstance().getStringSet(SpConstants.KEY_SEARCHHISTORYS);
        Set<String> searchHistorySet = new HashSet<>(strings);
        if (!searchHistorySet.contains(keyWord)){
            searchHistorySet.add(keyWord);
            SPUtils.getInstance().put(SpConstants.KEY_SEARCHHISTORYS,searchHistorySet);
        }
    }

    @Override
    public void clearSearchHistory() {
        SPUtils.getInstance().remove(SpConstants.KEY_SEARCHHISTORYS);
    }
}
