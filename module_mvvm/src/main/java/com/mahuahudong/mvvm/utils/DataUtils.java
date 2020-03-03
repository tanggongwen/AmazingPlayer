package com.mahuahudong.mvvm.utils;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;

import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;

import com.mahuahudong.module_mvvm.R;
import com.mahuahudong.mvvm.utils.constant.ShareEnum;
import com.mahuahudong.res.StringUtils;
import com.mahuahudong.res.Utils;
import com.mahuahudong.res.constants.NewsTagEnum;
import com.mahuahudong.res.weiget.TipToast;
import com.tbruyelle.rxpermissions2.RxPermissions;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import io.reactivex.functions.Consumer;

public enum  DataUtils {
    INSTANCE;
    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");//初始化Formatter的转换格式。

    private SimpleDateFormat formatterYmd = new SimpleDateFormat("MM-dd");//初始化Formatter的转换格式。

    private SimpleDateFormat formatterMs = new SimpleDateFormat("mm:ss");//初始化Formatter的转换格式。

    private SimpleDateFormat formatterHMS = new SimpleDateFormat("HH:mm:ss");//初始化Formatter的转换格式。

    private SimpleDateFormat formatterYMD = new SimpleDateFormat("yyyy年MM月dd日");//初始化Formatter的转换格式。

    private int[] images = {R.drawable.inviteregister1,R.drawable.inviteregister2,R.drawable.inviteregister3};
    private int current = 1;


    public static <T> List<List<T>> averageAssign(List<T> source,int n){
        List<List<T>> result=new ArrayList<List<T>>();
        int remaider=source.size()%n;  //(先计算出余数)
        int number=source.size()/n;  //然后是商
        int offset=0;//偏移量
        for(int i=0;i<n;i++){
            List<T> value=null;
            if(remaider>0){
                value=source.subList(i*number+offset, (i+1)*number+offset+1);
                remaider--;
                offset++;
            }else{
                value=source.subList(i*number+offset, (i+1)*number+offset);
            }
            result.add(value);
        }
        return result;
    }
    public static <T> List<List<T>> splitList(List<T> list, int len){
        if (list == null || list.size() == 0 || len < 1) {
            return null;
        }
        //返回结果
        List<List<T>> result = new ArrayList<List<T>>();
        //传入集合长度
        int size = list.size();
        //分隔后的集合个数
        int count = (size + len - 1) / len;
        for (int i = 0; i < count; i++) {
            List<T> subList = list.subList(i * len, ((i + 1) * len > size ? size : len * (i + 1)));
            result.add(subList);
        }
        return result;
    }


    public void installApk(String fileRoot,String apkName){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(getUriFromFile(new File(fileRoot,apkName)), "application/vnd.android.package-archive");
        //解决startActivity采取的上下文的Context而不是Activity
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
        //解决手机安装软件的权限问题
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
        Utils.getContext().startActivity(intent);

    }


    public void callPhone(final FragmentActivity activity, final String phone){
        new RxPermissions(activity).request(Manifest.permission.CALL_PHONE).subscribe(new Consumer<Boolean>() {
            @Override
            public void accept(Boolean aBoolean) throws Exception {
                if (aBoolean){
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    Uri data = Uri.parse(phone);
                    intent.setData(data);
                    activity.startActivity(intent);
                }else {
                    ToastUtils.showShort("获取权限失败，请在设置中打开相关权限");
                }
            }
        });

    }

    /**
     * 兼容Android版本获取Uri
     * @param file
     * @return
     */
    private Uri getUriFromFile(File file){
        Uri fileUri = null ;
        if (Build.VERSION.SDK_INT >= 24) { // Android 7.0 以上
            fileUri = FileProvider.getUriForFile(Utils.getContext(), "com.lbs.apps.zhcs", file);
        } else {
            fileUri = Uri.fromFile(file);
        }
        return fileUri;
    }

