package com.app.mirko.ayrtonthemagic.Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.mirko.ayrtonthemagic.MainActivity;
import com.app.mirko.ayrtonthemagic.R;


public class remember extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_remember, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Ricordare Ayrton");
        view.findViewById(R.id.imageRemember).setOnClickListener(this);


        return view;
    }

    public void onClick(View v) {
        int viewId = v.getId();

        // Check what view was clicked
        switch (viewId) {

            // More button listeners here
            case R.id.imageRemember:
                Uri uri = Uri.parse("http://senna.mclaren.com/#/intro"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}