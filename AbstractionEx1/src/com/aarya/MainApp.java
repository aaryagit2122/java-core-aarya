package com.aarya;

import com.aarya.example.Car;
import com.aarya.example.Ford;

public class MainApp {

	public static void main(String[] args) {
		
		Ford f = new Ford();
		f.accelerateCar();
		f.stopCar();
		
		
		Car c;
		c = new Ford();
		
		c.accelerateCar();
		c.stopCar();
		
	}

}