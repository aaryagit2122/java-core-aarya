package com.aarya.category;

import com.aarya.product.Product;

public class Sports extends Product {
	
	protected String sportType;
	
	public Sports() {}

	public Sports(String sportType) {
		super("Sports");
		this.sportType = sportType;
	}
	

}
