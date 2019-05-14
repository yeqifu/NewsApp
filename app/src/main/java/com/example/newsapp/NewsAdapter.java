package com.example.newsapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

//定义用于新闻列表数据显示的适配器类
public class NewsAdapter extends BaseAdapter {

    //定义指向要显示的数据动态数组
    private List<News> newsList;
    //定义指向要显示的界面的上下文
    private Context context;

    //定义适配器的构造方法
    public NewsAdapter(List<News> newsList, Context context) {
        this.newsList = newsList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return newsList.size(); //返回要显示的数据的大小
    }

    @Override
    public Object getItem(int position) {
        return newsList.get(position); //返回对应序号的数据
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
