package com.mahuahudong.project.config;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.project.viewmodel.AccountManagerViewModel;
import com.mahuahudong.project.viewmodel.HomeFrgViewModel;
import com.mahuahudong.project.viewmodel.HomeVideoViewModel;
import com.mahuahudong.project.viewmodel.HomeViewModel;
import com.mahuahudong.project.viewmodel.LiveFrgViewModel;
import com.mahuahudong.project.viewmodel.LoginViewModel;
import com.mahuahudong.project.viewmodel.MineFrgViewModel;
import com.mahuahudong.project.viewmodel.MovieDetailViewModel;
import com.mahuahudong.project.viewmodel.MovieSelectViewModel;
import com.mahuahudong.project.viewmodel.MyAttentionViewModel;
import com.mahuahudong.project.viewmodel.PersonInfoViewModel;
import com.mahuahudong.project.viewmodel.PlayRoomFrgViewModel;
import com.mahuahudong.project.viewmodel.RegisterViewModel;
import com.mahuahudong.project.viewmodel.SendTrendViewModel;
import com.mahuahudong.project.viewmodel.TrendsViewModel;
import com.mahuahudong.project.viewmodel.WatchHistoryListViewModel;

/**
 * Created by tanggongwen on 2019/9/18.
 */
public class HomeViewModelFactory extends ViewModelProvider.NewInstanceFactory {
    @SuppressLint("StaticFieldLeak")
    private static volatile HomeViewModelFactory INSTANCE;
    private final Application mApplication;
    private final HomeModel homeModel;

    public static HomeViewModelFactory getInstance(Application application) {
        if (INSTANCE == null) {
            synchronized (HomeViewModelFactory.class) {
                if (INSTANCE == null) {
                    INSTANCE = new HomeViewModelFactory(application, HomeInjection.provideHomeRepository());
                }
            }
        }
        return INSTANCE;
    }

    @VisibleForTesting
    public static void destroyInstance() {
        INSTANCE = null;
    }

    private HomeViewModelFactory(Application application, HomeModel model) {
        this.mApplication = application;
        this.homeModel = model;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(HomeViewModel.class)){
             return (T) new HomeViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(HomeFrgViewModel.class)){
            return (T) new HomeFrgViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(LiveFrgViewModel.class)){
            return (T) new LiveFrgViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(PlayRoomFrgViewModel.class)){
            return (T) new PlayRoomFrgViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(MineFrgViewModel.class)){
            return (T) new MineFrgViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(HomeVideoViewModel.class)){
            return (T) new HomeVideoViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(WatchHistoryListViewModel.class)){
            return (T) new WatchHistoryListViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(LoginViewModel.class)){
            return (T) new LoginViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(RegisterViewModel.class)){
            return (T) new RegisterViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(PersonInfoViewModel.class)){
            return (T) new PersonInfoViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(MyAttentionViewModel.class)){
            return (T) new MyAttentionViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(TrendsViewModel.class)){
            return (T) new TrendsViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(AccountManagerViewModel.class)){
            return (T) new AccountManagerViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(MovieDetailViewModel.class)){
            return (T) new MovieDetailViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(MovieSelectViewModel.class)){
            return (T) new MovieSelectViewModel(mApplication, homeModel);
        }else  if (modelClass.isAssignableFrom(SendTrendViewModel.class)){
            return (T) new SendTrendViewModel(mApplication, homeModel);
        }


        throw new IllegalArgumentException("Unknown ViewModel class: " + modelClass.getName());
    }
}
