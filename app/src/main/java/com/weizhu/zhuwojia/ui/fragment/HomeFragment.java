package com.weizhu.zhuwojia.ui.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.weizhu.zhuwojia.R;
import com.weizhu.zhuwojia.adapter.TabFragmentAdapter;
import com.weizhu.zhuwojia.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/15 0015.
 */

public class HomeFragment extends BaseFragment {

    private View mRootView;
    private String[] titles = new String[]{"推荐", "热点", "赣州", "社会","订阅", "娱乐", "科技", "汽车","体育", "财经", "美女"};
    private ViewPager mViewPager;
    private TabLayout mTablayout;

    @Override
    public View initView() {
        mRootView = View.inflate(mContext,R.layout.fragment_home,null);

        mViewPager = (ViewPager)mRootView.findViewById(R.id.home_viewPager);
        mTablayout = (TabLayout) mRootView.findViewById(R.id.home_tabLayout);

        List<Fragment> fragments = new ArrayList<Fragment>();
        for (int i = 0; i < titles.length; i++) {
            Fragment fragment = new TabsFragment();
            Bundle bundle = new Bundle();
            bundle.putString("text",titles[i]);
            fragment.setArguments(bundle);
            fragments.add(fragment);
        }
        mViewPager.setAdapter(new TabFragmentAdapter(fragments, titles,getChildFragmentManager(),getActivity()));
        mTablayout.setupWithViewPager(mViewPager);
        // 设置tab文本的没有选中（第一个参数）和选中（第二个参数）的颜色
        mTablayout.setTabTextColors(getResources().getColor(R.color.accent_material_dark), Color.WHITE);
        return mRootView;
    }
}
