package com.aarya;

import com.aarya.child.CloudEngineer;
import com.aarya.child.Developer;
import com.aarya.child.Tester;
import com.aarya.parent.Employee;

public class MainApp {

	public static void main(String[] args) {
		Employee emp;
		
		//Parent Class Reference
		emp = new Employee();
		emp.completeJob("Parent Class Reference");
		
		//Child Class Reference
		emp = new Developer(); 
		emp.completeJob("Child Class Developer");
		
		emp = new Tester();
		emp.completeJob("Child Class Tester");
		
		emp = new CloudEngineer();
		emp.completeJob("Child Class CloudEngineer");
	}

}