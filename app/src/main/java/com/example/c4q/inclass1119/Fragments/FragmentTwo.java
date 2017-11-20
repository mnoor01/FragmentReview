package com.example.c4q.inclass1119.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.c4q.inclass1119.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {
    private View rootView;


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_two, container, false);
        TextView txt02=(TextView) rootView.findViewById(R.id.txt02);
        Bundle bundle=getArguments();//here I am getting the things I saved from the button02 onclicklistener.
        // Inflate the layout for this fragment
        String getFromEditText=bundle.getString("random02","Don;t know what happened yet");
        //now we are going to set the textview in the framenttwo xml tot the value of get fromedittext
        txt02.setText(getFromEditText);
        return rootView ;
    }

}
