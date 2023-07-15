package com.java.mapper;

import com.java.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

@Mapper
public interface DepartmentMapper {
    Collection<Department> getAll();
    Department getOne(Integer departmentId);

}
