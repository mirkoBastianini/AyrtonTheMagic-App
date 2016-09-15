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


public class massimo extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_massimo, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Beco la persona");
        view.findViewById(R.id.imageMassimo).setOnClickListener(this);


        return view;
    }

    public void onClick(View v) {
        int viewId = v.getId();

        // Check what view was clicked
        switch (viewId) {

            // More button listeners here
            case R.id.imageMassimo:
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=mn0mLs1qvXc"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
