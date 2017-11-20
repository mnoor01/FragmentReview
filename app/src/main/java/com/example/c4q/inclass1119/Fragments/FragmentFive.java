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
public class FragmentFive extends Fragment {
    private View rootView;


    public FragmentFive() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_five, container, false);
        TextView txt05 = (TextView) rootView.findViewById(R.id.txt05);
        Bundle bundle = getArguments();
        String textFromEditText = bundle.getString("random05", "nothing");
        txt05.setText(textFromEditText);
        // Inflate the layout for this fragment
        return rootView;
    }

}
