package com.qf.service;

import com.qf.pojo.Discuss;

import java.util.Map;

/**
 * Created by 铁小雨 on 2019/6/12.
 */
public interface DiscussService {
    Map<String, Object> selectDiscuss(Integer pageNum, Integer limit, Integer id);
    void addDiscuss(Discuss discuss);
}
