package com.weizhu.zhuwojia.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;

import com.weizhu.zhuwojia.helper.ActivityHelper;
import com.zhy.autolayout.AutoLayoutActivity;


/**
 * @author Akeem
 * @time 2016/10/19 20:45
 * @desc Created by Akeem on 2016/10/19.
 */
public class BaseActivity extends AutoLayoutActivity {

//    private   CompositeSubscription mCompositeSubscription;
    protected Activity              mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mActivity = this;
        super.onCreate(savedInstanceState);
        ActivityHelper.getInstance().addActivity(this);

    }

    @Override
    protected void onDestroy() {
//        onUnsubscribe();
        ActivityHelper.getInstance().finishActivity(this);
        super.onDestroy();
    }

    /*********************************************************************************/
    /*    public void addSubscription(Observable observable, Subscriber subscriber) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber));
        }
    public void addSubscription(Subscription subscription) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(subscription);
    }
    public void onUnsubscribe() {
        //取消注册，以避免内存泄露
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions())
            mCompositeSubscription.unsubscribe();
    }*/
    /*********************************************************************************/
    public ProgressDialog progressDialog;

    public ProgressDialog showProgressDialog() {
        progressDialog = new ProgressDialog(mActivity);
        progressDialog.setMessage("加载中...");
        progressDialog.show();
        return progressDialog;
    }

    public ProgressDialog showProgressDialog(CharSequence message) {
        progressDialog = new ProgressDialog(mActivity);
        progressDialog.setMessage(message);
        progressDialog.show();
        return progressDialog;
    }

    public void dismissProgressDialog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            // progressDialog.hide();会导致android.view.WindowLeaked
            progressDialog.dismiss();
        }
    }


}
