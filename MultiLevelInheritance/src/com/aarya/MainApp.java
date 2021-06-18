package com.aarya;

import com.aarya.employee.Allowance;
import com.aarya.employee.Employee;

public class MainApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Aarya" , 48000.00f, 8112, "MNFDept");
		Allowance  a = new Allowance(e1);
		a.showEmployee();
	}

}
