package com.example.abdelrahman.myapplication;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

   Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.actionBar_id);
        setSupportActionBar(toolbar);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new OneFragment(),"ITEM ONE");
        viewPagerAdapter.addFragment(new TwoFragment(),"ITEM TWO");
        viewPagerAdapter.addFragment(new ThreeFragment(),"ITEM THREE");


        viewPager = findViewById(R.id.viewPager_id);
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout = findViewById(R.id.tabLayout_id);
        tabLayout.setupWithViewPager(viewPager);

    }
}
