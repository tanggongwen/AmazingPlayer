package com.mahuahudong.mvvm.utils.database;

import android.content.Context;

import com.mahuahudong.mvvm.databean.UserEventBean;

import java.util.List;

public class UserEventDaoUtils
{
    private static final String TAG = UserEventDaoUtils.class.getSimpleName();
    private DaoManager mManager;

    public UserEventDaoUtils(Context context){
        mManager = DaoManager.getInstance();
        mManager.init(context);
    }

    /**
     * 完成usereventbean记录的插入，如果表未创建，先创建usereventbean表
     * @return
     */
    public boolean insertUserEvent(UserEventBean bean){
        boolean flag = false;
        flag = mManager.getDaoSession().getUserEventBeanDao().insert(bean) == -1 ? false : true;
        return flag;
    }

    /**
     * 插入多条数据，在子线程操作
     * @return
     */
    public boolean insertMultUserEventBean(final List<UserEventBean> beanList) {
        boolean flag = false;
        try {
            mManager.getDaoSession().runInTx(new Runnable() {
                @Override
                public void run() {
                    for (UserEventBean userEventBean : beanList) {
                        mManager.getDaoSession().insertOrReplace(userEventBean);
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
     * @param userEventBean
     * @return
     */
    public boolean updateUserEventBean(UserEventBean userEventBean){
        boolean flag = false;
        try {
            mManager.getDaoSession().update(userEventBean);
            flag = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 删除单条记录
     * @param userEventBean
     * @return
     */
    public boolean deleteUserEventBean(UserEventBean userEventBean){
        boolean flag = false;
        try {
            //按照id删除
            mManager.getDaoSession().delete(userEventBean);
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
            mManager.getDaoSession().deleteAll(UserEventBean.class);
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
    public List<UserEventBean> queryAllUserEventBean(){
        return mManager.getDaoSession().loadAll(UserEventBean.class);
    }

    /**
     * 根据主键id查询记录
     * @param key
     * @return
     */
    public UserEventBean queryUserEventBeanById(long key){
        return mManager.getDaoSession().load(UserEventBean.class, key);
    }

    /**
     * 使用native sql进行查询操作
     */
    public List<UserEventBean> queryUserEventBeanByNativeSql(String sql, String[] conditions){
        return mManager.getDaoSession().queryRaw(UserEventBean.class, sql, conditions);
    }

}