package com.example.demo.service.Impl;

import com.example.demo.entity.PageResult;
import com.example.demo.entity.TeamInfo;
import com.example.demo.service.TeamInfoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TeamInfoServiceImpl implements TeamInfoService {
    @Override
    public List<TeamInfo> findAll() {
        return null;
    }

    @Override
    public PageResult<TeamInfo> findPage(int page, int size) {
        return null;
    }

    @Override
    public List<TeamInfo> findList(Map<String, Object> searchMap) {
        return null;
    }

    @Override
    public PageResult<TeamInfo> findPage(Map<String, Object> searchMap, int page, int size) {
        return null;
    }

    @Override
    public TeamInfo findById(Long exp_id) {
        return null;
    }

    @Override
    public void add(TeamInfo teamInfo) {

    }

    @Override
    public void update(TeamInfo teamInfo) {

    }

    @Override
    public void delete(Long exp_id) {

    }
}
