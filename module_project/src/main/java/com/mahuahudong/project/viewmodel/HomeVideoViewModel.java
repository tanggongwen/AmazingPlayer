package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class HomeVideoViewModel extends BaseViewModel<HomeModel> {
    public HomeVideoViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
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
            getHomeDatas();
        }
    });


    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {

        }
    });

    private void getHomeDatas(){
        items.add(new HomeHeadItemViewModel(HomeVideoViewModel.this));
        items.add(new HomeTypeItemViewModel(HomeVideoViewModel.this));
        items.add(new VideoGridViewModel<>(HomeVideoViewModel.this,"为您推荐", NetDateProvider.getVideoList()));
    }


}
