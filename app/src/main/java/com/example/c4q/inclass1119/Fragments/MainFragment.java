package com.example.c4q.inclass1119.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.c4q.inclass1119.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {// new stuff to fragmentone
    private View rootView;
    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private EditText eMain;

    public MainFragment() {// we are creating buttons on the main fragment so there is no on create method
        // I have to create a view variable that an inflator can be assigned to
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_main, container, false);
        eMain=(EditText) rootView.findViewById(R.id.emain);//this is the edit text in the fragment_main.

        button01=(Button) rootView.findViewById(R.id.button01);
        button02=(Button) rootView.findViewById(R.id.button02);
        button03=(Button) rootView.findViewById(R.id.button03);
        button04=(Button) rootView.findViewById(R.id.button04);
        button05=(Button) rootView.findViewById(R.id.button05);
        // Inflate the layout for this fragment
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentOne fragmentOne= new FragmentOne();
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
                String editTextContents = eMain.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("random", editTextContents);//in here it is bunde.putString and in the class that is being transacted it is going to be
                //bundle.putString and then bundle is going to equal to Bundle bundle= getArguments().
                fragmentOne.setArguments(bundle);
                fragmentTransaction.replace(R.id.main_container,fragmentOne).addToBackStack("random");
                fragmentTransaction.commit();

            }
        });
     button02.setOnClickListener(new View.OnClickListener() {// now I am going to do the same thing for this one and I am going
         //to get the methods in fragmenttwo so here I am going to instantiate fragment two.
         @Override
         public void onClick(View v) {
             FragmentTwo fragmentTwo= new FragmentTwo();
             FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
             FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();// we call to begin the transaction
             String editTextContent=eMain.getText().toString();
             Bundle bundle=new Bundle();
             bundle.putString("random02",editTextContent);
             fragmentTwo.setArguments(bundle);
             fragmentTransaction.replace(R.id.main_container,fragmentTwo).addToBackStack("random02");// so here I am replacing the Framelayout in the activity_main with the frament two view(whatever it may be).
             fragmentTransaction.commit(); //now I am going go to the fragmenttwo class and set it up using bundle and strings.

         }
     });
     button03.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             FragmentThree fragmentThree= new FragmentThree();// first intstantiate the fragment class then do the fragmetmanager
             FragmentManager fragmentManager= getActivity().getSupportFragmentManager();//fragmentmanager gets the activity and then manges it but I also ha ve to fo the logic.
             //A FragmentManager manages Fragments in Android, in relation to how transactions are handled between fragments. A transaction is a way to add, replace, or remove fragments.
             FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();//this wiil begin the transaction.
             // now I am going to create a string for the for the text view that was created in this class from the activity_main xml
             //so we can put stuff in the texview when the app starts running.
             String editTextcontents02= eMain.getText().toString();//After this I am going tom create a bundle
             Bundle bundle= new Bundle();
             bundle.putString("random03",editTextcontents02);
             fragmentThree.setArguments(bundle);
             fragmentTransaction.replace(R.id.main_container,fragmentThree).addToBackStack("random03");//this is replacing the framelayout with fragment 3
             //now I am going to commit
             fragmentTransaction.commit();// this is to commit the transaction.
             // Now I go to the fragmentthree class and make some changes

         }
     });
     button04.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             FragmentFour fragmentFour= new FragmentFour();//with every onclicklistener we instantiate the fragment classes
             FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
             FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
             //now create a string and assign it to the textview for the bundle
             String textFromEditText= eMain.getText().toString();
             Bundle bundle= new Bundle();
             bundle.putString("random04",textFromEditText);
             fragmentFour.setArguments(bundle);
             fragmentTransaction.replace(R.id.main_container,fragmentFour).addToBackStack("random04");
             fragmentTransaction.commit();
         }
     });
     button05.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             FragmentFive fragmentFive= new FragmentFive();
             FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
             FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
             String textFromEditText= eMain.getText().toString();
             Bundle bundle=new Bundle();
             bundle.putString("random05",textFromEditText);
             fragmentFive.setArguments(bundle);
             fragmentTransaction.replace(R.id.main_container, fragmentFive).addToBackStack("random05");
             fragmentTransaction.commit();

         }
     });

        return rootView;


    }

}
