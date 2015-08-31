package com.rahmanbari.discountopia;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class SettingsActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        Spinner countrySpinner = (Spinner) findViewById(R.id.country_spinner);

        String[] countries = new String[] {"Canada","France","Germany","Italy","USA"};

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, countries);

        countrySpinner.setAdapter(countryAdapter);

        Spinner stateSpinner = (Spinner) findViewById(R.id.state_spinner);

        String[] states = new String[] { "Ontario", "Quebec", "Alberta" };

        ArrayAdapter<String> stateAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, states);

        stateSpinner.setAdapter(stateAdapter);

        stateSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Log.v("item", (String) parent.getItemAtPosition(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
    }
}
