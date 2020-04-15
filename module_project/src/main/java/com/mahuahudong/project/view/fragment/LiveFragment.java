package com.mahuahudong.project.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.mahuahudong.module_live.entertainment.activity.LiveActivity;
import com.mahuahudong.module_live.entertainment.activity.LiveModeChooseActivity;
import com.mahuahudong.mvvm.base.BaseFragment;
import com.mahuahudong.mvvm.router.RouterFragmentPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.beans.ColunmBean;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.FragmentLiveBinding;
import com.mahuahudong.project.viewmodel.LiveFrgViewModel;

import java.util.ArrayList;
import java.util.List;

@Route(path = RouterFragmentPath.Home.PAGER_LIVE)
public class LiveFragment extends BaseFragment<FragmentLiveBinding, LiveFrgViewModel> {
    private List<String> colunmList = new ArrayList<>();
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


    @Override
    public void initViewObservable() {
        viewModel.colunList.observe(this, new Observer<List<ColunmBean>>() {
            @Override
            public void onChanged(List<ColunmBean> colunmBeans) {
                binding.vpVideos.setOffscreenPageLimit(colunmBeans.size());
                colunmList.clear();
                for (ColunmBean channelBean:colunmBeans){
                    colunmList.add(channelBean.getColumnName());
                }
                String[] titles = colunmList.toArray(new String[colunmList.size()]);
                binding.tabs.setViewPager(binding.vpVideos,titles);
                binding.tabs.setOnTabSelectListener(new OnTabSelectListener() {
                    @Override
                    public void onTabSelect(int position) {

                    }

                    @Override
                    public void onTabReselect(int position) {

                    }
                });
            }
        });
        viewModel.startLiveEvent.observe(this, new Observer() {
            @Override
            public void onChanged(Object o) {
                LiveActivity.start(getActivity(), true, true);
            }
        });
    }
}
