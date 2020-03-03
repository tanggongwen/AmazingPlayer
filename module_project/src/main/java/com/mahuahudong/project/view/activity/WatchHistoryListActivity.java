package com.mahuahudong.project.view.activity;

import android.os.Bundle;

import androidx.lifecycle.Observer;

import com.flyco.tablayout.listener.OnTabSelectListener;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.beans.ColunmBean;
import com.mahuahudong.project.databinding.ActivityWatchhistorylistBinding;
import com.mahuahudong.project.viewmodel.WatchHistoryListViewModel;

import java.util.ArrayList;
import java.util.List;

public class WatchHistoryListActivity extends BaseActivity<ActivityWatchhistorylistBinding, WatchHistoryListViewModel> {
    private List<String> columList = new ArrayList<>();
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_watchhistorylist;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        binding.tabs.setViewPager(binding.vpVideos);
    }

    @Override
    public WatchHistoryListViewModel initViewModel() {
        return super.initViewModel();
    }

    @Override
    public void initViewObservable() {
        viewModel.colunList.observe(this, new Observer<List<ColunmBean>>() {
            @Override
            public void onChanged(List<ColunmBean> colunmBeans) {
                binding.vpVideos.setOffscreenPageLimit(colunmBeans.size());
                columList.clear();
                for (ColunmBean channelBean:colunmBeans){
                    columList.add(channelBean.getColumnName());
                }
                String[] titles = columList.toArray(new String[columList.size()]);
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
    }
}
