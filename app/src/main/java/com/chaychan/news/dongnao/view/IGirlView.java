package com.chaychan.news.dongnao.view;


import com.chaychan.news.dongnao.bean.Girl;

import java.util.List;

/**
 * Created by CHP on 2018/8/18.
 */

//视图层
public interface IGirlView {

    //加载提示
    void showLoading();
    //显示数据
    void showGirls(List<Girl> girls);

}
