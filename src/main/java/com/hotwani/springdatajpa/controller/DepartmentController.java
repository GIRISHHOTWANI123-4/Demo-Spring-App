package com.hotwani.springdatajpa.controller;

import com.hotwani.springdatajpa.entity.Department;
import com.hotwani.springdatajpa.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public String saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> getDepartment() {
        return departmentService.getDepartment();
    }

    @GetMapping("/department/{name}")
    public Department getDepartmentByName(@PathVariable String name)
    {
        return departmentService.getDepartmentByName(name);
    }
    @GetMapping("/department/id/{id}")
    public Department getDepartmentById(@PathVariable int id)
    {
        System.out.println("Id = "+id);
        return departmentService.getDepartmentById(id);
    }

//    @GetMapping("/department/employee_count/{count}")
//    public Department getDepartmentByEmployee(@PathVariable int count)
//    {
//        return departmentService.getDepartmentByEmployeeCount(count);
//    }



}
