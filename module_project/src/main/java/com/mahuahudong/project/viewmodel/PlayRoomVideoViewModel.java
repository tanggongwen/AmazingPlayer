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

import me.tatarka.bindingcollectionadapter2.ItemBinding;
import me.tatarka.bindingcollectionadapter2.OnItemBind;

public class PlayRoomVideoViewModel extends ItemViewModel<PlayRoomFrgViewModel> {


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
            getHomeDatas();
        }
    });


    public BindingCommand onLoadMoreCommand = new BindingCommand<>(new BindingAction() {
        @Override
        public void call() {

        }
    });

    public PlayRoomVideoViewModel(@NonNull PlayRoomFrgViewModel viewModel) {
        super(viewModel);
        getHomeDatas();
    }

    private void getHomeDatas(){
        items.add(new HomeHeadItemViewModel(viewModel));
        items.add(new PlayRoomTypeItemViewModel(viewModel));
        items.add(new VideoGridViewModel<>(viewModel,"为您推荐", NetDateProvider.getVideoList()));
        items.add(new VideoGridViewModel<>(viewModel,"精彩电视剧", NetDateProvider.getVideoList()));
        items.add(new VideoGridViewModel<>(viewModel,"最新电视剧", NetDateProvider.getVideoList()));
    }


}
