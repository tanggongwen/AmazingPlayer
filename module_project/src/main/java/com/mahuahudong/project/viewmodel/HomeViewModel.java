package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.project.model.HomeModel;

import io.reactivex.disposables.Disposable;

public class HomeViewModel extends BaseViewModel<HomeModel> {
    private Disposable moreService;
    @SuppressLint("CheckResult")
    public HomeViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);

    }



    @Override
    public void onDestroy() {
        super.onDestroy();

    }





}
