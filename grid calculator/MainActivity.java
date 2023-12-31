package com.example.gridcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result,nnum;
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btmul,btdiv,btadd,btsub,btper,btcancel,btbs,btdot,bteq;
    float f1,f2,res;
    boolean add,sub,div,mult,per;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nnum = findViewById(R.id.bpres);
        result = findViewById(R.id.bres);
        bt0 = findViewById(R.id.b0);
        bt1 = findViewById(R.id.b1);
        bt2 = findViewById(R.id.b2);
        bt3 = findViewById(R.id.b3);
        bt4 = findViewById(R.id.b4);
        bt5 = findViewById(R.id.b5);
        bt6 = findViewById(R.id.b6);
        bt7 = findViewById(R.id.b7);
        bt8 = findViewById(R.id.b8);
        bt9 = findViewById(R.id.b9);
        btmul = findViewById(R.id.bmul);
        btdiv = findViewById(R.id.bdiv);
        btadd = findViewById(R.id.badd);
        btsub = findViewById(R.id.bsub);
        btper = findViewById(R.id.bper);
        btcancel = findViewById(R.id.btc);
        btbs = findViewById(R.id.bspace);
        btdot = findViewById(R.id.bdot);
        bteq = findViewById(R.id.bequal);

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");

            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"1");

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");

            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");

            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");

            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");

            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");

            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");

            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");

            }
        });

        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");

            }
        });

        btcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(" ");
                nnum.setText(" ");
            }
        });

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(result.getText().toString());
                result.setText(" ");
                nnum.setText(String.valueOf(f1+"+"));
                add=true;
            }
        });

        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(result.getText().toString());
                result.setText(" ");
                nnum.setText(String.valueOf(f1+"-"));
                sub=true;
            }
        });

        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(result.getText().toString());
                result.setText(" ");
                nnum.setText(String.valueOf(f1+"*"));
                mult=true;
            }
        });

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(result.getText().toString());
                result.setText(" ");
                nnum.setText(String.valueOf(f1+"/"));
                div=true;
            }
        });

        btper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(result.getText().toString());
                result.setText(" ");
                nnum.setText(String.valueOf(f1+"%"));
                per=true;
            }
        });

        bteq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add==true){
                    f2=Float.parseFloat(result.getText().toString());
                    res=f1+f2;
                    String data=String.valueOf(res);
                    nnum.setText(f1+"+"+f2+"=");
                    result.setText(data);
                    add=false;
                }
                else if(sub==true){
                    f2=Float.parseFloat(result.getText().toString());
                    res=f1-f2;
                    String data=String.valueOf(res);
                    nnum.setText(f1+"-"+f2+"=");
                    result.setText(data);
                    sub=false;
                }
                else if(mult==true){
                    f2=Float.parseFloat(result.getText().toString());
                    res=f1*f2;
                    String data=String.valueOf(res);
                    nnum.setText(f1+"x"+f2+"=");
                    result.setText(data);
                    mult=false;
                }
                else if(div==true){
                    f2=Float.parseFloat(result.getText().toString());
                    res=f1/f2;
                    String data=String.valueOf(res);
                    nnum.setText(f1+"/"+f2+"=");
                    result.setText(data);
                    div=false;
                }
                else if(per==true){
                    f2=Float.parseFloat(result.getText().toString());
                    res=f1%f2;
                    String data=String.valueOf(res);
                    nnum.setText(f1+"%"+f2+"=");
                    result.setText(data);
                    per=false;
                }
            }
        });










    }
}