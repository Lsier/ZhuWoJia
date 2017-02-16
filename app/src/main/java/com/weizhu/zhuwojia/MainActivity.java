package com.weizhu.zhuwojia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.widget.RadioButton;

import com.weizhu.zhuwojia.base.BaseActivity;
import com.weizhu.zhuwojia.ui.fragment.CircleFragment;
import com.weizhu.zhuwojia.ui.fragment.ContactsFragment;
import com.weizhu.zhuwojia.ui.fragment.HomeFragment;
import com.weizhu.zhuwojia.ui.fragment.MineFragment;
import com.weizhu.zhuwojia.ui.fragment.MsgFragment;
import com.weizhu.zhuwojia.ui.views.NoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private NoScrollViewPager mViewPager;
    public static final int            TAB_HOME     = 0;
    public static final int            TAB_MSG      = 1;
    public static final int            TAB_CRICLE   = 2;
    public static final int            TAB_CONTACTS = 3;
    public static final int            TAB_MINE     = 4;
    public static       int            currentItem  = TAB_HOME;
    private             List<Fragment> mFragments   = new ArrayList<Fragment>();
    private RadioButton mTab_home;
    private RadioButton mTab_news;
    private RadioButton mTab_cricle;
    private RadioButton mTab_contacts;
    private RadioButton mTab_mine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {

        mFragments.add(new HomeFragment());
        mFragments.add(new MsgFragment());
        mFragments.add(new CircleFragment());
        mFragments.add(new ContactsFragment());
        mFragments.add(new MineFragment());
    }

    private void initView() {

        mViewPager = (NoScrollViewPager) findViewById(R.id.content_viewpager);
        mTab_home = (RadioButton) findViewById(R.id.content_rb_home);
        mTab_news = (RadioButton) findViewById(R.id.content_rb_msg);
        mTab_cricle = (RadioButton) findViewById(R.id.content_rb_circle);
        mTab_contacts = (RadioButton) findViewById(R.id.content_rb_contacts);
        mTab_mine = (RadioButton) findViewById(R.id.content_rb_myself);
        mViewPager.setAdapter(myPagerAdapter);

//        mViewPager.addOnPageChangeListener(this);
        showTabs(currentItem);
        mTab_home.setChecked(true);
        mTab_home.setOnClickListener(this);
        mTab_news.setOnClickListener(this);
        mTab_cricle.setOnClickListener(this);
        mTab_contacts.setOnClickListener(this);
        mTab_mine.setOnClickListener(this);
        
    }

    private void showTabs(int tab) {

        currentItem = tab;
//        int current = mViewPager.getCurrentItem(); //当前current
        mViewPager.setCurrentItem(tab, false);
    }


    FragmentPagerAdapter myPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }
    };

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.content_rb_home:
                showTabs(TAB_HOME);
                break;
            case R.id.content_rb_msg:
                showTabs(TAB_MSG);
                break;
            case R.id.content_rb_circle:
                showTabs(TAB_CRICLE);
                break;
            case R.id.content_rb_contacts:
                showTabs(TAB_CONTACTS);
                break;
            case R.id.content_rb_myself:
                showTabs(TAB_MINE);
                break;

            default:
                break;
        }
    }
}
