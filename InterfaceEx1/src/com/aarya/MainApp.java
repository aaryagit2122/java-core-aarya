package com.aarya;

import com.aarya.example.Car;
import com.aarya.example.Insurance;
import com.aarya.example.Vehicle;

public class MainApp {

	public static void main(String[] args) {
		
			Car c1 = new Car();
			c1.changeSpeed();
			c1.applyBreaks();
			c1.changeGear();
			c1.isEligible(true);
			
			Vehicle veh;
			
			veh = new Car();
			veh.changeSpeed();
			veh.applyBreaks();
			veh.changeGear();
			
			Insurance in;
			in = new Car();
			in.isEligible(false);		
	}
}