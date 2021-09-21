package com.hotwani.springdatajpa.repository;

import com.hotwani.springdatajpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

     public Department findByName(String name);


//     @Query("Select id,name from department where employees=?1")
//     public Department findByEmployees(int count);


}
