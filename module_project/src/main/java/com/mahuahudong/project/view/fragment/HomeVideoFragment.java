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
import com.mahuahudong.project.databinding.FragmentHomeVideoBinding;
import com.mahuahudong.project.viewmodel.HomeVideoViewModel;
import com.mahuahudong.res.beans.FirstColumnBean;
import com.mahuahudong.res.constants.Constants;

import java.util.ArrayList;
import java.util.List;

@Route(path = RouterFragmentPath.Home.PAGER_HOME_VIDEO)
public class HomeVideoFragment extends BaseFragment<FragmentHomeVideoBinding, HomeVideoViewModel> {
    private FirstColumnBean.TabBean tabBean;
    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_home_video;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public void initData() {
        tabBean = (FirstColumnBean.TabBean) getArguments().getSerializable(Constants.PARAME_CHANNEL);
        viewModel.initData(tabBean.getList_id());
    }

    @Override
    public HomeVideoViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getActivity().getApplication());
        return ViewModelProviders.of(this,factory).get(HomeVideoViewModel.class);
    }

    public static HomeVideoFragment newInstance(FirstColumnBean.TabBean newsChannelBean, ArrayList<FirstColumnBean.TabBean> firstColumnBeans){
        HomeVideoFragment newsNormalFragment = new HomeVideoFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.PARAME_CHANNEL,newsChannelBean);
        bundle.putSerializable(Constants.PARAME_CHANNELLIST,firstColumnBeans);
        newsNormalFragment.setArguments(bundle);
        return newsNormalFragment;
    }
}