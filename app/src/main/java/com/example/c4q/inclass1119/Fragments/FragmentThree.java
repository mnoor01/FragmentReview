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
public class FragmentThree extends Fragment {
    private View rootView;


    public FragmentThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_three, container, false);//this is so we can call on different view in the fragment_three xml
        TextView text03=(TextView) rootView.findViewById(R.id.txt03);
        Bundle bundle=getArguments();
        String textFromEditText= bundle.getString("random03","nothing passed");
        text03.setText(textFromEditText);



        // Inflate the layout for this fragment
        return rootView ;
    }

}
