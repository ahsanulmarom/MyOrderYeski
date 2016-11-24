package com.example.user.orderyeski;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class OpeningPage extends Activity {
    public OpeningPage() {
    }

    private static int SPLASH_TIME_OUT = 5000;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.openingscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent intent = new Intent(OpeningPage.this, MainPage.class);
                //startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
