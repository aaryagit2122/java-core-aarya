package com.aarya.institute;

public class Student extends Course {
	
	int rollno;
	String studName;
	
	public void addStudent(int rollno, String studName)
	{
		this.rollno = rollno;
		this.studName = studName;
	}

	public int getRollNo()
	{
		return this.rollno;
	}
	
	public String getStudName()
	{
		return this.studName;
	}
}
