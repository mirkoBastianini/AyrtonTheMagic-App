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


public class week extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_week, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Ricordare Ayrton");
        view.findViewById(R.id.week1).setOnClickListener(this);
        view.findViewById(R.id.week2).setOnClickListener(this);
        view.findViewById(R.id.week3).setOnClickListener(this);
        view.findViewById(R.id.week4).setOnClickListener(this);
        view.findViewById(R.id.week5).setOnClickListener(this);

        return view;
    }

    public void onClick(View v) {
        int viewId = v.getId();

        // Check what view was clicked
        switch (viewId) {

            // More button listeners here
            case R.id.week1:
                Uri uri = Uri.parse("https://www.youtube.com/watch?v=WxlnNykY3N8"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.week2:
                Uri uri2 = Uri.parse("https://www.youtube.com/watch?v=mFhYSthGePM"); // missing 'http://' will cause crashed
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri2);
                startActivity(intent2);
                break;
            case R.id.week3:
                Uri uri3 = Uri.parse("https://www.youtube.com/watch?v=6zq9JCEoayI"); // missing 'http://' will cause crashed
                Intent intent3 = new Intent(Intent.ACTION_VIEW, uri3);
                startActivity(intent3);
                break;
            case R.id.week4:
                Uri uri5 = Uri.parse("https://www.youtube.com/watch?v=I8P3jzJqxtc"); // missing 'http://' will cause crashed
                Intent intent5 = new Intent(Intent.ACTION_VIEW, uri5);
                startActivity(intent5);
                break;
            case R.id.week5:
                Uri uri6 = Uri.parse("https://www.youtube.com/watch?v=iqdmMXzz4-0"); // missing 'http://' will cause crashed
                Intent intent6 = new Intent(Intent.ACTION_VIEW, uri6);
                startActivity(intent6);
                break;
            default:
                break;
        }
    }
}
