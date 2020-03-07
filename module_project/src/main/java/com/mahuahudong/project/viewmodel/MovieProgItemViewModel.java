package com.mahuahudong.project.viewmodel;

import android.graphics.Color;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.project.beans.VideoBean;

public class MovieProgItemViewModel<VM extends BaseViewModel> {
    private VideoBean videoBean;
    private int colorSelected = Color.parseColor("#EB2323");
    private int colorNormal = Color.parseColor("#000000");
    public BindingCommand itemClickCommand = new BindingCommand(new BindingAction() {

        @Override
        public void call() {
            viewModel.getUC().getReloadEvent().setValue(videoBean.getVideoUrl());
        }
    });

    protected VM viewModel;
    public MovieProgItemViewModel(@NonNull VM viewModel, VideoBean videoBean) {
        this.viewModel = viewModel;
        this.videoBean = videoBean;
        titleOb.set(videoBean.getCurrentCount());

    }

    public ObservableField<String> titleOb = new ObservableField<>();

    public void updateTvColor(String url){
        if (videoBean.getVideoUrl().equals(url)){
            tvColorOb.set(colorSelected);
        }else {
            tvColorOb.set(colorNormal);
        }
    }

    public ObservableInt tvColorOb = new ObservableInt(colorNormal);


}

