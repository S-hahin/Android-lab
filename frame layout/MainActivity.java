package com.example.framelayout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView car,engine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        car = findViewById(R.id.supra);
        engine = findViewById(R.id.jz);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                car.setVisibility(view.GONE);
                engine.setVisibility(view.VISIBLE);
            }
        });
        engine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                engine.setVisibility(view.GONE);
                car.setVisibility(view.VISIBLE);
            }
        });

    }
}