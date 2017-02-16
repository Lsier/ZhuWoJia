package com.weizhu.zhuwojia.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.weizhu.zhuwojia.R;
import com.zhy.autolayout.AutoLayoutActivity;

/**
 * Created by Administrator on 2016/12/8 0008.
 */

public class ViewTabsActivity extends AutoLayoutActivity {

    private String[] titles = new String[]{"推荐", "热点", "赣州", "社会","订阅", "娱乐", "科技", "汽车","体育", "财经", "美女"};
    private ViewPager mViewPager;
    private TabLayout mTablayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_home);

//        mViewPager = (ViewPager)findViewById(R.id.home_viewPager);
//        mTablayout = (TabLayout) findViewById(R.id.home_tabLayout);
//        List<Fragment> fragments = new ArrayList<Fragment>();
//        for (int i = 0; i < titles.length; i++) {
//            Fragment fragment = new TabsFragment();
//            Bundle bundle = new Bundle();
//            bundle.putString("text",titles[i]);
//            fragment.setArguments(bundle);
//            fragments.add(fragment);
//        }
//        mViewPager.setAdapter(new TabFragmentAdapter(fragments, titles,getSupportFragmentManager(),this));
//        mTablayout.setupWithViewPager(mViewPager);
    }
}
