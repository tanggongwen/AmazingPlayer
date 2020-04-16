package com.mahuahudong.project.viewmodel;

import androidx.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mahuahudong.mvvm.base.ItemViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.res.beans.MyTrendReqBean;
import com.mahuahudong.res.beans.MyTrendsBean;

public class PersonStateItemViewModel extends ItemViewModel<PersonInfoViewModel> {
    public PersonStateItemViewModel(@NonNull PersonInfoViewModel viewModel, MyTrendsBean.ListBean.RowsBean rowsBean) {
        super(viewModel);
    }

    public BindingCommand openTrendCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_TRENDS).navigation();
        }
    });
}
