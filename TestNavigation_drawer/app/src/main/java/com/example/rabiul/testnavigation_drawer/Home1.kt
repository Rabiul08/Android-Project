package com.example.rabiul.testnavigation_drawer

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Rabiul on 5/23/2018.
 */
class Home1 : Fragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View?{
       return  inflater?.inflate(R.layout.home1,null);
    }
}