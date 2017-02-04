package com.saitawngpha.simregister;

/**
 * Created by Sai Pha on 1/19/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import jp.co.recruit_lifestyle.android.widget.ColoringLoadingView;


public class Splash extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 6000;
    Animation fadeOutAndroidAnimation;
    Animation fadeInAndroidAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);


        initView();
        fadeIn();

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                fadeOut();
                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
    void fadeIn(){
        //fadeInAndroidAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
    }
    void fadeOut(){
        //fadeOutAndroidAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);
    }
    void ballPulseAnimLoader() {
        //findViewById(R.id.material_design_ball_pulse_loader_progress).setVisibility(View.VISIBLE);
    }

    private void initView() {
        final ColoringLoadingView loadingView = (ColoringLoadingView) findViewById(R.id.main_loading);
        loadingView.setCharacter(ColoringLoadingView.Character.SIM);
        loadingView.setColoringColor(0xFFFF1744);
        loadingView.setVisibility(View.VISIBLE);
        loadingView.startDrawAnimation();
    }

}