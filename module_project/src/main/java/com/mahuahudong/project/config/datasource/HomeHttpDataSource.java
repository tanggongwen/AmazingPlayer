package com.mahuahudong.project.config.datasource;

import com.mahuahudong.res.beans.FirstColumnBean;
import com.mahuahudong.res.beans.LiveListBean;
import com.mahuahudong.res.beans.SedColumnBean;
import com.mahuahudong.res.beans.UserBean;
import com.mahuahudong.res.beans.VideoDetailBean;
import com.mahuahudong.res.beans.VideoRespBean;

import io.reactivex.Observable;

/**
 * Created by tanggongwen on 2019/9/17.
 *
 */
public interface HomeHttpDataSource {
    Observable register(String username, String password);

    Observable<UserBean> login(String username, String password);

    Observable<FirstColumnBean> getFirstColumn();

    Observable<SedColumnBean> getSecendColumn(String pid);

    Observable<VideoRespBean> getVideoHomeDatas(String pid,String page,String size);

    Observable<VideoDetailBean> getVideoDetail( String vid);

    Observable<LiveListBean> getLiveList(String page,String size);
}
