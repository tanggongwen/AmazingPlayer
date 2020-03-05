package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.router.RouterActivityPath;

public class PersonInfoItemViewModel extends ItemViewModel<PersonInfoViewModel> {
    public PersonInfoItemViewModel(@NonNull PersonInfoViewModel viewModel) {
        super(viewModel);
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
}
