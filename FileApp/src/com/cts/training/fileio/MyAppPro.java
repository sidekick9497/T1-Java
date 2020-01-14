package com.cts.training.fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.cts.training.repository.Student;
import com.cts.training.repository.StudentRepository;

public class MyAppPro {
	public static void main(String args[]) {
		
		
		FileOutputStream fout;
		try {
			
			fout = new FileOutputStream("abc.dat");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			List<Student> students = StudentRepository.getStudents();
			for(Student student : students) {
				out.writeObject(student);
			}
			
			out.close();
			fout.close();
			System.out.println("Objects written successfully");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
