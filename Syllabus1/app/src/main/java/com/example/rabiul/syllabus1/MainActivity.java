package com.example.rabiul.syllabus1;

import java.io.BufferedReader;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import org.apache.http.HttpEntity;
        import org.apache.http.HttpResponse;
        import org.apache.http.client.HttpClient;
        import org.apache.http.client.methods.HttpPost;
        import org.apache.http.impl.client.DefaultHttpClient;
        import org.json.JSONArray;
        import org.json.JSONException;
        import org.json.JSONObject;
        import android.app.Activity;
        import android.graphics.Color;
        import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TableLayout;
        import android.widget.TableRow;
        import android.widget.TextView;
        import android.widget.Toast;
        import android.widget.TableRow.LayoutParams;

public class MainActivity extends AppCompatActivity {



    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button1);


        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                String result = null;
                InputStream is = null;

                try{
                    HttpClient httpclient = new DefaultHttpClient();
                    HttpPost httppost = new HttpPost("http://192.168.0.108/log_in.php");
                    HttpResponse response = httpclient.execute(httppost);
                    HttpEntity entity = response.getEntity();
                    is = entity.getContent();

                    Log.e("log_tag", "connection success ");
                    //   Toast.makeText(getApplicationContext(), "pass", Toast.LENGTH_SHORT).show();
                }
                catch(Exception e)
                {
                    Log.e("log_tag", "Error in http connection "+e.toString());
                    Toast.makeText(getApplicationContext(), "Connection fail", Toast.LENGTH_SHORT).show();

                }
                //convert response to string
                try
                {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
                    StringBuilder sb = new StringBuilder();
                    String line = null;
                    while ((line = reader.readLine()) != null)
                    {
                        sb.append(line + "\n");
                        //  Toast.makeText(getApplicationContext(), "Input Reading pass", Toast.LENGTH_SHORT).show();
                    }
                    is.close();

                    result=sb.toString();
                }
                catch(Exception e)
                {
                    Log.e("log_tag", "Error converting result "+e.toString());
                    Toast.makeText(getApplicationContext(), " Input reading fail", Toast.LENGTH_SHORT).show();

                }

                //parse json data
                try
                {

                    JSONArray jArray = new JSONArray(result);


                    String re=jArray.getString(jArray.length()-1);


                    TableLayout tv=(TableLayout) findViewById(R.id.table);
                    tv.removeAllViewsInLayout();




                    int flag=1;

                    for(int i=-1;i<jArray.length()-1;i++)

                    {




                        TableRow tr=new TableRow(MainActivity.this);

                        tr.setLayoutParams(new LayoutParams(
                                LayoutParams.FILL_PARENT,
                                LayoutParams.WRAP_CONTENT));




                        if(flag==1)
                        {

                            TextView b6=new TextView(MainActivity.this);
                            b6.setText("Course Code");
                            b6.setTextColor(Color.BLUE);
                            b6.setTextSize(15);
                            tr.addView(b6);


                            TextView b19=new TextView(MainActivity.this);
                            b19.setPadding(10, 0, 0, 0);
                            b19.setTextSize(15);
                            b19.setText("Name");
                            b19.setTextColor(Color.BLUE);
                            tr.addView(b19);

                            TextView b29=new TextView(MainActivity.this);
                            b29.setPadding(10, 0, 0, 0);
                            b29.setText("Marks");
                            b29.setTextColor(Color.BLUE);
                            b29.setTextSize(15);
                            tr.addView(b29);
                            TextView b39=new TextView(MainActivity.this);
                            b29.setPadding(10, 0, 0, 0);
                            b29.setText("Credit");
                            b29.setTextColor(Color.BLUE);
                            b29.setTextSize(15);
                            tr.addView(b39);


                            tv.addView(tr);

                            final View vline = new View(MainActivity.this);
                            vline.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, 2));
                            vline.setBackgroundColor(Color.BLUE);



                            tv.addView(vline);
                            flag=0;


                        }

                        else
                        {



                            JSONObject json_data = jArray.getJSONObject(i);

                            Log.i("log_tag","id: "+json_data.getInt("f1")+
                                    ", Username: "+json_data.getString("f2")+
                                    ", No: "+json_data.getInt("f3"));




                            TextView b=new TextView(MainActivity.this);
                            String stime=String.valueOf(json_data.getInt("f1"));
                            b.setText(stime);
                            b.setTextColor(Color.RED);
                            b.setTextSize(15);
                            tr.addView(b);


                            TextView b1=new TextView(MainActivity.this);
                            b1.setPadding(10, 0, 0, 0);
                            b1.setTextSize(15);
                            String stime1=json_data.getString("f2");
                            b1.setText(stime1);
                            b1.setTextColor(Color.WHITE);
                            tr.addView(b1);

                            TextView b2=new TextView(MainActivity.this);
                            b2.setPadding(10, 0, 0, 0);
                            String stime2=String.valueOf(json_data.getInt("f3"));
                            b2.setText(stime2);
                            b2.setTextColor(Color.RED);
                            b2.setTextSize(15);
                            tr.addView(b2);

                            tv.addView(tr);


                            final View vline1 = new View(MainActivity.this);
                            vline1.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, 1));
                            vline1.setBackgroundColor(Color.WHITE);
                            tv.addView(vline1);


                        }

                    }



                }
                catch(JSONException e)
                {
                    Log.e("log_tag", "Error parsing data "+e.toString());
                    Toast.makeText(getApplicationContext(), "JsonArray fail", Toast.LENGTH_SHORT).show();
                }




            }
        });




    }


}




