package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.utils.RxUtils;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.beans.VideoRespBean;

import io.reactivex.functions.Consumer;
import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class HomeVideoViewModel extends BaseViewModel<HomeModel> {
    private int pageSize = 10;
    private String pid="";
    private int page = 0;
    private HomeHeadItemViewModel homeHeadItemViewModel = new HomeHeadItemViewModel(HomeVideoViewModel.this);
    private VideoGridViewModel videoGridViewModel = new VideoGridViewModel(HomeVideoViewModel.this,"为您推荐");
    private HomeTypeItemViewModel homeTypeItemViewModel = new HomeTypeItemViewModel(HomeVideoViewModel.this);
    public HomeVideoViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);

    }

    public void initData(String pid){
        this.pid = pid;
        getHomeDatas();
    }

    public OnItemBind<Object> onItemBind = new OnItemBind<Object>() {
        @Override
        public void onItemBind(@NonNull ItemBinding itemBinding, int position, Object item) {
            if (item.getClass().equals(HomeHeadItemViewModel.class)){
                itemBinding.set(BR.itemViewModel, R.layout.home_item_head);
            }else if (item.getClass().equals(HomeTypeItemViewModel.class)){
                itemBinding.set(BR.itemViewModel,R.layout.home_item_type);
            }else if (item.getClass().equals(VideoGridViewModel.class)){
                itemBinding.set(BR.itemViewModel,R.layout.layout_video);
            }
        }
    };

    public ObservableList<Object> items = new ObservableArrayList<>();




    public BindingCommand refreshCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            items.clear();
            page =1;
            getHomeDatas();
        }
    });


    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {
            getHomeDatas();
        }
    });

    @SuppressLint("CheckResult")
    private void getHomeDatas(){
        model.getVideoHomeDatas(pid,page+"",pageSize+"")
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(HomeVideoViewModel.this)
                .subscribe(new Consumer<VideoRespBean>() {
                    @Override
                    public void accept(VideoRespBean firstColumnBean) {
                        if (firstColumnBean.getCode().equals("200")){

                                if (null!=firstColumnBean.getTab().getRec()&&firstColumnBean.getTab().getRec().size()>0){
                                    if (!items.contains(homeHeadItemViewModel)){
                                        items.add(homeHeadItemViewModel);
                                    }
                                    homeHeadItemViewModel.setDatas(firstColumnBean.getTab().getRec());
                                    if (!items.contains(homeTypeItemViewModel)){
                                        items.add(homeTypeItemViewModel);
                                    }
                                }

                                if (null!=firstColumnBean.getTab().getRows()&&firstColumnBean.getTab().getRows().size()>0){
                                    if (!items.contains(videoGridViewModel)){
                                        items.add(videoGridViewModel);
                                        page =pageSize+1;
                                    }
                                    videoGridViewModel.addItems(firstColumnBean.getTab().getRows());
                                }
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) {

                    }
                });


    }


}
