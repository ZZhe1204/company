package com.java.mapper;


import com.java.pojo.MyUser;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
public interface MyUserMapper extends BaseMapper<MyUser> {
    public MyUser getMyUser(MyUser myUser);
}
