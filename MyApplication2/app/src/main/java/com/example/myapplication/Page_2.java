package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Page_2 extends Fragment {

    public Page_2(){};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageTwo =  inflater.inflate(R.layout.page2, container, false);
        return PageTwo;
    }
}
