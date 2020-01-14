package com.cts.training.service;

public class EmployeeService {

	public int getAnnualSalary(Employee employee) {
		return employee.getSalary() * 12;
	}
	
	public int getAppraisal(Employee employee) {
		if(employee.getSalary() < 10000)
			return 500;
		return 1000;
	}
	
}
