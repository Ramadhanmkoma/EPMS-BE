package com.suza.epms.Suza.Employee.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stud_id;
    private String stud_regno;
    private String stud_firstname;
    private String stud_lastname;
    private String stud_email;
    private String stud_phone;
    private int stud_year;
    private String stud_password;

    public Student() {  }

    public Student(String stud_regno, String stud_firstname, String stud_lastname, String stud_email, String stud_phone, int stud_year, String stud_password) {
        this.stud_regno = stud_regno;
        this.stud_firstname = stud_firstname;
        this.stud_lastname = stud_lastname;
        this.stud_email = stud_email;
        this.stud_phone = stud_phone;
        this.stud_year = stud_year;
        this.stud_password = stud_password;
    }

    public Integer getStud_id() {
        return stud_id;
    }

    public void setStud_id(Integer stud_id) {
        this.stud_id = stud_id;
    }

    public String getStud_regno() {
        return stud_regno;
    }

    public void setStud_regno(String stud_regno) {
        this.stud_regno = stud_regno;
    }

    public String getStud_firstname() {
        return stud_firstname;
    }

    public void setStud_firstname(String stud_firstname) {
        this.stud_firstname = stud_firstname;
    }

    public String getStud_lastname() {
        return stud_lastname;
    }

    public void setStud_lastname(String stud_lastname) {
        this.stud_lastname = stud_lastname;
    }

    public String getStud_email() {
        return stud_email;
    }

    public void setStud_email(String stud_email) {
        this.stud_email = stud_email;
    }

    public String getStud_phone() {
        return stud_phone;
    }

    public void setStud_phone(String stud_phone) {
        this.stud_phone = stud_phone;
    }

    public int getStud_year() {
        return stud_year;
    }

    public void setStud_year(int stud_year) {
        this.stud_year = stud_year;
    }

    public String getStud_password() {
        return stud_password;
    }

    public void setStud_password(String stud_password) {
        this.stud_password = stud_password;
    }
}
