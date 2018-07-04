package com.example.rabiul.navicheck

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Rabiul on 5/24/2018.
 */
class Second: android.support.v4.app.Fragment()
        {
            override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
                return  inflater?.inflate(R.layout.second,null)
            }
        }