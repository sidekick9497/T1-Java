package com.cts.training.comparision;

import java.util.Set;
import java.util.TreeSet;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> students = new TreeSet<Student>();
		students.add(new Student(1, "First", "first@mail.com"));
		students.add(new Student(4, "Second", "second@mail.com"));
		students.add(new Student(1, "Third", "third@mail.com"));
		students.add(new Student(3, "Fourth", "fourth@mail.com"));
		students.add(new Student(2, "Fifth", "fifth@mail.com"));
		students.add(new Student(5, "Sixth", "sixth@mail.com"));
		
		System.out.println(students);
	}

}
