package com.grv.dev.decoderdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fm, int mNoOfTabs) {
        super(fm);
        this.mNoOfTabs = mNoOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Chat chat = new Chat();
                return chat;

            case 1:
                Threads threads = new Threads();
                return threads;

            case 2:
                QnA qnA  = new QnA();
                return qnA;

            case 3:
                Codes codes = new Codes();
                return codes;

                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
