package com.chaychan.news.dongnao.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by CHP on 2018/8/18.
 */

public class BasePresenter<T> {
    protected WeakReference<T> mViewRef;

    public void attachView(T view){
        mViewRef=new WeakReference<T>(view);
    }

    public void detachView(){
        if(mViewRef!=null){
            mViewRef.clear();
        }
    }

    protected T getView(){
        return mViewRef.get();
    }
}
