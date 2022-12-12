package com.example.demo.models;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    String blogId;
    String text;

    public Blog(String blogId, String text, String author, Date date, int likes, int staticLikes, String title, String subtext) {
        this.blogId = blogId;
        this.text = text;
        this.author = author;
        this.date = date;
        this.likes = likes;
        this.staticLikes = staticLikes;
        this.title = title;
        this.subtext = subtext;
    }
    String authorId;
    String author;
    Date date;
    int likes;
    int staticLikes;
    String title;
    String subtext;

}
