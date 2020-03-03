package com.mahuahudong.project.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mahuahudong.project.beans.ColunmBean;
import com.mahuahudong.project.view.fragment.HomeVideoFragment;
import com.mahuahudong.res.beans.ColumnBean;

import java.util.ArrayList;
import java.util.List;

public class HomeFrgPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList = new ArrayList<>();
    private List<ColunmBean> titleList = new ArrayList<>();

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    public HomeFrgPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position).getColumnName();
    }

    @Override
    public Fragment getItem(int position) {

        return fragmentList.get(position);
    }



    public void clearItems(){
        titleList.clear();
        fragmentList.clear();
        notifyDataSetChanged();
    }

    public void addItems(@Nullable List<ColunmBean> channelBeanList){
        titleList.clear();
        fragmentList.clear();
        titleList.addAll(channelBeanList);
        for (ColunmBean newsChannelBean:channelBeanList){
            fragmentList.add(HomeVideoFragment.newInstance(newsChannelBean));
        }
        notifyDataSetChanged();
    }

    public void addItem(@Nullable ColunmBean bean){
        titleList.add(bean);
        fragmentList.add(HomeVideoFragment.newInstance(bean));
        notifyDataSetChanged();
    }


    public void remove(@Nullable ColumnBean bean){
        int pos =  titleList.indexOf(bean);
        titleList.remove(pos);
        fragmentList.remove(pos);
        notifyDataSetChanged();
    }


    @Override
    public long getItemId(int position) {
        return titleList.get(position).hashCode();
    }



    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
