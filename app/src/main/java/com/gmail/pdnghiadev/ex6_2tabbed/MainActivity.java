package com.gmail.pdnghiadev.ex6_2tabbed;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new SampleFragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_android_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_movie_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_picture_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_food_24dp);
        tabLayout.getTabAt(4).setIcon(R.drawable.ic_music_24dp);
        tabLayout.getTabAt(5).setIcon(R.drawable.ic_comic_24dp);
    }
}
