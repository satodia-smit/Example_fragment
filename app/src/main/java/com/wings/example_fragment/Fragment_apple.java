package com.wings.example_fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment_apple extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment_apple, container, false);

        Bundle b = getArguments();
        String s = b.getString("Key");

        TextView txt_apple = (TextView)view.findViewById(R.id.txt_apple);
        txt_apple.setText(s);
        return view;

    }

}
