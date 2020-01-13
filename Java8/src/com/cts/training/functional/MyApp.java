package com.cts.training.functional;

import java.util.List;
import java.util.function.*;

import com.cts.training.repository.Student;
import com.cts.training.repository.StudentRepository;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Consumer<String> consumer = str -> System.out.println(str);
		Consumer<String> consumer = System.out :: println;
		consumer.accept("Hello");
		
		// Consumer<Student> studentConsumer = (student) -> System.out.println(student);
		Consumer<Student> studentConsumer = System.out :: println;
		studentConsumer.accept(new Student(100, "Dummy", "dummy@mail.com", 6, 3.5));
		
		
		
		
		Predicate<Student> gpaPredicate = (student) -> {
			
			if(student.getGpa() > 3.5)
				return true;
			return false;
		};
		
		System.out.println("Is Above average : " + gpaPredicate.test(new Student(100, "Dummy", "dummy@mail.com", 6, 3.7)));
		
		// UnaryOperator<T>
		// BinaryOperator<T>
		
		Function<String, String> toUpper = (name) -> name.toUpperCase(); // return by default associated
		System.out.println(toUpper.apply("First"));
		
		Function<Student, String> getStudentName = (student) -> student.getName();
		System.out.println("Student name : " + getStudentName.apply(new Student(100, "Dummy", "dummy@mail.com", 6, 3.5)));
		
		Supplier<List<Student>> getStudents = () -> StudentRepository.getStudents();
		System.out.println(getStudents.get());
		
		
		/*Function<Integer, Student> findStudent = (id) -> {
			
			return getStudents
				.get() // supplier method : returns list of students
				.get(id-1); // List method : returns a single object of given id
		};*/
		Function<Integer, Student> findStudent = id -> getStudents.get().get(id-1);
		
		
	}

}























