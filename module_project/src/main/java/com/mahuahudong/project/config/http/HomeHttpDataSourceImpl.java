package com.mahuahudong.project.config.http;


import com.mahuahudong.project.config.datasource.HomeHttpDataSource;
import com.mahuahudong.project.config.http.service.HomeApiService;

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




}
