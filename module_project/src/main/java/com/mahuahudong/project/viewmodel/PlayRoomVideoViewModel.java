package com.mahuahudong.project.viewmodel;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.ItemViewModel;
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

public class PlayRoomVideoViewModel extends ItemViewModel<PlayRoomFrgViewModel> {
        private int page = 0;
        private int size = 10;
        private HomeModel model;
    private HomeHeadItemViewModel homeHeadItemViewModel = new HomeHeadItemViewModel(viewModel);
    private VideoGridViewModel videoGridViewModel = new VideoGridViewModel(viewModel,"为您推荐");

    public OnItemBind<Object> onItemBind = new OnItemBind<Object>() {
        @Override
        public void onItemBind(@NonNull ItemBinding itemBinding, int position, Object item) {
            if (item.getClass().equals(HomeHeadItemViewModel.class)){
                itemBinding.set(BR.itemViewModel, R.layout.home_item_head);
            }else if (item.getClass().equals(VideoGridViewModel.class)){
                itemBinding.set(BR.itemViewModel,R.layout.layout_video);
            }else if (item.getClass().equals(PlayRoomTypeItemViewModel.class)){
                itemBinding.set(BR.itemViewModel,R.layout.playroom_item_type);
            }
        }
    };

    public ObservableList<Object> items = new ObservableArrayList<>();




    public BindingCommand refreshCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            items.clear();
            page = 0;
            getHomeDatas();
        }
    });


    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {
            getHomeDatas();
        }
    });

    public PlayRoomVideoViewModel(@NonNull PlayRoomFrgViewModel viewModel, HomeModel model) {
        super(viewModel);
        this.model = model;
        getHomeDatas();
    }

    @SuppressLint("CheckResult")
    private void getHomeDatas(){


        model.getVideoHomeDatas("1",page+"",size+"")
                .compose(RxUtils.schedulersTransformer())
                .doOnSubscribe(viewModel)
                .subscribe(new Consumer<VideoRespBean>() {
                    @Override
                    public void accept(VideoRespBean firstColumnBean) {
                        if (firstColumnBean.getCode().equals("200")){

                            if (null!=firstColumnBean.getTab().getRec()&&firstColumnBean.getTab().getRec().size()>0){
                                if (!items.contains(homeHeadItemViewModel)){
                                    items.add(homeHeadItemViewModel);
                                }
                                homeHeadItemViewModel.setDatas(firstColumnBean.getTab().getRec());
//                                if (!items.contains(homeTypeItemViewModel)){
//                                    items.add(homeTypeItemViewModel);
//                                }
                            }

                            if (null!=firstColumnBean.getTab().getRows()&&firstColumnBean.getTab().getRows().size()>0){
                                if (!items.contains(videoGridViewModel)){
                                    items.add(videoGridViewModel);
                                    page =page+1;
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

//
//        items.add(new HomeHeadItemViewModel(viewModel));
//        items.add(new PlayRoomTypeItemViewModel(viewModel));
//        items.add(new VideoGridViewModel<>(viewModel,"为您推荐"));
//        items.add(new VideoGridViewModel<>(viewModel,"精彩电视剧"));
//        items.add(new VideoGridViewModel<>(viewModel,"最新电视剧"));
    }


}
