package com.mahuahudong.project.view.activity;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityAccountmanagerBinding;
import com.mahuahudong.project.viewmodel.AccountManagerViewModel;
import com.mahuahudong.project.viewmodel.RegisterViewModel;

@Route(path = RouterActivityPath.PAGER_ACCOUNTMANAGER)
public class AccountManagerActivity extends BaseActivity<ActivityAccountmanagerBinding, AccountManagerViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_accountmanager;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public AccountManagerViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(AccountManagerViewModel.class);
    }
}
