package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.project.model.HomeModel;

public class LiveFrgViewModel extends BaseViewModel<HomeModel> {
    public LiveFrgViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
    }
}
