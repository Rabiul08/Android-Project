package com.example.rabiul.mysqltest;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends Activity {
    EditText name,email,pass,repass;
    String nameS,emailS,passS,repassS;
    Button save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name=(EditText)findViewById(R.id.name_re);
        email=(EditText)findViewById(R.id.email);
        pass=(EditText)findViewById(R.id.password_re);
        repass=(EditText)findViewById(R.id.retype_pass);
        save=(Button)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameS=name.getText().toString();
                emailS=email.getText().toString();
                passS=pass.getText().toString();
                repassS=repass.getText().toString();
                if(passS.compareTo("")==0)
                {
                    Toast.makeText(Register.this,"insert matched"+passS+" "+repassS,Toast.LENGTH_LONG).show();
                }
                else
                {
                    if(passS.compareTo(repassS)==0)
                    {
                        String method="register";
                        BackgroundTask  backgroundTask= new BackgroundTask(Register.this);
                        //Toast.makeText(Register.this,"Passowrd   matched",Toast.LENGTH_LONG).show();
                        backgroundTask.execute(method,nameS,emailS,passS);
                         finish();

                    }
                    else
                    {
                        Toast.makeText(Register.this,"Password not  matched"+passS+" "+repassS,Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

    }
}
