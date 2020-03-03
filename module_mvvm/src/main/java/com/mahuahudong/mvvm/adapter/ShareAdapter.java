package com.mahuahudong.mvvm.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.mahuahudong.module_mvvm.R;
import com.mahuahudong.mvvm.utils.constant.ShareEnum;

import java.util.List;

public class ShareAdapter extends RecyclerView.Adapter<ShareAdapter.VideoHolder> {

    private List<ShareEnum> shareBeans;
    private Context context;
    private SharePopupItemClickListenter itemClickListenter;

    public ShareAdapter(Context context, List<ShareEnum> shareBeans, SharePopupItemClickListenter itemClickListenter) {
        this.shareBeans = shareBeans;
        this.context = context;
        this.itemClickListenter= itemClickListenter;
    }

    @Override
    public ShareAdapter.VideoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.layout_window_share_item, parent, false);
        return new ShareAdapter.VideoHolder(itemView);

    }

    @Override
    public void onBindViewHolder(final ShareAdapter.VideoHolder holder, final int position) {
        final ShareEnum shareEnum = shareBeans.get(position);
        holder.imgShareIcon.setImageResource(shareBeans.get(position).getShareRes());
        holder.tvTip.setText(shareBeans.get(position).getShareTip());
        holder.llytShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (shareEnum.equals(ShareEnum.SHARE_FAVORITE)||shareBeans.get(position).equals(ShareEnum.SHARE_FAVORITED)){
                    itemClickListenter.onFavorite();
                }else if (shareEnum.equals(ShareEnum.SHARE_COMPLAIN)){
                    itemClickListenter.onComplain();
                }else {
                    itemClickListenter.onShareItemClick(shareEnum);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return shareBeans.size();
    }

    public class VideoHolder extends RecyclerView.ViewHolder {
        private ImageView imgShareIcon;
        private TextView tvTip;
        private LinearLayout llytShare;

        VideoHolder(View itemView) {
            super(itemView);
            imgShareIcon = itemView.findViewById(R.id.imgIcon);
            tvTip = itemView.findViewById(R.id.tvTip);
            llytShare = itemView.findViewById(R.id.llytShare);

        }
    }

    public interface SharePopupItemClickListenter{
        void onShareItemClick(ShareEnum shareEnum);
        void onFavorite();
        void onComplain();
    }
}
