package com.mahuahudong.project.viewmodel;

import android.text.format.DateUtils;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.databean.VideoHistoryBean;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.R;
import com.mahuahudong.res.constants.RouterParames;

public class WatchHistoryMovieItemViewModel extends ItemViewModel<WatchHistoryListViewModel> {
    private VideoHistoryBean videoHistoryBean;
    public WatchHistoryMovieItemViewModel(@NonNull WatchHistoryListViewModel viewModel, VideoHistoryBean videoHistoryBean) {
        super(viewModel);
        this.videoHistoryBean = videoHistoryBean;
        coverOb.set(videoHistoryBean.getPic());
        nameOb.set(videoHistoryBean.getName());
        timeOb.set(videoHistoryBean.getTimeStamp()+"");
    }

    public ObservableInt coverPlaceHoder = new ObservableInt(R.color.white);

    public ObservableField<String> coverOb = new ObservableField<>("");

    public ObservableField<String> timeOb = new ObservableField<>("");

    public ObservableField<String> nameOb = new ObservableField<>("");

    public BindingCommand itemCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_MOVIEDETAIL).withSerializable(RouterParames.KEY_VIDEO_ID,videoHistoryBean.getVid()).navigation();
        }
    });

}
