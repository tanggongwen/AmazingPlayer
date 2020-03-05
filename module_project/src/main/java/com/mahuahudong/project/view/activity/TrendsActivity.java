package com.mahuahudong.project.view.activity;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityTrendsBinding;
import com.mahuahudong.project.viewmodel.TrendsViewModel;

@Route(path = RouterActivityPath.PAGER_TRENDS)
public class TrendsActivity extends BaseActivity<ActivityTrendsBinding, TrendsViewModel> {
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_trends;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public TrendsViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(TrendsViewModel.class);
    }
}
