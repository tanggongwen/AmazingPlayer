package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.project.R;
import com.mahuahudong.project.beans.VideoBean;

public class WatchHistoryItemViewModel extends ItemViewModel<MineFrgViewModel> {
    public WatchHistoryItemViewModel(@NonNull MineFrgViewModel viewModel, VideoBean videoBean) {
        super(viewModel);
        coverUrlOb.set(videoBean.getCover());
        titleOb.set(videoBean.getIntro());

    }

    public ObservableField<String> coverUrlOb = new ObservableField<>("");


    public ObservableInt coverPlaceHolder = new ObservableInt(R.color.white);

    public ObservableField<String> dateOb = new ObservableField<>();


    public ObservableField<String> titleOb = new ObservableField<>();
}
