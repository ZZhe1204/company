package com.java.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Data//get/set
@AllArgsConstructor//构造info
@NoArgsConstructor//空构造info
@Table(name = "employee")
public class Employee {
    @Column(name = "id")
    private Integer id;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "gender")
    private Integer gender;  //0女  1男
    @Column(name = "departmentid")
    private String departmentId;
    @Column(name = "birth")
    private Date birth;

    private Department department;


}
