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
public class FragmentFour extends Fragment {
    private View rootView;


    public FragmentFour() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_four, container, false);
        TextView txt04=(TextView) rootView.findViewById(R.id.txt04);
        Bundle bundle=getArguments();
        String textFromEditText=bundle.getString("random04","nothing");
        txt04.setText(textFromEditText);
        // Inflate the layout for this fragment
        return rootView;
    }

}
