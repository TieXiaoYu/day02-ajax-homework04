package com.qf.controller;

import com.qf.service.NewsService;
import com.qf.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by 铁小雨 on 2019/6/12.
 */
@RestController
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping("/list")
    public JsonBean selectAll(Integer page, Integer limit,String title){
        Map<String, Object> map = null;
        if(title != null && !title.equals("")){
            map = newsService.selectByTitle(page, limit, title);
        }else{
            map = newsService.selectByPage(page, limit);
        }
        return new JsonBean(1,map);
    }
    @RequestMapping("/del")
    public JsonBean deleteNews(Integer id){
        newsService.deleteNews(id);
        return new JsonBean(1,null);
    }

}