package com.example.antor.navigato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv=(TextView)findViewById(R.id.txttxt);
        tv.setSelected(true);

        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {


                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();

            }
        },17000);
    }
}
