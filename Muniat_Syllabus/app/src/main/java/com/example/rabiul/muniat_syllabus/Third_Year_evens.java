package com.example.rabiul.muniat_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Third_Year_evens extends AppCompatActivity {
   static int select =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third__year_evens);}
        public void select_subject(View view)
        {
            boolean checked = ((RadioButton) view).isChecked();
            switch (view.getId()) {
                case R.id.cse3211:
                    Intent myIntent=new  Intent(Third_Year_evens.this,PdfVeiwer.class) ;
                    startActivity(myIntent);
                    select=3211;
                    break;
                case R.id.cse3221:
                    Intent myIntent1=new  Intent(Third_Year_evens.this,PdfVeiwer.class) ;
                    startActivity(myIntent1);
                    select=3221;
                    break;
                case R.id.cse3222:
                    Intent myIntent2=new  Intent(Third_Year_evens.this,PdfVeiwer.class) ;
                    startActivity(myIntent2);
                    select=3222;
                    break;
                case R.id.cse3231:
                    Intent myIntent4=new  Intent(Third_Year_evens.this,PdfVeiwer.class) ;
                    startActivity(myIntent4);
                    select=3231;
                    break;

                case R.id.cse3232:
                    Intent myIntent3=new  Intent(Third_Year_evens.this,PdfVeiwer.class) ;
                    startActivity(myIntent3);
                    select=3232;
                    break;
                case R.id.cse3241:
                    Intent myIntent5=new  Intent(Third_Year_evens.this,PdfVeiwer.class) ;
                    startActivity(myIntent5);
                    select=3241;
                    break;
                case R.id.cse3242:
                    Intent myIntent6=new  Intent(Third_Year_evens.this,PdfVeiwer.class) ;
                    startActivity(myIntent6);
                    select=3242;
                    break;
                case R.id.cse3251:
                    Intent myIntent7=new  Intent(Third_Year_evens.this,PdfVeiwer.class) ;
                    startActivity(myIntent7);
                    select=3251;
                    break;
                case R.id.cse3252:
                    Intent myIntent8=new  Intent(Third_Year_evens.this,PdfVeiwer.class) ;
                    startActivity(myIntent8);
                    select=3252;
                    break;
                default:
                    break;

            }
        }

}
