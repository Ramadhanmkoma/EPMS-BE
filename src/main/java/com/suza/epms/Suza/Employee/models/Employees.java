package com.suza.epms.Suza.Employee.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employees {

    @Id
    @GeneratedValue
    private Integer emp_id;
    private String emp_firstname;
    private String emp_lastname;
    private long emp_phone;
    private String emp_email;
    private String emp_role;
    private String emp_password;

    public Employees() {  }

    public Employees(String emp_firstname, String emp_lastname, long emp_phone, String emp_email, String emp_role, String emp_password) {
        this.emp_firstname = emp_firstname;
        this.emp_lastname = emp_lastname;
        this.emp_phone = emp_phone;
        this.emp_email = emp_email;
        this.emp_role = emp_role;
        this.emp_password = emp_password;
    }

    public Integer getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_firstname() {
        return emp_firstname;
    }

    public void setEmp_firstname(String emp_firstname) {
        this.emp_firstname = emp_firstname;
    }

    public String getEmp_lastname() {
        return emp_lastname;
    }

    public void setEmp_lastname(String emp_lastname) {
        this.emp_lastname = emp_lastname;
    }

    public long getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(long emp_phone) {
        this.emp_phone = emp_phone;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_role() {
        return emp_role;
    }

    public void setEmp_role(String emp_role) {
        this.emp_role = emp_role;
    }

    public String getEmp_password() {
        return emp_password;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }
}
