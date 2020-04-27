package com.mahuahudong.mvvm.utils.database;

import android.content.Context;

import com.mahuahudong.mvvm.databean.VideoHistoryBean;

import java.util.List;


public class VideoHistoryDaoUtils
{
    private static final String TAG = VideoHistoryDaoUtils.class.getSimpleName();
    private DaoManager mManager;

    public VideoHistoryDaoUtils(Context context){
        mManager = DaoManager.getInstance();
        mManager.init(context);
    }

    /**
     * 完成usereventbean记录的插入，如果表未创建，先创建usereventbean表
     * @return
     */
    public boolean insertVideoHistory(VideoHistoryBean bean){
        boolean flag = false;
        flag = mManager.getDaoSession().getVideoHistoryBeanDao().insert(bean) == -1 ? false : true;
        return flag;
    }

    /**
     * 插入多条数据，在子线程操作
     * @return
     */
    public boolean insertMultUserEventBean(final List<VideoHistoryBean> beanList) {
        boolean flag = false;
        try {
            mManager.getDaoSession().runInTx(new Runnable() {
                @Override
                public void run() {
                    for (VideoHistoryBean videoHistoryBean : beanList) {
                        mManager.getDaoSession().insertOrReplace(videoHistoryBean);
                    }
                }
            });
            flag = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 修改一条数据
     * @param videoHistoryBean
     * @return
     */
    public boolean updateUserEventBean(VideoHistoryBean videoHistoryBean){
        boolean flag = false;
        try {
            mManager.getDaoSession().update(videoHistoryBean);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 删除单条记录
     * @param videoHistoryBean
     * @return
     */
    public boolean deleteUserEventBean(VideoHistoryBean videoHistoryBean){
        boolean flag = false;
        try {
            //按照id删除
            mManager.getDaoSession().delete(videoHistoryBean);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 删除所有记录
     * @return
     */
    public boolean deleteAll(){
        boolean flag = false;
        try {
            //按照id删除
            mManager.getDaoSession().deleteAll(VideoHistoryBean.class);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 查询所有记录
     * @return
     */
    public List<VideoHistoryBean> queryAllVideoHistoryBean(){
        return mManager.getDaoSession().loadAll(VideoHistoryBean.class);
    }

    /**
     * 根据主键id查询记录
     * @param key
     * @return
     */
    public VideoHistoryBean queryVideoHistoryBeanById(long key){
        return mManager.getDaoSession().load(VideoHistoryBean.class, key);
    }

    /**
     * 使用native sql进行查询操作
     */
    public List<VideoHistoryBean> queryVideoHistoryByNativeSql(String sql, String[] conditions){
        return mManager.getDaoSession().queryRaw(VideoHistoryBean.class, sql, conditions);
    }

}