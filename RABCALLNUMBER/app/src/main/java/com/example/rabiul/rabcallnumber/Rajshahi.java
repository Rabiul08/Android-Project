package com.example.rabiul.rabcallnumber;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Rajshahi extends AppCompatActivity {
    private  static final  int REQUEST_CALL=1;
    Button jp;
    Button raj;
    Button noga;
    Button chap;
    Button nat;
    Button bogra;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
      if(requestCode==REQUEST_CALL)
      {
          if ( grantResults[0]==PackageManager.PERMISSION_GRANTED)
                 {
                     makephonecalljp();
                     makephoncallbogra();
                     makephoncallnat();
                     makephoncallchap();
                     makephoncallraj();
                     makephoncallnoga();
                 }
          else
          {
              Toast.makeText(this,"Permission DENIED",Toast.LENGTH_SHORT).show();
          }
      }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi);
        jp=(Button) findViewById(R.id.joypurhat);

        nat=(Button) findViewById(R.id.nator);
        noga=(Button) findViewById(R.id.naoga);
        raj=(Button) findViewById(R.id.rajshahi_jela);
        chap=(Button) findViewById(R.id.capai);
        bogra=(Button) findViewById(R.id.bogra);
        jp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            makephonecalljp();
            }
        });
        bogra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makephoncallbogra();
            }
        });
        raj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makephoncallraj();
            }
        });

        nat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makephoncallnat();
            }
        });
        chap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makephoncallchap();
            }
        });
        noga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makephoncallnoga();
            }
        });
    }
    private  void makephonecalljp()
    {
        if (ContextCompat.checkSelfPermission(Rajshahi.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(Rajshahi.this,new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);
        }
        else
        {
            String dial="tel:01777710533";
          startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
    }
    private  void makephoncallbogra()
    {
        if (ContextCompat.checkSelfPermission(Rajshahi.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(Rajshahi.this,new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);
        }
        else
        {
            String dial="tel:01777711333";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
    }
   private void makephoncallraj()
   {
       if (ContextCompat.checkSelfPermission(Rajshahi.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
           ActivityCompat.requestPermissions(Rajshahi.this,new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);
       }
       else
       {
           String dial="tel:01777710599";
           startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
       }
   }
    private void makephoncallnat()
    {
        if (ContextCompat.checkSelfPermission(Rajshahi.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(Rajshahi.this,new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);
        }
        else
        {
            String dial="tel:01777710522";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
    }
    private void makephoncallnoga()
    {
        if (ContextCompat.checkSelfPermission(Rajshahi.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(Rajshahi.this,new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);
        }
        else
        {
            String dial="tel:01777710511";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
    }
    private void makephoncallchap()
    {
        if (ContextCompat.checkSelfPermission(Rajshahi.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(Rajshahi.this,new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL);
        }
        else
        {
            String dial="tel:01777710511";
            startActivity(new Intent(Intent.ACTION_CALL,Uri.parse(dial)));
        }
    }


}
