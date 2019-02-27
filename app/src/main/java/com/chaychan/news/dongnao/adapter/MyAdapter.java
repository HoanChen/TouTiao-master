package com.chaychan.news.dongnao.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.atguigu.android.R;
import com.atguigu.android.dongnao.bean.Girl;

import java.util.List;

/**
 * Created by CHP on 2018/8/18.
 */

public class MyAdapter extends BaseAdapter {

    public MyAdapter(Context context, List<Girl> girls){
        inflater= LayoutInflater.from(context);
        this.girls=girls;
    }

    private LayoutInflater inflater;
    private List<Girl> girls;


    @Override
    public int getCount() {
        return girls.size();
    }

    @Override
    public Object getItem(int position) {
        return girls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        View view=inflater.inflate(R.layout.activity_mvp,null);
        TextView textView= (TextView) view.findViewById(R.id.tv);
        textView.setText(girls.get(position).getName());

        return view;
    }
}
