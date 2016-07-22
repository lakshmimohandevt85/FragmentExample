package com.sdsu.cs646.lakshmi.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by lakshmimohandev on 7/22/16.
 */
public class FragmentA extends Fragment implements View.OnClickListener
{
    Button button_clickMe;
    int counter = 0;
    Communicator communicator;
    /*
    Linking the layout to Fragmentclass A
     */

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
    /*
      Oncreate of fragment can get called before oncreate of activity.
       So there is chance for app crashing.
       So intialize widgets inside onActivityCreated
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
         button_clickMe = (Button) getActivity().findViewById(R.id.button);
        button_clickMe.setOnClickListener(this);
        // Getting reference to subclass of interface (ie, main class)
         communicator = (Communicator) getActivity();
    }

    @Override
    public void onClick(View view)
    {
     counter++;
        // Got the respond method from main activity, and this value is passed
        //to the data of the respond method of main activity
        communicator.respond("The counter is clicked" +counter+"times");
    }
}
