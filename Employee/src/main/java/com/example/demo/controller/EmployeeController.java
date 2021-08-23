package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.EmployeeNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employees/{id}")
	 public Employee getEmployee( @PathVariable int id)
	 {
		Employee employee =  service.getEmployeeById(id);
		if(employee == null)
			throw new EmployeeNotFoundException("Employee not found");
		 return employee;
	 }
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return service.getAllEmployees();
	}
	 
	@PostMapping("/employees")
	public int createEmployee(@RequestBody Employee employee)
	{
		return service.createEmployee(employee);
	}
	 

}
