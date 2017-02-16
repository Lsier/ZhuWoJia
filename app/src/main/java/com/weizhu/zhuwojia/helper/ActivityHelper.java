package com.weizhu.zhuwojia.helper;

import android.app.Activity;

import java.util.Stack;

/**
 * Created by Administrator on 2016/7/15.
 */
public class ActivityHelper {

    private static Stack<Activity> activityStack;
    private static ActivityHelper instance;

    private ActivityHelper(){}
    /**
     * 单一实例
     */
    public static ActivityHelper getInstance(){
        if(instance==null){
            instance=new ActivityHelper();
        }
        return instance;
    }
    /**
     * 添加Activity到堆栈
     */
    public void addActivity(Activity activity){
        if(activityStack==null){
            activityStack=new Stack<Activity>();
        }
        activityStack.add(activity);
    }
    /**
     * 获取当前Activity（堆栈中最后一个压入的）
     */
    public Activity currentActivity(){
        Activity activity=activityStack.lastElement();
        return activity;
    }
    /**
     * 结束当前Activity（堆栈中最后一个压入的）
     */
    public void finishActivity(){
        Activity activity=activityStack.lastElement();
        finishActivity(activity);
    }
    /**
     * 结束指定的Activity
     */
    public void finishActivity(Activity activity){
        if(activity!=null){
            activityStack.remove(activity);
            activity.finish();
            activity=null;
        }
    }


    public Activity getActivity(Class<?> cls){
        for (Activity activity : activityStack) {
            if(activity.getClass().equals(cls) ){
                return activity;
            }
        }
        return null;
    }

    /**
     * 结束指定类名的Activity
     */
    public void finishActivity(Class<?> cls){
        for (Activity activity : activityStack) {
            if(activity.getClass().equals(cls) ){
                finishActivity(activity);
            }
        }
    }

    /**
     * 杀死除了这个以外的acitivy
     * @param ac
     */
    public void finishOtherActivity(Activity ac) {
        for (int i = 0; i < activityStack.size(); i++) {
            Activity activity = activityStack.get(i);
            if (!activity.getClass().equals(ac.getClass()) && activity != null) {
                activity.finish();
                activity = null;
            }
        }
        activityStack.clear();
        activityStack.add(ac);
    }


    public void finishOtherActivity(Class ac) {
        for (int i = 0; i < activityStack.size(); i++) {
            Activity activity = activityStack.get(i);
            if (!activity.getClass().equals(ac) && activity != null) {
                activity.finish();
                activityStack.remove(i);
                activity = null;
            }
        }
    }

    /**
     * 结束所有Activity
     */
    public void finishAllActivity(){
        for (int i = 0, size = activityStack.size(); i < size; i++){
            if (null != activityStack.get(i)){
                activityStack.get(i).finish();
            }
        }
        activityStack.clear();
    }


}
