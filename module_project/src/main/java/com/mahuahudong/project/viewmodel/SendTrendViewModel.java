package com.mahuahudong.project.viewmodel;

import android.app.Application;
import android.graphics.Color;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableInt;

import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.project.model.HomeModel;
import com.mahuahudong.res.Utils;

public class SendTrendViewModel extends BaseViewModel<HomeModel> {
    private String colorSelected = "#000000";
    private String colorUnSelected = "#999999";
    public SendTrendViewModel(@NonNull Application application, HomeModel model) {
        super(application, model);
    }

    public BindingCommand backCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
                finish();
        }
    });


    public ObservableInt tvColorOb = new ObservableInt(Color.parseColor(colorUnSelected));
}
