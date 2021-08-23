package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	Employee getEmployeeById(int id);
	List<Employee> getAllEmployees();
	int createEmployee(Employee employee);
	

}
