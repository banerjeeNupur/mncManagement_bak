package com.spe.mncManagement.controller;

import com.spe.mncManagement.bean.Employee;
import com.spe.mncManagement.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class homeController {

    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/home")
    public String login(){
        return "login page";
    }

    // get the list of employees
    @GetMapping("/employeeList")
    public List<Employee> getEmployees(){
        return null;
    }
}
