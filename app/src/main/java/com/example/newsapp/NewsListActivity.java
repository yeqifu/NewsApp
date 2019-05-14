package com.example.newsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class NewsListActivity extends AppCompatActivity {
    //定义存放新闻信息的动态数组
    List<News> newsList = new ArrayList<News>();
    //定义指向布局文件新闻列表界面对象
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_news_list);
        //1.获取布局文件中列表对象
        listView = (ListView)findViewById(R.id.lv_news_list);
        //2.加载新闻信息到动态数组中
        loadData();
        //3.将存放在动态数组中的数据，显示在列表对象lvNews中
        showData();
    }//end onCreate

    //定义加载新闻信息的方法
    private void loadData(){
        for (int i=1;i<=10;i++){
            News obj=new News();
                obj.setId(""+1);
                obj.setTitle("新闻"+1);
                obj.setMain_contents("内容:"+i);
                obj.setComments(i);
                obj.setDate("2019-5-7");
            newsList.add(obj);
        }
    }//end loadData

    private void showData(){

    }
}
