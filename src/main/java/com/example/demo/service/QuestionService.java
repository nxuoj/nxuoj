package com.example.demo.service;

import java.util.*;
import com.example.demo.utils.R;
import com.example.demo.entity.Question;
import com.example.demo.entity.PageResult;

/**
 * question业务逻辑层
 */
public interface QuestionService {


    public List<Question> findAll();


    public PageResult<Question> findPage(int page, int size);


    public List<Question> findList(Map<String,Object> searchMap);


    public PageResult<Question> findPage(Map<String,Object> searchMap,int page, int size);


    public Question findById(Long exp_id);

    public void add(Question question);


    public void update(Question question);


    public void delete(Long exp_id);

}
