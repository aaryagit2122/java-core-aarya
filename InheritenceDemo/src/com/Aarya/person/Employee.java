package com.Aarya.person;

public class Employee extends Person 
{

	public double salary;
	
	public addSalary(double salary)
	{
		this.salary = salary;
	}
	
	public void showPerson()
	{
		System.out.println("Employee: " + super.firstName + "\t" + super.lastName + "\t" + super.age + "\t" + super.weight + "\t"+ super.height);
		System.out.println("Salary is:" + this.salary);
	}
}
