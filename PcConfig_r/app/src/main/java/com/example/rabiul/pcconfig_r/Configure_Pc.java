package com.example.rabiul.pcconfig_r;

/**
 * Created by Rabiul on 4/15/2018.
 */

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Configure_Pc extends Fragment {
    Button catagoris;
    Button customize;
    Button find;
    String catagori="";
    String selectItem="";
    String tk;
    String  customize_list[];
    public static String select;
    boolean[] cus_check;
    ArrayList<Integer> customizeItem= new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,   Bundle savedInstanceState) {
        View myview=inflater.inflate(R.layout.configure_pc,container,false);
        catagoris= (Button)myview.findViewById(R.id.catagories);

        customize=(Button)myview.findViewById(R.id.customize);
        customize_list=getResources().getStringArray(R.array.customize_parts);
        cus_check = new boolean[customize_list.length];
        find=myview.findViewById(R.id.find);

        catagoris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu popupMenu=new PopupMenu(getActivity(),catagoris);
                popupMenu.getMenuInflater().inflate(R.menu.catagories_desktop,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId())
                        {
                            case R.id.gaming:
                               catagori="Gaming";
                                break;
                            case R.id.g_Student:
                                catagori="General Student";
                                break;
                            case R.id.cse_Student:
                               catagori="CSE Student";
                                break;
                            case R.id.business:
                               catagori="Business";
                                break;
                            case R.id.public_people:
                               catagori="Public People";
                                break;
                            case R.id.official:
                               catagori="Official";
                                Toast.makeText(getActivity(),"" + menuItem.getTitle(),Toast.LENGTH_SHORT).show();
                               break;
                            case R.id.reasearch:
                               catagori="Research";
                                Toast.makeText(getActivity(),"" + menuItem.getTitle(),Toast.LENGTH_SHORT).show();
                                break;
                            default:
                                Toast.makeText(getActivity(),""+"Nothing is selected",Toast.LENGTH_SHORT).show();
                                catagori="";
                                break;


                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
        customize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



               PopupMenu popupMenu=new PopupMenu(getActivity(),customize);
                popupMenu.getMenuInflater().inflate(R.menu.customiz_parts_yes_no,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId())
                        {
                            case R.id.no:
                               selectItem="No";
                                break;
                            case R.id.yes:
                               // textView.setText(menuItem.getTitle());
                                Intent myIntent_1= new Intent(getActivity(),Customize_parts.class);
                                startActivity(myIntent_1);
                                ((Activity) getActivity()).overridePendingTransition(0,0);

                                break;

                            default:
                                selectItem="";
                                break;


                        }


                        return true;
                    }
                });
                popupMenu.show();


            }
        });


        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(selectItem=="No")
                    selectItem=selectItem;
                else
                    selectItem=select;

                if(catagori!=null&&selectItem!=null)
                {
                    if(selectItem=="No")
                    {

                        final android.support.v7.app.AlertDialog.Builder builder=new android.support.v7.app.AlertDialog.Builder(getActivity());
                        builder.setMessage("You have selected : "+catagori +" & automatic selected parts");
                        builder.setCancelable(true);

                        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                              //  dialogInterface.cancel();
                                Intent myIntent_1= new Intent(getActivity(),Final_pc.class);
                                startActivity(myIntent_1);
                                ((Activity) getActivity()).overridePendingTransition(0,0);
                                Toast.makeText(getActivity(),select+"Keyboard is selsected",Toast.LENGTH_LONG).show();
                            }
                        });

                        android.support.v7.app.AlertDialog alertDialog=builder.create();
                        alertDialog.show();

                    }
                 else  if(select.length()>2)
                    {
                        final android.support.v7.app.AlertDialog.Builder builder=new android.support.v7.app.AlertDialog.Builder(getActivity());
                        builder.setMessage("You have selected : "+catagori +" & Parts is :\n"+select);
                        builder.setCancelable(true);

                        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //  dialogInterface.cancel();
                                Intent myIntent_1= new Intent(getActivity(),Final_pc.class);
                                startActivity(myIntent_1);
                                ((Activity) getActivity()).overridePendingTransition(0,0);
                                Toast.makeText(getActivity(),select+"Keyboard is selsected",Toast.LENGTH_LONG).show();
                            }
                        });

                        android.support.v7.app.AlertDialog alertDialog=builder.create();
                        alertDialog.show();
                    }
                  else
                    {

                        final android.support.v7.app.AlertDialog.Builder builder=new android.support.v7.app.AlertDialog.Builder(getActivity());
                        builder.setMessage("Please categories and customise parts");
                        builder.setCancelable(true);

                        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });

                        android.support.v7.app.AlertDialog alertDialog=builder.create();
                        alertDialog.show();
                    }
                }
                else
                {

                    final android.support.v7.app.AlertDialog.Builder builder=new android.support.v7.app.AlertDialog.Builder(getActivity());
                    builder.setMessage("Please select categories and parts");
                    builder.setCancelable(true);

                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });

                    android.support.v7.app.AlertDialog alertDialog=builder.create();
                    alertDialog.show();
                }
               // Toast.makeText(getActivity(),select+" is selsected",Toast.LENGTH_LONG).show();
                selectItem="";
                select="";
                catagori="";
            }
        });
      return myview;
    }





}
