package com.java.service.impl;

import com.java.mapper.DepartmentMapper;
import com.java.pojo.Department;
import com.java.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Collection<Department> getAll() {
        return departmentMapper.getAll();
    }
}
