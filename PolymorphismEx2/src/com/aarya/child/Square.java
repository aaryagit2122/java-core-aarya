package com.aarya.child;

import com.aarya.parent.Shape;

public class Square extends Shape {

	public void calculateAreaS() {
		System.out.println("Area of Squre with side " + super.side + " = "  + (super.side*super.side));
	}

}