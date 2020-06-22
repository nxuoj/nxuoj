package com.example.demo.service.Impl;

import com.example.demo.entity.PageResult;
import com.example.demo.entity.SubmitRecord;
import com.example.demo.service.SubmitRecordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SubmitRecordServiceImpl implements SubmitRecordService {

    @Override
    public List<SubmitRecord> findAll() {
        return null;
    }

    @Override
    public PageResult<SubmitRecord> findPage(int page, int size) {
        return null;
    }

    @Override
    public List<SubmitRecord> findList(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public PageResult<SubmitRecord> findPage(Map<String, Object> searchMap, int page, int size) {
        return null;
    }

    @Override
    public SubmitRecord findById(Long exp_id) {
        return null;
    }

    @Override
    public void add(SubmitRecord submitRecord) {

    }

    @Override
    public void update(SubmitRecord submitRecord) {

    }

    @Override
    public void delete(Long exp_id) {

    }
}
