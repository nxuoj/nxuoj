package com.example.demo.controller;
import com.example.demo.service.UserInfoService;
import com.example.demo.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/find")
public class ReUtil {

    @Autowired
    UserInfoService userInfoService;

    @GetMapping("/user/{id}")
    public R staticFiles(@PathVariable Long id){
        return R.success(userInfoService.findById(id));
    }
}
