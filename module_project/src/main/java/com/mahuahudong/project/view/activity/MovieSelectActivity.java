package com.mahuahudong.project.view.activity;

import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityMovieselectBinding;
import com.mahuahudong.project.viewmodel.MovieDetailViewModel;
import com.mahuahudong.project.viewmodel.MovieSelectViewModel;
import com.mahuahudong.res.weiget.SlidingRvTabLayout;

@Route(path = RouterActivityPath.PAGER_MOVIESELECT)
public class MovieSelectActivity extends BaseActivity<ActivityMovieselectBinding, MovieSelectViewModel> {
    private String[] tabYears = {"全部年份","2018","2017","2016","2015","2014","2013","2012","2011","2010"};
    private String[] tabTypes = {"全部类型","爱情","恐怖","历史","犯罪","喜剧","经典","科幻","玄幻","动画"};
    private String[] tabAreas = {"全部地区","韩国","日本","美国","英国","泰国","马来西亚","新加坡"};
    private String[] tabTops = {"最新","高分","最多评论","最多观看"};
    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_movieselect;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    @Override
    public void initData() {
        binding.tabArea.setRecyclerView(tabAreas);
        binding.tabType.setRecyclerView(tabTypes);
        binding.tabYear.setRecyclerView(tabYears);
        binding.tabTop.setRecyclerView(tabTops);
        binding.tabArea.setOnTabSelectListener(new SlidingRvTabLayout.OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {

                binding.tabArea.setCurrentTab(position);
                viewModel.reloadVideos();
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
        binding.tabType.setOnTabSelectListener(new SlidingRvTabLayout.OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {

                binding.tabType.setCurrentTab(position);
                viewModel.reloadVideos();
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
        binding.tabYear.setOnTabSelectListener(new SlidingRvTabLayout.OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {

                binding.tabYear.setCurrentTab(position);
                viewModel.reloadVideos();
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
        binding.tabTop.setOnTabSelectListener(new SlidingRvTabLayout.OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {

                binding.tabTop.setCurrentTab(position);
                viewModel.reloadVideos();
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
    }


    @Override
    public MovieSelectViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(MovieSelectViewModel.class);
    }
}
