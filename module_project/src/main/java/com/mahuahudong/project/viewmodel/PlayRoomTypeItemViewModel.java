package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableList;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;
import com.mahuahudong.project.beans.PlayRoomTypeBean;

import java.util.ArrayList;
import java.util.List;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

public class PlayRoomTypeItemViewModel extends ItemViewModel<PlayRoomFrgViewModel> {
    private List<PlayRoomTypeBean> typeBeanList = new ArrayList<>();
    public PlayRoomTypeItemViewModel(@NonNull PlayRoomFrgViewModel viewModel) {
        super(viewModel);
        typeBeanList.addAll(NetDateProvider.getPlayRoomTypeData());
        for (PlayRoomTypeBean typeBean:typeBeanList){
            items.add(new PlayRoomTypeViewModel(viewModel,typeBean));
        }
    }

    public ObservableList<PlayRoomTypeViewModel> items = new ObservableArrayList<>();


    public ItemBinding<PlayRoomTypeViewModel> itemBinding = ItemBinding.of(BR.itemViewModel, R.layout.layout_item_playroom_type);


    public BindingCommand typeSelectCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {

        }
    });
}
