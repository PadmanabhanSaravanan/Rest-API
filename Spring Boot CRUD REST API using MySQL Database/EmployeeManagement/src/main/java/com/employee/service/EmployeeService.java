package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
	
	    Employee createEmployee(Employee employee);

	    Employee getEmployeeById(Long employeeId);

	    List<Employee> getAllEmployee();

	    Employee updateEmployee(Employee employee);

	    void deleteEmployee(Long employeeId);
	
}
