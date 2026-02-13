package com.example.news;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class NewsPagerAdapter extends FragmentStateAdapter {

    public NewsPagerAdapter(FragmentActivity fa) {
        super(fa);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if(position==0) return NewsFragment.newInstance("Top Stories News");
        if(position==1) return NewsFragment.newInstance("Sports News");
        return NewsFragment.newInstance("Entertainment News");
    }
}