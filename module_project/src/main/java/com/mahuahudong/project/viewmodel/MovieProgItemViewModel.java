package com.mahuahudong.project.viewmodel;

import android.graphics.Color;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.project.R;

import com.mahuahudong.res.Utils;

public class MovieProgItemViewModel<VM extends BaseViewModel> {
    private VideoBean videoBean;
    public BindingCommand itemClickCommand = new BindingCommand(new BindingAction() {

        @Override
        public void call() {
            viewModel.getUC().getReloadEvent().setValue(videoBean);
        }
    });

    protected VM viewModel;
    public MovieProgItemViewModel(@NonNull VM viewModel, VideoBean videoBean,String videoId) {
        this.viewModel = viewModel;
        this.videoBean = videoBean;
        titleOb.set(videoBean.getCurrentCount());
        if (videoBean.getVideoId().equals(videoId)){
            tvColorOb.set(Utils.getContext().getResources().getColor(R.color.tvselected));
        }else {
            tvColorOb.set(Utils.getContext().getResources().getColor(R.color.tvNomormal));
        }
    }

    public ObservableField<String> titleOb = new ObservableField<>();

    public void updateTvColor(String videoId){
        if (videoBean.getVideoId().equals(videoId)){
            tvColorOb.set(Utils.getContext().getResources().getColor(R.color.tvselected));
        }else {
            tvColorOb.set(Utils.getContext().getResources().getColor(R.color.tvNomormal));
        }
    }

    public ObservableInt tvColorOb = new ObservableInt();


}

