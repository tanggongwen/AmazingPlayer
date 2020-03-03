package com.mahuahudong.project.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mahuahudong.mvvm.base.BaseFragment;
import com.mahuahudong.mvvm.router.RouterFragmentPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.FragmentLiveBinding;
import com.mahuahudong.project.viewmodel.LiveFrgViewModel;

@Route(path = RouterFragmentPath.Home.PAGER_LIVE)
public class LiveFragment extends BaseFragment<FragmentLiveBinding, LiveFrgViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_live;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public LiveFrgViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getActivity().getApplication());
        return ViewModelProviders.of(this,factory).get(LiveFrgViewModel.class);
    }
}
