package com.aarya;

import com.aarya.example.Animal;
import com.aarya.example.Bird;
import com.aarya.example.Dog;
import com.aarya.example.Fish;

public class MainApp {

	public static void main(String[] args) {
		Animal animal;
		
		animal = new Fish();
		animal.move();
		
		animal = new Dog();
		animal.move();
		
		animal = new Bird();
		animal.move();
	}
}