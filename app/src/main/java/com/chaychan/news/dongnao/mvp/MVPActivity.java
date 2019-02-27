package com.chaychan.news.dongnao.mvp;

import android.os.Bundle;
import android.widget.Toast;

import com.chaychan.news.R;
import com.chaychan.news.dongnao.bean.Girl;
import com.chaychan.news.dongnao.presenter.GirlPresenter;
import com.chaychan.news.dongnao.view.IGirlView;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by CHP on 2018/8/18.
 */

public class MVPActivity extends BaseActivity<IGirlView,GirlPresenter> implements IGirlView{

//    @Bind(R.id.lv)
//    ListView lv;

//    List<Girl> list=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        init();

//        lv.setAdapter(new MyAdapter(this,list));

//        new GirlPresenter(this).fench();

        presenter.fench();

    }

    @Override
    protected GirlPresenter createPresenter() {
        return new GirlPresenter();
    }

    private void init() {
//        list.add(new Girl("小王"));
//        list.add(new Girl("小离"));
//        list.add(new Girl("小陈"));
    }

    @Override
    public void showLoading() {
        Toast.makeText(this,"正在加载中...", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirls(List<Girl> girls) {

    }


}
