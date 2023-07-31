package com.java.service;

import com.java.pojo.MyUser;

import java.util.Collection;

public interface MyUserService {
    public MyUser getMyUser(String username,String password);
    public Integer add(MyUser myUser);
    public Collection<MyUser> getAllUser();
    public MyUser getOne(Integer id);
    public Integer upUser(MyUser myUser);
    public Integer delUser(Integer id);

}
