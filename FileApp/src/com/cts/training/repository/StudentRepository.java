package com.cts.training.repository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

	public static List<Student> getStudents(){
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1,"First", "first@mail.com", 2, 3.5, "Basketball"));
		students.add(new Student(2,"Second", "second@mail.com", 2, 2.5, "Football"));
		
		students.add(new Student(3,"Third", "third@mail.com", 3, 3.7, "Hockey"));
		students.add(new Student(4,"Fourth", "fourth@mail.com", 3, 4.0, "Cricket"));
		
		students.add(new Student(5,"Fifth", "fifth@mail.com", 4, 3.7, "Chess"));
		students.add(new Student(6,"Sixth", "sixth@mail.com", 4, 3.5, "Football"));
		
		return students;
	}
}
