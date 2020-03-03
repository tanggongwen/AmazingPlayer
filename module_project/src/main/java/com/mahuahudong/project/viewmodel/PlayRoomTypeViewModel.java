package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.project.beans.PlayRoomTypeBean;

public class PlayRoomTypeViewModel extends ItemViewModel<PlayRoomFrgViewModel> {
    private PlayRoomTypeBean typeBean;
    public PlayRoomTypeViewModel(@NonNull PlayRoomFrgViewModel viewModel, PlayRoomTypeBean bean) {
        super(viewModel);
        typeBean = bean;
        typeOb.set(bean.getTypeName());
    }

    public ObservableField<String> typeOb = new ObservableField<>("战争");


    public BindingCommand typeSelectCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {

        }
    });

}
