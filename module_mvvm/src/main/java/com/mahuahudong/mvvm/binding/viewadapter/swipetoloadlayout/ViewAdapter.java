package com.mahuahudong.mvvm.binding.viewadapter.swipetoloadlayout;

import androidx.databinding.BindingAdapter;

import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.res.weiget.swipetoloadlayout.OnLoadMoreListener;
import com.mahuahudong.res.weiget.swipetoloadlayout.OnRefreshListener;
import com.mahuahudong.res.weiget.swipetoloadlayout.SwipeToLoadLayout;


/**
 * Created by goldze on 2017/6/18.
 */
public class ViewAdapter {
    //下拉刷新命令
    @BindingAdapter(value = {"onRefreshCommand","onLoadMoreCommand"},requireAll = false)
    public static void onRefreshCommand(final SwipeToLoadLayout swipeToLoadLayout, final BindingCommand onRefreshCommand, final BindingCommand onLoadMoreCommand) {

        swipeToLoadLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (onRefreshCommand != null) {
                    onRefreshCommand.execute();
                    swipeToLoadLayout.setRefreshing(false);
                }
            }
        });

        swipeToLoadLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore() {
                if (onLoadMoreCommand != null) {
                    onLoadMoreCommand.execute();
                    swipeToLoadLayout.setLoadingMore(false);
                }
            }
        });
    }

    //是否刷新中
    @BindingAdapter(value = {"refreshing","loadingMore"})
    public static void setRefreshing(SwipeToLoadLayout swipeRefreshLayout, boolean refreshing,boolean loadingMore) {
        swipeRefreshLayout.setRefreshing(refreshing);
        swipeRefreshLayout.setLoadingMore(loadingMore);
    }


    //是否刷新中
    @BindingAdapter(value = {"loadingMore"})
    public static void setLoadingMore(SwipeToLoadLayout swipeRefreshLayout,boolean loadingMore) {
        swipeRefreshLayout.setLoadingMore(loadingMore);
    }




}
