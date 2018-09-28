package com.example.android.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MondayFragment();
        } else if (position == 1){
            return new TuesdayFragment();
        } else if (position == 2){
            return new WednesdayFragment();
        } else if(position == 3){
            return new ThursdayFragment();
        } else {
            return new com.example.android.viewpager.FridayFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}

