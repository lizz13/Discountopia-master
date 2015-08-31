package com.rahmanbari.discountopia.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahmanbari.discountopia.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class FeaturedDealsFragment extends Fragment {

    public FeaturedDealsFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.featured_tab, container, false);
    }
}
