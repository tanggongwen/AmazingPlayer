package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.mahuahudong.mvvm.base.BaseViewModel;

import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.project.model.HomeModel;

public class MovieDetailRelatedViewModel<VM extends BaseViewModel<HomeModel>> {
    protected VM viewModel;

    private HomeModel videoModel;
    private VideoBean currentVideo;
    @SuppressLint("CheckResult")
    public MovieDetailRelatedViewModel(@NonNull final VM viewModel, HomeModel videoModel, VideoBean videoBean) {
        this.viewModel  = viewModel;
        this.videoModel = videoModel;
        titleOb.set(videoBean.getTitle());
        desOb.set(videoBean.getIntro());

        this.currentVideo = videoBean;




    }





    public ObservableField<String> titleOb = new ObservableField<>("未知");

    public ObservableField<String> desOb = new ObservableField<>("未知");



}
