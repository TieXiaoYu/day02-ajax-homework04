package com.qf.pojo;

import java.util.Date;
import java.util.List;

/**
 * Created by 铁小雨 on 2019/6/12.
 */
public class News {
    private Integer id;
    private String title;
    private String content;
    private String author;
    private Date create_time;
    public News() {
        super();
    }

    public News(String author, String content, Date create_time, Integer id, String title) {
        this.author = author;
        this.content = content;
        this.create_time = create_time;
        this.id = id;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}