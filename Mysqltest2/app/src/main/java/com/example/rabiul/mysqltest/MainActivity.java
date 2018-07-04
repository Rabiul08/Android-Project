package com.example.rabiul.mysqltest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    Button signup;
    Button signin;
    EditText email1;
    EditText pass1;
    String email_s;
    String  pass_s;
    Button check;
    public static  String name[];
    public static String email[];
    public static String password[];
    public  static String ret="";
  int flag=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email1=(EditText)findViewById(R.id.email_l);
        pass1=(EditText)findViewById(R.id.password);
        signin=(Button)findViewById(R.id.signin);
        signup=(Button)findViewById(R.id.signup);
        check=(Button)findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email_s=email1.getText().toString();
                pass_s=pass1.getText().toString();
                String method ="Login";
                BackgroundTask backgroundTask=new BackgroundTask(MainActivity.this);
                backgroundTask.execute(method,email_s,pass_s);
                flag=1;
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Register.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,ret,Toast.LENGTH_LONG).show();
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // email_s="mdrabiulislam521@gmail.com";
              //  pass_s="12345c";
                if(flag==1)
                {
                    if(ret.contains("Welcome"))

                    {
                        Intent intent=new Intent(MainActivity.this,Register.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Please insert valid email and password",Toast.LENGTH_LONG).show();
                    }


                    ret="";
                    flag=0;
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Please press check button first",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
