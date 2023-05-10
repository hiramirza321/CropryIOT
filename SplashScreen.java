package com.lproject.cropryiot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;



public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Thread td = new Thread() {
            public void run() {
                try {
                    sleep(3000);

                } catch (Exception ex) {
                    ex.printStackTrace();
                } finally {
                    Intent it = new Intent(SplashScreen.this, MainActivity2.class);
                    startActivity(it);
                }
            }
        };
        td.start();
    }
}

