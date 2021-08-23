package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService {
     
	@Autowired
	private EmployeeDao employeedao;
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeedao.getById(id);
	}

	

	@Override
	public int createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee createdemployee = employeedao.save(employee);
		return createdemployee.getId();
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeedao.findAll();
	}

}
