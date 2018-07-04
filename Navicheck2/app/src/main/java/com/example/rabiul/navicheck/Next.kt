package com.example.rabiul.navicheck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Rabiul on 5/24/2018.
 */
class Next: android.support.v4.app.Fragment()
{
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return  inflater?.inflate(R.layout.next,null)
    }
}