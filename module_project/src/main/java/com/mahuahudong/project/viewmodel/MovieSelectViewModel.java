package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.bus.RxBus;
import com.mahuahudong.mvvm.databean.VideoBean;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.mvvm.utils.Utils;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;

import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.beans.AddTrendRespBean;
import com.mahuahudong.res.beans.SelectedRespBean;
import com.mahuahudong.res.weiget.TipToast;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Consumer;
import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class MovieSelectViewModel extends BaseViewModel<HomeModel> {
    private List<VideoBean> videoBeanList = new ArrayList<>();
    public MovieSelectViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        videoBeanList.addAll(NetDateProvider.getVideoList());
        refreshVideos();
    }

    public void initDressSed(String pid){
        model.getSecendColumn(pid)
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(MovieSelectViewModel.this)
                .subscribe(new Consumer<SelectedRespBean>() {
                    @Override
                    public void accept(SelectedRespBean selectedRespBean) {
                        if (selectedRespBean.getCode().equals("200")){

                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) {
                        TipToast.showTextToas(Utils.getContext(),"获取筛选列表失败");
                    }
                });
    }

    private void refreshVideos(){
        for (VideoBean videoBean: videoBeanList){
//            items.add(new MovieGridItemViewModel(MovieSelectViewModel.this,videoBean));
        }
    }

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            finish();
        }
    });


    public ItemBinding<MovieGridItemViewModel> itemBinding = ItemBinding.of(BR.girdItemVideModel,R.layout.layout_item_movie_gridvideo);

    public ObservableList<MovieGridItemViewModel> items = new ObservableArrayList<>();




    public BindingCommand refreshCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            reloadVideos();
        }
    });


    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {
            List<VideoBean> moreVideos = new ArrayList<>();
            moreVideos.addAll(NetDateProvider.getVideoList());
            for (VideoBean videoBean:moreVideos){
//                items.add(new MovieGridItemViewModel(MovieSelectViewModel.this,videoBean));
                videoBeanList.add(videoBean);
            }
        }
    });

    public void reloadVideos(){
        items.clear();
        videoBeanList.clear();
        videoBeanList.addAll(NetDateProvider.getVideoList());
        refreshVideos();
    }
}
