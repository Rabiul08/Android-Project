package com.example.rabiul.pcconfig_r;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Browse_parts extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_parts);
        getSupportActionBar().setTitle("Browse Parts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    } @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_browse, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.exit_browse)
        {
            finish();
        }

        if(id==R.id.completed_Build_browse)
        {
            Intent myIntent_2= new Intent(Browse_parts.this,Completed_Build.class);
            startActivity(myIntent_2);
        }
        if(id==R.id.help_comp)
        {
            Intent myIntent_2= new Intent(Browse_parts.this,Help.class);
            startActivity(myIntent_2);
        }
        return super.onOptionsItemSelected(item);
    }



}
