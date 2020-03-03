package com.mahuahudong.mvvm.adapter;

import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class BaseFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    public BaseFragmentPagerAdapter(FragmentManager fragmentManager, List<Fragment> fragments, List<String> titleList){
        super(fragmentManager);
        this.fragmentList = fragments;
        this.titleList = titleList;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }



//    @Override
//    public int getCount() {
//      return   fragmentList.size();
//    }

//    @Override
//    public Fragment getAdapterItem(int position) {
//        return fragmentList.get(position);
//    }
}
