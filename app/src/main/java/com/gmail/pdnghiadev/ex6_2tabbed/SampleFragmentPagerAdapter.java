package com.gmail.pdnghiadev.ex6_2tabbed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

/**
 * Created by PDNghiaDev on 12/21/2015.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;
    final int PAGE_COUNT = 6;
    private String tabTitles[] = new String[]{"ANDROIDEV", "MOVIES", "PICS", "FOOD", "MUSIC", "COMIC"};
    private int imageResId[] = {R.drawable.ic_android_24dp, R.drawable.ic_movie_24dp, R.drawable.ic_picture_24dp, R.drawable.ic_food_24dp, R.drawable.ic_music_24dp, R.drawable.ic_comic_24dp};

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
//        // Generate title based on item position
//        Drawable image = mContext.getResources().getDrawable(imageResId[position]);
//        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
//
//        // Replace blank spaces with image icon
//        SpannableString sb = new SpannableString(" ");
//        ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
//        sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//
//        return sb;

        return tabTitles[position];
    }
}
