package com.zht.car.dimensiontestapp;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.widget.Toast;

public class MyApplication extends Application {
    public static String AppEnviornment = "";


    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationInfo appInfo = null;
        try {
            appInfo = getApplicationContext().getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            AppEnviornment = appInfo.metaData.getString("app_enviornment");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
