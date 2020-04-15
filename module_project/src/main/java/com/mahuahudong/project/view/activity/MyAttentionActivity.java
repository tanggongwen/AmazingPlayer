package com.mahuahudong.project.view.activity;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityMyattentionBinding;
import com.mahuahudong.project.viewmodel.MyAttentionViewModel;

@Route(path = RouterActivityPath.PAGER_MYATTENTION)
public class MyAttentionActivity extends BaseActivity<ActivityMyattentionBinding, MyAttentionViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_myattention;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public MyAttentionViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(MyAttentionViewModel.class);
    }



}
