package com.chaychan.news.dongnao.mvp;

import android.app.Activity;
import android.os.Bundle;

import com.chaychan.news.dongnao.presenter.BasePresenter;

/**
 * Created by CHP on 2018/8/18.
 */

public abstract class BaseActivity <V,T extends BasePresenter<V>>extends Activity {

    public T presenter;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = createPresenter();
        presenter.attachView((V)this);


    }

    protected abstract T createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }



//    public GirlPresenter girlPresenter;
//    @Override
//    protected void onCreate( Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        girlPresenter = new GirlPresenter();
//        girlPresenter.attachView(this);
//        girlPresenter.fench();
//
//    }
//
//    protected abstract T createPresenter();
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        girlPresenter.detachView();
//    }


}
