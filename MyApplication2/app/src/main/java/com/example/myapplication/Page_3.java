package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Page_3 extends Fragment {

    public Page_3(){};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageTree =  inflater.inflate(R.layout.page3, container, false);
        return PageTree;
    }
}
