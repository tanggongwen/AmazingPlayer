package com.mahuahudong.res.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mahuahudong.res.R;
import com.mahuahudong.res.StringUtils;
import com.mahuahudong.res.beans.NewsCommontBean.UserCommontBean;
import com.mahuahudong.res.controller.PersonInfoManager;
import com.mahuahudong.res.weiget.CommontPopupWindow.CommontPopupWindowClickListener;

import java.util.ArrayList;
import java.util.List;


public class CommontItemAdapter extends RecyclerView.Adapter<CommontItemAdapter.VideoHolder> {

    private List<UserCommontBean> commontBeans = new ArrayList<>();
    private Context context;
    private CommontPopupWindowClickListener commontPopupWindowClickListener;

    public CommontItemAdapter(List<UserCommontBean> commontBeanList, Context context, CommontPopupWindowClickListener clickListener) {
        this.commontBeans = commontBeanList;
        this.commontPopupWindowClickListener = clickListener;
        this.context = context;
    }

    public CommontItemAdapter(Context context, CommontPopupWindowClickListener clickListener) {
        this.context = context;
        this.commontPopupWindowClickListener = clickListener;
    }

    public void setCommontClickListener(CommontPopupWindowClickListener clickListener){
        this.commontPopupWindowClickListener = clickListener;
    }

    public void addDatas(List<UserCommontBean> commontBeanList){
        commontBeans = commontBeanList;
        notifyDataSetChanged();
    }

    public void addCommont(UserCommontBean userCommontBean){
        commontBeans.add(0,userCommontBean);
        notifyDataSetChanged();
    }

    @Override
    public VideoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.layout_commont_item, parent, false);
        return new VideoHolder(itemView);

    }

    @Override
    public void onBindViewHolder(final VideoHolder holder, final int position) {
        final UserCommontBean commontBean = commontBeans.get(position);
        holder.tvNickName.setText(commontBean.getUserInfo().getPetName());
        Glide.with(context).load(commontBean.getUserInfo().getProfilePhoto())
                .placeholder(R.drawable.head_defalut).into(holder.imgIcon);
        holder.likeCount.setText(commontBean.getLikeCount()+"");
        holder.tvContent.setText(commontBean.getDiscussContent());
        holder.tvTime.setText(commontBean.getIssueTime());
        if (commontBean.getHasLike().equals("1")){
            holder.imgLike.setImageResource(R.drawable.icon_like_press);
            holder.likeCount.setTextColor(Color.RED);
        }else {
            holder.imgLike.setImageResource(R.drawable.icon_like_normal);
            holder.likeCount.setTextColor(Color.parseColor("#dcdcdc"));
        }
        holder.imgLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!StringUtils.isEmpty(PersonInfoManager.INSTANCE.getUserToken())){
                    if (commontBean.getHasLike().equals("1")){
                        commontBeans.get(position).setHasLike("");
                        commontBeans.get(position).setLikeCount(commontBean.getLikeCount()-1);
                        holder.imgLike.setImageResource(R.drawable.icon_like_normal);
                        holder.likeCount.setText(commontBean.getLikeCount()+"");
                        holder.likeCount.setTextColor(Color.parseColor("#dcdcdc"));
                    }else {
                        commontBeans.get(position).setHasLike("1");
                        commontBeans.get(position).setLikeCount(commontBean.getLikeCount()+1);
                        holder.imgLike.setImageResource(R.drawable.icon_like_press);
                        holder.likeCount.setText(commontBean.getLikeCount()+"");
                        holder.likeCount.setTextColor(Color.RED);
                    }
                }
                commontPopupWindowClickListener.onClickLike(commontBean.getDiscussId());
            }
        });
    }

    @Override
    public int getItemCount() {
        return commontBeans.size();
    }

    public class VideoHolder extends RecyclerView.ViewHolder {
         ImageView imgIcon;
         TextView likeCount;
         ImageView imgLike;
         TextView tvContent;
         TextView tvTime;
         TextView tvNickName;

        VideoHolder(View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgHead);
            likeCount = itemView.findViewById(R.id.tvLikeCount);
            imgLike = itemView.findViewById(R.id.imgLike);
            tvContent = itemView.findViewById(R.id.tvCommont);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvNickName = itemView.findViewById(R.id.tvNickName);
        }
    }
}
