package com.lproject.cropryiot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {
    ImageView card;
    ImageView monitor;
    ImageView blog;
    Button health;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        monitor= findViewById(R.id.monitor);
        health= findViewById(R.id.HealthCheck);
        blog= findViewById(R.id.blog);
        card = findViewById(R.id.card1);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,PlotActivity.class);
                startActivity(intent);

            }

        });
        monitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,MainActivity.class);
                startActivity(intent);

            }

        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,CheckHeathActivity.class);
                startActivity(intent);

            }

        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this,BlogActivity.class);
                startActivity(intent);

            }

        });
    }
}