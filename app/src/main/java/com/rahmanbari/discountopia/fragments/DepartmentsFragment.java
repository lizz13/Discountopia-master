package com.rahmanbari.discountopia.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.rahmanbari.discountopia.MapActivity;
import com.rahmanbari.discountopia.R;
import com.rahmanbari.discountopia.SettingsActivity;


/**
 * A placeholder fragment containing a simple view.
 */
public class DepartmentsFragment extends Fragment {

    public DepartmentsFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.departments_tab, container, false);

        Button buttonMap = (Button) rootView.findViewById(R.id.buttonMap);
        Button buttonSettings= (Button)rootView.findViewById(R.id.buttonSettings);
        buttonMap.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(getActivity(),MapActivity.class);
                startActivity(i);


            }
        });


        buttonSettings.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v)
            {
                Intent i= new Intent(getActivity(), SettingsActivity.class);
                startActivity(i);


            }
        });


        return rootView;
    }
}