package com.aarya.child;

import com.aarya.parent.Shape;

public class Triangle extends Shape {

	@Override
	public void calculateArea() {
		System.out.println("Area of Tirangle with Base " + super.base + " and Height " + super.height + " = " + (0.5f*super.base*super.height));
	}

}