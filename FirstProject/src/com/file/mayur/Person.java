package com.file.mayur;

public class Person extends CollegeStudent{
	
	public void student() {
		System.out.println("Hello I am a Student");
	}
	
	public void employee() {
		System.out.println("Hello I am an Employee");
	}

	public static void main(String[] args) {
		
		Person p = new Person();
		p.student();
		p.employee();
		p.collegeStudent();

	}

}
