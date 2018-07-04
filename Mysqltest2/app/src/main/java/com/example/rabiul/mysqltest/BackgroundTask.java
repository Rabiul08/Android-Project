package com.example.rabiul.mysqltest;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Rabiul on 6/10/2018.
 */

public class BackgroundTask extends AsyncTask<String,Void,String> {
     Context ctx;

AlertDialog alertDialog;

    BackgroundTask(android.content.Context ctx)
   {
     this.ctx=   ctx;
    }
    @Override
    protected void onPreExecute()
    {
         alertDialog=new AlertDialog.Builder(ctx).create();
         alertDialog.setTitle("Login Information");
    }

    @Override
    protected String doInBackground(String... params) {
       String reg_url="http://10.0.2.2/loginApp/register.php";
      String login_url="http://10.0.2.2/loginApp/login.php";

        String method=params[0];

        if(method.equals("register"))
        {
            String name=params[1];
            String email=params[2];
            String pass=params[3];
            try {
                URL url= new URL(reg_url);
                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream OS=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(OS,"UTF-8"));
                String data= URLEncoder.encode("name","UTF-8") +"="+URLEncoder.encode(name,"UTF-8")+"&"+
                        URLEncoder.encode("email","UTF-8") +"="+URLEncoder.encode(email,"UTF-8")+"&"+
                        URLEncoder.encode("pass","UTF-8") +"="+URLEncoder.encode(pass,"UTF-8");
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                OS.close();
                InputStream IS= httpURLConnection.getInputStream();
                IS.close();

                return "Registration Successfully";






            }catch (Exception e)
            {

                e.printStackTrace();
            }
        }
        else if(method.equals("Login"))
        {
            String email=params[1];
            String pass= params[2];
             try {
                URL url= new URL(login_url);
                HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream OS=httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(OS,"UTF-8"));
                String data= URLEncoder.encode("email","UTF-8") +"="+URLEncoder.encode(email,"UTF-8")+"&"+
                        URLEncoder.encode("password","UTF-8") +"="+URLEncoder.encode(pass,"UTF-8");
                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                OS.close();
                InputStream IS= httpURLConnection.getInputStream();
                BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(IS,"iso-8859-1"));
                StringBuilder respons=new StringBuilder();
                String line="";
                while ((line=bufferedReader.readLine())!=null)
                {
                  respons.append(line+"\n");
                }
                bufferedReader.close();
                IS.close();
                httpURLConnection.disconnect();
                String res=respons.toString();
                return res ;
            }catch (Exception e)
            {
                e.printStackTrace();
            }


        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {
       if(result.equals("Registration Successfully"))
       {
           Toast.makeText(ctx,result,Toast.LENGTH_LONG).show();
       }
      else
      {
          try
          {
              JSONArray jsonArray=new JSONArray(result);
              JSONObject jsonObject=null;
                MainActivity.name=new String[jsonArray.length()];
                MainActivity.email=new String[jsonArray.length()];
                MainActivity.password=new String[jsonArray.length()];
                int i;
                for(i=0;i<=jsonArray.length();i++)
                {
                    jsonObject=jsonObject.getJSONObject(String.valueOf(i));
                    MainActivity.name[i]=jsonObject.getString("name");
                    MainActivity.email[i]=jsonObject.getString("email");
                    MainActivity.password[i]=jsonObject.getString("password");
                }
          }catch (Exception ex)
          {
              ex.printStackTrace();
          }
           alertDialog.setMessage(result);
          alertDialog.show();
        MainActivity.ret=result;
       //   Toast.makeText(ctx,MainActivity.ret,Toast.LENGTH_LONG).show();

      }
    }
}
