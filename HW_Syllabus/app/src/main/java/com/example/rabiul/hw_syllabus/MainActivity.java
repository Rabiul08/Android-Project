package com.example.rabiul.hw_syllabus;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {
    Button first ;
    Button second ;
    Button third ;
    Button fourth ;

   static  int select=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first=(Button)findViewById(R.id.fist);
        third=( Button)findViewById(R.id.third);
        second=(Button)findViewById(R.id.second);
        fourth=(Button)findViewById(R.id.fourth);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(MainActivity.this,third);
                popupMenu.getMenuInflater().inflate(R.menu.third,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId())
                        {
                            case R.id.event:
                                break;
                            case R.id.cse3111:
                              select=3111;
                                Intent myIntent =new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent);
                                break;
                            case R.id.cse3112:
                                select=3112;
                                Intent myIntent2 =new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent2);

                            break;
                            case R.id.cse3121:
                                select=3121;
                                Intent myIntent1 =new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent1);
                                break;

                            case R.id.cse3122:
                                select=3122;
                                Intent myIntent3 =new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent3);
                                break;
                            case R.id.cse3131:
                                select=313;
                                Intent myIntent4=new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent4);
                                break;

                            case R.id.cse3132:
                                select=3132;
                                Intent myIntent5 =new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent5);
                                break;
                            case R.id.cse3141:
                                select=3141;
                                Intent myIntent6=new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent6);
                                break;
                            case R.id.cse3142:
                                select=3142;
                                Intent myIntent7=new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent7);
                                break;
                            case R.id.cse3151:
                                select=3151;
                                Intent myIntent8 =new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent8);
                                break;
                            case R.id.cse3152:
                                select=3152;
                                Intent myIntent9=new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent9);
                                break;
                            case R.id.cse3211:
                                select=3211;
                                Intent myIntent10=new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent10);

                                break;
                            case R.id.cse3221:
                                select=3221;
                                Intent myIntent11 =new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent11);
                                break;
                            case R.id.cse3222:
                                select=3222;
                                Intent myIntent12=new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent12);
                                break;
                            case R.id.cse3231:
                                select=3231;
                                Intent myIntent13=new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent13);
                                break;

                            case R.id.cse3232:
                                select=3232;
                                Intent myIntent14 =new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent14);
                                break;
                            case R.id.cse3241:
                                select=3241;
                                Intent myIntent15=new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent15);
                                break;
                            case R.id.cse3242:
                                select=3242;
                                Intent myIntent16 =new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent16);
                                break;
                            case R.id.cse3251:
                                select=3251;
                                Intent myIntent17=new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent17);
                                break;
                            case R.id.cse3252:
                                select=3252;
                                Intent myIntent18 =new Intent(MainActivity.this ,Main2Activity.class);
                                startActivity(myIntent18);
                                break;
                                default:
                                    break;
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(MainActivity.this,first);
                popupMenu.getMenuInflater().inflate(R.menu.first,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId())
                        {
                            case R.id.evenf:
                                break;
                            case R.id.oddf:
                                break;
                            default:
                                break;
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(MainActivity.this,second);
                popupMenu.getMenuInflater().inflate(R.menu.secoond,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId())
                        {
                            case R.id.evens:
                                break;
                            case R.id.odds:
                                break;
                            default:
                                break;
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(MainActivity.this,fourth);
                popupMenu.getMenuInflater().inflate(R.menu.fourth,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId())
                        {
                            case R.id.evenfo:
                                break;
                            case R.id.oddfo:
                                break;
                            default:
                                break;
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });


    }
    public void onBackPressed()
    {
        final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Are you sure want to exit?");
        builder.setCancelable(true);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();
            }
        });
        builder.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog=builder.create();
        alertDialog.show();

    }
}
