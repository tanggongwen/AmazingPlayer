package com.mahuahudong.project.viewmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;
import com.mahuahudong.project.beans.HeadBean;
import com.mahuahudong.res.weiget.NiceImageView;
import com.zhouwei.mzbanner.holder.MZHolderCreator;
import com.zhouwei.mzbanner.holder.MZViewHolder;

import java.util.List;

public class HomeHeadItemViewModel<VM extends BaseViewModel> {


    public List<HeadBean> focusLsBeans;

    public BindingCommand onClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {

        }
    });

    public MZHolderCreator<BannerViewHolder> mzHolderCreator = new MZHolderCreator<BannerViewHolder>() {
        @Override
        public BannerViewHolder createViewHolder() {
            return new BannerViewHolder();
        }
    };

    protected VM viewModel;

    public HomeHeadItemViewModel(@NonNull VM viewModel) {
        this.viewModel = viewModel;
        this.focusLsBeans = NetDateProvider.getHomeHeadData();
    }


    public static class BannerViewHolder implements MZViewHolder<HeadBean> {
        private NiceImageView imgFocus;
        private TextView tvTitle;
        private RelativeLayout rlytRoot;

        @Override
        public View createView(Context context) {
            // 返回页面布局
            View view = LayoutInflater.from(context).inflate(R.layout.home_item_head_pager,null);
            imgFocus = (NiceImageView) view.findViewById(R.id.imgFocus);
            tvTitle = view.findViewById(R.id.tvTitle);
            rlytRoot = view.findViewById(R.id.rlytRoot);
            return view;
        }



        @Override
        public void onBind(Context context, int i, final HeadBean headBean) {
            Glide.with(context).load(headBean.getUrl()).error(R.drawable.image_placeholder_white).into(imgFocus);
            tvTitle.setText(headBean.getTitle());
            rlytRoot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }


    }
}
