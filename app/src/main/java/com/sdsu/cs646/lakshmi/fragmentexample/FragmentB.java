package com.sdsu.cs646.lakshmi.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lakshmimohandev on 7/22/16.
 */
public class FragmentB extends Fragment

{

    TextView textView_view;
   /*
    Linking the layout to Fragmentclass B
     */

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView_view = (TextView)getActivity().findViewById(R.id.textView);

    }

    public void changeText(String data)
    {
       textView_view.setText(data);

    }
}
