package com.mahuahudong.project.weiget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.mahuahudong.project.R;

import me.majiajie.pagerbottomtabstrip.item.BaseTabItem;

/**
 * Created by mjj on 2017/6/3
 */
public class NormalTab extends BaseTabItem {

    private ImageView mIcon;
    private final TextView mTitle;

    private Drawable mDefaultDrawable;
    private Drawable mCheckedDrawable;

    private int mDefaultTextColor = 0x56000000;
    private int mCheckedTextColor = 0x56000000;

    private boolean mChecked;

    public NormalTab(Context context) {
        this(context, null);
    }

    public NormalTab(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NormalTab(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        LayoutInflater.from(context).inflate(R.layout.normal_tab, this, true);

        mIcon = findViewById(R.id.icon);
        mTitle = findViewById(R.id.title);

    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        View view = getChildAt(0);
        if (view != null) {
            view.setOnClickListener(l);
        }
    }

    /**
     * 方便初始化的方法
     *
     * @param drawableRes        默认状态的图标
     * @param checkedDrawableRes 选中状态的图标
     * @param title              标题
     */
    public void initialize(@DrawableRes int drawableRes, @DrawableRes int checkedDrawableRes, String title) {
        mDefaultDrawable = ContextCompat.getDrawable(getContext(), drawableRes);
        mCheckedDrawable = ContextCompat.getDrawable(getContext(), checkedDrawableRes);
        mTitle.setText(title);
    }

    @Override
    public void setChecked(boolean checked) {
        if (checked) {
            mIcon.setImageDrawable(mCheckedDrawable);
            mTitle.setTextColor(mCheckedTextColor);
        } else {
            mIcon.setImageDrawable(mDefaultDrawable);
            mTitle.setTextColor(mDefaultTextColor);
        }
        mChecked = checked;
    }

    @Override
    public void setMessageNumber(int number) {

    }

    @Override
    public void setHasMessage(boolean hasMessage) {

    }


    @Override
    public void setTitle(String title) {
        mTitle.setText(title);
    }

    @Override
    public void setDefaultDrawable(Drawable drawable) {
        mDefaultDrawable = drawable;
        if (!mChecked) {
            mIcon.setImageDrawable(drawable);
        }
    }

    @Override
    public void setSelectedDrawable(Drawable drawable) {
        mCheckedDrawable = drawable;
        if (mChecked) {
            mIcon.setImageDrawable(drawable);
        }
    }

    @Override
    public String getTitle() {
        return mTitle.getText().toString();
    }

    public void setTextDefaultColor(@ColorInt int color) {
        mDefaultTextColor = color;
    }

    public void setTextCheckedColor(@ColorInt int color) {
        mCheckedTextColor = color;
    }
}
