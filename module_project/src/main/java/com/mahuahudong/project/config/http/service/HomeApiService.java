package com.mahuahudong.project.config.http.service;


import com.mahuahudong.res.beans.AddTrendRespBean;
import com.mahuahudong.res.beans.AddTrendbean;
import com.mahuahudong.res.beans.FirstColumnBean;
import com.mahuahudong.res.beans.LiveListBean;
import com.mahuahudong.res.beans.LiveReqBean;
import com.mahuahudong.res.beans.MyFocusBean;
import com.mahuahudong.res.beans.MyFocusReqBean;
import com.mahuahudong.res.beans.MyTrendReqBean;
import com.mahuahudong.res.beans.MyTrendsBean;
import com.mahuahudong.res.beans.RegisterRqBean;
import com.mahuahudong.res.beans.SedReqBean;
import com.mahuahudong.res.beans.SelectedRespBean;
import com.mahuahudong.res.beans.SelectedVideoReqBean;
import com.mahuahudong.res.beans.SelectedVideoRespBean;
import com.mahuahudong.res.beans.UpdateUserBean;
import com.mahuahudong.res.beans.UpdateUserRespBean;
import com.mahuahudong.res.beans.UserBean;
import com.mahuahudong.res.beans.UserFocusBean;
import com.mahuahudong.res.beans.UserFocusReqBean;
import com.mahuahudong.res.beans.VideoDetailBean;
import com.mahuahudong.res.beans.VideoDetailReqBean;
import com.mahuahudong.res.beans.VideoHomeReqBean;
import com.mahuahudong.res.beans.VideoRespBean;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.MultipartBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;

/**
 * Created by tanggongen on 2019/9/17
 */

public interface HomeApiService {
    //注册
    @POST("default/register")
    Observable<UserBean> register(@HeaderMap Map<String, String> header, @Body RegisterRqBean registerRqBean);

    //登陆
    @POST("default/login")
    Observable<UserBean> login(@HeaderMap Map<String, String> header,@Body RegisterRqBean registerRqBean);

    @GET("info/dress-fst")
    Observable<FirstColumnBean> getFirstColumn(@HeaderMap Map<String, String> header);

    @GET("info/dress-sed")
    Observable<SelectedRespBean> getSecendColumn(@HeaderMap Map<String, String> header , @Body SedReqBean sedReqBean);

    @POST("info/video-index")
    Observable<VideoRespBean> getVideoHome(@HeaderMap Map<String, String> header, @Body VideoHomeReqBean videoHomeReqBean);

    @POST("info/video-detail")
    Observable<VideoDetailBean> getVideoDetail(@HeaderMap Map<String, String> header, @Body VideoDetailReqBean videoDetailReqBean);

    @POST("info/video-list")
    Observable<SelectedVideoRespBean> getSelectedVideoList(@HeaderMap Map<String,String> header, @Body SelectedVideoReqBean selectedVideoReqBean);

    @POST("info/live-list")
    Observable<LiveListBean> getLiveList(@HeaderMap Map<String, String> header, @Body LiveReqBean liveReqBean);

    @POST("user/my-focus")
    Observable<MyFocusBean> getMyFocusList(@HeaderMap Map<String, String> header, @Body MyFocusReqBean myFocusReqBean);

    @POST("/user/focus")
    Observable<UserFocusBean> addFocus(@HeaderMap Map<String, String> header, @Body UserFocusReqBean userFocusReqBean);

    @POST("/user/my-trends")
    Observable<MyTrendsBean> getMyTrendList(@HeaderMap Map<String, String> header, @Body MyTrendReqBean myTrendReqBean);

    @POST("/user/set-trends")
    Observable<AddTrendRespBean> addTrend(@HeaderMap Map<String, String> header, @Body AddTrendbean addTrendbean);

    @Multipart
    @POST("/user/upload-avatar")
    Observable<AddTrendRespBean> uploadAvaTar(@HeaderMap Map<String, String> header, @Part MultipartBody.Part file);

    @POST("/user/set-info")
    Observable<UpdateUserRespBean> updateUserInfo(@HeaderMap Map<String,String> header,@Body UpdateUserBean userBean);
}
