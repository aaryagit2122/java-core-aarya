package com.aarya.child;

import com.aarya.parent.Employee;

public class CloudEngineer extends Employee{

	@Override
	public void completeJob(String msg) {
		System.out.println("Employee is now Cloud Engineer. " + msg);
	}

}