package com.java.mapper;

import com.java.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;

import java.util.Collection;
import java.util.List;

@Mapper
public interface EmployeeMapper{
    Collection<Employee> getAll();
    Collection<Employee> getEmpByLastname(String lastname);

    Employee getOne(Integer id);
    Integer addEmp(Employee employee);
    Integer updateEmp(Employee employee);
    Integer deleteEmp(Integer id);
}
