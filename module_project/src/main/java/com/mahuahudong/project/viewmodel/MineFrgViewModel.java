package com.mahuahudong.project.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableList;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.model.HomeModel;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class MineFrgViewModel extends BaseViewModel<HomeModel> {
    public MineFrgViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
        itemViewModels.add(new WatchHistoryItemViewModel(MineFrgViewModel.this));
        itemViewModels.add(new WatchHistoryItemViewModel(MineFrgViewModel.this));
        itemViewModels.add(new WatchHistoryItemViewModel(MineFrgViewModel.this));
        itemViewModels.add(new WatchHistoryItemViewModel(MineFrgViewModel.this));
    }

    public ObservableField<String> headUrl = new ObservableField<>();

    public ObservableInt headPlaceHolder = new ObservableInt(R.drawable.head_defalut);

    public ItemBinding itemBinding = ItemBinding.of(BR.itemViewModel,R.layout.layout_item_watchhistory);

    public ObservableList<WatchHistoryItemViewModel> itemViewModels = new ObservableArrayList<>();

    public BindingCommand openWatchHistoryListCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_WATCHHISTORYLIST).navigation();
        }
    });
}
