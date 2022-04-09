package com.example.restapidemo.service;

import java.util.List;

import com.example.restapidemo.model.Employee;

public interface EmployeeService {
	Employee getEmployeeById(long id);
	List<Employee> getAllEmployees();
}
