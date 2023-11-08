package com.example.myapplicationmenudriven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class simple_interest extends AppCompatActivity {
EditText et1,et2,et3,et4;
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_interest);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String p = et1.getText().toString();
                String r = et2.getText().toString();
                String t = et3.getText().toString();
                int a = Integer.parseInt(p);
                int b = Integer.parseInt(r);
                int c = Integer.parseInt(t);
                float res = (a*b*c)/100;
                String result=String.valueOf(res);
                et4.setText(result);


            }
        });
    }
}