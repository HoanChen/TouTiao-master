package com.chaychan.news.dongnao.presenter;


/**
 * Created by CHP on 2018/8/18.
 */


import com.chaychan.news.dongnao.bean.Girl;
import com.chaychan.news.dongnao.model.GirlModelImpl;
import com.chaychan.news.dongnao.model.IGirlModel;
import com.chaychan.news.dongnao.view.IGirlView;

import java.util.List;

/**
 * MVC
 * M:业务模型
 * V：视图层  xml布局
 * C：controller 控制层   activity
 *
 * activity不仅仅是一个纯粹的view层也不仅仅是一个纯粹的controller层
 *
 *
 * MVP
 * M：业务模型
 * V：View  视图层  activity/xml布局
 * C：presenter表示层
 *
 * 解决：切断了view和model的联系，让view之和presenter交互，较少在需求发生变化的时候需要维护的对象的数量
 *  presenter：就是model和view的桥梁
 *
 *
 * 当进行加载网络数据时候，model层去加载数据，但是当用户点击返回键的时候，长时间加载数据，线程还存活着
 * activity销毁了，但是model层还持有mGirlView引用，造成内存泄漏
 *使用弱引用解决，不要用软引用：但是有可能被回收，有可用没有被回收，还得进行绑定和解绑
 * 软引用：
 * 在ondestroy（）把引用置为空
 */

public class GirlPresenter extends BasePresenter<IGirlView> {

    //必须有视图层引用  View引用  在构造里面进行初始化引用
//    IGirlView mGirlView;

    //model层引用   用接口接受
    IGirlModel girlModel = new GirlModelImpl();


    public GirlPresenter(){
        super();
//        this.mViewRef=new WeakReference<T>(view);
//        this.mGirlView=mGirlView;
    }
    //

    public void fench(){

        if(girlModel!=null){
            //显示进度
            if(getView() !=null){
                getView().showLoading();
            }
            //加载数据
            girlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    //返回数据   显示到view层
                    IGirlView mGirlView=getView();
                    if(mGirlView!=null){
                        mGirlView.showGirls(girls);
                    }
                }
            });

        }
    }



}
