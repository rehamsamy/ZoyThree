package com.zoythree.OrderActivity;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Switch;

import com.zoythree.OrderActivity.Completed.OrderCompletedFragment;
import com.zoythree.OrderActivity.Onway.OrderOnWayFragment;
import com.zoythree.OrderActivity.Process.OrderProcessFragment;

public class OrdersPagerAdapter extends FragmentPagerAdapter {
 int numOfTabs;
    public OrdersPagerAdapter(FragmentManager fm,int numOfTabs) {
        super(fm);
        this.numOfTabs=numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch(position){
            case 0:
                return fragment=new OrderProcessFragment();

            case 1:
                return  fragment=new OrderOnWayFragment();

            case 2:
                return fragment=new OrderCompletedFragment();

                default:
                    return fragment;

        }

    }

    @Override
    public int getCount() {
        return numOfTabs;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Process";
            case 1:
                return "On Way";
            case 2:
                return "Completed";
                default:
                    return null;
        }
    }
}
