package com.nestdigital.nestApp_backend.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "employee")
public class EmployeeModel {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String mobile;
    private String address;
    private String designation;
    private String dob;
    private int empcode;
    private String  password;

    public EmployeeModel(int id, String name, String mobile, String address, String designation, int empcode, String password,String dob) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.designation = designation;
        this.empcode = empcode;
        this.password = password;
        this.dob = dob;
    }

    public EmployeeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getEmpcode() {
        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
