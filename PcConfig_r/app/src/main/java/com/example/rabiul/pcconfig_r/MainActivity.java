package com.example.rabiul.pcconfig_r;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id==R.id.exit)
        {
            finish();
        }
        if(id==R.id.browse_parts_m)
          {
              Intent myIntent_1= new Intent(MainActivity.this,Browse_parts.class);
              startActivity(myIntent_1);

          }
        if(id==R.id.completed_Build_m)
        {
            Intent myIntent_2= new Intent(MainActivity.this,Completed_Build.class);
            startActivity(myIntent_2);
        }
        if(id==R.id.help_m)
        {
            Intent myIntent_2= new Intent(MainActivity.this,Help.class);
            startActivity(myIntent_2);
        }


        return super.onOptionsItemSelected(item);
    }





    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Home home = new Home();
                    return home;
                case 1:
                    Configure_Pc configure_pc=new Configure_Pc();
                    AlertDialog.Builder selBuilder= new AlertDialog.Builder(MainActivity.this);
                    return configure_pc;
                case 2:
                    Choose_Laptop choose_laptop=new Choose_Laptop();
                    return choose_laptop;
                default:
                    return null;



            }
        }
        public void onBackPressed()
        {
            final android.support.v7.app.AlertDialog.Builder builder=new android.support.v7.app.AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Do you realy want to exit");
            builder.setCancelable(true);
            builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                    finish();
                }
            });
            builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });

            android.support.v7.app.AlertDialog alertDialog=builder.create();
            alertDialog.show();

        }
        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
        public CharSequence gePageTitle(int position) {
            switch (position) {
                case 0:

                    return "home";

                case 2:

                    return "Choose Laptop";

                case 1:

                    return "Configure Desktop";

                default:
                    return null;
            }
        }
    }
}
