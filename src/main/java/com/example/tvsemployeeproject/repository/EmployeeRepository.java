package com.example.tvsemployeeproject.repository;

import com.example.tvsemployeeproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
