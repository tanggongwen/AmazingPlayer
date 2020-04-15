package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.project.R;
import com.mahuahudong.res.StringUtils;
import com.mahuahudong.res.beans.MyFocusBean;

public class MyAttentionItemViewModel extends ItemViewModel<MyAttentionViewModel> {
    private MyFocusBean.ListBean.RowsBean rowsBean;
    public MyAttentionItemViewModel(@NonNull MyAttentionViewModel viewModel, MyFocusBean.ListBean.RowsBean rowsBean) {
        super(viewModel);
        this.rowsBean = rowsBean;
        if (!StringUtils.isEmpty(rowsBean.getAvatar())){
            headUrlOb.set(rowsBean.getAvatar());
        }
        nameOb.set(rowsBean.getName());
    }

    public ObservableInt headPlaceHolder = new ObservableInt(R.drawable.ic_account_circle_48px);

    public ObservableField<String> headUrlOb  = new ObservableField<>();

    public ObservableField<String> nameOb  = new ObservableField<>();

    public ObservableField<String> introOb  = new ObservableField<>("主播介绍");


    public BindingCommand focusCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            viewModel.addFocus(rowsBean.getLid());
        }
    });
}
