package com.java.service.impl;

import com.java.mapper.EmployeeMapper;
import com.java.pojo.Employee;
import com.java.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Collection<Employee> getAll() {
        return employeeMapper.getAll();
    }
    @Override
    public Collection<Employee> getEmpByLastname(String lastname) {
        return employeeMapper.getEmpByLastname(lastname);
    }

    @Override
    public Employee getOne(Integer id) {
        return employeeMapper.getOne(id);
    }

    @Override
    public Integer addEmp(Employee employee) {
         return employeeMapper.addEmp(employee);
    }

    @Override
    public Integer updateEmp(Employee employee) {
        return employeeMapper.updateEmp(employee);
    }

    @Override
    public Integer deleteEmp(Integer id) {
        return employeeMapper.deleteEmp(id);
    }
}
