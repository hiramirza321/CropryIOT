package com.lproject.cropryiot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class BlogActivity extends AppCompatActivity {
    ImageView apple;
    ImageView banana;
    ImageView barley;
    ImageView chilli;
    ImageView  cauliflower ;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        apple= findViewById(R.id.apple);
        banana = findViewById(R.id.banana);
        barley = findViewById(R.id.barley);
        chilli = findViewById(R.id.chilli);
        cauliflower = findViewById(R.id.cauliflower);
        arrow= findViewById(R.id.arrow);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BlogActivity.this,Dashboard.class);
                startActivity(intent);

            }
        });
        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BlogActivity.this,BlogAppleActivity.class);
                startActivity(intent);

            }

        });
        banana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (BlogActivity.this, BlogBananaActivity.class);
                startActivity(intent);
            }
        });


        chilli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (BlogActivity.this, BlogChilliActivity.class);
                startActivity(intent);
            }
        });
        cauliflower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (BlogActivity.this, BlogCauli.class);
                startActivity(intent);
            }
        });
        barley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (BlogActivity.this, BlogBarley.class);
                startActivity(intent);
            }
        });

    }
}
