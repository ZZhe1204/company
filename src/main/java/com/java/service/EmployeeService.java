package com.java.service;

import com.java.pojo.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeService {
    Collection<Employee> getAll();
    Employee getOne(Integer id);
    Collection<Employee> getEmpByLastname(String lastname);
    Integer addEmp(Employee employee);
    Integer updateEmp(Employee employee);
    Integer deleteEmp(Integer id);
}
