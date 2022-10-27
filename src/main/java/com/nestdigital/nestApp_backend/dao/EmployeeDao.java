package com.nestdigital.nestApp_backend.dao;

import com.nestdigital.nestApp_backend.model.EmployeeModel;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<EmployeeModel,Integer> {
}
