package com.example.rabiul.pcconfig_r;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class Customize_parts extends AppCompatActivity {
    Button done;
    ArrayList<String > item=new ArrayList<String >();
   public static String selectstring ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_parts);
        getSupportActionBar().setTitle("Select Item");
        done=findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectstring="";
                for(String selection:item)
                {
                    selectstring= selection+", "+selectstring;
                }
                final AlertDialog.Builder builder=new AlertDialog.Builder(Customize_parts.this);
                if(selectstring.length()<3)
                {
                    builder.setMessage("You did not select "+"\n Is it ok ?");
                    builder.setCancelable(true);
                    builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Configure_Pc.select=selectstring;
                            finish();
                        }
                    });
                    builder.setPositiveButton("Reselect", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    AlertDialog alertDialog=builder.create();
                    alertDialog.show();
                }
                else
                {
                    builder.setMessage("You have selected : "+selectstring+"\n Is it ok ?");
                    builder.setCancelable(true);
                    builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Configure_Pc.select=selectstring;
                            finish();
                        }
                    });
                    builder.setPositiveButton("Reselect", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    AlertDialog alertDialog=builder.create();
                    alertDialog.show();
                }



                //finish();
            }
        });

    }
    public void onBackPressed()
    {
        final AlertDialog.Builder builder=new AlertDialog.Builder(Customize_parts.this);
        builder.setMessage("Do you want to back without select any item");
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

        AlertDialog alertDialog=builder.create();
        alertDialog.show();

    }
    public  void selectItem(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.processor_c:
                if(checked)
                {
                    item.add("Processor");
                }
                else
                {
                    item.remove("Processor");
                }
                break;
            case R.id.main_board_c:
                if(checked)
                {
                    item.add("Main Board");
                }
                else
                {
                    item.remove("Main Board");
                }
                break;
            case R.id.power_supply_c:
                if(checked)
                {
                    item.add("Power Supply");
                }
                else
                {
                    item.remove("Power Supply");
                }
                break;
            case R.id.ram_c:
                if(checked)
                {
                    item.add("RAM");
                }
                else
                {
                    item.remove("RAM");
                }
                break;case R.id.processor_culler_c:
            if(checked)
            {
                item.add("Processor Culler");
            }
            else
            {
                item.remove("Processor Culler");
            }
            break;
            case R.id.hard_disk_c:
                if(checked)
                {
                    item.add("Hard Disk");
                }
                else
                {
                    item.remove("Hard Disk");
                }
                break;
            case R.id.graphics_c:
                if(checked)
                {
                    item.add("Graphics Card");
                }
                else
                {
                    item.remove("Graphics Card");
                }
                break;case R.id.case_c:
            if(checked)
            {
                item.add("Casing");
            }
            else
            {
                item.remove("Casing");
            }
            break;
            case R.id.dvd_c:
                if(checked)
                {
                    item.add("DVD Writer");
                }
                else
                {
                    item.remove("DVD Writer");
                }
                break;
            case R.id.monitor_c:
                if(checked)
                {
                    item.add("Monitor");
                }
                else
                {
                    item.remove("Monitor");
                }
                break;
            case R.id.mouse_c:
                if(checked)
                {
                    item.add("Mouse");
                }
                else
                {
                    item.remove("Mouse");
                }
                break;
            case R.id.keyboard_c:
                if(checked)
                {
                    item.add("Keyboard");
                }
                else
                {
                    item.remove("Keyboard");
                }
                break;
            case R.id.speaker_c:
                if(checked)
                {
                    item.add("Speaker");
                }
                else
                {
                    item.remove("Speaker");
                }
                break;
            case R.id.headphone_c:
                if(checked)
                {
                    item.add("Head Phone");
                }
                else
                {
                    item.remove("Head Phone");
                }
                break;
            case R.id.ups_c:
                if(checked)
                {
                    item.add("UPS");
                }
                else
                {
                    item.remove("UPS");
                }
                break;
            case R.id.case_fan_c:
                if(checked)
                {
                    item.add("Case Fan");
                }
                else
                {
                    item.remove("Case fan");
                }
                break;
                default:
                    break;






        }

    }


}
