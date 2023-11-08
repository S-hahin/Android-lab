package com.example.rval;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    EditText e1,e2,e3,e4,e5;
    Button b1,b2;
    boolean isAllFieldsChecked = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.tv1);
        e1=(EditText) findViewById(R.id.et1);
        t2=(TextView) findViewById(R.id.tv2);
        e2=(EditText) findViewById(R.id.et2);
        t3=(TextView) findViewById(R.id.tv3);
        e3=(EditText) findViewById(R.id.et3);
        t4=(TextView) findViewById(R.id.tv4);
        e4=(EditText) findViewById(R.id.et4);
        t5=(TextView) findViewById(R.id.tv5);
        e5=(EditText) findViewById(R.id.d1);
        b1=(Button) findViewById(R.id.bt1);
        b2=(Button) findViewById(R.id.bt2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.length() == 0) {
                    e1.setError("This field is required");
                    isAllFieldsChecked = false;
                }
                if(e1.length() > 0){
                    String regexStr = "^[0-9]*$";

                    if(e1.getText().toString().trim().matches(regexStr))
                    {
                        e1.setError("This field should be in alphabets or Alphanumeric");
                        isAllFieldsChecked = false;
                    }

                }


                if (e2.length() == 0) {
                    e2.setError("This field is required");
                    isAllFieldsChecked = false;

                }

                if (e3.length() == 0) {
                    e3.setError("Email is required");
                    isAllFieldsChecked = false;

                }
                if(e3.length() > 0){
                    String emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
                    if (!e3.getText().toString().trim().matches(emailPattern)) {
                        e3.setError("Invalid email address");
                        isAllFieldsChecked = false;
                    }
                }

                if (e4.length() == 0) {
                    e4.setError("Password is required");
                    isAllFieldsChecked = false;

                } else if (e4.length() < 8) {
                    e4.setError("Password must be minimum 8 characters");
                    isAllFieldsChecked = false;

                }
                if(e5.length() == 0){
                    e5.setError("Date of birth is required");
                    isAllFieldsChecked = false;
                }else{
                    String dobPattern= "\\d{2}/\\d{2}/\\d{4}";
                    if(!e5.getText().toString().trim().matches(dobPattern)){
                        e5.setError("Invalid date format (use DD/MM/YYYY)");
                        isAllFieldsChecked = false;
                    }
                }
                if(isAllFieldsChecked) {
                    Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
                System.exit(0);
            }
        });
    }
}