package com.nestdigital.nestApp_backend.controller;


import com.nestdigital.nestApp_backend.dao.EmployeeDao;
import com.nestdigital.nestApp_backend.model.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping( path = "/addEmployee",consumes = "application/json",produces = "application/json")
    public String addEmployee(@RequestBody EmployeeModel emp)
    {
         dao.save(emp);
         return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewEmployee")
    public List<EmployeeModel> viewEmployee()
    {
        return (List<EmployeeModel>)dao.findAll();
    }
}
