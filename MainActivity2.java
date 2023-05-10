package com.lproject.cropryiot;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    public Button Get_started;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Get_started= findViewById(R.id.getstarted);


        Get_started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity4();

            }

        });
    }
    public void openMainActivity4(){
        Intent intent= new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
}
