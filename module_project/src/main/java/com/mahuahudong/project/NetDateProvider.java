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
        headBean.setTitle("控制");
        headBean.setUrl("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2568026724,615400968&fm=26&gp=0.jpg");
        HeadBean headBean1 = new HeadBean();
        headBean1.setMovieId("001");
        headBean1.setTitle("复仇者联盟");
        headBean1.setUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1583422800443&di=31af7a73f53fd193dfdc3ea01725f182&imgtype=0&src=http%3A%2F%2Fbigtu.eastday.com%2Fimg%2F201204%2F10%2F99%2F4797962636273518987.jpg");
        HeadBean headBean2 = new HeadBean();
        headBean2.setMovieId("002");
        headBean2.setTitle("冰封重生之门");
        headBean2.setUrl("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1583422800443&di=e3fae4512e1dfc2067459f239fc710c6&imgtype=0&src=http%3A%2F%2Fhbimg.b0.upaiyun.com%2Fb90e245e013c0a539c4adfb848e33dca4a79e0558178-ToXH5S_fw658");
        HeadBean headBean3 = new HeadBean();
        headBean3.setMovieId("003");
        headBean3.setTitle("摩天营救");
        headBean3.setUrl("https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=683693947,880901182&fm=26&gp=0.jpg");
        headBeans.add(headBean);
        headBeans.add(headBean1);
        headBeans.add(headBean2);
        headBeans.add(headBean3);
        return headBeans;
    }

    public static List<VideoTypeBean> getHomeTypeData(){
        List<VideoTypeBean> typeBeanList = new ArrayList<>();
        VideoTypeBean typeBean =new VideoTypeBean();
        typeBean.setTitle("战争");
        typeBean.setTypeId("00");
        VideoTypeBean typeBean1 =new VideoTypeBean();
        typeBean1.setTitle("爱情");
        typeBean1.setTypeId("01");
        VideoTypeBean typeBean2 =new VideoTypeBean();
        typeBean2.setTitle("科幻");
        typeBean2.setTypeId("02");
        VideoTypeBean typeBean3 =new VideoTypeBean();
        typeBean3.setTitle("恐怖");
        typeBean3.setTypeId("03");
        VideoTypeBean typeBean4 =new VideoTypeBean();
        typeBean4.setTitle("犯罪");
        typeBean4.setTypeId("04");
        VideoTypeBean typeBean5 =new VideoTypeBean();
        typeBean5.setTitle("欧美");
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
        videoBean.setCover("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1583422800442&di=0a66e6e9aac92e869f96dfd61505ac8b&imgtype=0&src=http%3A%2F%2Fphotocdn.sohu.com%2F20130927%2FImg387363334.jpg");
        videoBean.setIntro("电影简介");
        videoBean.setMovieId("0000");
        videoBean.setPoint("9.0");
        videoBean.setTitle("电影标题");
        VideoBean videoBean1 = new VideoBean();
        videoBean1.setCover("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1583422800442&di=0a66e6e9aac92e869f96dfd61505ac8b&imgtype=0&src=http%3A%2F%2Fphotocdn.sohu.com%2F20130927%2FImg387363334.jpg");
        videoBean1.setIntro("电影简介1");
        videoBean1.setMovieId("00001");
        videoBean1.setPoint("9.0");
        videoBean1.setTitle("电影标题1");
        VideoBean videoBean2 = new VideoBean();
        videoBean2.setCover("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1583422800442&di=0a66e6e9aac92e869f96dfd61505ac8b&imgtype=0&src=http%3A%2F%2Fphotocdn.sohu.com%2F20130927%2FImg387363334.jpg");
        videoBean2.setIntro("电影简介2");
        videoBean2.setMovieId("00002");
        videoBean2.setPoint("9.0");
        videoBean2.setTitle("电影标题2");
        VideoBean videoBean3 = new VideoBean();
        videoBean3.setCover("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1583422800442&di=0a66e6e9aac92e869f96dfd61505ac8b&imgtype=0&src=http%3A%2F%2Fphotocdn.sohu.com%2F20130927%2FImg387363334.jpg");
        videoBean3.setIntro("电影简介3");
        videoBean3.setMovieId("00003");
        videoBean3.setPoint("9.0");
        videoBean3.setTitle("电影标题3");
        VideoBean videoBean4 = new VideoBean();
        videoBean4.setCover("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1583422800442&di=0a66e6e9aac92e869f96dfd61505ac8b&imgtype=0&src=http%3A%2F%2Fphotocdn.sohu.com%2F20130927%2FImg387363334.jpg");
        videoBean4.setIntro("电影简介4");
        videoBean4.setMovieId("00004");
        videoBean4.setPoint("9.0");
        videoBean4.setTitle("电影标题4");
        VideoBean videoBean5 = new VideoBean();
        videoBean5.setCover("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1583422800442&di=0a66e6e9aac92e869f96dfd61505ac8b&imgtype=0&src=http%3A%2F%2Fphotocdn.sohu.com%2F20130927%2FImg387363334.jpg");
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
