package com.aarya;

import com.aarya.child.Laptop;
import com.aarya.child.Television;

public class MainApp  {

	public static void main(String[] args) {
		
		Television t1 = new Television ("Samsung 32 Inch", 17000.00f);
				t1.show();
				
		Laptop x = new Laptop("Asus" , 67000.90f);
		x.show();
		
	}

}
