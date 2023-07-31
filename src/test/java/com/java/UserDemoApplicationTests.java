package com.java;

import com.java.pojo.Department;
import com.java.service.DepartmentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserDemoApplication.class)//启动类.class
class UserDemoApplicationTests {

    @Test
    void contextLoads() {

    }

}
