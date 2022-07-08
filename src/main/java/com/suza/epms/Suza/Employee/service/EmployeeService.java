package com.suza.epms.Suza.Employee.service;

import com.suza.epms.Suza.Employee.Repository.EmployeeRepository;
import com.suza.epms.Suza.Employee.models.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employees> getEmployees() { return employeeRepository.findAll(); }

    public void addEmployee(Employees employee) { employeeRepository.save(employee); }

    public void updateEmployee(Employees employees) { employeeRepository.save(employees); }

    public void deleteEmployee(Integer id) { employeeRepository.deleteById(id); }

}
