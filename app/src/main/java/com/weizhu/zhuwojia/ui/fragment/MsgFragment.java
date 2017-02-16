package com.weizhu.zhuwojia.ui.fragment;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.weizhu.zhuwojia.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/15 0015.
 */

public class MsgFragment extends BaseFragment {


    List<String> mDatas = new ArrayList<>();
    private RecyclerView mRvMsg1;
    private View mHomeView;

    @Nullable
    @Override
    public View initView() {

//        mHomeView = View.inflate(mContext, R.layout.fragment_msg,null);

//        mRvMsg1 = (RecyclerView) mHomeView.findViewById(R.id.rv_msg);
//        initData();
//        return mHomeView;
        return null;
    }

    public void initData() {

        mDatas.add("http://lsier.oss-cn-shenzhen.aliyuncs.com/meinv/20131025103326433.jpg?Expires=1487072504&OSSAccessKeyId=TMP.AQE1k-va2JpNsbzgSriqjU0CZ4Mz3RIkUu9OxTO-D9XNgoO8pXFg3CezsQMqADAtAhQ2dcZcD99MG6x9iE_jFTLGnu_geQIVANy-Lt5Tk5nTzSxIZh-6te6RxVW7&Signature=KaIOoUddwo%2FpbD%2BCRKEPeTrA0qY%3D");
        mDatas.add("http://lsier.oss-cn-shenzhen.aliyuncs.com/meinv/20140102084143254.jpg?Expires=1487072524&OSSAccessKeyId=TMP.AQE1k-va2JpNsbzgSriqjU0CZ4Mz3RIkUu9OxTO-D9XNgoO8pXFg3CezsQMqADAtAhQ2dcZcD99MG6x9iE_jFTLGnu_geQIVANy-Lt5Tk5nTzSxIZh-6te6RxVW7&Signature=qwP86N1cuJL%2FR7v9g5Ltj0DPFOE%3D");
        mDatas.add("http://lsier.oss-cn-shenzhen.aliyuncs.com/meinv/20140102084144513.jpg?Expires=1487072544&OSSAccessKeyId=TMP.AQE1k-va2JpNsbzgSriqjU0CZ4Mz3RIkUu9OxTO-D9XNgoO8pXFg3CezsQMqADAtAhQ2dcZcD99MG6x9iE_jFTLGnu_geQIVANy-Lt5Tk5nTzSxIZh-6te6RxVW7&Signature=LoDq5Qrpb28FK9USD7PpiQtSb44%3D");
        mDatas.add("http://lsier.oss-cn-shenzhen.aliyuncs.com/meinv/20140123103539721.jpg?Expires=1487072565&OSSAccessKeyId=TMP.AQE1k-va2JpNsbzgSriqjU0CZ4Mz3RIkUu9OxTO-D9XNgoO8pXFg3CezsQMqADAtAhQ2dcZcD99MG6x9iE_jFTLGnu_geQIVANy-Lt5Tk5nTzSxIZh-6te6RxVW7&Signature=Dg%2BsKWie9i34TkdR4cqoKNpFczk%3D");

    }
//
//    private void initView() {
//                mRvMsg1.setAdapter(new CommonAdapter(mContext, R.layout.item_msg, mDatas) {
//                    @Override
//                    protected void convert(ViewHolder holder, Object o, int position) {
//        //                holder.setImageResource(R.id.iv_msg,R.mipmap.fifth);
//
//                        ImageView iv = holder.getView(R.id.iv_msg);
//                        Glide.with(mContext).load(mDatas.get(position)).into(iv);
//                    }
//                });
//    }

}
