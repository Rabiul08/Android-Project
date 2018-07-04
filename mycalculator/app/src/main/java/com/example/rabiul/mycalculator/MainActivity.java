package com.example.rabiul.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button dot;
    private Button plus;
    private Button minus;
    private Button mult;
    private Button devide;
    private Button equal;
    private Button ac;
    private Button back;
    private Button percentage;
    private TextView main_Window;
    private double num1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUIView();
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_Window.setText(main_Window.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_Window.setText(main_Window.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_Window.setText(main_Window.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_Window.setText(main_Window.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_Window.setText(main_Window.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_Window.setText(main_Window.getText().toString()+"5");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_Window.setText(main_Window.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_Window.setText(main_Window.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_Window.setText(main_Window.getText().toString()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main_Window.setText(main_Window.getText().toString()+"0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp;
                temp=main_Window.getText().toString();

                //num1=temp.;
                main_Window.setText(main_Window.getText().toString()+"+");
            }
        });



        setContentView(R.layout.activity_main);
    }
    private  void setUIView()
    {
        one=(Button)findViewById(R.id.button);
        two=(Button)findViewById(R.id.button2);
        three=(Button)findViewById(R.id.button3);
        four=(Button)findViewById(R.id.button4);
        five=(Button)findViewById(R.id.button5);
        six=(Button)findViewById(R.id.button6);
        seven=(Button)findViewById(R.id.button7);
        eight=(Button)findViewById(R.id.button8);
        nine=(Button)findViewById(R.id.button9);
        zero=(Button)findViewById(R.id.button10);
        dot= (Button)findViewById(R.id.button11);
        plus=(Button)findViewById(R.id.button12);
        minus=(Button)findViewById(R.id.button13);
        mult=(Button)findViewById(R.id.button14);
        devide=(Button)findViewById(R.id.button15);
        percentage=(Button)findViewById(R.id.button16);
        equal=(Button)findViewById(R.id.button17);
        ac=(Button)findViewById(R.id.button18);
        back=(Button)findViewById(R.id.button19);
        main_Window=(TextView) findViewById(R.id.text);

    }
}
