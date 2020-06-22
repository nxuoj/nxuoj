package com.example.demo.service;

import java.util.*;
import com.example.demo.utils.R;
import com.example.demo.entity.TeamInfo;
import com.example.demo.entity.PageResult;

/**
 * teamInfo业务逻辑层
 */
public interface TeamInfoService {


    public List<TeamInfo> findAll();


    public PageResult<TeamInfo> findPage(int page, int size);


    public List<TeamInfo> findList(Map<String,Object> searchMap);


    public PageResult<TeamInfo> findPage(Map<String,Object> searchMap,int page, int size);


    public TeamInfo findById(Long exp_id);

    public void add(TeamInfo teamInfo);


    public void update(TeamInfo teamInfo);


    public void delete(Long exp_id);

}
