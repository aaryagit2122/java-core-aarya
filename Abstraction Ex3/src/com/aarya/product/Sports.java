package com.aarya.product;

public abstract class Sports extends Category{
	
	protected String sportItem;
	protected int warrenty;
	
	public abstract void createItem(String sportItem, int warrenty);
	public abstract void showItem();
}