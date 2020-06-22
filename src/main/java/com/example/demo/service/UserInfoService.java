package com.example.demo.service;

import java.util.*;
import com.example.demo.utils.R;
import com.example.demo.entity.UserInfo;
import com.example.demo.entity.PageResult;

/**
 * userInfo业务逻辑层
 */
public interface UserInfoService {


    public List<UserInfo> findAll();


    public PageResult<UserInfo> findPage(int page, int size);


    public List<UserInfo> findList(Map<String,Object> searchMap);


    public PageResult<UserInfo> findPage(Map<String,Object> searchMap,int page, int size);


    public UserInfo findById(Long exp_id);

    public void add(UserInfo userInfo);


    public void update(UserInfo userInfo);


    public void delete(Long exp_id);

}
