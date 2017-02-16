package com.weizhu.zhuwojia.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.weizhu.zhuwojia.R;
import com.weizhu.zhuwojia.base.BaseActivity;
/**
 * @author: lsier
 * @date: 2017-02-16 10:41
 * @descript: <描述当前版本功能>
 */
public class LoginActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }
}
