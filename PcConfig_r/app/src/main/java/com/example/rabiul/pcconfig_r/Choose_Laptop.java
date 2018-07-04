package com.example.rabiul.pcconfig_r;

/**
 * Created by Rabiul on 4/15/2018.
 */

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Choose_Laptop extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,   Bundle savedInstanceState) {
        View myview=inflater.inflate(R.layout.choose_laptop,container,false);
        return myview;
    }
}
