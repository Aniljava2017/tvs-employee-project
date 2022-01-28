package com.example.tvsemployeeproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "TVS_EMP_RECORD")
public class Employee {
    @Id
    Long id;
    String emp_name;
    int emp_age;
    String emp_post;

    public Employee() {
    }

    public Employee(Long id, String emp_name, int emp_age, String emp_post) {
        this.id = id;
        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.emp_post = emp_post;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }

    public String getEmp_post() {
        return emp_post;
    }

    public void setEmp_post(String emp_post) {
        this.emp_post = emp_post;
    }
}
