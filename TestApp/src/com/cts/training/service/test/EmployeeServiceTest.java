package com.cts.training.service.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cts.training.service.Employee;
import com.cts.training.service.EmployeeService;

class EmployeeServiceTest {

	private static EmployeeService service;
	
	@BeforeAll
	static void setUp() {
		// this method will invoke auto before test cases are executed
		// initialization before testing starts
		System.out.println("Initialized");
		service = new EmployeeService();
	}
	
	
	/*@AfterClass // @AfterAll
	void cleanUp() {
		// this methid gets invoked after all test cases have executed
		// for cleanup purpose
	}
	
	@Before // @BeforeEach
	void beforeEach() {
		// going to run before every test case
	}
	
	@After // @AfterEach
	void afterEach() {
		// going to run after every test case
	}*/
	
	
	@Test
	void testGetAnnualSalary() {
		Employee employee = new Employee(1, "First", 10000);
		//EmployeeService service = new EmployeeService();
		int annualSalary = service.getAnnualSalary(employee);
		int expected = 120000;
		assertEquals(expected, annualSalary);
	}

	@Test
	void testGetAppraisal() {
		Employee employee = new Employee(1, "First", 10000);
		//EmployeeService service = new EmployeeService();
		int appraisal = service.getAppraisal(employee);
		int expected = 1000;
		assertEquals(expected, appraisal);
	}

}