    /**
     *
     * @param time 单位秒
     * @return
     */
    public String getTimeTip(String time,String timeTag){
        String tip="0";

        if (StringUtils.isEmpty(time)){
            return tip;
        }
        int s = Integer.parseInt(time);
        if (s>60&&s<3600){
            tip = s/60+"分钟前";
        }else if (s>3600&&s<3600*24){
            tip = s/3600+"小时前";
        } else if (s<60){
            tip = "刚刚";
        } else {
           tip = getTimeStr(timeTag);
        }
        return tip;
    }

    public String getTimeStr(String time){
        if (StringUtils.isEmpty(time)){
            return "0";
        }
        formatterYmd.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return formatterYmd.format(new Date(Long.valueOf(time+"000")));
    }

    /**
     * 1置顶 2推荐 3图文直播 4直播 5回看 6专题 7广告
     * @param tag
     * @return
     */
    public int getNewsTagBg(String tag){
        if (tag.equals(NewsTagEnum.TYPE_TOP.getTagType())){
            return com.mahuahudong.res.R.drawable.shape_icon_top_bg;
        }else if (tag.equals(NewsTagEnum.TYPE_REC.getTagType())){
            return com.mahuahudong.res.R.drawable.shape_icon_recommend_bg;
        }else if (tag.equals(NewsTagEnum.TYPE_IMAGELIVE.getTagType())){
            return com.mahuahudong.res.R.drawable.shape_icon_imagelive_bg;
        }else if (tag.equals(NewsTagEnum.TYPE_LIVE.getTagType())){
            return com.mahuahudong.res.R.drawable.shape_icon_live_bg;
        }else if (tag.equals(NewsTagEnum.TYPE_REVIEW.getTagType())){
            return com.mahuahudong.res.R.drawable.shape_icon_review_bg;
        }else if (tag.equals(NewsTagEnum.TYPE_SPECIAL.getTagType())){
            return com.mahuahudong.res.R.drawable.shape_icon_special_bg;
        }else if (tag.equals(NewsTagEnum.TYPE_ADV.getTagType())){
            return com.mahuahudong.res.R.drawable.shape_icon_advertisement_bg;
        }
        return 0;
    }

    /**
     * 1置顶 2推荐 3图文直播 4直播 5回看 6专题 7广告
     * @param tag
     * @return
     */
    public int getNewsTagColor(String tag){
        if (tag.equals(NewsTagEnum.TYPE_TOP.getTagType())){
            return com.mahuahudong.res.Utils.getContext().getResources().getColor(com.mahuahudong.res.R.color.icon_top);
        }else if (tag.equals(NewsTagEnum.TYPE_REC.getTagType())){
            return com.mahuahudong.res.Utils.getContext().getResources().getColor(com.mahuahudong.res.R.color.icon_recommend);
        }else if (tag.equals(NewsTagEnum.TYPE_IMAGELIVE.getTagType())){
            return com.mahuahudong.res.Utils.getContext().getResources().getColor(com.mahuahudong.res.R.color.icon_imagelive);
        }else if (tag.equals(NewsTagEnum.TYPE_LIVE.getTagType())){
            return com.mahuahudong.res.Utils.getContext().getResources().getColor(com.mahuahudong.res.R.color.icon_live);
        }else if (tag.equals(NewsTagEnum.TYPE_REVIEW.getTagType())){
            return com.mahuahudong.res.Utils.getContext().getResources().getColor(com.mahuahudong.res.R.color.icon_review);
        }else if (tag.equals(NewsTagEnum.TYPE_SPECIAL.getTagType())){
            return com.mahuahudong.res.Utils.getContext().getResources().getColor(com.mahuahudong.res.R.color.icon_special);
        }else if (tag.equals(NewsTagEnum.TYPE_ADV.getTagType())){
            return Utils.getContext().getResources().getColor(com.mahuahudong.res.R.color.icon_advertisement);
        }
        return 0;
    }

