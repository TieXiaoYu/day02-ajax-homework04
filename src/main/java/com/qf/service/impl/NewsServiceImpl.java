package com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.DiscussMapper;
import com.qf.dao.NewsMapper;
import com.qf.pojo.Discuss;
import com.qf.pojo.News;
import com.qf.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 铁小雨 on 2019/6/12.
 */
@Service
public class NewsServiceImpl implements NewsService{
    @Autowired
    private NewsMapper newsMapper;
    @Autowired
    private DiscussMapper discussMapper;
    @Override
    public Map<String, Object> selectByPage(Integer pageNum, Integer limit) {
        PageHelper.startPage(pageNum, limit);
        List<News> list = newsMapper.selectAll();
        Map<String, Object> map = new HashMap<>();
        map.put("totalPage", ((Page)list).getPages());// 总页数
        map.put("count", ((Page)list).getTotal());// 总记录数
        map.put("currentPage", pageNum);
        map.put("list", list);
        System.out.println("git");
        return map;
    }

    @Override
    public Map<String, Object> selectByTitle(Integer pageNum, Integer limit, String title) {
        PageHelper.startPage(pageNum, limit);
        List<News> list = newsMapper.selectByTitle(title);
        Map<String, Object> map = new HashMap<>();
        map.put("totalPage", ((Page)list).getPages());// 总页数
        map.put("count", ((Page)list).getTotal());// 总记录数
        map.put("currentPage", pageNum);
        map.put("list", list);
        return map;
    }
    @Override
    public void deleteNews(Integer id) {
        newsMapper.deleteNews(id);
        discussMapper.deleteDiscuss(id);
    }
}