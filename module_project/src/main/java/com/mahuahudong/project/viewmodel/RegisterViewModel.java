package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.project.model.HomeModel;

public class RegisterViewModel extends BaseViewModel<HomeModel> {
    public RegisterViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
    }
}