    public String getNewsTagSrc(String tag){
        if (tag.equals(NewsTagEnum.TYPE_TOP.getTagType())){
            return "置顶";
        }else if (tag.equals(NewsTagEnum.TYPE_REC.getTagType())){
            return "推荐";
        }else if (tag.equals(NewsTagEnum.TYPE_IMAGELIVE.getTagType())){
            return "图文";
        }else if (tag.equals(NewsTagEnum.TYPE_LIVE.getTagType())){
            return "直播";
        }else if (tag.equals(NewsTagEnum.TYPE_REVIEW.getTagType())){
            return "回看";
        }else if (tag.equals(NewsTagEnum.TYPE_SPECIAL.getTagType())){
            return "专题";
        }else if (tag.equals(NewsTagEnum.TYPE_ADV.getTagType())){
            return "广告";
        }
        return "";
    }


    public String formatTime(String time){
        if(StringUtils.isEmpty(time)){
            return "00:00";
        }
        formatterMs.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return formatterMs.format(new Date(Long.valueOf(time)));
    }

    public String formatHMS(String time){
        if(StringUtils.isEmpty(time)){
            return "00:00:00";
        }
        formatterHMS.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return formatterHMS.format(new Date(Long.valueOf(time+"000")));
    }

    public String formatTimeYMD(String time){
        if(StringUtils.isEmpty(time)){
            return "0";
        }
        formatterYMD.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        return formatterYMD.format(new Date(Long.valueOf(time+"000")));
    }

    public List<ShareEnum> getTopShareList(String isCollect){
       List<ShareEnum> shareEnumList = new ArrayList<>();
        shareEnumList.add(ShareEnum.SHARE_WECHAT);
        shareEnumList.add(ShareEnum.SHARE_PENGYOUQUAN);
        shareEnumList.add(ShareEnum.SHARE_QQ);
        shareEnumList.add(ShareEnum.SHARE_QQZONE);
        if (isCollect.equals("1")){
            shareEnumList.add(ShareEnum.SHARE_FAVORITED);
        }else {
            shareEnumList.add(ShareEnum.SHARE_FAVORITE);
        }
        shareEnumList.add(ShareEnum.SHARE_COMPLAIN);
        return shareEnumList;
    }

    public List<ShareEnum>  getShareList(){
        List<ShareEnum> shareEnumList = new ArrayList<>();
        shareEnumList.add(ShareEnum.SHARE_WECHAT);
        shareEnumList.add(ShareEnum.SHARE_PENGYOUQUAN);
        shareEnumList.add(ShareEnum.SHARE_QQ);
        shareEnumList.add(ShareEnum.SHARE_QQZONE);
        return shareEnumList;
    }

    public void hideSoftInput(Activity activity) {

        // 关闭软键盘
        if (activity.getCurrentFocus() != null) {
            if (activity.getCurrentFocus().getWindowToken() != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(),InputMethodManager.HIDE_NOT_ALWAYS);
            }
        }
    }

    public int switchImages(){
        if (current==3){
            current = 0;
        }
        return images[current++];
    }

    public String getViewCountFormat(String s){
        if (StringUtils.isEmpty(s)){
            return "0";
        }
        int viewCount = Integer.parseInt(s);
        if (viewCount<10000){
            return viewCount+"";
        }
        DecimalFormat df = new DecimalFormat("0.00");//格式化小数
        String num = df.format((float)Integer.parseInt(s)/10000);//返回的是String类型
        return num+"万";
    }
    public static String getFileType(String path) {
        File file = new File(path);
        /* 取得扩展名 */
        String end = file.getName().substring(file.getName().lastIndexOf(".") + 1, file.getName().length()).toLowerCase();

        if (end.equals("jpg") || end.equals("gif") || end.equals("png") ||
                end.equals("jpeg") || end.equals("bmp")) {
            try {//图片
                return "1";//图片
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (end.equals("mp4")|| end.equals("flv")|| end.equals("m3u8")|| end.equals("avi")|| end.equals("mov")|| end.equals("rmvb")) {
            return "2";//视频格式

        } else {
            TipToast.showTextToas(Utils.getContext(), "文件格式暂不支持");
            return "";
        }
        return "";
    }
}
