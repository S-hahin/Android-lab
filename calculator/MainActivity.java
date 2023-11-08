package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3;
    EditText e1,e2,e3;
    Button bt1,bt2,bt3,bt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView) findViewById(R.id.tv1);
        e1=(EditText) findViewById(R.id.et1);
        t2=(TextView) findViewById(R.id.tv2);
        e2=(EditText) findViewById(R.id.et2);
        bt1=(Button) findViewById(R.id.b1);
        bt2=(Button) findViewById(R.id.b2);
        bt3=(Button) findViewById(R.id.b3);
        bt4=(Button) findViewById(R.id.b4);
        t3=(TextView) findViewById(R.id.tv3);
        e3=(EditText) findViewById(R.id.et3);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String S1=e1.getText().toString();
                    String S2=e2.getText().toString();
                    int a,b,c;
                    a=Integer.parseInt(S1);
                    b=Integer.parseInt(S2);
                    c=a/b;
                    String S3=String.valueOf(c);
                    e3.setText(S3);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        String S1=e1.getText().toString();
                        String S2=e2.getText().toString();
                        int a,b,c;
                        a=Integer.parseInt(S1);
                        b=Integer.parseInt(S2);
                        c=a*b;
                        String S3=String.valueOf(c);
                        e3.setText(S3);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    String S1=e1.getText().toString();
                    String S2=e2.getText().toString();
                    int a,b,c;
                    a=Integer.parseInt(S1);
                    b=Integer.parseInt(S2);
                    c=a-b;
                    String S3=String.valueOf(c);
                    e3.setText(S3);
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S1=e1.getText().toString();
                String S2=e2.getText().toString();
                int a,b,c;
                a=Integer.parseInt(S1);
                b=Integer.parseInt(S2);
                c=a+b;
                String S3=String.valueOf(c);
                e3.setText(S3);
            }
        });

    }
}