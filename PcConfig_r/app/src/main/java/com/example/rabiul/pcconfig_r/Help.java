package com.example.rabiul.pcconfig_r;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        getSupportActionBar().setTitle("Help");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_help, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id==R.id.exit_help)
        {
            finish();
        }
        if(id==R.id.browse_parts_h)
        {
            Intent myIntent_1= new Intent(Help.this,Browse_parts.class);
            startActivity(myIntent_1);

        }
        if(id==R.id.completed_Build_h)
        {
            Intent myIntent_2= new Intent(Help.this,Completed_Build.class);
            startActivity(myIntent_2);
        }


        return super.onOptionsItemSelected(item);
    }
}
