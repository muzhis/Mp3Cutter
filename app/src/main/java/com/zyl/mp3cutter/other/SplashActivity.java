package com.zyl.mp3cutter.other;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.jaeger.library.StatusBarUtil;
import com.zyl.mp3cutter.R;
import com.zyl.mp3cutter.databinding.ActivitySplashBinding;

/**
 * Description: 欢迎页
 * Created by zouyulong on 2017/11/22.
 * Person in charge :  zouyulong
 */
public class SplashActivity extends AppCompatActivity {
    private ActivitySplashBinding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtil.setColor(this, Color.TRANSPARENT);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setClass(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }, 3000);
    }
}
