package com.suza.epms.Suza.Employee.controller;

import com.suza.epms.Suza.Employee.Repository.EmployeeRepository;
import com.suza.epms.Suza.Employee.models.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employees> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employees> getOneEmployee(@PathVariable int id) {
        return employeeRepository.findById(id);
    }

    @PostMapping("/employees")
    public Employees addEmployee(@RequestBody Employees employees) {
        return employeeRepository.save(employees);
    }

    @PutMapping("/employees")
    public ResponseEntity<Employees> updateEmployee(@RequestBody Employees employee) {
        if(employeeRepository.findById(employee.getEmp_id()).isPresent())
            return new ResponseEntity(employeeRepository.save(employee), HttpStatus.OK);
        else
            return new ResponseEntity(employee, HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteById(@PathVariable("id") Integer id) { employeeRepository.deleteById(id); }

}
