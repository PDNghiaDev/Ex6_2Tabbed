package com.gmail.pdnghiadev.ex6_2tabbed;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by PDNghiaDev on 12/21/2015.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    final int PAGE_COUNT = 6;
    private String tabTitles[] = new String[]{"ANDROIDEV", "MOVIES", "PICS", "FOOD", "MUSIC", "COMIC"};

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
