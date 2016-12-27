package com.wings.example_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment_android extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_android, container, false);

        Bundle b = getArguments();
        String s = b.getString("Key");

        TextView txt_android = (TextView)view.findViewById(R.id.txt_android);
        txt_android.setText(s);
        return view;

    }

}
