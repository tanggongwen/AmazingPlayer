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
import com.mahuahudong.res.StringUtils;
import com.mahuahudong.res.beans.MyTrendReqBean;
import com.mahuahudong.res.beans.MyTrendsBean;

public class PersonStateItemViewModel extends ItemViewModel<PersonInfoViewModel> {
    public PersonStateItemViewModel(@NonNull PersonInfoViewModel viewModel, MyTrendsBean.ListBean.RowsBean rowsBean) {
        super(viewModel);
        contentOb.set(rowsBean.getContent());
        if (!StringUtils.isEmpty(rowsBean.getAvatar())){
            headUrlOb.set(rowsBean.getAvatar());
        }
        nameOb.set(rowsBean.getName());
        timeOb.set(rowsBean.getCreated_at());
    }

    public BindingCommand openTrendCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            ARouter.getInstance().build(RouterActivityPath.PAGER_TRENDS).navigation();
        }
    });

    public ObservableField<String> contentOb = new ObservableField<>();

    public ObservableField<String> nameOb = new ObservableField<>();

    public ObservableField<String> headUrlOb = new ObservableField<>();

    public ObservableField<String> timeOb = new ObservableField<>();

    public ObservableInt headPlaceHolder = new ObservableInt(R.drawable.ic_person_48px);
}
