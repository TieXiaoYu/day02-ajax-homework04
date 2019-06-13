package com.qf.pojo;

import java.util.Date;

/**
 * Created by 铁小雨 on 2019/6/12.
 */
public class Discuss {
    private Integer id;
    private String discuss_content;
    private String person;
    private Date discuss_time;
    private Integer news_id;

    public Discuss() {
        super();
    }

    public Discuss(String discuss_content, Date discuss_time, Integer id, Integer news_id, String person) {
        this.discuss_content = discuss_content;
        this.discuss_time = discuss_time;
        this.id = id;
        this.news_id = news_id;
        this.person = person;
    }

    public String getDiscuss_content() {
        return discuss_content;
    }

    public void setDiscuss_content(String discuss_content) {
        this.discuss_content = discuss_content;
    }

    public Date getDiscuss_time() {
        return discuss_time;
    }

    public void setDiscuss_time(Date discuss_time) {
        this.discuss_time = discuss_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNews_id() {
        return news_id;
    }

    public void setNews_id(Integer news_id) {
        this.news_id = news_id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}