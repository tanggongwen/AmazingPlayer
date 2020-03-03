package com.lbs.apps.library.media.audioplayer.utils;

import android.content.Context;

import com.lbs.apps.library.media.audioplayer.beans.StorageInfo;

import java.io.File;
import java.util.List;

/**
资源文件处理类
 */
public class ResourceFileUtil {
    /**
     * 文件的基本路径
     */
    private static String baseFilePath = null;

    /**
     * 获取资源文件的完整路径
     *
     * @param context
     * @param tempFilePath 文件的临时路径
     * @return
     */
    public static String getFilePath(Context context, String tempFilePath, String fileName) {
        if (baseFilePath == null) {
            List<StorageInfo> storageInfos = StorageListUtil.listAvaliableStorage(context);
            for (int i = 0; i < storageInfos.size(); i++) {
                StorageInfo temp = storageInfos.get(i);
                if (!temp.isRemoveable) {
                    baseFilePath = temp.path;
                    break;
                }
            }
        }

        //
        if (fileName == null) {
            fileName = "";
        }

        //
        String filePath = baseFilePath + File.separator + tempFilePath + File.separator + fileName;

        File file = new File(filePath);
        if(!fileName.equals("")){
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
        }else{
            if(!file.exists()){
                file.mkdirs();
            }
        }

        return filePath;
    }
}
