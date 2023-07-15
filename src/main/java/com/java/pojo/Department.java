package com.java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "department")
public class Department {
    /**
     * 部门id
     */
    @Column(name = "departmentid")
    private Integer departmentId;
    /**
     * 部门名
     */
    @Column(name = "departmentname")
    private String departmentName;

}
