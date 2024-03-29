package com.jy.santianzuoye.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list;
    private ArrayList<String> strings;

    public FragmentAdapter(FragmentManager fm, ArrayList<Fragment> list, ArrayList<String> strings) {
        super(fm);
        this.list = list;
        this.strings = strings;
    }


    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        return strings.get(position);
    }
}
