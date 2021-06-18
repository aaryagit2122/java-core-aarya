package com.aarya.category;

import com.aarya.product.Product;

public class Electronics extends Product {
	
	protected  String  deviceType;
	public String prodType;
	
	public Electronics() {}

	public Electronics(String deviceType) {
		super("Electronics");
	    this.deviceType = deviceType;
	}
	
	
	
	

}
