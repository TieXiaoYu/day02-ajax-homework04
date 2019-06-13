package com.qf.dao;

import com.qf.pojo.Discuss;
import com.qf.pojo.News;

import java.util.List;

/**
 * Created by 铁小雨 on 2019/6/12.
 */
public interface NewsMapper {
    List<News> selectAll();
    List<News> selectByTitle(String title);
    void deleteNews(Integer id);
}
