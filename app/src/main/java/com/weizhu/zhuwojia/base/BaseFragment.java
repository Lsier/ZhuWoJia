package com.weizhu.zhuwojia.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/11/15 0015.
 */

public abstract class BaseFragment extends Fragment {
    public Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        init();// 可以接受别人传递过来的参数
        mContext = getActivity();
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initView();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        initData();
        initListener();
        super.onActivityCreated(savedInstanceState);
    }

    /**
     * 初始化的时候,接收别人传递进来的参数
     */
    public void init() {

    }

    /**
     * 初始化Fragment应有的视图
     */
    public abstract View initView();

    /**
     * 初始化Fragment应有的数据
     */
    public void initData() {

    }

    /**
     * 初始化监听器
     */
    public void initListener() {

    }
}
