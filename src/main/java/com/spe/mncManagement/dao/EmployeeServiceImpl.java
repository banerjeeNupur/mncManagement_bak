package com.spe.mncManagement.dao;

import com.spe.mncManagement.bean.Employee;
import com.spe.mncManagement.services.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> empList;

    @Override
    public List<Employee> getEmployees() {
        return null;
    }
}
