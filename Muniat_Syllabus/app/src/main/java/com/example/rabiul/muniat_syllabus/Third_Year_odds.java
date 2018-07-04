package com.example.rabiul.muniat_syllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Third_Year_odds extends AppCompatActivity {
  static  int select=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third__year_odds);
    }
    public void select_subject(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.cse3111:
                Intent myIntent=new  Intent(Third_Year_odds.this,PdfVeiwer.class) ;
                startActivity(myIntent);
                select=3111;
                break;
            case R.id.cse3112:
                Intent myIntent1=new  Intent(Third_Year_odds.this,PdfVeiwer.class) ;
                startActivity(myIntent1);
                select=3112;
                break;
            case R.id.cse3121:
                Intent myIntent2=new  Intent(Third_Year_odds.this,PdfVeiwer.class) ;
                startActivity(myIntent2);
                select=3121;
                break;
            case R.id.cse3122:
                Intent myIntent3=new  Intent(Third_Year_odds.this,PdfVeiwer.class) ;
                startActivity(myIntent3);
                select=3122;
                break;
            case R.id.cse3131:
                Intent myIntent4=new  Intent(Third_Year_odds.this,PdfVeiwer.class) ;
                startActivity(myIntent4);
                select=3131;
                break;

            case R.id.cse3132:
                Intent myIntent5=new  Intent(Third_Year_odds.this,PdfVeiwer.class) ;
                startActivity(myIntent5);
                select=3132;
                break;
            case R.id.cse3141:
                Intent myIntent6=new  Intent(Third_Year_odds.this,PdfVeiwer.class) ;
                startActivity(myIntent6);
                select=3141;
                break;
            case R.id.cse3142:
                Intent myIntent7=new  Intent(Third_Year_odds.this,PdfVeiwer.class) ;
                startActivity(myIntent7);
                select=3142;
                break;
            case R.id.cse3151:
                Intent myIntent8=new  Intent(Third_Year_odds.this,PdfVeiwer.class) ;
                startActivity(myIntent8);
                select=3151;
                break;
            case R.id.cse3152:
                Intent myIntent9=new  Intent(Third_Year_odds.this,PdfVeiwer.class) ;
                startActivity(myIntent9);
                select=3152;
                break;
            default:
                break;

        }
    }
}
