package com.suza.epms.Suza.Employee.Repository;

import com.suza.epms.Suza.Employee.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {  }
