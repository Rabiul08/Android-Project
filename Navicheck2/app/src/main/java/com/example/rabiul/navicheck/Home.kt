package com.example.rabiul.navicheck

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.home.*

/**
 * Created by Rabiul on 5/24/2018.
 */
class Home: android.support.v4.app.Fragment(),View.OnClickListener
{

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?{

       val view: View= inflater!!.inflate(R.layout.home,container,false)
        val btn: Button=view.findViewById(R.id.testb)
        btn.setOnClickListener(this)
       // return  inflater?.inflate(R.layout.home,null)
        return view

    }
    companion object {
        fun newInstance():Home{
            return Home()
        }

    }
   override fun onClick(v:View)
    {
        when(v.id)
        {
            R.id.testb->
            {
                textView3.setText("Test button")

                Next()
            }
            else ->
            {

            }
        }
    }


   /* override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        testb.setOnClickListener {
           val intent = Intent(context,Next::class.java)
            //startActivity(intent)

            Next()


        }

    }*/
}
