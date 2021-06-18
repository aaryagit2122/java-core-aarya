package com.aarya.child;

import com.aarya.category.Electronics;

public class Laptop extends Electronics {
	
	private String laptopName;
	private float price;
	
	public Laptop(String laptopName, float price) {
		super("Laptop");
		this.laptopName = laptopName;
		this.price = price;
	}
	
	public void show ()
	{
		System.out.println(super.prodType + "\t" + super.deviceType + "\t" + this.laptopName + "\t" +this.price);
	}
}
