package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.R;
import com.mahuahudong.res.controller.PersonInfoManager;

public class PersonInfoItemViewModel extends ItemViewModel<PersonInfoViewModel> {
    public PersonInfoItemViewModel(@NonNull PersonInfoViewModel viewModel) {
        super(viewModel);
        if (null!= PersonInfoManager.INSTANCE.getUserBean()){
            headUrl.set(PersonInfoManager.INSTANCE.getUserBean().getInfo().getPic());
        }
    }

    public BindingCommand openMyAttentionCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_MYATTENTION).navigation();
        }
    });

    public BindingCommand openAccountManagerCommand= new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_ACCOUNTMANAGER).navigation();
        }
    });



    public ObservableField<String> headUrl = new ObservableField<>();


    public ObservableInt headPlaceHoder = new ObservableInt(R.drawable.ic_account_circle_48px);
}
