package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.databean.LiveBean;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;

import java.util.ArrayList;
import java.util.List;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class LivePagerViewModel extends ItemViewModel<LiveFrgViewModel> {
    private List<LiveBean> liveBeanList = new ArrayList<>();


    public ItemBinding<LiveGridItemViewModel> onItemBind = ItemBinding.of(BR.itemViewModel,R.layout.layout_item_live);

    public ObservableList<LiveGridItemViewModel> items = new ObservableArrayList<>();




    public BindingCommand refreshCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            items.clear();
            getLiveDatas();
        }
    });


    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {

        }
    });

    public LivePagerViewModel(@NonNull LiveFrgViewModel viewModel) {
        super(viewModel);
        getLiveDatas();
    }

    private void getLiveDatas(){
        liveBeanList.addAll(NetDateProvider.getLiveList());
        for (LiveBean liveBean:liveBeanList){
            items.add(new LiveGridItemViewModel(viewModel,liveBean));
        }
    }


}
