package com.zoythree.OrderActivity;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.zoythree.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyOrderActivity extends AppCompatActivity {
    @BindView(R.id.tab_layout_id) TabLayout tabLayout;
    @BindView(R.id.view_pager_id) ViewPager viewPager;
    OrdersPagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle
        savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_order);
            ButterKnife.bind(this);

            //tabLayout.addTab(processTab,0);

            pagerAdapter=new OrdersPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
            viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
            tabLayout.setupWithViewPager(viewPager);
            viewPager.setAdapter(pagerAdapter);
            tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    viewPager.setCurrentItem(tab.getPosition());
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });

    }
}
