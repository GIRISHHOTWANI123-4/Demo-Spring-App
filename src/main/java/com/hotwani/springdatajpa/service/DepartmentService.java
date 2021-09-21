package com.hotwani.springdatajpa.service;

import com.hotwani.springdatajpa.entity.Department;
import com.hotwani.springdatajpa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public String saveDepartment(Department department)
    {
        departmentRepository.save(department);
        return "Department Added Successfully";
    }

    public List<Department> getDepartment()
    {
        return  departmentRepository.findAll();
    }

    public Department getDepartmentByName(String name)
    {
        return departmentRepository.findByName(name);
    }

    public Department getDepartmentById(int id)
    {
        return departmentRepository.findById(id).orElse(null);
    }

//    public Department getDepartmentByEmployeeCount(int count)
//    {
//        return departmentRepository.findByEmployees(count);
//    }
}
