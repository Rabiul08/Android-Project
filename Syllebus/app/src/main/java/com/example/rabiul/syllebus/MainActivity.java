package com.example.rabiul.syllebus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button  first;
    Button second;
    Button third;
    Button fourth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first= (Button)findViewById(R.id.button1);
        first.setOnClickListener(new View.OnClickListener() {
        public  void onClick(View v)
        {
            Intent myIntent_1= new Intent(MainActivity.this,FirstYear.class);
            startActivity(myIntent_1);

        }
        });

    }
}
