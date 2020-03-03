package com.mahuahudong.mvvm.utils;

import android.annotation.SuppressLint;
import android.content.Context;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by goldze on 2017/5/14.
 * 常用工具类
 */
public final class Utils {

    @SuppressLint("StaticFieldLeak")
    private static Context context;

    private Utils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(@NonNull final Context context) {
        Utils.context = context.getApplicationContext();
    }

    /**
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (context != null) {
            return context;
        }
        throw new NullPointerException("should be initialized in application");
    }



        /**
         * 秒转换为指定格式的日期
         * @param second
         * @param patten
         * @return
         */
        public static String secondToDate(long second,String patten) {

            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(second);//转换为毫秒
            Date date = calendar.getTime();
            SimpleDateFormat format = new SimpleDateFormat(patten);
            String dateString = format.format(date);
            return dateString;
        }



}