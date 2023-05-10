package com.lproject.cropryiot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CheckHeathActivity extends AppCompatActivity {
    public ImageView Cauli;
    public ImageView Corn;
    public ImageView  Banana;
    public ImageView  Rice;
    public ImageView  Apple;
    public ImageView Grapes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_heath);
        Cauli = findViewById(R.id.cauliflower);
        Corn = findViewById(R.id.corn);
        Banana = findViewById(R.id.banana);
        Rice = findViewById(R.id.rice);
        Apple= findViewById(R.id.apple);
        Grapes= findViewById(R.id.grapes);
        Cauli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CheckHeathActivity.this,CauliflowerActivity.class);
                startActivity(intent);

            }

        });
        Corn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (CheckHeathActivity.this, CornActivity.class);
                startActivity(intent);
            }
        });
        Banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (CheckHeathActivity.this, BananaActivity.class);
                startActivity(intent);
            }
        });
        Rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (CheckHeathActivity.this, RiceActivity.class);
                startActivity(intent);
            }
        });

        Apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (CheckHeathActivity.this, AppleActivity.class);
                startActivity(intent);
            }
        });
        Grapes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (CheckHeathActivity.this, GrapeActivity.class);
                startActivity(intent);
            }
        });





    }
}
