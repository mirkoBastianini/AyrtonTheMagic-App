package com.app.mirko.ayrtonthemagic.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.mirko.ayrtonthemagic.MainActivity;
import com.app.mirko.ayrtonthemagic.R;


public class leAuto extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_auto, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Ayrton il pilota");



        return view;
    }

}
