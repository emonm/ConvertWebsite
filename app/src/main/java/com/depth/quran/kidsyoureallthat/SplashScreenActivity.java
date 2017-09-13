package com.depth.quran.kidsyoureallthat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class SplashScreenActivity extends AppCompatActivity {

    private final Handler mHandler = new Handler();
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        mContext = this;

        mHandler.postDelayed(mPendingLauncherRunnable, 2000);
    }

    private final Runnable mPendingLauncherRunnable = new Runnable() {
        @Override
        public void run() {

            Intent mm = new Intent(SplashScreenActivity.this, MainActivity.class);
            startActivity(mm);
            SplashScreenActivity.this.finish();

        }
    };

}
