package com.mahuahudong.res.weiget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.RecyclerView;

import com.mahuahudong.res.R;
import com.mahuahudong.res.beans.AudioSwitcherBean;

import java.util.ArrayList;
import java.util.List;

public class AudioSwitchListPopupwindow extends PopupWindow implements View.OnClickListener {

    private RecyclerView ryContent;
    private View mPopView;
    private Context context;
    private List<AudioSwitcherBean> switcherBeanList = new ArrayList<>();
    public AudioSwitchListPopupwindow(Context context) {
        super(context);
        this.context = context;
        init(context);
        setPopupWindow();
        initData();
    }

    public void setAudioSwitcherBean(AudioSwitcherBean audioSwitcherBean){
        switcherBeanList.clear();
        switcherBeanList.add(audioSwitcherBean);
        adapter.notifyDataSetChanged();
    }


    private void init(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        mPopView = inflater.inflate(R.layout.layout_audioswitchlist_window, null);
        ryContent = mPopView.findViewById(R.id.ryContent);
    }

    private void initData(){
        ryContent.setAdapter(adapter);

    }

    /**
     * 设置窗口的相关属性
     */
    @SuppressLint("InlinedApi")
    private void setPopupWindow() {
        this.setContentView(mPopView);// 设置View
        this.setWidth(ActionBar.LayoutParams.MATCH_PARENT);// 设置弹出窗口的宽
        this.setHeight(ActionBar.LayoutParams.WRAP_CONTENT);// 设置弹出窗口的高
        this.setBackgroundDrawable(null);
        setOutsideTouchable(true);
//        setAnimationStyle(R.style.mypopwindow_anim_style);
        //是否具有获取焦点的能力

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.tvList){
            changeSeletedType((Integer) v.getTag());
        }
        dismiss();
        adapter.notifyDataSetChanged();
    }

    private void changeSeletedType(int pos){
        for (int i = 0; i< switcherBeanList.size(); i++){
            if (pos == i){
                switcherBeanList.get(i).setSelected(true);
            }else {
                switcherBeanList.get(i).setSelected(false);
            }
        }
    }


    private RecyclerView.Adapter<AudioSwitchListPopupwindow.VideoHolder> adapter = new RecyclerView.Adapter<VideoHolder>() {
        @NonNull
        @Override
        public VideoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(context).inflate(R.layout.layout_item_audioswitchlist_window, parent, false);
            return new VideoHolder(itemView);
        }

        @NonNull


        @Override
        public void onBindViewHolder(@NonNull VideoHolder holder, int position) {
            holder.tvList.setTag(position);
            if (switcherBeanList.get(position).isSelected()){
                holder.tvList.setTextColor(Color.parseColor("#da2141"));
            }else {
                holder.tvList.setTextColor(Color.parseColor("#b0b0b0"));
            }
            holder.tvList.setText(switcherBeanList.get(position).getStartPos()+"-"+switcherBeanList.get(position).getEndPos());
            holder.tvList.setOnClickListener(AudioSwitchListPopupwindow.this);
        }

        @Override
        public int getItemCount() {
            return switcherBeanList.size();
        }


    };
    public class VideoHolder extends RecyclerView.ViewHolder {
        private TextView tvList;

        VideoHolder(View itemView) {
            super(itemView);
            tvList = itemView.findViewById(R.id.tvList);
        }
    }

}
