
package com.mahuahudong.project.view.activity;

import android.os.Bundle;
import android.view.View;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.mahuahudong.mvvm.base.BaseActivity;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.BR;
import com.mahuahudong.project.R;
import com.mahuahudong.project.config.HomeViewModelFactory;
import com.mahuahudong.project.databinding.ActivityMovieselectBinding;
import com.mahuahudong.project.viewmodel.MovieSelectViewModel;
import com.mahuahudong.res.beans.SelectedRespBean;
import com.mahuahudong.res.constants.RouterParames;
import com.mahuahudong.res.weiget.SlidingRvTabLayout;

import java.util.ArrayList;
import java.util.List;

@Route(path = RouterActivityPath.PAGER_MOVIESELECT)
public class MovieSelectActivity extends BaseActivity<ActivityMovieselectBinding, MovieSelectViewModel> {
    private String[] tabYears = {};
    private String[] tabTypes = {};
    private String[] tabCates = {};
    private String[] tabStates = {};
    private String[] tabWords = {};
    private List<SelectedRespBean.TabBean.CateBean> cateBeanList = new ArrayList<>();
    private List<String> cateStrList = new ArrayList<>();
    private List<SelectedRespBean.TabBean.TypeBean> typeBeanList = new ArrayList<>();
    private List<String> typeStrList = new ArrayList<>();
    private List<String> stateStrList = new ArrayList<>();
    private List<String> yearStrList = new ArrayList<>();
    private List<String> keywordStrList = new ArrayList<>();
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
        String pid = getIntent().getStringExtra(RouterParames.KEY_PID);
        viewModel.initDressSed(pid);
    }

    @Override
    public void initViewObservable() {
        viewModel.upDateColumnEvent.observe(this, new Observer<SelectedRespBean.TabBean>() {
            @Override
            public void onChanged(SelectedRespBean.TabBean tabBean) {
                if (null!=tabBean){
                    if (null!=tabBean.getCate()&&tabBean.getCate().size()>0){
                        binding.tabCate.setVisibility(View.VISIBLE);
                        for (SelectedRespBean.TabBean.CateBean cateBean:tabBean.getCate()){
                            cateBeanList.add(cateBean);
                            cateStrList.add(cateBean.getName());
                        }
                        tabCates = cateStrList.toArray(new String[cateStrList.size()]);
                        viewModel.setCate(cateBeanList.get(0).getCid());
                        binding.tabCate.setRecyclerView(tabCates);
                    }else {
                        binding.tabCate.setVisibility(View.GONE);
                    }
                    if (null!=tabBean.getType()&&tabBean.getType().size()>0){
                        binding.tabType.setVisibility(View.VISIBLE);
                        for (SelectedRespBean.TabBean.TypeBean typeBean:tabBean.getType()){
                            typeBeanList.add(typeBean);
                            typeStrList.add(typeBean.getName());
                        }
                        viewModel.setType(typeBeanList.get(0).getTid());
                        tabTypes = typeStrList.toArray(new String[typeStrList.size()]);
                        binding.tabType.setRecyclerView(tabTypes);
                    }else {
                        binding.tabType.setVisibility(View.GONE);
                    }
                    if (null!=tabBean.getState()&&tabBean.getState().size()>0){
                        binding.tabState.setVisibility(View.VISIBLE);
                        for (String state:tabBean.getState()){
                            stateStrList.add(state);
                        }
                        viewModel.setState(stateStrList.get(0));
                        tabStates = stateStrList.toArray(new String[stateStrList.size()]);
                        binding.tabState.setRecyclerView(tabStates);
                    }else {
                        binding.tabState.setVisibility(View.GONE);
                    }
                    if (null!=tabBean.getWord()&&tabBean.getWord().size()>0){
                        binding.tabWord.setVisibility(View.VISIBLE);
                        for (String word:tabBean.getWord()){
                            keywordStrList.add(word);
                        }
                        viewModel.setWord(keywordStrList.get(0));
                        tabWords = keywordStrList.toArray(new String[keywordStrList.size()]);
                        binding.tabWord.setRecyclerView(tabWords);
                    }else {
                        binding.tabWord.setVisibility(View.GONE);
                    }
                    if (null!=tabBean.getYear()&&tabBean.getYear().size()>0){
                        binding.tabYear.setVisibility(View.VISIBLE);
                        for (String year:tabBean.getYear()){
                            yearStrList.add(year);
                        }
                        viewModel.setYear(yearStrList.get(0));
                        tabYears = yearStrList.toArray(new String[yearStrList.size()]);
                        binding.tabYear.setRecyclerView(tabYears);
                    }else {
                        binding.tabYear.setVisibility(View.GONE);
                    }
                }
                binding.tabState.setOnTabSelectListener(new SlidingRvTabLayout.OnTabSelectListener() {
                    @Override
                    public void onTabSelect(int position) {

                        binding.tabState.setCurrentTab(position);
                        viewModel.setState(stateStrList.get(position));
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
                        viewModel.setType(typeBeanList.get(position).getTid());
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
                        viewModel.setYear(yearStrList.get(position));
                        viewModel.reloadVideos();
                    }

                    @Override
                    public void onTabReselect(int position) {

                    }
                });
                binding.tabCate.setOnTabSelectListener(new SlidingRvTabLayout.OnTabSelectListener() {
                    @Override
                    public void onTabSelect(int position) {

                        binding.tabCate.setCurrentTab(position);
                        viewModel.setCate(cateBeanList.get(position).getCid());
                        viewModel.reloadVideos();
                    }

                    @Override
                    public void onTabReselect(int position) {

                    }
                });

                binding.tabWord.setOnTabSelectListener(new SlidingRvTabLayout.OnTabSelectListener() {
                    @Override
                    public void onTabSelect(int position) {
                        binding.tabWord.setCurrentTab(position);
                        viewModel.setWord(keywordStrList.get(position));
                        viewModel.reloadVideos();
                    }

                    @Override
                    public void onTabReselect(int position) {

                    }
                });
                viewModel.reloadVideos();
            }
        });
    }

    @Override
    public MovieSelectViewModel initViewModel() {
        HomeViewModelFactory factory = HomeViewModelFactory.getInstance(getApplication());
        return ViewModelProviders.of(this,factory).get(MovieSelectViewModel.class);
    }
}

