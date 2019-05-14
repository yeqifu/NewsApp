package com.example.newsapp;

//定义新闻信息对应的类News
public class News {
    String id;
    String title;   //标题
    String contents;//内容
    String date;    //发布日期
    int comments;   //评论数
    String icon;    //图标文件名
    String main_contents;//内容简介

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getMain_contents() {
        return main_contents;
    }

    public void setMain_contents(String main_contents) {
        this.main_contents = main_contents;
    }


}
