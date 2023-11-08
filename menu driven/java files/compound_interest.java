package com.example.myapplicationmenudriven;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Math;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class compound_interest extends AppCompatActivity {
    EditText et1,et2,et3,et4,et6;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_interest);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et6 = (EditText) findViewById(R.id.et6);
        b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String p = et1.getText().toString();
                String r = et2.getText().toString();
                String t = et3.getText().toString();
                String n = et6.getText().toString();
                double a =  Double.parseDouble(p);
                double b =  Double.parseDouble(r);
                double c =  Double.parseDouble(t);
                double d =  Double.parseDouble(n);
                double m=(1+(b/d));


                double x=d*c;
                double res = Math.pow(m,x)*a;
                String result=String.valueOf(res);
                et4.setText(result);
            }
        });
    }
}