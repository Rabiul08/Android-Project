package com.example.rabiul.pcconfig_r;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Completed_Build extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed__build);
        getSupportActionBar().setTitle("Completed Build");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_complete, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id==R.id.exit_comp)
        {
            finish();
        }
        if(id==R.id.browse_parts_com)
        {
            Intent myIntent_1= new Intent(Completed_Build.this,Browse_parts.class);
            startActivity(myIntent_1);

        }

        if(id==R.id.help_comp)
        {
            Intent myIntent_2= new Intent(Completed_Build.this,Help.class);
            startActivity(myIntent_2);
        }
        return super.onOptionsItemSelected(item);
    }
}
