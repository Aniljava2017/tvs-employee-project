package com.example.tvsemployeeproject.controller;

import com.example.tvsemployeeproject.model.Employee;
import com.example.tvsemployeeproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    // Add Employee
    @PostMapping("/add_emp")
    public String addEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Added Employee Successfully";
    }
    // Get Employee
    @GetMapping("/get_emp")
    public List<Employee> getEmployee(){
        return employeeRepository.findAll();
    }
    //Update Employee Name
    @PutMapping("/put_emp")
    public String updateEmployee(@RequestParam String name,@RequestParam Long id){
        Employee employee=employeeRepository.getById(id);
        employee.setEmp_name(name);
        employeeRepository.save(employee);
        return "Update Successfully";
    }
    //Delete Epmloyee
    @DeleteMapping("/remove_emp")
    public String deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    return "Delete Successfully";
    }
}
