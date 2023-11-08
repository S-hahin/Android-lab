package com.example.dude;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class page2 extends AppCompatActivity {
    TextView ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        ed=findViewById(R.id.tv);
        String value=getIntent().getStringExtra("uname");
        ed.setText(value);
    }
}