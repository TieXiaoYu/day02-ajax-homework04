package com.qf.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qf.dao.DiscussMapper;
import com.qf.pojo.Discuss;
import com.qf.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 铁小雨 on 2019/6/12.
 */
@Service
public class DiscussServiceImpl implements DiscussService{
    @Autowired
    private DiscussMapper discussMapper;
    @Override
    public Map<String, Object> selectDiscuss(Integer pageNum, Integer limit, Integer id) {
        PageHelper.startPage(pageNum, limit);
        List<Discuss> list = discussMapper.selectDiscuss(id);
        Map<String, Object> map = new HashMap<>();
        map.put("totalPage", ((Page)list).getPages());// 总页数
        map.put("count", ((Page)list).getTotal());// 总记录数
        map.put("currentPage", pageNum);
        map.put("list", list);
        return map;

    }

    @Override
    public void addDiscuss(Discuss discuss) {
        discussMapper.addDiscuss(discuss);
    }
}