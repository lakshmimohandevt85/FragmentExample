package com.sdsu.cs646.lakshmi.fragmentexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void respond(String data) // This value holds the data from Fragment A
                                     //  "The counter is clicked" +counter+"times"
    {
        // getting reference to fragment B
        FragmentManager fragmentManager = getFragmentManager();
        FragmentB fragment2 = (FragmentB) fragmentManager.findFragmentById(R.id.fragment2);
        // Passing value to fragment B
        //"The counter is clicked" +counter+"times"
        fragment2.changeText(data);
    }
}