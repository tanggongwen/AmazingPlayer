package com.mahuahudong.project.view.activity;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityPersoninfoBinding;
import com.mahuahudong.project.viewmodel.PersonInfoViewModel;

@Route(path = RouterActivityPath.PAGER_PERSONINFO)
public class PersonInfoActivity extends BaseActivity<ActivityPersoninfoBinding, PersonInfoViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_personinfo;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public PersonInfoViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(PersonInfoViewModel.class);
    }
}
