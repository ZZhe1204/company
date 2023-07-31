package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.java.pojo"})//使用tkMapper的包扫描器注解
public class UserDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserDemoApplication.class, args);
    }

}
