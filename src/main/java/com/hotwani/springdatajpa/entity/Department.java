package com.hotwani.springdatajpa.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="department")
public class Department {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int employees;

    @OneToMany(targetEntity = Course.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "dep_id",referencedColumnName = "id")
    private List<Course> courses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }
}
