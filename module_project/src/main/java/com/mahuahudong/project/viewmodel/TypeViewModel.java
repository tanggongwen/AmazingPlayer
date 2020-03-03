package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.res.beans.VideoTypeBean;

public class TypeViewModel extends ItemViewModel<HomeVideoViewModel> {
    private VideoTypeBean typeBean;
    public TypeViewModel(@NonNull HomeVideoViewModel viewModel, VideoTypeBean bean) {
        super(viewModel);
        typeBean = bean;
        typeOb.set(bean.getTitle());
    }

    public ObservableField<String> typeOb = new ObservableField<>("战争");


    public BindingCommand typeSelectCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {

        }
    });
}
