package com.qf.service;

import java.util.Map;

/**
 * Created by 铁小雨 on 2019/6/12.
 */
public interface NewsService {
    Map<String, Object> selectByPage(Integer pageNum, Integer limit);
    Map<String, Object> selectByTitle(Integer pageNum, Integer limit,String title);
    void deleteNews(Integer id);

}
