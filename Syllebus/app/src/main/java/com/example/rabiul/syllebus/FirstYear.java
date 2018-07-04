package com.example.rabiul.syllebus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FirstYear extends AppCompatActivity {
    TextView final_result1;
    TextView final_result2;
    TextView final_result3;
    TextView final_result4;
    TextView final_result5;
    TextView final_result6;
    TextView final_result7;
    TextView final_result8;
    TextView final_result9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_year);

        final_result1 = (TextView)findViewById(R.id.result1);

        final_result2 = (TextView)findViewById(R.id.result2);

        final_result3 = (TextView)findViewById(R.id.result3);

        final_result4 = (TextView)findViewById(R.id.result4);

        final_result5 = (TextView)findViewById(R.id.result5);

        final_result6 = (TextView)findViewById(R.id.result6);

        final_result7 = (TextView)findViewById(R.id.result7);

        final_result8 = (TextView)findViewById(R.id.result8);

        final_result9 = (TextView)findViewById(R.id.result9);
        final_result1.setEnabled(false);
        final_result2.setEnabled(false);
        final_result3.setEnabled(false);
        final_result4.setEnabled(false);
        final_result5.setEnabled(false);
        final_result6.setEnabled(false);
        final_result7.setEnabled(false);
        final_result8.setEnabled(false);
        final_result9.setEnabled(false);}
    public void SelectSemester(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.rbtnOdd:
                if (checked) {
                    final_result1.setText("1.Computer Programming With C");
                    final_result1.setEnabled(true);
                    final_result2.setText("2.Computer Fundamental");
                    final_result2.setEnabled(true);
                    final_result3.setText("3.Technical English");
                    final_result3.setEnabled(true);
                    final_result4.setText("4.Algebra,Trigonmetry and Vector");
                    final_result4.setEnabled(true);
                    final_result5.setText("5.Physical and Inorganic Chemistry");
                    final_result5.setEnabled(true);
                    final_result6.setText("6.Electrical Circuit and Electronics");
                    final_result6.setEnabled(true);
                    final_result7.setText("7.Computer Programminng with C lab");
                    final_result7.setEnabled(true);
                    final_result8.setText("8.Computer Maintenance and Engineering Drawing Lab");
                    final_result8.setEnabled(true);
                    final_result9.setText("9.Electrical Circuit and Electronics Lab");

                    final_result9.setEnabled(true);








                } else {
                    final_result1.setEnabled(false);
                    final_result2.setEnabled(false);
                    final_result3.setEnabled(false);
                    final_result4.setEnabled(false);
                    final_result5.setEnabled(false);
                    final_result6.setEnabled(false);
                    final_result7.setEnabled(false);
                    final_result8.setEnabled(false);
                    final_result9.setEnabled(false);
                }
                break;
            case R.id.rbtnEven:
                if (checked) {
                    final_result1.setText("1.Object Oriented Programming With C++");
                    final_result2.setText("2.Introduction to digital System");
                    final_result3.setText("3.Applied Electricity and Magnetism");
                    final_result4.setText("4.Differential And Integral Calculus");
                    final_result5.setText("5.Statistics for Engineers");
                    final_result6.setText("6.Economics");

                    final_result7.setText("7.Object Oriented Programming With C++ Lab");
                    final_result8.setText("8.Introduction to digital Electronics Lab");

                    final_result1.setEnabled(true);
                    final_result2.setEnabled(true);
                    final_result3.setEnabled(true);
                    final_result4.setEnabled(true);
                    final_result5.setEnabled(true);
                    final_result6.setEnabled(true);
                    final_result7.setEnabled(true);
                    final_result8.setEnabled(true);
                    final_result9.setEnabled(false);


                } else {
                    final_result1.setEnabled(false);
                    final_result2.setEnabled(false);
                    final_result3.setEnabled(false);
                    final_result4.setEnabled(false);
                    final_result5.setEnabled(false);
                    final_result6.setEnabled(false);
                    final_result7.setEnabled(false);
                    final_result8.setEnabled(false);
                    final_result9.setEnabled(false);
                }
                break;
        }
    }

}
