package com.aarya;

import com.aarya.institute.Student;

public class MainApp {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.addCourse(193, "Android App Developer", 130000.00f);
		s1.addStudent(18, "SMITH");
		
		s1.showCourse();
		System.out.println("Roll No = " + s1.getRollNo() + "\t Student Name =" + s1.getStudName() );
		

	}

}
