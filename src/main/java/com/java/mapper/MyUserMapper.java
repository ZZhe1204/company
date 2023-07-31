package com.java.mapper;


import com.java.pojo.Employee;
import com.java.pojo.MyUser;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.Collection;

@Mapper
public interface MyUserMapper extends BaseMapper<MyUser> {
    public MyUser getMyUser(String username,String password);

    public Integer add(MyUser myUser);
    public Collection<MyUser> getAllUser();
    public MyUser getOne(Integer id);
    public Integer upUser(MyUser myUser);
    public Integer delUser(Integer id);
}
