package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashActivity.this,
                        MainActivity.class);
                startActivity(i);
                // close this activity
                //  finish();
            }
        }, SPLASH_TIME_OUT);
        TextView txt = findViewById(R.id.textView);
        ImageView img =findViewById(R.id.imageView2);
        Animation topanim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        txt.setAnimation(topanim);
        img.setAnimation(topanim);
    }
}