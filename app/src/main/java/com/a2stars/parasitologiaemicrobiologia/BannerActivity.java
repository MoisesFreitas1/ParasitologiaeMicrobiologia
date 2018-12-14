package com.a2stars.parasitologiaemicrobiologia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.a2stars.parasitologiaemicrobiologia.ShowActivities.ShowThemes;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;


public class BannerActivity extends Activity implements Runnable {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);

        Handler handler = new Handler();
        handler.postDelayed(this, 3000);

        YoYo.with(Techniques.FadeIn).duration(2000).playOn(findViewById(R.id.logoapp));
    }

    public void run(){
        startActivity(new Intent(this, ShowThemes.class));
        finish();
    }
}