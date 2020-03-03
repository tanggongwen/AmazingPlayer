package com.mahuahudong.project;

import com.mahuahudong.project.beans.HeadBean;
import com.mahuahudong.project.beans.PlayRoomTypeBean;
import com.mahuahudong.project.beans.VideoBean;
import com.mahuahudong.res.beans.VideoTypeBean;

import java.util.ArrayList;
import java.util.List;

public class NetDateProvider {

    public static List<HeadBean> getHomeHeadData(){
        List<HeadBean> headBeans = new ArrayList<>();
        HeadBean headBean = new HeadBean();
        headBean.setMovieId("000");
        headBean.setTitle("000电影轮播图");
        headBean.setUrl("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1035415831,1465727770&fm=26&gp=0.jpg");
        HeadBean headBean1 = new HeadBean();
        headBean1.setMovieId("001");
        headBean1.setTitle("001电影轮播图");
        headBean1.setUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1582606122694&di=e958caf5ae5da1e258fa66d1454aeb5b&imgtype=0&src=http%3A%2F%2Fa2.att.hudong.com%2F36%2F48%2F19300001357258133412489354717.jpg");
        HeadBean headBean2 = new HeadBean();
        headBean2.setMovieId("002");
        headBean2.setTitle("002电影轮播图");
        headBean2.setUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1582606122693&di=ceab0fd11bd3642f62080ac33bf1ee09&imgtype=0&src=http%3A%2F%2Fa4.att.hudong.com%2F21%2F09%2F01200000026352136359091694357.jpg");
        HeadBean headBean3 = new HeadBean();
        headBean3.setMovieId("003");
        headBean3.setTitle("003电影轮播图");
        headBean3.setUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1582606122693&di=c37c83afe5b4553f88ee6cbb8d409341&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F14%2F75%2F01300000164186121366756803686.jpg");
        headBeans.add(headBean);
        headBeans.add(headBean1);
        headBeans.add(headBean2);
        headBeans.add(headBean3);
        return headBeans;
    }

    public static List<VideoTypeBean> getHomeTypeData(){
        List<VideoTypeBean> typeBeanList = new ArrayList<>();
        VideoTypeBean typeBean =new VideoTypeBean();
        typeBean.setTitle("类型");
        typeBean.setTypeId("00");
        VideoTypeBean typeBean1 =new VideoTypeBean();
        typeBean1.setTitle("类型1");
        typeBean1.setTypeId("01");
        VideoTypeBean typeBean2 =new VideoTypeBean();
        typeBean2.setTitle("类型2");
        typeBean2.setTypeId("02");
        VideoTypeBean typeBean3 =new VideoTypeBean();
        typeBean3.setTitle("类型3");
        typeBean3.setTypeId("03");
        VideoTypeBean typeBean4 =new VideoTypeBean();
        typeBean4.setTitle("类型4");
        typeBean4.setTypeId("04");
        VideoTypeBean typeBean5 =new VideoTypeBean();
        typeBean5.setTitle("类型5");
        typeBean5.setTypeId("05");
        typeBeanList.add(typeBean);
        typeBeanList.add(typeBean1);
        typeBeanList.add(typeBean2);
        typeBeanList.add(typeBean3);
        typeBeanList.add(typeBean4);
        typeBeanList.add(typeBean5);
        return typeBeanList;
    }

    public static List<PlayRoomTypeBean> getPlayRoomTypeData(){
        List<PlayRoomTypeBean> typeBeanList = new ArrayList<>();
        PlayRoomTypeBean typeBean =new PlayRoomTypeBean();
        typeBean.setTypeName("类型");
        typeBean.setTypeId("00");
        PlayRoomTypeBean typeBean1 =new PlayRoomTypeBean();
        typeBean1.setTypeName("类型1");
        typeBean1.setTypeId("01");
        PlayRoomTypeBean typeBean2 =new PlayRoomTypeBean();
        typeBean2.setTypeName("类型2");
        typeBean2.setTypeId("02");
        PlayRoomTypeBean typeBean3 =new PlayRoomTypeBean();
        typeBean3.setTypeName("类型3");
        typeBean3.setTypeId("03");
        PlayRoomTypeBean typeBean4 =new PlayRoomTypeBean();
        typeBean4.setTypeName("类型4");
        typeBean4.setTypeId("04");
        PlayRoomTypeBean typeBean5 =new PlayRoomTypeBean();
        typeBean5.setTypeName("类型5");
        typeBean5.setTypeId("05");
        typeBeanList.add(typeBean);
        typeBeanList.add(typeBean1);
        typeBeanList.add(typeBean2);
        typeBeanList.add(typeBean3);
        typeBeanList.add(typeBean4);
        typeBeanList.add(typeBean5);
        return typeBeanList;
    }

    public static List<VideoBean> getVideoList(){
        List<VideoBean> videoBeanList = new ArrayList<>();
        VideoBean videoBean = new VideoBean();
        videoBean.setCover("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1035415831,1465727770&fm=26&gp=0.jpg");
        videoBean.setIntro("电影简介");
        videoBean.setMovieId("0000");
        videoBean.setPoint("9.0");
        videoBean.setTitle("电影标题");
        VideoBean videoBean1 = new VideoBean();
        videoBean1.setCover("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1035415831,1465727770&fm=26&gp=0.jpg");
        videoBean1.setIntro("电影简介1");
        videoBean1.setMovieId("00001");
        videoBean1.setPoint("9.0");
        videoBean1.setTitle("电影标题1");
        VideoBean videoBean2 = new VideoBean();
        videoBean2.setCover("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1035415831,1465727770&fm=26&gp=0.jpg");
        videoBean2.setIntro("电影简介2");
        videoBean2.setMovieId("00002");
        videoBean2.setPoint("9.0");
        videoBean2.setTitle("电影标题2");
        VideoBean videoBean3 = new VideoBean();
        videoBean3.setCover("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1035415831,1465727770&fm=26&gp=0.jpg");
        videoBean3.setIntro("电影简介3");
        videoBean3.setMovieId("00003");
        videoBean3.setPoint("9.0");
        videoBean3.setTitle("电影标题3");
        VideoBean videoBean4 = new VideoBean();
        videoBean4.setCover("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1035415831,1465727770&fm=26&gp=0.jpg");
        videoBean4.setIntro("电影简介4");
        videoBean4.setMovieId("00004");
        videoBean4.setPoint("9.0");
        videoBean4.setTitle("电影标题4");
        VideoBean videoBean5 = new VideoBean();
        videoBean5.setCover("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1035415831,1465727770&fm=26&gp=0.jpg");
        videoBean5.setIntro("电影简介5");
        videoBean5.setMovieId("00005");
        videoBean5.setPoint("9.0");
        videoBean5.setTitle("电影标题5");
        videoBeanList.add(videoBean);
        videoBeanList.add(videoBean1);
        videoBeanList.add(videoBean2);
        videoBeanList.add(videoBean3);
        videoBeanList.add(videoBean4);
        videoBeanList.add(videoBean5);
        return videoBeanList;
    }
}
