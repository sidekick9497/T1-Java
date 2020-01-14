package com.cts.training.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import com.cts.training.repository.Student;

public class MyAppRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin;
		try {
			
			fin = new FileInputStream("abc.dat");
			ObjectInputStream in = new ObjectInputStream(fin);
			
			// Student student =  (Student)in.readObject();
			Student student = null;
			while((student = (Student)in.readObject()) != null) {
				System.out.println(student);
			}
			
			in.close();
			fin.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
