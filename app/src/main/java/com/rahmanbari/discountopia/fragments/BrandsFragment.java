package com.rahmanbari.discountopia.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahmanbari.discountopia.R;

/**
 * Created by tahseenrahman on 2015-07-26.
 */
public class BrandsFragment extends Fragment
{
    public BrandsFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.brands_tab, container, false);
    }
}
