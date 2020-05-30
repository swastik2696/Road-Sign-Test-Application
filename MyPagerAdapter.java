package com.example.fragments;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import static com.example.fragments.MainActivity.AnswerList;

public class MyPagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 8;

    public MyPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {

        return RoadSign_Quiz.newInstance("Please select the correct Answer.", AnswerList.get(position));
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
