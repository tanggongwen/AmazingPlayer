package com.mahuahudong.project.viewmodel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.mahuahudong.mvvm.base.BaseViewModel;
import com.mahuahudong.mvvm.binding.command.BindingAction;
import com.mahuahudong.mvvm.binding.command.BindingCommand;
import com.mahuahudong.mvvm.router.RouterActivityPath;
import com.mahuahudong.project.NetDateProvider;
import com.mahuahudong.project.R;
import com.mahuahudong.project.beans.HeadBean;
import com.mahuahudong.res.beans.VideoRespBean;
import com.mahuahudong.res.constants.RouterParames;
import com.mahuahudong.res.weiget.NiceImageView;
import com.zhouwei.mzbanner.holder.MZHolderCreator;
import com.zhouwei.mzbanner.holder.MZViewHolder;

import java.util.List;

public class HomeHeadItemViewModel<VM extends BaseViewModel> {


    public List<VideoRespBean.TabBean.RecBean> focusLsBeans;

    public BindingCommand onClickCommand = new BindingCommand(new BindingAction() {
        @Override
        public void call() {

        }
    });

    public void setDatas(List<VideoRespBean.TabBean.RecBean> datas){
        this.focusLsBeans = datas;
    }

    public MZHolderCreator<BannerViewHolder> mzHolderCreator = new MZHolderCreator<BannerViewHolder>() {
        @Override
        public BannerViewHolder createViewHolder() {
            return new BannerViewHolder();
        }
    };

    protected VM viewModel;

    public HomeHeadItemViewModel(@NonNull VM viewModel) {
        this.viewModel = viewModel;
    }


    public static class BannerViewHolder implements MZViewHolder<VideoRespBean.TabBean.RecBean> {
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
        public void onBind(Context context, int i, final VideoRespBean.TabBean.RecBean headBean) {
            Glide.with(context).load(headBean.getPic()).error(R.drawable.image_placeholder_white).into(imgFocus);
            tvTitle.setText(headBean.getName());
            rlytRoot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ARouter.getInstance().build(RouterActivityPath.PAGER_MOVIEDETAIL).withSerializable(RouterParames.KEY_VIDEO_ID,headBean.getVid()).navigation();
                }
            });
        }


    }
}
