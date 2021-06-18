package com.aarya;

import com.aarya.child.Circle;
import com.aarya.child.Square;
import com.aarya.child.Triangle;
import com.aarya.parent.Shape;

public class MainApp {

	public static void main(String[] args) {
		Shape shape;
		
		shape = new Shape();
		shape.calculateArea();
		
		shape = new Circle();
		shape.calculateArea();
		
		shape = new Triangle();
		shape.calculateArea();
		
		shape = new Square();
		shape.calculateArea();
		
	}

}