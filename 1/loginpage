package com.example.dude;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView ob,ob1;
    EditText ed,ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ob=(TextView) findViewById(R.id.tv3);
        ed=(EditText) findViewById(R.id.et1);
        ob1=(TextView) findViewById(R.id.tv2);
        ed1=(EditText) findViewById(R.id.et2);
        b1=(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S1=ed.getText().toString();
                String S2=ed1.getText().toString();
                if(S1.equals("User")&&S2.equals("Password")){
                    Toast.makeText(getApplicationContext(),"Login Successfull",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Login failed",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
