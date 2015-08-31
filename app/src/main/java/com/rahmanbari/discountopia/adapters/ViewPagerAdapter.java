package com.rahmanbari.discountopia.adapters;

/**
 * Created by tahseenrahman on 2015-07-26.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.rahmanbari.discountopia.fragments.BrandsFragment;
import com.rahmanbari.discountopia.fragments.DepartmentsFragment;
import com.rahmanbari.discountopia.fragments.FeaturedDealsFragment;
import com.rahmanbari.discountopia.fragments.MallsFragment;

/**
 * Created by hp1 on 21-01-2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {


        if(position == 0)            // As we are having 4 tabs if the position is now 0 it must be 1 so we are returning second tab
        {
            FeaturedDealsFragment featuredDealsTab = new FeaturedDealsFragment();
            return featuredDealsTab;
        }
        else if(position == 1) // if the position is 0 we are returning the First tab
        {
            DepartmentsFragment departmentsTab = new DepartmentsFragment();
            return departmentsTab;
        }
        else if(position == 2)            // As we are having 4 tabs if the position is now 0 it must be 2 so we are returning third tab
        {
            BrandsFragment brandsTab = new BrandsFragment();
            return brandsTab;
        }
        else             // As we are having 4 tabs if the position is now 0 it must be 3 so we are returning fourth tab
        {
            MallsFragment mallsTab = new MallsFragment();
            return mallsTab;
        }

    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}