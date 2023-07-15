package com.java.controller;


import com.java.pojo.Department;
import com.java.pojo.Employee;
import com.java.service.DepartmentService;

import com.java.service.EmployeeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * @className: EmployeeController
 * @description: 员工管理控制器
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/emp")
    public String getAll(Model model) {
        Collection<Employee> employees = employeeService.getAll();
        model.addAttribute("employees", employees);
        return "emp/list";
    }
    @GetMapping("/toAdd")
    public String toAdd(Model model){
        Collection<Department> departments = departmentService.getAll();
        model.addAttribute("departments",departments);
        return "emp/addEmp";
    }
    @PostMapping("/toAdd")
    public String doneAdd(Employee employee){
        employeeService.addEmp(employee);
        return "redirect:/emp";
    }
    @GetMapping("/upEmp/{id}")
    public String toUpdatePag(@PathVariable("id") Integer id,Model model){
        model.addAttribute("emp",employeeService.getOne(id));
        model.addAttribute("departments" ,departmentService.getAll());
        return "emp/updateEmp";
    }
    @RequestMapping("/update")
    public String updateEmp(Employee employee){
        employeeService.updateEmp(employee);
        return "redirect:/emp";
    }
    @GetMapping("/delEmp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        employeeService.deleteEmp(id);
        return "redirect:/emp";
    }
    @RequestMapping("/searchEmp")
    public String search(@RequestParam("lastName") String lastName, Model model){
        Collection<Employee> empByLastname = employeeService.getEmpByLastname(lastName);
        model.addAttribute("emps",empByLastname);
        return "searchEmp";
    }
}
