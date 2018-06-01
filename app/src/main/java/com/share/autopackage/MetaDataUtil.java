package com.share.autopackage;


import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/**
 * Created by tzw on 2018/6/1.
 */

public class MetaDataUtil {




    public static void getMetaDataByActivity(String metaKey,Activity activity){
/*
        ActivityInfo appInfo = activity.getPackageManager().getActivityInfo(activity.getComponentName(),
                        PackageManager.GET_META_DATA);
        return  appInfo.metaData.getString(metaKey);*/
    }

/*    public String getMetaDataByApp(String metaKey,Activity activity){
        ApplicationInfo appInfo = activity.getPackageManager()
                .getApplicationInfo(getPackageName(),
                        PackageManager.GET_META_DATA);
        String msg=appInfo.metaData.getString(metaKey);
    }*/





}
