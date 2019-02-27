package com.chaychan.news.dongnao.model;

import com.chaychan.news.dongnao.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHP on 2018/8/18.
 */

public class GirlModelImpl implements IGirlModel {

    @Override
    public void loadGirl(GirlOnLoadListener listener) {
        //加载数据
        List<Girl> list=new ArrayList<>();
        list.add(new Girl("小王"));
        list.add(new Girl("小离"));
        list.add(new Girl("小陈"));

        //返回数据
        listener.onComplete(list);
    }
}
