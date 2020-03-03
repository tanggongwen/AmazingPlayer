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
import com.mahuahudong.project.beans.ColunmBean;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.FragmentHomeVideoBinding;
import com.mahuahudong.project.viewmodel.HomeVideoViewModel;
import com.mahuahudong.res.constants.Constants;

@Route(path = RouterFragmentPath.Home.PAGER_HOME_VIDEO)
public class HomeVideoFragment extends BaseFragment<FragmentHomeVideoBinding, HomeVideoViewModel> {
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_home_video;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public HomeVideoViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getActivity().getApplication());
        return ViewModelProviders.of(this,factory).get(HomeVideoViewModel.class);
    }

    public static HomeVideoFragment newInstance(ColunmBean newsChannelBean){
        HomeVideoFragment newsNormalFragment = new HomeVideoFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.PARAME_NEWS_CHANNEL,newsChannelBean);
        newsNormalFragment.setArguments(bundle);
        return newsNormalFragment;
    }
}