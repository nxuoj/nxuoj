package com.example.demo.service.Impl;

import com.example.demo.entity.PageResult;
import com.example.demo.entity.UserInfo;
import com.example.demo.mapper.UserInfoMapper;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return null;
    }

    @Override
    public PageResult<UserInfo> findPage(int page, int size) {
        return null;
    }

    @Override
    public List<UserInfo> findList(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public PageResult<UserInfo> findPage(Map<String, Object> searchMap, int page, int size) {
        return null;
    }

    @Override
    public UserInfo findById(Long exp_id) {
        return userInfoMapper.selectByPrimaryKey(exp_id);
    }

    @Override
    public void add(UserInfo userInfo) {

    }

    @Override
    public void update(UserInfo userInfo) {

    }

    @Override
    public void delete(Long exp_id) {

    }
}
