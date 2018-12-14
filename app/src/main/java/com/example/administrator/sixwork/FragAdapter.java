package com.example.administrator.sixwork;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class FragAdapter extends FragmentPagerAdapter {
    private final List<MyFragment> myFragments;
    public FragAdapter(FragmentManager fm,List<MyFragment> myFragments) {
        super(fm);
        this.myFragments = myFragments;
    }

    @Override
    public Fragment getItem(int i) {
        return myFragments.get(i);
    }

    @Override
    public int getCount() {
        return myFragments.size();
    }
    public String getPageTitle(int i){
        return myFragments.get(i).getTitle();
    }
}
