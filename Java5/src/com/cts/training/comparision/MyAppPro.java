package com.cts.training.comparision;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MyAppPro {

	public static class CustomEmployeeComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee emp1, Employee emp2) {
			// TODO Auto-generated method stub
			return emp1.getId() - emp2.getId();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomEmployeeComparator comparator = new CustomEmployeeComparator();
		
		Set<Employee> employees = new TreeSet<Employee>(comparator);
		employees.add(new Employee(1, "First", "first@mail.com"));
		employees.add(new Employee(4, "Second", "second@mail.com"));
		employees.add(new Employee(1, "Third", "third@mail.com"));
		employees.add(new Employee(3, "Fourth", "fourth@mail.com"));
		employees.add(new Employee(2, "Fifth", "fifth@mail.com"));
		employees.add(new Employee(5, "Sixth", "sixth@mail.com"));
		
		System.out.println(employees);
	}

}
