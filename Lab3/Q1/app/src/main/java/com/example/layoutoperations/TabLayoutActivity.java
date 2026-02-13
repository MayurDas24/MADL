package com.example.layoutoperations;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class TabLayoutActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 pager = findViewById(R.id.viewPager);

        pager.setAdapter(new TabPagerAdapter(this));

        new TabLayoutMediator(tabLayout, pager,
                (tab, pos) -> tab.setText("Tab " + (pos+1))
        ).attach();
    }
}