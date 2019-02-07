package com.olabode.wilson.news.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.olabode.wilson.news.fragments.Business;
import com.olabode.wilson.news.fragments.Entertainment;
import com.olabode.wilson.news.fragments.HeadLines;
import com.olabode.wilson.news.fragments.Sport;


public class CategoryAdapter extends FragmentPagerAdapter {


    private String tabTitles[] = new String[]{"HeadLines", "Entertainment", "Business", "Sport",};


    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HeadLines();
        } else if (position == 1) {
            return new Entertainment();
        } else if (position == 2) {
            return new Business();

        } else {
            return new Sport();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    // get current tab title
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
