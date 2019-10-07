package com.shen.mall.User.service.impl;


import com.shen.mall.User.mapper.UserInfoMapper;
import com.shen.mall.bean.UserInfo;
import com.shen.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> userInfoList() {
        return userInfoMapper.selectAll();
    }
}
