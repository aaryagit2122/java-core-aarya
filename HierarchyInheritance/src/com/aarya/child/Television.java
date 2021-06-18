package com.aarya.child;

import com.aarya.category.Electronics;

public class Television extends Electronics {
	
	private String deviceName;
	private float price;
	
	public Television() {}
	
	public Television(String deviceName, float price) {
		super("Television");
		this.deviceName = deviceName;
		this.price = price;
	}
	
	public void show ()
	{
		System.out.println(super.prodType + "\t" + super.deviceType + "\t" + this.deviceName + "\t" +this.price);
	}
	
	

}
