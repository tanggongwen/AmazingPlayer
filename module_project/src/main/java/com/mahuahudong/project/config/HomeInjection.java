package com.mahuahudong.project.config;


import com.mahuahudong.mvvm.http.RetrofitClient;
import com.mahuahudong.project.config.datasource.HomeHttpDataSource;
import com.mahuahudong.project.config.datasource.HomeLocalDataSource;
import com.mahuahudong.project.config.http.HomeHttpDataSourceImpl;
import com.mahuahudong.project.config.http.service.HomeApiService;
import com.mahuahudong.project.config.local.HomeLocalDataSourceImpl;
import com.mahuahudong.project.model.HomeModel;


/**
 * 注入全局的数据仓库，可以考虑使用Dagger2。（根据项目实际情况搭建，千万不要为了架构而架构）
 * Created by tanggongwen on 2019/9/18.
 */
public class HomeInjection {
    public static HomeModel provideHomeRepository() {
        //网络API服务
        HomeApiService apiService = RetrofitClient.getInstance().create(HomeApiService.class);
        //网络数据源
        HomeHttpDataSource httpDataSource = HomeHttpDataSourceImpl.getInstance(apiService);
        //本地数据源
        HomeLocalDataSource localDataSource = HomeLocalDataSourceImpl.getInstance();
        //两条分支组成一个数据仓库
        return HomeModel.getInstance(httpDataSource, localDataSource);
    }
}
