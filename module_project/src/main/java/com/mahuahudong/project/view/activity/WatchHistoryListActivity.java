package com.mahuahudong.project.view.activity;

import android.os.Bundle;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.beans.ColunmBean;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityWatchhistorylistBinding;
import com.mahuahudong.project.viewmodel.WatchHistoryListViewModel;

import java.util.ArrayList;
import java.util.List;
@Route(path = RouterActivityPath.PAGER_WATCHHISTORYLIST)
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

    }

    @Override
    public WatchHistoryListViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(WatchHistoryListViewModel.class);
    }

    @Override
    public void initViewObservable() {
        viewModel.colunListEvent.observe(this, new Observer<List<ColunmBean>>() {
            @Override
            public void onChanged(List<ColunmBean> colunmBeans) {
                binding.historyPager.setOffscreenPageLimit(colunmBeans.size());
                columList.clear();
                for (ColunmBean channelBean:colunmBeans){
                    columList.add(channelBean.getColumnName());
                }
                String[] titles = columList.toArray(new String[columList.size()]);
//                binding.tabs.setViewPager(binding.historyPager,titles);
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
