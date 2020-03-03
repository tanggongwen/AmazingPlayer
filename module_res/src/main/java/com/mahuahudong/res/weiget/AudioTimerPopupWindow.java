package com.mahuahudong.res.weiget;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lbs.apps.library.media.audioplayer.manager.AudioTimer;
import com.mahuahudong.res.R;
import com.mahuahudong.res.constants.AudioTimeEnum;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

public class AudioTimerPopupWindow extends PopupWindow implements View.OnClickListener {

    private SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");//初始化Formatter的转换格式。

        private RecyclerView ryContent;
        private View mPopView;
        private TextView tvTitle;
        private ImageView imgClose;
        private Context context;
        private List<AudioTimeEnum> enumList = new ArrayList<>();
        private OnAudioTimerSetListener onAudioTimerSetListener;
        public AudioTimerPopupWindow(Context context,OnAudioTimerSetListener onAudioTimerSetListener) {
            super(context);
            this.context = context;
            this.onAudioTimerSetListener = onAudioTimerSetListener;
            init(context);
            setPopupWindow();
            initData();
            AudioTimer.INSTANCE.setTimerTick(onAudioTimerTick);
        }




        private void init(Context context) {
            LayoutInflater inflater = LayoutInflater.from(context);
            mPopView = inflater.inflate(R.layout.layout_audiotimer_window, null);
            ryContent = mPopView.findViewById(R.id.ryContent);
            ryContent.addItemDecoration(LineManagers.horizontalGray(2,0,20).create(ryContent));
            tvTitle = mPopView.findViewById(R.id.tvTitle);
            imgClose = mPopView.findViewById(R.id.imgClose);
            imgClose.setOnClickListener(this);
        }

        private void initData(){
            enumList.add(AudioTimeEnum.TYPE_INFINITE);
            enumList.add(AudioTimeEnum.TYPE_10M);
            enumList.add(AudioTimeEnum.TYPE_30M);
            enumList.add(AudioTimeEnum.TYPE_1H);
            enumList.add(AudioTimeEnum.TYPE_2H);
            enumList.add(AudioTimeEnum.TYPE_3H);
            enumList.add(AudioTimeEnum.TYPE_6H);
            enumList.add(AudioTimeEnum.TYPE_12H);
            ryContent.setAdapter(adapter);
        }

        /**
         * 设置窗口的相关属性
         */
        @SuppressLint("InlinedApi")
        private void setPopupWindow() {
            this.setContentView(mPopView);// 设置View
            this.setWidth(ActionBar.LayoutParams.MATCH_PARENT);// 设置弹出窗口的宽
            this.setHeight(context.getResources().getDimensionPixelSize(R.dimen.audiotimerwindowheight));// 设置弹出窗口的高
            this.setBackgroundDrawable(null);
            setOutsideTouchable(true);
            setAnimationStyle(R.style.mypopwindow_anim_style);
            //是否具有获取焦点的能力
        }

        @Override
        public void onClick(View v) {
            if (v.getId()==R.id.tvTime){
                changeSeletedType((Integer) v.getTag());
                onAudioTimerSetListener.onAudioSeted();
            }else if (v.getId()==R.id.imgClose){
                dismiss();
            }
            adapter.notifyDataSetChanged();
        }

        private void changeSeletedType(int pos){
            for (int i = 0;i<enumList.size();i++){
                if (pos == i){
                    enumList.get(i).setSeleted(true);
                    if (enumList.get(i).getTime()!=0){
                        AudioTimer.INSTANCE.startTimer(enumList.get(i).getTime()*1000,context);
                    }else {
                        AudioTimer.INSTANCE.startInfinity();
                    }
                }else {
                    enumList.get(i).setSeleted(false);
                }
            }
        }


        private RecyclerView.Adapter<AudioTimerPopupWindow.VideoHolder> adapter = new RecyclerView.Adapter<VideoHolder>() {
            @NonNull
            @Override
            public VideoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View itemView = LayoutInflater.from(context).inflate(R.layout.layout_item_audiotimer_time, parent, false);
                return new VideoHolder(itemView);
            }

            @Override
            public void onBindViewHolder(@NonNull VideoHolder holder, int position) {
                holder.tvTime.setTag(position);
                if (enumList.get(position).isSeleted()){
                    holder.tvTime.setTextColor(Color.parseColor("#da2141"));
                }else {
                    holder.tvTime.setTextColor(Color.parseColor("#252525"));
                }
                if (enumList.get(position).equals(AudioTimeEnum.TYPE_INFINITE)){
                    holder.tvTime.setText("不限");
                }else {
                    holder.tvTime.setText(enumList.get(position).getTimeType());
                }
                holder.tvTime.setOnClickListener(AudioTimerPopupWindow.this);
            }

            @Override
            public int getItemCount() {
                return enumList.size();
            }


        };
    public class VideoHolder extends RecyclerView.ViewHolder {
        private TextView tvTime;

        VideoHolder(View itemView) {
            super(itemView);
            tvTime = itemView.findViewById(R.id.tvTime);
        }
    }

    private AudioTimer.OnAudioTimerTick onAudioTimerTick = new AudioTimer.OnAudioTimerTick() {
        @Override
        public void onTick(long unitiFinished) {

            tvTitle.setTextColor(Color.parseColor("#da2141"));
            tvTitle.setText(getTimeStr(unitiFinished)+"后停止播放");
        }

        @Override
        public void onFinish() {
            tvTitle.setTextColor(Color.parseColor("#000000"));
            tvTitle.setText("设置时间");
            onAudioTimerSetListener.onAudioSeted();
        }

    };

    private String getTimeStr(long time){
        formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
       return formatter.format(time);
    }

    public interface OnAudioTimerSetListener{
        void onAudioSeted();
    }

}
