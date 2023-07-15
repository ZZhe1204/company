package com.java.service.impl;

import com.java.mapper.MyUserMapper;
import com.java.pojo.MyUser;
import com.java.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    private MyUserMapper myUserMapper;
    @Override
    public MyUser getMyUser(MyUser myUser) {
        return myUserMapper.getMyUser(myUser);
    }
}
