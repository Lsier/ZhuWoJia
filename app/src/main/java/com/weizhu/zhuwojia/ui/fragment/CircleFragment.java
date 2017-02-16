package com.weizhu.zhuwojia.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.weizhu.zhuwojia.R;

/**
 * Created by Administrator on 2016/11/15 0015.
 */

public class CircleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View homeView = inflater.inflate(R.layout.fragment_circle, container, false);
        return homeView;
    }
}
