package com.Aarya;

import com.Aarya.person.Employee;

public class MainApp {

	public static void main(String[] args) {
	  
		Employee e1 = new Employee();
		
		e1.addPerson("Smith", "Mathew", 45, 78.5f, 123.56f);
		e1.addSalary(67000.00);
		e1.showPerson();

	}

}
