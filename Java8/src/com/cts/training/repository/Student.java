package com.cts.training.repository;

public class Student {

	private int id;
	private String name;
	private String email;
	private int grade;
	private double gpa;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", email=" + email + ", grade=" + grade + ", gpa=" + gpa + "]";
	}


	public Student() {
		
	}
	
	
	public Student(int id, String name, String email, int grade, double gpa) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.grade = grade;
		this.gpa = gpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
}
