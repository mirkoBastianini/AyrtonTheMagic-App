package com.app.mirko.ayrtonthemagic.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.mirko.ayrtonthemagic.MainActivity;
import com.app.mirko.ayrtonthemagic.R;


public class ioeayrton extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_ioeayrton, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Io ed Ayrton");



        return view;
    }

}
