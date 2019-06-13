package com.qf.dao;

import com.qf.pojo.Discuss;

import java.util.List;

/**
 * Created by 铁小雨 on 2019/6/12.
 */
public interface DiscussMapper {
    List<Discuss> selectDiscuss(Integer id);
    void deleteDiscuss(Integer id);
    void addDiscuss(Discuss discuss);
}
