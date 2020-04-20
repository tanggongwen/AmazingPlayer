package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;
import com.mahuahudong.res.beans.VideoTypeBean;
import com.mahuahudong.res.constants.RouterParames;

import java.util.ArrayList;
import java.util.List;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class HomeTypeItemViewModel extends ItemViewModel<HomeVideoViewModel> {
    private List<VideoTypeBean> typeBeanList = new ArrayList<>();
    private String pid="";
    public HomeTypeItemViewModel(@NonNull HomeVideoViewModel viewModel) {
        super(viewModel);
        typeBeanList.addAll(NetDateProvider.getHomeTypeData());
        for (VideoTypeBean typeBean:typeBeanList){
            items.add(new TypeViewModel(viewModel,typeBean));
        }
    }

    public void setPid(String pid){
        this.pid = pid;
    }

    public ObservableList<TypeViewModel> items = new ObservableArrayList<>();


    public ItemBinding<TypeViewModel> itemBinding = ItemBinding.of(BR.itemViewModel, R.layout.layout_item_type);


    public BindingCommand typeSelectCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_MOVIESELECT).withString(RouterParames.KEY_PID,pid).navigation();
        }
    });
}

