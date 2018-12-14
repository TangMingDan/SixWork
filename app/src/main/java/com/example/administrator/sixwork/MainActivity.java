package com.example.administrator.sixwork;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private int[] imageID = {R.drawable.apple_pic,R.drawable.strawberry_pic,R.drawable.banana_pic,R.drawable.cherry_pic,
            R.drawable.edit_bg,R.drawable.grape_pic,R.drawable.orange_pic,R.drawable.pear_pic,R.drawable.pineapple_pic,
            R.drawable.watermelon_pic};

    private List<MyFragment> myFragments = new ArrayList<>();

    ViewPager viewPager;
    TabLayout tabLayout;
    FragAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        initData();
        tabLayout = findViewById(R.id.tablayout);

        adapter = new FragAdapter(getSupportFragmentManager(),myFragments);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
            }

            @Override
            public void onPageSelected(int i) {
                Toast.makeText(getApplicationContext(),myFragments.get(i).getHint(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
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
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }
    public void initData(){
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < imageID.length; i++) {
                myFragments.add(new MyFragment("主题" + (j * 10 + i + 1),
                        "我是第" + (j * 10 + i + 1) + "Fragment",imageID[i],"你切换到了第" +(j * 10 + i + 1) + "个页面"));
            }
        }
    }
}
