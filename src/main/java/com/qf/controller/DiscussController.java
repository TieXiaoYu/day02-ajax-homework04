package com.qf.controller;

import com.qf.pojo.Discuss;
import com.qf.service.DiscussService;
import com.qf.vo.JsonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by 铁小雨 on 2019/6/12.
 */
@RestController
@RequestMapping("/dis")
public class DiscussController {
    @Autowired
    private DiscussService discussService;
    @RequestMapping("/all")
    public JsonBean selectDiscuss(Integer page, Integer limit, Integer id){
        Map<String, Object> map = discussService.selectDiscuss(page, limit, id);
        return new JsonBean(1,map);
    }
    @RequestMapping("/add")
    public JsonBean addDiscuss(Discuss discuss,Integer id){
        discussService.addDiscuss(discuss);
        return new JsonBean(1,null);
    }
}