package com.example.demo.service.Impl;

import com.example.demo.entity.PageResult;
import com.example.demo.entity.Question;
import com.example.demo.mapper.QuestionMapper;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;


    @Override
    public List<Question> findAll() {
        return null;
    }

    @Override
    public PageResult<Question> findPage(int page, int size) {
        return null;
    }

    @Override
    public List<Question> findList(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public PageResult<Question> findPage(Map<String, Object> searchMap, int page, int size) {
        return null;
    }

    @Override
    public Question findById(Long exp_id) {
        return null;
    }

    @Override
    public void add(Question question) {

    }

    @Override
    public void update(Question question) {

    }

    @Override
    public void delete(Long exp_id) {

    }
}
