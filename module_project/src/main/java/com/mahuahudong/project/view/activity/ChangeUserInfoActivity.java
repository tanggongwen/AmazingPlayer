package com.mahuahudong.project.view.activity;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityChangeuserinfoBinding;
import com.mahuahudong.project.viewmodel.ChangeUserInfoViewModel;
import com.mahuahudong.res.constants.RouterParames;

@Route(path = RouterActivityPath.PAGER_CHANGE_USER)
public class ChangeUserInfoActivity extends BaseActivity<ActivityChangeuserinfoBinding, ChangeUserInfoViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_changeuserinfo;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public ChangeUserInfoViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(ChangeUserInfoViewModel.class);
    }

    @Override
    public void initData() {
        boolean changerNick = getIntent().getBooleanExtra(RouterParames.KEY_CHANGE_NICK,false);
        viewModel.initData(changerNick);
    }
}
