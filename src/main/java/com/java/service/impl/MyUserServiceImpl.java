package com.java.service.impl;

import com.java.mapper.MyUserMapper;
import com.java.pojo.MyUser;
import com.java.service.MyUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MyUserServiceImpl implements MyUserService {
    @Autowired
    private MyUserMapper myUserMapper;
    @Override
    public MyUser getMyUser(String username, String password) {
        return myUserMapper.getMyUser(username,password);
    }

    @Override
    public Integer add(MyUser myUser) {
        return myUserMapper.add(myUser);
    }

    @Override
    public Collection<MyUser> getAllUser() {
        return myUserMapper.getAllUser();
    }

    @Override
    public MyUser getOne(Integer id) {
        return myUserMapper.getOne(id);
    }

    @Override
    public Integer upUser(MyUser myUser) {
        return myUserMapper.upUser(myUser);
    }

    @Override
    public Integer delUser(Integer id) {
        return myUserMapper.delUser(id);
    }

}
