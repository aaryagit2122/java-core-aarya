package com.aarya.department;

public class Department {
	
	private int deptCode;
	private String deptName;
	
	public Department()
	{
		deptCode = -1;
		deptName = "#unknowndeptName";
		
		
	}

	public Department(int deptCode, String deptName) {
		super();
		this.deptCode = deptCode;
		this.deptName = deptName;
	}

}
