package com.itheima.health.service;

import com.itheima.health.entity.PageResult;
import com.itheima.health.entity.QueryPageBean;
import com.itheima.health.exception.MyException;
import com.itheima.health.pojo.CheckItem;

import java.util.List;

public interface CheckItemService {

    List<CheckItem> findAll();

    /*
     * 添加检查项
     */
    void add(CheckItem checkItem);

    /*
     * 检查项的分页查询
     */
    PageResult<CheckItem> findPage(QueryPageBean queryPageBean);

    CheckItem findById(int id);

    void update(CheckItem checkItem);

    void deleteById(int id) throws MyException;
}