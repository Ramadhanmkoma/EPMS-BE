package com.suza.epms.Suza.Employee.Repository;

import com.suza.epms.Suza.Employee.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {  }
