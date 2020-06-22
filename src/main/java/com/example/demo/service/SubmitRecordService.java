package com.example.demo.service;

import java.util.*;
import com.example.demo.utils.R;
import com.example.demo.entity.SubmitRecord;
import com.example.demo.entity.PageResult;

/**
 * submitRecord业务逻辑层
 */
public interface SubmitRecordService {


    public List<SubmitRecord> findAll();


    public PageResult<SubmitRecord> findPage(int page, int size);


    public List<SubmitRecord> findList(Map<String,Object> searchMap);


    public PageResult<SubmitRecord> findPage(Map<String,Object> searchMap,int page, int size);


    public SubmitRecord findById(Long exp_id);

    public void add(SubmitRecord submitRecord);


    public void update(SubmitRecord submitRecord);


    public void delete(Long exp_id);

}
