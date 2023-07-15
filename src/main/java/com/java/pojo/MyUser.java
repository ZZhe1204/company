package com.java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "myuser")//数据库表名和实体类类名不一致需要指定映射关系！
public class MyUser {
    private String uname;
    private String pword;
}
