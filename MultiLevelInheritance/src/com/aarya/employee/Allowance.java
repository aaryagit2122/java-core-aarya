package com.aarya.employee;

public class Allowance extends Employee{
	
	private Employee emp;
	
	public Allowance()
	{
		super.da = 9.5;
		super.hra = 8.7;
	}
	
	public Allowance(Employee emp)
	{
		this();
		this.emp = emp;
	}
	
	public void showEmployee()
	{
		super.da = emp.getSalary()*super.da/100;
		super.hra = empgetSalary()*super.hra/100;
		super.gross = da + hra + emp.getSalary();
		
		System.out.println("Employee Code = " +emp.getEmpCode() );
		System.out.println("Employee Name = " + emp.getEmpName());
		System.out.println("Employee Salary = " +emp.getSalary());
		System.out.println("Dearness Allowance ="+ da);
		System.out.println("House Rent Allowance = "+ hra);
		System.out.println("Gross Income =" +gross);
	}
	

}
