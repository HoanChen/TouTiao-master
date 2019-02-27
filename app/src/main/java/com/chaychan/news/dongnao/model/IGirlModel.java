package com.chaychan.news.dongnao.model;


import com.chaychan.news.dongnao.bean.Girl;

import java.util.List;

/**
 * Created by CHP on 2018/8/18.
 */

public interface IGirlModel {

    void loadGirl(GirlOnLoadListener listener);

    //接口设计：回调数据
     interface GirlOnLoadListener{
        void onComplete(List<Girl> girls);
    }


}
