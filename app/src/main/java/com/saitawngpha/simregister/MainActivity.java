package com.saitawngpha.simregister;

import android.content.Intent;
import android.support.multidex.MultiDex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.saitawngpha.simregister.Blur.Fblur;
import com.saitawngpha.simregister.Blur.SNBlur;

import mehdi.sakout.fancybuttons.FancyButton;

public class MainActivity extends AppCompatActivity {
    private FancyButton mPt, tEle, oOre, mEc, aBout, SN;
    private InterstitialAd interstitial;
    private AdView adView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MultiDex.install(this);

        // Ads
        // ads
        // Prepare the Interstitial Ad
        interstitial = new InterstitialAd(MainActivity.this);
        // Insert the Ad Unit ID
        interstitial.setAdUnitId("ca-app-pub-9447884126970962/7298597534");

        //Locate the Banner Ad in activity_main.xml
        AdView adView = (AdView) this.findViewById(R.id.adView);

        // Request for Ads
        AdRequest adRequest = new AdRequest.Builder()

                // Add a test device to show Test Ads
                // .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                //.addTestDevice("CC5F2C72DF2B356BBF0DA198")
                .build();
        // Load ads into Banner Ads
        adView.loadAd(adRequest);

        // Load ads into Interstitial Ads
        interstitial.loadAd(adRequest);
        // Prepare an Interstitial Ad Listener
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                // Call displayInterstitial() function
                //displayInterstitial();
            }
        });

         this.mPt = ((FancyButton)findViewById(R.id.mpt));
        //mPt.setIconResource("&#xf2c3;");
       // mPt.setIconPosition(FancyButton.POSITION_LEFT);
        mPt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Mpt.class);
                startActivity(i);
                displayInterstitial();
            }
        });

        this.tEle = (FancyButton)findViewById(R.id.tln);
        tEle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Telenor.class);
                startActivity(i);
                displayInterstitial();
            }
        });

        this.oOre = (FancyButton)findViewById(R.id.ord);
        oOre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Ooredoo.class);
                startActivity(i);
                displayInterstitial();
            }
        });

        this.mEc = (FancyButton)findViewById(R.id.mec);
        mEc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Mec.class);
                startActivity(i);
                displayInterstitial();
            }
        });

        this.aBout = (FancyButton)findViewById(R.id.aBout);
        aBout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Fblur().fadeIn(MainActivity.this, "dialog");
                displayInterstitial();
            }
        });

        this.SN = (FancyButton)findViewById(R.id.fb);
        SN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new SNBlur().fadeIn(MainActivity.this, "dialog");
                displayInterstitial();
            }
        });
    }

    public void displayInterstitial() {
        // If Ads are loaded, show Interstitial else show nothing.
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }
}
