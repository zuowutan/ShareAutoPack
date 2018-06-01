package com.share.autopackage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mAppInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAppInfo = findViewById(R.id.apkInfo);
        String channerlName = ChannelUtil.getChannel(this);
        int versionCode = ChannelUtil.getVersionCode(this);

        Log.i("info", "渠道名称："+channerlName+"\n Apk版本号:"+versionCode);
        mAppInfo.setText("武哥测试输出包的位置"+"渠道名称："+channerlName+"Apk版本号:"+versionCode);



    }
}
