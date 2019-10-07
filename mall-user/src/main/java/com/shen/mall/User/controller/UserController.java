package com.shen.mall.User.controller;


import com.shen.mall.bean.UserInfo;
import com.shen.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("userInfoList")
    @ResponseBody
    public ResponseEntity<List<UserInfo>> userInfoList(){

       List<UserInfo> userInfoList = userService.userInfoList();

        return ResponseEntity.ok(userInfoList);
    }

    @RequestMapping("hello")
    public String test(){
        return "hello";
    }
}
